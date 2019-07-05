单例模式：保证一个类仅有一个实例，并提供一个全局访问点。
类型：创建型

适用场景：需要确保任何情况下都绝对只有一个实例对象。

优点：内存中只有一个实例，减少了内存开销。
      可以避免对资源的多重占用。
      设置全局访问点，严格控制访问。
缺点：没有接口，扩展困难

普通的单例模式是线程不安全的，在多线程环境下，并不能保证单例对象唯一。
解决方案1：使用synchronized关键字对getInstance()方法加锁，使得只有一个线程能够成功创建对象。使用synchronized关键字加在static方
法上，相当于对整个类加锁，而用在普通方法上，相当于锁的是堆中生成的对象。synchronized关键字开销比较大，性能比较低。

解决方案2：使用双重检查机制来获取实例对象。第一次检查单例实例不存在时，再去使用synchronized关键字锁住整个类文件，为了保证生成的
对象是所有线程可见的、最新的，且防止生成对象时候的指令重排序问题，使用volatile关键字修饰单例对象。相比较解决方案1，此方案的性能
更好。

解决方案3：方案2通过使用volatile关键字禁止了指令的重排序，使所有线程都可以看见对象的最新状态。也可以换一种解决思路，让对象的创建
过程对线程不可见。使用静态内部类的方式来实现单例模式。这种方法也是线程安全的，因为JVM在类初始化阶段会去获取一个锁，这个锁可以同步
多个线程对一个类的初始化，具体可以去看《深入理解java虚拟机》这本书。此方案性能开销比较低，也属于懒汉式，因为内部类并不是一开始就
被加载的，而是在使用的时候才被加载。

解决方案4；上述几个方案都是在使用的时候创建单例对象，可以直接在类加载的时候就创建好对象，就是所谓的饿汉式单例模式。饿汉式绕过了多
线程下的对象创建问题，是线程安全的，特点是类加载的时候对象就加载了，会一直占着内存。

------------------------------------------------------------------------------------------------------------------------
上述单例模式创建的单例对象会被序列化和反射攻击破坏，具体原理不再深入。为了解决这种破坏，可以使用Enum类来构建单例模式，这是一种比
较好的单例模式，可以防止序列化和反射造成单例实例不一致，推荐使用枚举类单例模式。

------------------------------------------------------------------------------------------------------------------------
JDK/Spring/Mybatis源码分析：
1.Runtime.java类中的currentRuntime对象：
private static Runtime currentRuntime = new Runtime(); //饿汉模式，在类初始化的时候就创建好了currentRuntime对象

2.java.awt.Desktop.java类中的getDesktop()方法：
public static synchronized Desktop getDesktop(){    //懒汉模式，在使用的时候才创建，synchronized锁定的是整个类文件
    ...
    if (desktop == null) {
        desktop = new Desktop();
        context.put(Desktop.class, desktop);    //context是map容器，内部逻辑很像容器单例模式
    }
    ...
}

3.spring中的AbstractFactoryBean.java中：
public final T getObject() throws Exception {
    if (isSingleton()) {
    //在具体的getEarlySingletonInstance()方法中通过代理去获取单例对象，然后返回
        return (this.initialized ? this.singletonInstance : getEarlySingletonInstance());
    }
    else {
        return createInstance();
    }
}

4.Mybatis中ErrorContext.java类，该类的构造器是private的：
public static ErrorContext instance() {
    ErrorContext context = LOCAL.get();     //LOCAL是static、final的ThreadLocal<ErrorContext>对象
    if (context == null) {
      context = new ErrorContext();
      LOCAL.set(context);
    }
    return context;
}
类似于此项目中写的ThreadLocalSingleton，保证每个线程各自的错误上下文对象唯一。（并不是整个应用全局唯一）
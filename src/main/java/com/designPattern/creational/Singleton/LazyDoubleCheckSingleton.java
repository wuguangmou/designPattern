package com.designPattern.creational.Singleton;

/**
 *  普通单例模式的演进
 *  使用双重检查机制，确保线程安全
 *  相对于synchronized加在静态方法上，这种方式性能开销更小
 */
public class LazyDoubleCheckSingleton {
    //使用volatile关键字声明instance，保证instance的最新性和可见性，同时禁止指令重排序
    private volatile static LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton(){

    }

    //将synchronized关键字放在第一次检查之后，若有实例对象，直接返回。很大程度上降低了使用synchronized关键字所带来的性能开销
    public static LazyDoubleCheckSingleton getInstance(){
        //由于创建对象并不是原子操作，此时可能对象实例有内存地址，但还没初始化，所以return可能报错。使用volatile解决此问题。
        if (instance == null){                                  //第一次检查
            synchronized (LazyDoubleCheckSingleton.class){
                if (instance == null){                          //第二次检查
                    /*  创建对象并不是个原子操作，创建对象的步骤如下：
                     *  1.分配内存
                     *  2.初始化对象
                     *  3.设置instance实例对象指向刚分配出来的内存地址
                     *  为了性能优化，cpu和编译器会对步骤2和步骤3进行指令重排序
                     *  intra-thread semantics保证重排序不会改变单线程内的执行结果
                     **/
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

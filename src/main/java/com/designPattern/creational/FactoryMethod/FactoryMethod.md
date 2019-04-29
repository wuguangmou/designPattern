工厂方法模式：定义一个创建对象的接口，让实现这个接口的类去决定实例化哪个类。工厂方法让类的实例化推迟到实现接口的子类中进行。
类型：创建型，是简单工厂方法的演进。

适用类型：创建对象需要大量重复的代码；客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。

优点：用户只需关心所需产品对应的工厂，无需关心产品细节。
      加入新的产品符合开闭原则，提高可拓展性。
缺点：类的个数容易过多，增加系统复杂度。
      增加了系统的抽象性和理解难度。
      当需要增加一个新的产品族时，若仍然使用工厂方法模式，会产生类爆炸，因此工厂方法不适合于产品族的创建逻辑。

------------------------------------------------------------------------------------------------------------------------
JDK源码分析：
1.Collection类中的Iterator接口： Iterator<E> iterator();      （类似于Video）
每个容器都有自己的遍历器，这里的Iterator接口就体现了工厂方法的思想，具体看实现其方法的两个子类：
    a.ArrayList.java                        （类似于JavaVideo）
    public Iterator<E> iterator() {
        return new Itr();   //返回ArrayList的内部类Itr对象，在内部类中实现自己的Iterator方法
    }
    b.LinkedBlockingDeque.java
    //阻塞队列的Itr{}内部类，调用方法与ArrayList相同。通过此内部类实现自己的iterator对象，去遍历阻塞队列
    private class Itr extends AbstractItr {     （类似于PythonVideo）
        Node<E> firstNode() { return first; }
        Node<E> nextNode(Node<E> n) { return n.next; }
    }
由于java中的集合很多，每一个集合都实现了自己的Iterator对象。父类Collection约定规范，子类各个容器去实现自己的逻辑，体现了工厂方
法模式的思想。

2.URLStreamHandlerFactory.java类，主要用于解决URL协议拓展：
public interface URLStreamHandlerFactory {
    URLStreamHandler createURLStreamHandler(String protocol);
}
这个类就是一个标准的工厂方法类。在其实现类Launcher.java中，该实现方法返回了一个URLStreamHandler对象，该对象正是一个抽象类，根据
不同的协议，最后创建出不同的Handler对象。

3.LoggerFactory.java类中的getLogger()方法：
public static Logger getLogger(String name) {
    ILoggerFactory iLoggerFactory = getILoggerFactory();
    return iLoggerFactory.getLogger(name);
}
在ILoggerFactory中只有一个方法，就是getLogger()方法： public Logger getLogger(String name);
getLogger()方法有三个实现子类。即在把类的实现推迟到子类中进行，也可以看出工厂方法模式的思想。
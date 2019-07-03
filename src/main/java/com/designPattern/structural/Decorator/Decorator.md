装饰者模式：在不改变现有对象的基础之上，动态的将功能添加到该对象上。
类型：创建型。其提供了比继承更有弹性的替代方案（拓展原有对象功能）。

适用场景：拓展一个类的功能或给一个类添加附加职责；
         动态的给一个对象添加功能，这些功能可以再动态的撤销。

优点：采用装饰者模式拓展对象功能比采用继承方式更加灵活。
      通过使用不同的装饰类以及这些装饰类的排列组合，可以实现不同的效果，创造出多个不同行为的组合。
      符合开闭原则。
缺点：会出现更多的代码，更多的类，增加程序的复杂性。
      动态装饰时，多层装饰会更复杂。

------------------------------------------------------------------------------------------------------------------------
JDK/spring源码分析：
1.JDK中与I/O相关的类：
BufferedReader类继承了抽象类Reader，并且将Reader组合到自己的类中，通过父类Reader来构造BufferedReader对象；
BufferedInputStream类继承了实体类FilterInputStream，而FilterInputStream类又继承了抽象类InputStream，其将抽象父类组合到自己的
类中，通过抽象父类InputStream来构造自己的对象；BufferedOutputStream与此类似。
正是因为JDK中与I/O相关的类使用了装饰者模式，因此可以无限次的进行装饰转换，从而得到自己需要的流对象，但是这也让与I/O相关的类的数
量特别多，整个结构看起来比较复杂。

2.spring中的TransactionAwareCacheDecorator类：
这个类用于处理spring缓存和同步事务，从类名就可以看出来这个类是个实际的装饰者类，TransactionAwareCacheDecorator实现了Cache接口，
在构造函数中又使用了Cache类的对象来构造自己的对象，可以理解为TransactionAwareCacheDecorator类是Cache类的装饰者。

3.mybatis中的Cache类：
org.apache.ibatis.cache包下的Cache类是一个接口，其具体的装饰者都在decorators包下，包括FifoCache、BlockingCache、LruCache等。
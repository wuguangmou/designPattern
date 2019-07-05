模板方法模式：定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现。
类型：行为型。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤。

适用场景：一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
         各子类中公共的行为被提取出来，并集中到一个公共父类中，从而避免代码重复。

优点：提高复用性；提高扩展性；符合开闭原则。
缺点：类数目增加；增加了系统实现的复杂度；继承关系自身缺点，如果父类增加新的抽象方法，所有的子类都要改一遍。

------------------------------------------------------------------------------------------------------------------------
JDK/Servlet源码分析：
1.util包下的AbstractList、AbstractSet、AbstractMap等类：
它们都定义了一套算法模板，其中部分方法交给子类实现。子类ArrayList、TreeSet、HashMap等按照父类的模板去实现自己的功能。

2.HttpServlet类：
HttpServlet类中的doGet()、doPost()、service()等方法就是一套模板，使用的时候继承HttpServlet，然后去实现自己的方法。

3.mybatis中的BaseExecutor类：
BaseExecutor是一个抽象类，其中定义了一些具体的方法与属性。它有四个实现类，分别是BatchExecutor、ClosedExecutor、ReuseExecutor、
SimpleExecutor。这四个类都实现了BaseExecutor,因此可以把BaseExecutor看成是模板类。
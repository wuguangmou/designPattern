适配器模式：将一个类的接口转换成客户期望的另一个类的接口。
类型：结构性。适配器模式使原本接口不兼容的类可以一起工作。

适用场景：已经存在的类，他的方法和需求不匹配时（方法结果相同或者相似）。
         不是软件设计阶段考虑的设计模式，是随着软件的维护，由于不同的产品、不同厂家造成功能类似而接口不相同的情况下的解决方案。

优点：能提高类的复用，现有的类复用但不需要改变。
      目标类和适配器类解耦，提高程序拓展性。
      符合开闭原则。
缺点：适配器编写过程需要全面考虑，可能会增加系统的复杂度。
      增加系统代码可读的难度。

------------------------------------------------------------------------------------------------------------------------
JDK/SpringAOP/SpringMVC源码分析：
1.XmlAdapter类：
这个类是JDK处理xml序列化和反序列化时使用的，对于不同类型的java格式，可以使用不同的适配器去处理序列化成xml文件，该类中只有两个方
法：marshal和unmarshal。

2.SpringAOP中的AdvisorAdapter类：
这个类是一个适配器接口，其定义了自己支持的Advice类型，并且能把一个advisor适配成MethodInterceptor。默认的实现是defaultAdvisorAdapterRegistry。

3.SpringMVC中的HandlerAdapter类：
HandlerAdapter是一个接口，其约束了适配器的主要方法，它有一些具体的实现类：HttpRequestHandlerAdapter（用于适配HttpRequest请求），
SimpleServletHandlerAdapter（用于处理简单的Servlet请求）等，具体的处理逻辑在DispatcherServlet类中的doDispatch方法中。在处理不
同的controller时，根据不同的controller自动适配去处理。
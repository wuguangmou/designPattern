责任链模式：为请求创建一个接受此次请求对象的链。
类型：行为型。

适用场景：一个请求的处理需要多个对象中的一个或多个协同处理。

优点：请求的发送者和接受者解耦；
      责任链可以动态的组合。
缺点：责任链太长或者处理时间过长，影响性能；
      责任链有可能过多。

------------------------------------------------------------------------------------------------------------------------
Servlet源码分析：
1.Servlet中的过滤器:
javax.servlet.Filter类是一个过滤器接口，其中的doFilter()方法起到过滤的作用，Filter接口中的doFilter()方法传入了FilterChain对象，
而FilterChain是一个接口，其中也有dodoFilter()方法，在它的实现类中，以PassThroughFilterChain类为例，其重写的doFilter()方法如下：
    if (this.filter != null) {
        this.filter.doFilter(request, response, this.nextFilterChain);
    }
可以看出，这是标准的责任链模式的实现，只不过在servlet中叫做过滤器。
外观模式：又叫门面模式，其隐藏了系统的复杂度，向外提供了一个统一的接口，用于访问整个系统。
类型：结构型。外观模式定义了一个高层接口，让子系统更容易使用。

适用场景：子系统越来越复杂，增加外观模式提供简单调用接口。
         构建多层系统结构，利用外观对象作为每层的入口，简化层间调用。
         
优点：简化了调用过程，无需深入了解子系统，防止带来风险。
     减少系统依赖、松散耦合。
     更好的划分访问层次。
     符合迪米特法则，即最少知道法则。
缺点：增加子系统、扩展子系统行为容易引入风险。
     不符合开闭原则。

------------------------------------------------------------------------------------------------------------------------
springJDBC/mybatis/tomcat源码分析：
1.spring的JdbcUtils类：
JdbcUtils封装了对于原生JDBC的各个对象的操作、例如closeConnection、closeStatement、closeResultSet等方法。从这一点来看，connection
对象、statement对象、resultSet对象是各个子系统（组件），而JdbcUtils就是一个外观角色。

2.mybatis的Configuration类：
Configuration类中的各种new方法，如newResultSetHandler、newStatementHandler、newExecutor、newMetaObject等，可以理解成Configuration
是外观类，其关联了很多子系统（类），而Configuration的接口对这些类进行了组合封装，对外屏蔽了这些成员的组合调用。

3.tomcat源码中的RequestFacade、ResponseFacade类：
RequestFacade类封装了各种操作Request的方法，ResponseFacade类中封装了各种操作Response的方法，除此之外，tomcat中还有其他大量应用
外观模式的地方。
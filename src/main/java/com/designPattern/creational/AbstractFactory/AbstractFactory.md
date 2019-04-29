抽象工厂模式：抽象工厂模式提供了一个创建一系列相关或相互依赖的接口。
类型：创建型。抽象工厂模式关注的是产品族，而工厂方法模式关注的是产品等级。

适用场景：客户端（应用层）不依赖产品实例如何被创建、实现等细节。
         强调一系列相关的产品对象（属于同一产品族），在创建对象时需要大量重复的代码，即可以使用抽象工厂解决。
         提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现
         
优点：具体产品在应用层代码隔离，无需关心创建细节。
      将一个系列的产品族统一到一起创建。
缺点：规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口。
      增加了系统的抽象性和理解难度。

------------------------------------------------------------------------------------------------------------------------
JDK/mybatis源码分析：
1.java.sql.connection.java类：
connection类中定义了一系列方法和属性，不难理解，在connection这个接口中，返回的都属于同一产品族。
例如创建一个mysql的connection，其中就有属于mysql的Statement、PrepareStatement、close等方法；
    创建一个oracle的connection，就有属于oracle的相关方法。
由此可见，这种设计模式就是标准的抽象工厂模式。

2.java.sql.Statement.java类
与connection类似。

3.mybatis中的sqlSessionFactory类：
public interface SqlSessionFactory {
    SqlSession openSession();
    //openSession()方法重载，这里省略。
    Configuration getConfiguration();
}
从这个接口就可以很清晰地看出sqlSessionFactory也是一个抽象工厂方法，该方法返回两个对象SqlSession、Configuration，都属于同一产品
族，类似于例子中的CourseFactory，返回Video和Article对象。
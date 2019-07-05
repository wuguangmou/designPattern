简单工厂模式：由一个工厂对象决定出创建哪一种产品类的实例。
类型：创建型，但不属于GOF23种设计模式。

适用类型：工厂类负责创建的对象比较少时；客户端（应用层）只需知道传入工厂类的参数，对于如何创建对象（逻辑）不关心。

简单工厂模式
优点：只需知道一个正确的参数，就可以获取到所需要的对象，而无需知道其创建细节。
缺点：工厂类的职责过重，当需要增加新的产品时，需修改工厂类的判断逻辑，违背了开闭原则。

------------------------------------------------------------------------------------------------------------------------
JDK源码分析：
1.Calendar类的createCalendar()方法：
switch (caltype) {
    case "buddhist":
        cal = new BuddhistCalendar(zone, aLocale);
        break;
    case "japanese":
        cal = new JapaneseImperialCalendar(zone, aLocale);
        break;
    case "gregory":
        cal = new GregorianCalendar(zone, aLocale);
        break;
}
根据caltype的不同的值，从而创建出不同的对象。从这可以看出简单工厂模式的思想。

2.java连接数据库实例时，根据不同的数据库，调用反射方法创建相应的实例对象去加载数据库连接：
以mysql数据库为例：    Class.forName("com.mysql.jdbc.Driver");
具体如何实现的此处不再深入分析，只讨论思想。
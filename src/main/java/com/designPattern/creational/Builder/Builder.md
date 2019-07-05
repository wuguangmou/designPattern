建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
类型：创建型。用户只需指定需要建造的类型就可以得到它们，建造过程及细节不需要知道。

适用场景：一个对象有非常复杂的内部结构（很多属性）；想把复杂对象的创建和使用分离。

优点：封装性好，创建和使用分离
      扩展性好，建造者之间独立，一定程度上解耦
缺点：产生多余的Builder对象
      产品内部发生变化时，建造者都需要修改，成本较大

------------------------------------------------------------------------------------------------------------------------
JDK/guava/spring/mybatis源码分析：
1.StringBuilder类中的append方法：
public StringBuilder append(char c) {
    super.append(c);
    return this;
}
可以看出这是一个链式调用，是一个标准的建造者模式。StringBuffer中的append方法也和StringBuilder一样，只不过加了synchronized关键
字，因此说StringBuffer是线程安全的，而StringBuilder是线程不安全的。

2.guava中的ImmutableSet集合类:
其也有一个Builder静态内部类，Builder中的add方法属于调用链，返回的是自身的Builder对象。可以看出，这种建造者模式与此项目中的v2.0
很像，只不过其中的属性更为复杂。

3.guava中的CacheBuilder类:
CacheBuilder类中的许多方法都返回自己，然后再通过自己，去调用自身的方法，也是标准的建造者模式。

4.spring中的BeanDefinitionBuilder类：
与guava中的CacheBuilder类相似，Spring的这个类中的许多方法也返回自身，例如：
public static BeanDefinitionBuilder genericBeanDefinition(String beanClassName) {
    BeanDefinitionBuilder builder = new BeanDefinitionBuilder();
    builder.beanDefinition = new GenericBeanDefinition();
    builder.beanDefinition.setBeanClassName(beanClassName);
    return builder;
}
可以看出builder对象就是自身，然后通过自身再去调用这个类中的其他方法，完成初始化，也是属于标准的建造者模式。

5.mybatis中的sqlSessionFactoryBuilder类:
sqlSessionFactoryBuilder类中有许多build方法，都返回自身，与上述例子类似。其中需要注意的是，sqlSessionFactoryBuilder类中有builder()
方法又调用了XMLConfigBuilder类，然后在XMLConfigBuilder中去解析具体的根节点。相当于sqlSessionFactoryBuilder只是一层简单的封装，
在其中用建造者来包装一层建造者。

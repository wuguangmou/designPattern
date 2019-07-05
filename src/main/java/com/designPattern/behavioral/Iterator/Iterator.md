迭代器模式：提供一种方法，顺序访问一个集合对象中的各个元素，而又不暴露该对象的内部表示。
类型：行为型。

适用场景：访问一个集合对象的内容而无需暴露它的内部表示。
         为遍历不同的集合结构提供一个统一的接口。

优点：分离了集合对象的遍历行为，可以让外部的代码透明地访问集合内部地数据。
缺点：类的个数成对增加。每新出现一种集合类，都需要新出现对应的集合的迭代器。

------------------------------------------------------------------------------------------------------------------------
JDK/Mybatis源码分析：
1.java.util.Iterator：
Iterator是一个迭代器接口，其有许多实现的子类。

2.Mybatis中的DefaultCursor类：
DefaultCursor实现了Cursor接口，其内部也定义了自己的迭代器：
    private final CursorIterator cursorIterator = new CursorIterator();
    private class CursorIterator implements Iterator<T>{}；
可以看出，其也是实现JDK的Iterator接口。
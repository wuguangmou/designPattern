原型模式：原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
类型：创建型。其特点是不需要知道任何创建的细节，不调用构造函数。

适用场景：创建一个类消耗较多资源
         new产生一个对象需要非常繁琐的过程（数据准备，访问权限等）
         构造函数比较复杂时
         在循环体中创建大量对象时

优点：原型模式性能比直接new一个对象性能高，简化了对象的创建过程。
缺点：必须具备克隆方法；对克隆复杂对象或克隆出的对象进行复杂改造时，容易引入风险；深克隆、浅克隆要运用得当。

------------------------------------------------------------------------------------------------------------------------
JDK源码分析：
1.ArrayList、HashMap等容器
它们都实现了Cloneable接口，以下是具体的实现方法：
public Object clone() {         //ArrayList的clone方法
    try {
        ArrayList<?> v = (ArrayList<?>) super.clone();
        v.elementData = Arrays.copyOf(elementData, size);
        v.modCount = 0;
        return v;
    } catch (CloneNotSupportedException e) {
        // this shouldn't happen, since we are Cloneable
        throw new InternalError(e);
    }
}
//HashMap的clone方法
public Object clone() {
    HashMap<K,V> result;
    try {
        result = (HashMap<K,V>)super.clone();   
    } catch (CloneNotSupportedException e) {
        // this shouldn't happen, since we are Cloneable
        throw new InternalError(e);
    }
    result.reinitialize();
    result.putMapEntries(this, false);
    return result;
}

2.mybatis中的CacheKey.java类，其也实现了Cloneable接口：
public CacheKey clone() throws CloneNotSupportedException {
    CacheKey clonedCacheKey = (CacheKey) super.clone();
    clonedCacheKey.updateList = new ArrayList<Object>(updateList);
    return clonedCacheKey;
}
这些容器都可以作为原型实例。可以说一个类只要实现了Cloneable接口，其就有原型模式的思想在里面。
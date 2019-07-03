组合模式：将对象组合成树形结构以表示“部分-整体”的层次结构。
类型：结构型。组合模式使客户端对单个对象和组合对象保持一致的处理方式。使用组合模式，最关键的一点是叶子对象和组合对象都要实现相同
的接口。

适用场景：希望客户端可以忽略组合对象与单个对象的差异时；
         处理一个树形结构时。

优点：清楚的定义分层次的复杂对象，表示对象的全部或部分层次。
      让客户端忽略了层次差异，方便对整个层次结构进行控制。
      简化了客户端代码。
      符合开闭原则。
缺点：限制类型时会比较复杂。
      使设计变得更加抽象。

------------------------------------------------------------------------------------------------------------------------
JDK/Mybatis源码分析：
1.HashMap/ArrayList中的组合模式：
HashMap中的putAll()方法，传入的参数是HashMap的父类Map，ArrayList中的addAll()方法，传入的参数也是ArrayList的父类Collection，这
些都是组合模式的体现，就像例子中的Course和CourseCatalog，其里面的方法传入的参数都是父类CatalogComponent对象。

2.Mybatis中的SqlNode类：
SqlNode是一个接口，其有很多实现，以MixedSqlNode为例：
    private List<SqlNode> contents;
    public MixedSqlNode(List<SqlNode> contents) {
        this.contents = contents;
      }
    @Override
    public boolean apply(DynamicContext context) {
        for (SqlNode sqlNode : contents) {
          sqlNode.apply(context);
        }
        return true;
    }
MixedSqlNode中包含了多个SqlNode，其contents相当于CourseCatalog类中的items，在apply方法中处理这些SqlNode对象，相当于CourseCatalog
类中的print方法。

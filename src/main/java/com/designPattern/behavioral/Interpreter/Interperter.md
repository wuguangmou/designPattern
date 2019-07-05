解释器模式：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
类型：行为型。解释器模式是为了解释某一种语言，而为语言创建的解释器。

适用场景：某个特定问题发生的频率足够高的时候。

优点：语法由很多类表示，容易改变及扩展此语言。
缺点：当语法规则数目太多的时候，增加了系统的复杂度。

------------------------------------------------------------------------------------------------------------------------
JDK/Spring源码分析：
1.JDK中的正则表达式Pattern类：
java.util.Pattern类运用了解释器模式的设计思想，正则表达式就是一种语法，通过Pattern类中的正则解释器将其解释出来。

2.Spring中的解释器：
Spring的ExpressionParser类是一个解释器接口，其实现有SpelExpressionParser，InternalSpelExpressionParser、TemplateAwareExpressionParser。
SpelExpressionParser用于解释Spring中的EL表达式。
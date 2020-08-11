# java 常用设计模式



#### 七大软件设计原则

* 开闭原则（Open-Closed Principle）
  * `对拓展开放，对修改关闭`，大概意思就是如果你需要修改一个类的行为，请继承，或者组合等方式进行拓展修改，不要直接修改，这样会破坏原来代码的行为。
  * https://blog.csdn.net/CandyCCCation/article/details/88940953
* 依赖导致原则（Dependence Inversion Principle）
  * https://blog.csdn.net/CandyCCCation/article/details/88940953
* 单一指责原则（Simple Responsibility Pinciple）
  * https://blog.csdn.net/CandyCCCation/article/details/88899480
* 接口分离原则（Interface Segregation Principle）
  * https://blog.csdn.net/CandyCCCation/article/details/88899480
* 迪米特法则（Law of Demeter）
  * https://blog.csdn.net/CandyCCCation/article/details/88904313
* 合成复用原则（Composite/Aggregate Reuse Principle）
  * https://blog.csdn.net/CandyCCCation/article/details/88904313
* 里氏替换法原则（Liskov Substitution Principle）
  * https://blog.csdn.net/CandyCCCation/article/details/88904701

| 设计原则                                                | 一句话归纳                                         | 目的                                       |
| ------------------------------------------------------- | -------------------------------------------------- | ------------------------------------------ |
| 开闭原则（OCP）<br />（Open-Close）                     | 对扩展开放，对修改关闭                             | 减少维护带来新的风险                       |
| 依赖导致原则（DIP）<br />（Dependence Inversion）       | 高层不应该依赖底层                                 | 更利于代码结构的升级扩展                   |
| 单一职责原（SRP）<br />（Simple Responsibility）        | 一个类只干一件事情                                 | 便于理解，提高代码可读性                   |
| 接口隔离原则（ISP）<br />（Interface Segregation）      | 一个接口只干一件事情                               | 功能解耦，高聚合，低耦合                   |
| 迪米特法则（LoD）<br />（Law of Demeter）               | 不该知道的不要知道                                 | 只有朋友交流，不和陌生人说话，减少代码臃肿 |
| 里氏替换原则（LSP）<br />（Liskov Substitution）        | 子类重写方法功能发生改变，不应该影响父类方法的含义 | 防止继承泛滥                               |
| 合成复用原则（CAPP）<br />（Composite/Aggregate Reuse） | 尽量使用组合实现代码复用，而不使用继承             | 降低代码耦合                               |

《Design Pattern:Elements of Resusable Object-Oriented Software》(即后述，《设计模式》一书)

由Erich Gamma，Richard Helm, Ralph Johnson 和 John Vlissides 合著（Addison-Wesley 1995）

这几位作者常被成为“四人组”（Gang of Four），而这本书被称为“四人组”（或者GoF）书
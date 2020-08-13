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

这几位作者常被成为“四人组”（Gang of Four），而这本书被称为“四人组”（或者GoF）书。



#### GOF 设计模式分类

* 创建型(Creational)
  * 工厂方法模式（Factory Method）
  * 抽象工厂模式(Abstract Factory)
  * 建造者模式(Builder)
  * 单例模式(Singleton)
  * 原型模式(Prototype)
* 结构型(Structural)
  * 适配器模式（Adapter）
  * 装饰器模式 （Decorator）
  * 代理模式 （Proxy）
  * 门面模式（Facade）
  * 组合模式（Composite）
  * 享元模式（Flyweight）
  * 桥接模式（Brigde）
* 行为型(Behavioral)
  * 策略模式（Strategy）
  * 观察者模式（Observer）
  * 责任链模式（Chain of Responsibility）
  * 解释器模式（Interpreter）
  * 模版方法模式（Template Method）
  * 迭代器模式（Interator）
  * 中介者模式（Mediator）
  * 命令模式（Command）
  * 访问者模式（Visitor）
  * 备忘录模式（Memento）
  * 状态模式（State）



#### 创建型模式

|       设计模式        |       一句话归纳       | 目的                   | 生活案例 | 框架源码举例                          |
| :-------------------: | :--------------------: | ---------------------- | -------- | ------------------------------------- |
|   工厂模式(Factory)   | 产品标准化，生产更高效 | 封装创建细节           | 食品工厂 | LoggerFactory、Calender               |
| 单例模式（Singleton） |    世界上只有一个我    | 保证对象在应用中唯一性 | 太阳     | BeanFactory、Runtime                  |
| 原型模式（Prototype） | 把一根猴毛，吹出千万个 | 高效创建对象           | 克隆     | ArrayList，PrototypeBean              |
| 建造者模式（Builder） | 高配中配与低配，随心配 | 开放个性化配置步骤     | 适配     | StringBuilder、BeanDefinitionBiuilder |



#### 结构型模式

| 设计模式                | 一句话归纳                                 | 目的 | 生活案例 | 框架源码举例                                        |
| ----------------------- | ------------------------------------------ | ---- | -------- | --------------------------------------------------- |
| 代理模式（Proxy）       |                                            |      |          | ProxyFactoryBean、JdkDynamicAopProxy、CglibAopProxy |
| 门面模式（Facade）      | 一扇门，门的后面是世界                     |      |          | JdbcUtils、RequestFacade                            |
| 装饰器模式（Decorator） | 做蛋糕                                     |      |          |                                                     |
| 享元模式（Flyweight）   |                                            |      |          |                                                     |
| 组合模式（Composite）   | 拥有主干，功能一致，生命周期一致，同综同源 |      |          |                                                     |
| 适配器模式（Adapter）   | 兼容                                       |      |          |                                                     |
| 桥接模式（Bridege）     | 只用组合和委托                             |      |          |                                                     |



#### 行为型模式

| 设计模式                              | 一句话归纳                           | 目的                     | 生活案例           | 框架源码举例                       |
| ------------------------------------- | ------------------------------------ | ------------------------ | ------------------ | ---------------------------------- |
| 委派模式（Delegate）                  | 这个需求很简单，如何实现我不管       | 只对结果负责             | 不属于23种设计模式 | ClassLoader                        |
| 模版模式（Template）                  | 流程固定，部分微调                   |                          |                    |                                    |
| 策略模式（Strategy）                  | 选择权交给用户                       |                          |                    |                                    |
| 责任链模式（Chain of Responsibility） | 踢皮球，对感兴趣地负责，省略if语句   |                          | 踢皮球             | FilterChain                        |
| 迭代器模式（Iterator）                | 流水线上坐一天，每个包都过一遍       | 统一对集合地访问方式     |                    | Iterator                           |
| 命令模式（Command）                   |                                      | 解耦请求和处理           | 遥控器，FTP服务器  | Runnable                           |
| 状态模式（State）                     | 状态驱动行为，行为决定状态           | 绑定状态和行为           | 订单状态跟踪       | Lifecycle                          |
| 备忘录（Memento）                     | 给我一杯后悔药                       | 备份，支持撤回           | 草稿箱             | StateManagebleMessageContext       |
| 中介者（Mediator）                    | 太君托我给你带个话                   | 将网状资源整合，统一转发 | 朋友圈，群聊       | Timer                              |
| 解释器模式（Interpreter）             | 自定义方言                           | 实现特定地语法解析       | 摩斯密码           | Pattern。spring中的AOP表达式       |
| 观察者模式（Observer）                | 你关注的人更新啦                     | 解耦观察者和被观察者     | 关注更新提醒，闹钟 | ContextLoaderListener              |
| 访问者模式（Visitor）                 | 专人看专有数据，且只读模式，不能操作 | 解耦数据结构和数据操作   | PKI考核            | FileVisitor，BeanDefinitionVisitor |



#### 代理 VS 中介者

* 代理：职责增强，不仅要建立联系，还要参与过程
* 中介：只负责牵线搭桥，建立联系

#### 委派模式 VS 代理模式

* 委派：全权地静态代理，不做任何地增加，只是把你作为成员变量，然后调用你地方法
* 代理：一定会有增强操作，调用你地方法前后，会做一些小动作

没有任何功能地增强就叫委派

#### 命令vs 策略

命令：解耦请求和处理，会有一个回调，会反馈和处理方法

策略：固定好地选项，一定是同样地结果。

命令和策略都有自己地一个清单，对于命令而言，他是一个help 地列表，上面有所有可以操作的指令，当你执行地时候，会有一个回调或者说反馈，可能执行成功，也可能执行失败。而对应命令而言，请求和处理是可以写在一起地。只是为了解耦，所以在拆开来，写成了命令模式。

而策略是一定要用户来参与选择才可以地。



#### 代理模式  vs 装饰器模式

代理：组合实现功能地增强和扩展

装饰器：继承实现功能地增强和扩展



#### 委派模式vs责任链模式

委派：没有流程地概念，只是拿到结果，并不在意过程，因为过程是其它类做地

责任链：拥有流程，处理流程可扩展，可定制，最终结果是根据一个节点或者多个节点决定。



#### 代理模式vs中介者模式

代理：全程都要参与。跟进

中介者：只有开头没有结尾



#### 工厂方法 vs 抽象方法

工厂方法：产品地扩展，单向维度

抽象工厂：产品等级和产品簇相互扩展关系，多维度，至少二维



#### 桥接模式 vs 适配器模式

桥接：不用继承建立关系

适配器：类适配器用地继承，对象地适配器用地是组合，接口适配器实际上也是继承



#### 三种类型地设计模式的比较

* 行为：对Java 中地方法的使用提出地建议
* 结构：对Java类地组合提出地建议
* 创建：对创建Java对象地形式提出地建议
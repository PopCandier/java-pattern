#### 观察者模式（Observer Pattern）

又叫发布-订阅(Public/Subscribe)模式、模型-视图(Model/View)模式、源-监听器（Source/Listener）模式或从属者（Dependents）模式。定义一种对多的依赖关系，一个主题对象可被多个观察者对象同时监听，使得每当主题对象状态变化时，所有依赖于它的对象都会得到通知并被自动更新。

**属于行为型模式**

代码中体现的比较多的是 **回调**

#### 观察者模式的使用场景

* 当一个抽象模型包含两个方面内容，其中一个方面依赖于另一个方面
* 其它一个或多个对象的变化依赖于另一个对象的变化
* 实现类似广播机制的功能，无需知道具体收听者，只需要分发广播，系统中感兴趣的对象会自动接收该广播
* 多层级嵌套使用，形成一种链式触发机制，是的事件具备跨域（超越两种观察者类型）通知。



#### JDK 版本的实现

被观察者需要实现`Observable`，观察者需要实现`Observer`，编译器启动时候会自动扫描实现了Obervable的实现，放入Observer实现者中，调用详情请参考代码

#### Guava 版本实现

观察者模式的一个轻量级落地

```xml
<dependency>
	<groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>18.0</version>
</dependency>
```

被观察者

```java
/*
定一个观察者，类名随意
*/
public class GuavaEvent{
    /*
    方法名随意，传参随意
    只要加上了@Subscribe注解，且注册到了guava的事件里，就可以被回调
    */
    @Subscribe
    public void observer(Object arg){
        //回调的内容
        if(arg instanceof Question){
            // 判断，单独的逻辑，配合责任链使用
        }
    }
    
}

public class App{
    
    public static void main(String[] args){
        
        EventBus eventBus = new EventBus();//guva中的用于注册被观察者的对象
        
        GuavaEvent event = new GuavaEvent();
        eventBus.register(event);//注册完成
        
        eventBus.post(new Question("xiaoming","有一个问题"));
        
        //对应内容就会被回调
    }
    
}
```

 **观察者主要是为了实现回调**

#### 源码中的体现

javax中的ServletContentListener，用来监听每个servlet初始化和销毁的触发

spring中的ContextLoaderListener



#### 观察者的优点

* 观察者和被观察者是松耦合（抽象耦合）的，符合依赖导致原则
* 分离了表示层（观察者，接受通知的人）和数据逻辑层（被观察者，发布通知的人），并且建立了一套触发机制，是的数据发生变化可以响应到多个表示层上
* 实现了一对多的通讯机制，支持事件注册机制，支持兴趣分发机制，当被观察者触发事件时，只有感兴趣的观察者可以接受到通信。

#### 观察者的缺点

* 如果观察者数量过多，则事件通知会耗时较长；
* 时间通知呈线性关系，如果其中一个观察者处理时间卡壳，会影响后续观察者接受该时间（增加超时时间？）
* 如果观察者和被观察者之间存在依赖关系，则可能造成两者之间的循环调用，导致系统崩溃
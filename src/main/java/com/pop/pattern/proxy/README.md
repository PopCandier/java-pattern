#### 代理模式

属于结构型模式，用于保护对象，和增强对象。

对于静态代理来说，代理方与被代理方都应该实现同一个接口。来保证他们的行为是一致的

```java
public interface IPerson {
   
    void findLove();
    
}

public class Xiaoming implements IPerson{
    
    public void findLove(){
        System.out.print("寻找动作");
    }
    
}

public class Laoming implements IPerson{
    
    private Xiaoming xiaoming;
    
    public Laoming(Xiaoming xiaoming){
        this.xiaoming = xiaoming;
    }
    
    public void findLove(){
        //laoming有自己的手段，找到更好的资源，或者更合适的场景
        // 去筛选资源。
        xiaoming.findLove();
    }
    
}

```

https://github.com/PopCandier/Java-Design-model/blob/master/proxy/cglib/

cglib总的来说要比jdk效率更高，他有自己一套api，不依赖jdk，且他不使用反射。

`cglib不会代理目标对象的final方法`

#### 代理模式的优点

* 优点
  * 代理模式能够将代理对象和真实被调用的对象分离，一定程度上降低了系统的耦合性，易于拓展。
  * 代理可以起到保护目标对象作用（用户不会直接访问，直接调用目标对象的方法）
  * 增强目标对象职责。
* 缺点
  * 造成系统中类的数目增加
  * 中间多了一个代理对象，请求速度会变慢。

spring中代理选择原则

* 当Bean有实现接口时，Spring会选择JDK动态代理

* 当Bean没有使用接口的时，SpringUI使用cglib

* spring可以强行配置使用cglib

  * ```xml
    <aop:aspectj-autoproxy proxy-target-class="true">
    ```

    

#### 请总结静态代理和动态代理的区别

静态代理：硬编码，手动注入，必须实现被代理对象的借口，手动调用。

动态代理：具有更强的拓展性，自动注入，只需要持有被代理被就可以被动态代理。
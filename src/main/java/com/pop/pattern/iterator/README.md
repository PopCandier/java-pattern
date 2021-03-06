#### 迭代器模式（Iterator Pattern）

又称为游标模式（Cursor Pattern），它提供了一种顺序访问集合/容器对象元素的方法，而又无须暴露集合内部表示。

本质：抽离集合对象迭代行为到迭代器中，提供一致访问结接口

**属于行为性模式**



#### 迭代器模式的适用场景

* 访问一个集合对象的内容而无需暴露它的内部表示
* 为遍历不同的集合结构提供一个统一的访问接口

这里和组合模式区别开来，组合模式是具有一致性目的的，且有父子关系。而迭代器只是有一个共同点，方便迭代操作。

例如每次检票入门，刷脸进去，因为大家都是个人，这一共同点，所以可以直接进去，还有快递打包，无论什么快递都可以打包成快递。



例如我们熟悉的HashMap和ArrayLIst都提供了迭代接口，所以，我们可以在不在意他们各自数据结构的情况下，获得他们每个子元素的情况。这就是迭代器模式的优点。



#### 迭代器模式的优点

* 多态迭代：为不同的聚合结构提供一致的遍历接口，即一个迭代接口可以访问不同的聚合对象
* 简化集合对象接口，迭代器模式将集合对象本身应该提供的元素迭代接口抽取到迭代器中，使集合对象无须关心具体迭代行为
* 元素迭代功能多样化，每个集合对象都可以提供一个或多个不同的迭代器，使的同种元素聚合结构可以有不同的迭代行为
* 解耦迭代与集合：迭代器模式，封装了具体的迭代算法，迭代算法的变化，不会影响到集合对象的结构



#### 迭代器模式的缺点

* 对于比较简单的遍历（像数组或者有序列表），使用迭代器方式遍历较为繁琐。



这个模式基本很少用到，如果你要自己设计一个比较复杂的数据结构，且需要被迭代的话，也许就可以考虑这个。
package com.pop.pattern.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pop
 * @date 2020/7/21 0:45
 *
 * 父节点，也实现自己的方法，对子节点起到管理作用。
 */
public class CoursePackage extends CurseComponent {

    private String name;
    private Integer level;//层级，用这个来区别不同package之间的关系

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    /**
     * 请注意这里为什么不写
     * List<Course> 的关键。
     * 在于如果写了后，就无法兼容其他类型。
     * 也就是说他只能管理Course这种类型，无法再去管理其他继承了CursComponent的组件。
     * 就造成了组合的不合理，现在只要用这一个父抽象组件就搞定了
     */
    private List<CurseComponent> items = new ArrayList<>();

    /**
     * 具体父节点去实现自己需要实现的方法
     */
    public void addChild(CurseComponent curseComponent) {
        this.items.add(curseComponent);
    }
    
    public void removeChild(CurseComponent curseComponent) {
       this.items.remove(curseComponent);
    }

    @Override
    public void print() {
        //具体打印方法，就不实现了
    }
}

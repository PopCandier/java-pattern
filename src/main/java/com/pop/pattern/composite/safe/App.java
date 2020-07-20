package com.pop.pattern.composite.safe;

/**
 * @author Pop
 * @date 2020/7/21 0:55
 */
public class App {

    public static void main(String[] args) {

        //定义课程，类似子节点
        Course javaBase = new Course("Java入门课程",2000);
        Course ai = new Course("人工智能",5000);

        //定义管理他们的课程的目录，类似分叉位置
        CoursePackage packageCourse = new CoursePackage("Java课程",2);//位于2级目录

        CoursePackage base = new CoursePackage("根目录",1);//层级最高，为1

        //将他们组合起来
        packageCourse.addChild(javaBase);

        base.addChild(ai);//将ai节点包含金进来
        base.addChild(packageCourse);//分支也可以

        base.print();

        /**
         *  根目录
         *      人工智能
         *      Java课程
         *          Java入门课程
         */

        //安全写法，是无法点出不属于他的方法的，比较安全
        //javaBase.addChild(null);
    }

}

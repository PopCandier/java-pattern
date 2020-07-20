package com.pop.pattern.composite.transparent;

/**
 * @author Pop
 * @date 2020/7/21 0:55
 */
public class App {

    public static void main(String[] args) {

        //定义课程，类似子节点
        CurseComponent javaBase = new Course("Java入门课程",2000);
        CurseComponent ai = new Course("人工智能",5000);

        //定义管理他们的课程的目录，类似分叉位置
        CurseComponent packageCourse = new CoursePackage("Java课程",2);//位于2级目录

        CurseComponent base = new CoursePackage("根目录",1);//层级最高，为1

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

        //但是，如果课程去调用addChild方法的话
        javaBase.addChild(null);//会报错，因为本身Course是没有实现这个方法的
        //不支持这个操作的异常，这是透明组合模式的一个问题，对调用者来说，他会觉得很奇怪，因为这个方法是会报错的。
    }

}

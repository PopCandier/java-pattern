package com.pop.pattern.visitor;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-08-09 22:47
 **/
public class App {

    public static void main(String[] args) {

        IVisitor ceo = new CEO();

        IVisitor cto = new CTO();

        Excel excel = new Excel();

        excel.showData(ceo);

        excel.showData(cto);

        /**
         * 不同的访问者访问某个系统会得到他们不同的结果
         */

    }

}

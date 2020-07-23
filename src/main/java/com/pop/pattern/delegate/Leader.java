package com.pop.pattern.delegate;

/**
 * @author Pop
 * @date 2020/7/23 23:46
 */
public class Leader implements IEmployee {
    @Override
    public void work(String task) {

        if("软件架构".equals(task)){
            //让擅长软件架构的人来
            new EmployeeA().work(task);
        }else if("底层涉及".equals(task)){
            new EmployeeB().work(task);
        }else{
            //与门面模式一个很直接的区别，超过能力范围将无法委派
            System.out.println("不擅长的领域，将不会委派");
        }

    }
}

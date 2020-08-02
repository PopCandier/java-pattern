package com.pop.pattern.mediator;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-08-02 22:53
 **/
public class App {
    /**
     * 中介者模式，只做消息的转派，并不做其他事情
     *
     */
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user = new User("小明");
        User user1 = new User("小红");

        user.sendMessage("你好",chatRoom);
        user1.sendMessage("me too",chatRoom);

        //作为拓展，类似 User 这种，可以做一层抽象，也被称呼为同事类
    }
}

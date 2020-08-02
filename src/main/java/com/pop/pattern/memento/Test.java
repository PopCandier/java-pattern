package com.pop.pattern.memento;

/**
 * @program: java-pattern
 * @description:
 * @author: Pop
 * @create: 2020-08-02 21:24
 **/
public class Test {

    public static void main(String[] args) {
        /**
         * 模拟 文本编辑器，能够对内容进行修改，也可以进行恢复到以前的版本
         */
        DraftBox box = new DraftBox();

        Editor editor = new Editor("标题","内容");

        Memento memento=editor.save2Memento();//保存到草稿箱，生成一个快照
        box.addMemento(memento);//存入备忘录

        //对编辑器内容进行修改
        editor.setContent("修改后的内容");
        //再存入草稿箱
        box.addMemento(editor.save2Memento());

        //然后现在垃圾箱里面有两个快照，想要撤回到以前的版本
        editor.undoFromMemento(box.getMemento());//垃圾箱的内容是stack结构
        //这会弹出最后保存的信息
    }

}

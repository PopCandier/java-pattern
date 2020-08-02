package com.pop.pattern.memento;

/**
 * @program: java-pattern
 * @description: 编辑器
 *
 * 备忘录模式 第一组件， “发起人”
 * 对备忘录进行操作的对象
 * @author: Pop
 * @create: 2020-08-02 20:47
 **/
public class Editor {

    /**
     * 编辑
     */

    private String title;
    private String content;

    public Editor(String title,String content){
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setContent(String content){
        this.content = content;
    }
    /**
     * 保存备忘录
     */
    public Memento save2Memento(){
        Memento memento = new Memento(title,content);
        return memento;   //生成快照返回
    }

    public void undoFromMemento(Memento memento){
        this.title = memento.getTitle();
        this.content = memento.getContent();
    }


}

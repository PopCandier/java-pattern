package com.pop.pattern.bridge;

/**
 * @author Pop
 * @date 2020/7/22 23:35
 */
public class AbstractCourse implements ICourse {

    private IVideo video;
    private INote note;

    public void setVideo(IVideo video) {
        this.video = video;
    }

    public void setNote(INote note) {
        this.note = note;
    }

    @Override
    public void course() {
        //一个具体实现
    }
}

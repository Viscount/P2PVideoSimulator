package vedio.entity;

/**
 * Created by Jaric Liao on 2015/11/1.
 */
public class Video {
    private long id;
    private String name;
    private long size;
    private int fps;

    public Video(long id, String name) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }
}

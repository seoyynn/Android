package com.example.app0210;

import android.graphics.drawable.Drawable;

public class MsgVO {

    private int ImageResource;
    private String name;
    private String message;
    private String time;

    public MsgVO(int ImageResource, String name, String message, String time){
        this.ImageResource = ImageResource;
        this.name = name;
        this.message = message;
        this.time = time;
    }

    public int getImageResource() {
        return ImageResource;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public void setImageResource(int imageResource) {
        ImageResource = imageResource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MsgVO{");
        sb.append("ImageResource=").append(ImageResource);
        sb.append(", name='").append(name).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", time='").append(time).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

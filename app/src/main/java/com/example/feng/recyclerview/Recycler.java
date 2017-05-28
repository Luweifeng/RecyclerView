package com.example.feng.recyclerview;

/**
 * Created by Feng on 2017/5/27.
 */

public class Recycler {
    private String name;
    private int imgId;

    public Recycler(String name,int imgId){
        this.name=name;
        this.imgId=imgId;

    }

    public String getName() {
        return name;
    }

    public int getImgId() {
        return imgId;
    }


}

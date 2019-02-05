package com.recyclerview.liuyixi.recyclerview;

/**
 * Created by liuyixi on 18-9-2.
 */
//定义一个实体类作为适配器的适配类型
public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}

package com.company;

public class Ecosystem {
    private int width;
    private int height;

    private WaterSpot waterSpot;

    public Ecosystem(){
        width = 120;
        height = 30;
        waterSpot= new WaterSpot(500,width/4,height/4);
    }


}

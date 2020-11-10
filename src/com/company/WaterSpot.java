package com.company;

public class WaterSpot {
    private int WaterQuantity;
    private int Width;
    private int Height;
    private Coords coords;

    public WaterSpot(int waterQuantity, int width, int height) {
        WaterQuantity = waterQuantity;
        Width = width;
        Height = height;
        coords = new Coords(0,0);
    }
}

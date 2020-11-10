package com.company;

public class Predator {
    private int AgeNow;
    private int AgeMax;
    private static final int AgeMaxAll = 40;

    private int NbLifePointsNow;
    private int NbLifePointsMax;
    private static final int NbLifePointsMaxAll = 120;

    private Smelling smelling;
    private Vision vision;
    private Coords coords;

    public Coords move(){
        Coords coords = new Coords();
        //Code pour déterminer les nouvelles coordonnées
        //Par exemple le but à atteindre
        return coords;
    }
    public void hunt(Prey prey){

    }
    public void mate(Predator predator){

    }
    public void eat(Prey prey){

    }
    public void drink(WaterSpot waterSpot){

    }
}

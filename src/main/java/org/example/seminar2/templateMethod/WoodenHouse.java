package org.example.seminar2.templateMethod;

public class WoodenHouse extends HouseBuilding {
    @Override
    protected void buildWalls() {
        System.out.println("возведение стен из деревянных брусьев");
    }
    @Override
    protected void buildRoof(){
        System.out.println("строительство деревянной крыши");
    }

}

package org.example.seminar2.templateMethod;

public class PanelHouse extends HouseBuilding {
    @Override
    protected void buildWalls() {
        System.out.println("возведение стен из ж/б панелей");
    }
    @Override
    protected void buildRoof(){
        System.out.println("строительство ж/б крыши");
    }
    // переопределяем хук
    @Override
    protected void additionalAction() {
        System.out.println("облицовка фасада плиткой");
    }
}

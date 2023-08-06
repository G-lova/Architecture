package org.example.seminar2.templateMethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("---стротельство панельного дома---");
        HouseBuilding panelHouse = new PanelHouse();
        panelHouse.build();
        System.out.println("---стротельство деревянного дома---");
        HouseBuilding woodenHouse = new WoodenHouse();
        woodenHouse.build();
    }
}

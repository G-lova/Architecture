package org.example.seminar2.templateMethod;

public abstract class HouseBuilding {
    //template method
    public void build() {
        buildFoundation();   // шаг 1, возведение фундамента
        buildWalls();        // шаг 2, возведение стен
        buildRoof();         // шаг 3, строительство крыши
        insertWindows();     // шаг 4, вставка окон и дверей

        //hook
        additionalAction();  // шаг 5, дополнительное действие
    }

    protected void buildFoundation() {
        System.out.println("возведение фундамента");
    }

    abstract protected void buildWalls();

    protected void buildRoof() {
    }

    protected void insertWindows() {
        System.out.println("вставка окон и дверей");
    }

    //hook с пустым телом
    protected void additionalAction() {
    }
}

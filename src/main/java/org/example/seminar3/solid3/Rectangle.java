package org.example.seminar3.solid3;

public class Rectangle implements Figure {
    protected int width;
    protected int height;

    Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }


    public int getArea() {
        return width * height;
    }
}

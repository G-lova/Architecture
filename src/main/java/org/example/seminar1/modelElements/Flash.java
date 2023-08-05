package org.example.seminar1.modelElements;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    public void rotate(Angle3D angle) {
        System.out.println("вращение");
    }

    public void move(Point3D location) {
        System.out.println("перемещение");
    }
}

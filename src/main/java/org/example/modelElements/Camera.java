package org.example.modelElements;

public class Camera {
    public Point3D location;
    public Angle3D angle;

    public void rotate(Angle3D angle) {
        System.out.println("вращение");
    }

    public void move(Point3D location) {
        System.out.println("перемещение");
    }
}

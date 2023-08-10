package org.example.seminar4;

// Класс для треугольника
class Triangle extends Shape {
    // Поля для класса треугольника
    private double side1;
    private double side2;
    private double side3;

    // Конструктор для треугольника
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Метод нахождения площади треугольника
     *
     * @return площадь треугольника
     */
    @Override
    double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Метод нахождения периметра треугольника
     *
     * @return периметр треугольника
     */
    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }
}
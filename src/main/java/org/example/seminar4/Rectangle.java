package org.example.seminar4;

// Класс для прямоугольника
class Rectangle extends Shape {
    // Поля для класса прямоугольника
    private double length;
    private double width;

    // Конструктор для прямоугольника
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Метод нахождения площади прямоугольника
     *
     * @return площадь прямоугольника
     */
    @Override
    double getArea() {
        return length * width;
    }

    /**
     * Метод нахождения периметра прямоугольника
     *
     * @return периметр прямоугольника
     */
    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}

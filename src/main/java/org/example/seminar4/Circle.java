package org.example.seminar4;

// Класс для круга
class Circle extends Shape {
    // Поля класса круга
    private double radius;

    // Конструктор для круга
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Метод нахождения площади круга
     *
     * @return площадь круга
     */
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Метод нахождения периметра круга
     *
     * @return периметр круга
     */
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
package com.example.oracle;

public class Parallelogram extends Shape {
    private int width;
    private int height;

    // Constructor
    public Parallelogram(int x, int y, int width, int height) {
        super(); // Call default constructor
        this.x = x;  // Set inherited x field
        this.y = y;  // Set inherited y field
        this.width = width;
        this.height = height;
    }

    // Calculate area
    public double getArea() {
        return width * height;
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Objects;

public class Rectangle implements Comparable<Rectangle> {
    private int width;
    private int height;

    public Rectangle() {
        super();
    }

    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSquare() {
        return height * width;
    }

    @Override
    public int compareTo(Rectangle o) {
        if (o == null) {
            throw new NullPointerException();
        }
        if (this.getSquare() - o.getSquare() < 0) {
            return -1;
        }
        if (this.getSquare() - o.getSquare() > 0) {
            return 1;
        }
        if (this.width - o.width < 0) {
            return -1;
        }
        if (this.width - o.width > 0) {
            return 1;
        }
        return this.height - o.height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

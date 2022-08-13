package com.codegym;

public class Square extends Shape implements Colorable{
    private double side;

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides " +getColor());
    }
    @Override
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return 4*side;
    }
}

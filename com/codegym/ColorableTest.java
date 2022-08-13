package com.codegym;

public class ColorableTest {
    public static void main(String[] args) {
        Shape shape1=new Circle(3);
        Shape shape2=new Rectangle(3,4);
        Shape shape3=new Square("red",false,3);
        Shape[] shapes={shape1,shape2,shape3};
        for (Shape s:shapes
             ) {
            System.out.println("Area is: "+ s.getArea());
if(s instanceof Square){
    Square t=(Square) s;
    t.howToColor();
}
        }
    }
}

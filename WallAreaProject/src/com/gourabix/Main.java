package com.gourabix;

public class Main {

    public static void main(String[] args) {

        Wall wall = new Wall(5, 4);
        System.out.println("Area of a wall with width = 5 and height = 4 is equal to " + wall.getArea());

        wall.setHeight(6);
        System.out.println("Area of a wall with width = 5 and height = 6 is equal to " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Wall height = " + wall.getHeight());
        System.out.println("Wall width = " + wall.getWidth());
        System.out.println("Wall area = " + wall.getArea());

    }
}

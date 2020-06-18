package com.gourabix;

public class Main {

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        System.out.println("---------------------------------------------------------");

        Point point1 = new Point(5, 4);
        System.out.println("Distance between (0, 0) and (5, 4) = " + point1.distance());

        Point point2 = new Point(6,9);
        System.out.println("Distance between (6, 9) and (0, 0) = " + point2.distance());

        Point point3 = new Point(12, 5);
        System.out.println("Distance between (12, 5) and (6, 8) = " + point3.distance(6, 8));

        Point point4 = new Point(9, -6);
        Point point5 = new Point(2, 4);
        System.out.println("Distance between (9, -6) and Point {(2, 4)} = " + point4.distance(point5));
    }
}

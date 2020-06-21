package com.gourabix;

import java.util.ArrayList;

class IntClass {
    private int myInt;

    public IntClass(int myInt) {
        this.myInt = myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<IntClass> myIntClassArrayList = new ArrayList<IntClass>(10);
        IntClass intClass1 = new IntClass(45);
        IntClass intClass2 = new IntClass(79);
        myIntClassArrayList.add(intClass1);
        myIntClassArrayList.add(intClass2);

        for (int i = 0; i < myIntClassArrayList.size(); i++) {
            System.out.println(myIntClassArrayList.get(i).getMyInt());
        }

        ArrayList<String> myStrArrayList = new ArrayList<String>();
        myStrArrayList.add("Hello");
        myStrArrayList.add("This is Autoboxing and unboxing.");
        System.out.println(myStrArrayList.toString());

        Integer myInteger = new Integer(5);
        Double myDouble = new Double(12.25);
        System.out.println(myInteger.intValue());
        System.out.println(myDouble.doubleValue());

        System.out.println();

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));          // This is an example of autoboxing.
        }

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(integerArrayList.get(i).intValue());         // This is an example of unboxing.
        }

        System.out.println();

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double dbl = 0.0; dbl < 10.0; dbl += 1.5) {
            doubleArrayList.add(dbl);               // same as doubleArrayList.add(Double.valueOf(dbl) -- Autoboxing
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            System.out.println(doubleArrayList.get(i));    // same as doubleArrayList.get(i).doubleValue() -- Unboxing
        }

    }
}

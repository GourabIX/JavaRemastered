package com.gourabix;

public class Main {

    public static void main(String[] args) {

        ComplexNumber complexNumber = new ComplexNumber(2.65, 8.94);
        System.out.println("Real part of the complex number: " + complexNumber.getReal());
        System.out.println("Imaginary part of the complex number: " + complexNumber.getImaginary());
        complexNumber.add(5, -3.64);
        System.out.println("Updated complex value after addition: " + complexNumber.getReal() + " + " +
                complexNumber.getImaginary() + "i.");

        ComplexNumber complexNumber1 = new ComplexNumber(2.21, -9.12);
        System.out.println("Real part of the complex number: " + complexNumber1.getReal());
        System.out.println("Imaginary part of the complex number: " + complexNumber1.getImaginary());
        complexNumber.add(complexNumber1);
        System.out.println("Updated complex value after addition: " + complexNumber.getReal() + " + " +
                complexNumber.getImaginary() + "i.");

        ComplexNumber complexNumber2 = new ComplexNumber(9.25, 8.00);
        complexNumber2.subtract(complexNumber1);
        complexNumber2.subtract(2.00, -5.04);
        System.out.println("Updated complex value after subtraction x 2: " + complexNumber2.getReal() + " + " +
                complexNumber2.getImaginary() + "i.");
    }
}

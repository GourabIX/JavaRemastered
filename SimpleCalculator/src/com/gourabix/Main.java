package com.gourabix;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(12.63);
        calculator.setSecondNumber(6.25);

        System.out.println("12.63 + 6.25 = " + calculator.getAdditionResult());
        System.out.println("12.63 - 6.25 = " + calculator.getSubtractionResult());
        System.out.println("12.63 * 6.25 = " + calculator.getMultiplicationResult());
        System.out.println("12.63 / 6.25 = " + calculator.getDivisionResult());
        System.out.println("-----------------------------------------------");

        SimpleCalculator calculator1 = new SimpleCalculator();

        calculator1.setFirstNumber(54.0);
        calculator1.setSecondNumber(0.0);

        System.out.println("54.0 + 0.0 = " + calculator1.getAdditionResult());
        System.out.println("54.0 - 0.0 = " + calculator1.getSubtractionResult());
        System.out.println("54.0 * 0.0 = " + calculator1.getMultiplicationResult());
        System.out.println("54.0 / 0.0 = " + calculator1.getDivisionResult());
    }
}

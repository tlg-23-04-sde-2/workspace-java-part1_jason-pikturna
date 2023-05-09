package com.mathhelp;



class CalculatorClient {

    public static void main(String[] args) {

        double sum = Calculator.add(3,5.2);
        /*this is an implicit upcast
         * meaning that any 32-bit integers in a double sum will be up-scaled to 64-bit doubles
         */
        System.out.println("The sum is: " + sum);


        // Can use the class name CALCULATOR since all methods are class-level

        System.out.println("The difference is: " + Calculator.subtract(3.1,5.1));



        int input = 10;
        System.out.println("Ten is even: " + Calculator.isEven(input));




        System.out.println("Ten is even: " + Calculator.isEven(10));

        System.out.println();

        System.out.println(Calculator.getRandomInt());

        System.out.println(Calculator.getRandomInt(5,20));
        System.out.println();

        System.out.println(Calculator.getAverage(3,5,9,9));  // any number of "loose" ints
        System.out.println(Calculator.getAverage(56));  // I MUST pass at least one

    }
}
package com.mathhelp;
/*
 * This is an "all-static" class, i.e., one that contains ONLY STATIC METHODS
 */

class Calculator {

    //add, subtract, isEven
   public static double add(double a, double b){
        return a + b;

    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
        // % is "module"  it calculates how many times a defined integer (the 2) goes into YOUR integer
        // == is for COMPARISON
    }

    //Business requirement:  Returns a random integer between 1 and 14
    //HINT:  see a class called Math (in package java.lang), look for a helpful method here
    //NOTE:  these methods in the math class are all "static," which means you called them as Math.methodName()

    public static int getRandomInt() {
        int result = 0;  // declare return value as a local variable

        double rand = Math.random(); //0.0000... to 0.99999...
        double scaled = (rand * 14)+1;   //0.0000... to 13.9999999....

        //convert (via explicit downcast) the double to int
        result = (int) scaled; // 1 to 14
        return result;
    }

    /*
     * Returns a random integer between 'min' and 'max' (inclusive)
     */
   public static int getRandomInt(int min , int max) {
       int result = 0;
       double rand = Math.random();     // 0.000000 to 0.99999
       double scaled =rand * (max-min) + min; // 5.000000 to 19.985

       double rounded = Math.ceil(scaled); // 5.0000 to 20.0000
       return (int) rounded;

    }
//    public int getRandomInt(int min, int max) {
//       int result = 0;
//
//       double rand = Math.random();
//       double scaled = rand * (max-min +1);
//       result = (int) (scaled + min);
//
//       return result;
//    }
    //this is an alternate version without using ceil

    /*
     * Returns the average (arithmetic mean) of the supplied integers.
     * getAverage()
     * aveInt()
     * getMean()
     */
     public static double getAverage(int first, int... rest) {  //client can pass any number of ints (ie 3,5,9,9)
         double result = 0.0;
         double sum = first;
         for (int value : rest) {
             sum = sum + value;     // sum += value  is an alternate way of doing this

         }
         result = sum / (1 + rest.length); // at runtime, rest IS AN ARRAY

         return result;

     }
}
package ex.periment;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int [] ages = new int[4];
        ages[0] = 60;
        ages[1] = 57;
        ages[2] = 32;
        ages[3] = 30;
        System.out.println(ages.length);
        //sout(ages) will return nonsense;  you need to pass it to Array.toString(ages); Arrays are a static class with special methods
        System.out.println(Arrays.toString(ages));

        double[] temps = {64.0, 56.9, 83.4, 49.0, 98.6 };
        for(double temp : temps) {
            System.out.println("The temperature is:  " + temp);
        }
        System.out.println();

        for (int i = 0; i < temps.length; i++) {
            System.out.println("The temperature is:  " + temps[i]);

        }

    }
}
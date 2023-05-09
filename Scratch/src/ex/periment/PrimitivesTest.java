package ex.periment;

/*
 *
 */
class PrimitivesTest {

    public static void main(String[] args) {
        int age = 30;
        System.out.println("This goober is " + age + " years old");

        double weight = 197.6;

        System.out.println("This goober is " + weight + " pounds of 100% AMERICAN ANGUS");

        boolean hasGuns = true;

        System.out.println("This Goober has Guns: " + hasGuns);

        char shirtSize = 'L';

        System.out.println("This Goober wears " + shirtSize + "-sized shirts");

        long population = 8_000_000_000L;

        System.out.println("Goobers competing for resources: " + population);

        String name = "Goober";
        System.out.println("The name is " + name);

        //TODO:  print the following sentence (as a string)
        //the word "belly" makes me laugh
        System.out.println("The word \"belly\" makes me laugh");
        /*the backslash is the "escape character"
         *These are necessary if your quoted phrase for printing ALSO contains quotes
         */

        int i = 18;
        int j = i;
        //assignment runs right to left, so it follows common logic.  i = 18 = j, so j = 18
        i++;
        //This is to increase the increment of integer "i"
        //"i" is now 18 + 1 = 19
        //"j" was born from "i" at a time when i=18

        System.out.println("j is: " + j); // is it still 18, or is it 19 now?
         //"j" is still 18.  There is no linkage in value with primitives
        //"i" is now 19, but "j" remains unaffected
        System.out.println();

        int x = 3;
        System.out.println("x is: " + ++x);
        // ++x is a PRE-increment.  If run in the print, then will increase increment of "x" PRIOR to print
        //x++ is a POST-increment.  If run in the print, then will increase increment of "x" AFTER to print

    }
}
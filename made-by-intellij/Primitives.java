public class Primitives {
    // the parameter name can be whatever, not required to be args (but it is the norm)
    public static void main(String[] args) {
        /*
        smallest bits of data you wll work with in Java are primitives:
        these represent numbers, characters and logical true/false
        great resrouce to use is w3schools or baeldung
         */
        // numerical data storage types
        byte myByte = 127;
        short myShort = 127;
        int myNumber = 10;
        long myLong = 127;
        float myFloat = 10.0f;
        double myDouble = 10.0;

        boolean myBoolean = true; // lowercase true/false

        char myChar = 'a'; // single quotes

        /*
        while java does not manually coerce your types you can do so yourslef
        for instance if you want to add extra precision to an integer you can "cast"
        it as a float
         */
        int impreciseNumber = 99;
        // (float) casts our int to float
        float preciseNumber = (float) impreciseNumber;
        System.out.println(preciseNumber);
        preciseNumber = 99.999f;
        System.out.println(preciseNumber);
        int backToImpreciseNumber = (int) preciseNumber;
        System.out.println(backToImpreciseNumber);

        /*
        can also cast types between the whole number and floating point type as well,
        but this gets a little tricky
        widening types via casting is usually safe
        narrowing types via casting can lead to issues
         */

        // widening of data primitives - safe
        int myAge = 56;
        long myLongAge = (int) myAge;
        System.out.println(myAge);
        System.out.println(myLongAge);
        // narrowing of data primitives - not safe
        long secondsFromDinosDisappearing = 12345600000000000L; // include 'L'
        int secondsFromDinosDisappearingInt = (int) secondsFromDinosDisappearing;
        System.out.println(secondsFromDinosDisappearing);
        System.out.println(secondsFromDinosDisappearingInt); // narrowing types can cause issues

        /*
        any time you are doing string manipulation be aware you will be working with chars instead of strings
        if accessing individual characters
         */

        /*

         */

    }
}

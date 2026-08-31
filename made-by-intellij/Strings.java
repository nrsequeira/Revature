public class Strings {
    public static void main(String[] args) {
        //  Strings are onoe of the more common data structures you will use
        // they represent words, statements, written data in general.
        // strings are immutable, stringbuilder and stringbuffer are mutable, with stringbuffer being multi-thread safe
        // because they are so commonly used java implements them with some unique rules that other objects do not have

        // stored in a special place in memory called the string pool, reserved memory space where only strings are stored
        // all objects are stored in the heap (strings are objects therefore string pool is stored in the heap)
        // references to the objects can be stored on the stack
        // "==" equality operator compares the actual value of the primitive variable, but compares the memory location
        // of objects
        int firstnum = 10;
        int secondnum = 10;

        System.out.println(firstnum == secondnum);

        String name = "Billy";
        // creates a new name string object instead of referencing the already exisiting "Billy" Object
        String nameNew = new String ("Billy");
        String nameAgain = "Billy";

        System.out.println(name);
        System.out.println(nameAgain);
        // "==" equality  operator compares the memory location of the string object not the contents of the string
        System.out.println(name == nameNew); // same contents but different object instances (different memory locations)
        System.out.println(name == nameAgain); // same contents and same object instances (same memory locations)

        // ".equals() belongs to the base object class, compares the contents of the string
        boolean stringsAreEqual = name.equals(nameAgain);
        System.out.println(stringsAreEqual);

        // creates a new string object with the contents of "Billy BIllyson"
        // does not modify the "Billy" object
        // name updates the reference from "Billy" object to "Billy Billyson"
        // old "Billy" object has not been changed. Strings are immutable
        name = name + " Billyson";
        System.out.println(name);

        // String manipulation, specifically changing a String value permanently, is not a thing, since strings are
        // immutable, but there are plenty of ways we can alter the displaying of String data

        System.out.println(name); // shows the raw string data
        System.out.println(name.toLowerCase()); // shows the text contents in all lowercase
        System.out.println(name.substring(6)); // "Billy"
        System.out.println(name.substring(6,12)); // "Billys" starting at index position 6 and up to but not including index 12

        /*
        if you ever want to do some String manipulation you are better off using StringBuilder object (use StringBuffer
        if in an environment where you expect multiple threads to compete for the same resources

        StringBuilder is designed to handle String manipulation and persist those changes.
         */

        StringBuilder nameBuilder = new StringBuilder(name); // stringbuilder object, set initial value to "Billy Billyson"
        System.out.println(nameBuilder);
        nameBuilder.reverse();
        System.out.println(nameBuilder);
        nameBuilder.reverse();
        nameBuilder.append(" Billerton");
        System.out.println(nameBuilder);
        nameBuilder.insert(15, "The Third ");
        System.out.println(nameBuilder);
        int location = nameBuilder.indexOf("The Third"); // case sensitive
        System.out.println(location);
        int location2 = nameBuilder.indexOf("The third"); // lower case does not match, will return -1
        System.out.println(location2);
        int end = nameBuilder.lastIndexOf(" ");
        System.out.println(end);
        nameBuilder.replace(15, nameBuilder.lastIndexOf(" ") + 1, "");
        System.out.println(nameBuilder);
    }
}

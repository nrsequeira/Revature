import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
    public static void main(String[] args) {
        /*
        all primitives have a Class to represent them, these are typically used when you need to declare that primitive
        data is stored in a data structure (ex: lists and sets) but they also provide a handful of helper method
         */

        // NOTE we specify the List will store Integers (class reference)
        List<Integer> myNumbers = new ArrayList<>();
        // NOTE: however when we add numbers to the list we provide primitives
        myNumbers.add(1); // auto-boxing: converting the primitive value into the class object
        myNumbers.add(2);
        myNumbers.add(3);
        /*
        when the primitive is added to the List, Java performs autoboxing and converts the primitive into its object form,
        and then we access the value Java unboxes the object back into a primitive
         */
        System.out.println(myNumbers.getFirst());

        /*
        primitive classes also have a myriad of helper methods that can be used to interact with and manipulate primitives.
        primitives are not objects and therefore they do not have access to methods. the wrapper classes for the primitives
        do have access to helper methods
         */
        int myNumber = Integer.parseInt("23");
        System.out.println(myNumber);
    }
}

import java.util.Arrays;

public class ArrayA {
    public static void main(String[] args) {
        //creates a array of String data types
        String[] fruits = {"apple", "pear", "peaches"};
       
        //calls the fruit that's in position "0" of the array. Arrays positional count starts with "0"
        System.out.println(fruits[0]);
       
        //overwrites the data in position "0" of the array
        fruits[0] = "orange";

        //"orange" overwrites "apple" at position "0"
        System.out.println(Arrays.toString(fruits));

        //but you will noticed that once an array is initalized it's length can not change.
        int fruitsLength = fruits.length;

        System.out.println(fruitsLength);

        //Uncommnet the line of code below for an example of fixed size of arrays
        // fruits[3] = "apple";
        // System.out.println(Arrays.toString(fruits));
    }
}

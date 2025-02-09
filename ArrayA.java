import java.util.Arrays;

public class ArrayA {
    public static void main(String[] args) {
        //creates a array of String data types
        String[] fruits = {"apple", "pear", "peaches"};
        System.out.println( "Initialized array: " + Arrays.toString(fruits));
        //calls the fruit that's in position "0" of the array. Arrays positional count starts with "0"
        System.out.println("data in position '0' of array: " + fruits[0]);
       
        //overwrites the data in position "0" of the array
        fruits[0] = "orange";

        //"orange" overwrites "apple" at position "0"
        System.out.println("Overwriting data: " + Arrays.toString(fruits));

        //The commented line of code below will throw an error: noticed that once an array is initalized it's length can not change.
        
        // fruits[3] = "apple";

        //The initialized array will maintain it's size.
        int fruitsLength = fruits.length;

        System.out.println("Length of array doesn't change: " + fruitsLength);
    }
}

import java.util.ArrayList;

public class ArrayB {
    public static void main(String[] args) {
        //initialized ArrayList
        ArrayList<String> fruits = new ArrayList<String>();

        //adds data to list so array lists do not have a fixed size
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("peaches");

        System.out.println("Original array: " + fruits);

        //calls the fruit that's in position "0" of the array. Arrays positional count starts with "0"
        System.out.println(" Element in position 0: " + fruits.get(0));

        //added data to position "0" of the array, and moves original data over one position.
        fruits.add(0, "orange");
        System.out.println("Adds orange: " + fruits);

        //extends the variable size past what it was originally iniztialized for.
        fruits.add("grapes");

        System.out.println("New Array with added data: " + fruits);

        //to remove an element
        fruits.remove(0);
        System.out.println("removes an element of the array" + fruits);


        //overwrites the data in position "0" of the array
        fruits.set(0, "orange");
        System.out.println(fruits);

        //Returns how many elements are in the array
        int fruitSize = fruits.size();
        System.out.println("Initialized Array size has been increased: " + fruitSize);
    }
}

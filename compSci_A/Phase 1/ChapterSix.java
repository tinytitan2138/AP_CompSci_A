import java.util.*;
public class ChapterSix {
    public static void main(String[] args){
        /*
        Arrays are n dimensional objects which are immutable, non-dynamic, store values of the same
        class, and are indexed. I will note that the index starts at one.
         */
        int[] myList = new int[11]; //list of integers with 11 elements. All are initialized to 0.
        String[] newList = {"Solomon", "Phoo Pham", "Dimim"}; //list with elements already defined.
        Human solomon = new Human("Solomon", 16);
        Human winston = new Human("Phoo Pham", 16);
        Human dylan = new Human("dimim", 16);
        Human[] the3 = {new Human("Solomon", 16), new Human("Phoo Pham", 16),
                new Human("dimim", 16)};// list of objects.

        Human melalie = new Human("Mommy Melanie", 16);
        Human thomas = new Human("BOY", 15);
        Human katelyn = new Human("GIRL", 16);
        Human[] theBig6 = {solomon, winston, dylan, melalie, thomas, katelyn};//another list of objects
        int j = 0;
        for (int i = 100; i < myList.length + 100; i++){
            myList[j] = i;
            j +=1;
        }//basic array traversal

        for (int i: myList){
            System.out.println(i);
        }

        for(Human h: the3){
            System.out.println(h.getName());
        }
        for (Human h: theBig6){
            h.Speak("Hello");
        } //variables declared in loops can be reused, probably since the garbage collector deletes them after.
        /*
        for (Human h : the3){
            System.out.println(h);
        } memory is already allocated for each object.
        */

        System.out.println(Arrays.toString(toCharacter(myList)));
        /*
        I will note that you can make methods that take arrays as parameters that then change them,
        but you cannot change some specific element, so if you have a method that takes in integers
        as a parameter, you cannot pass in something like myArray[0] into the method for the element to be
        changed. Java comes with a built-in data type from the Collections API, it comes with something
        called ArrayList, which is basically a dynamic array, it can be adjusted at run time. Inheritance is used
        a lot in the collection API, the ArrayList implements the List class. Collection classes themselves are
        generic having type parameters denoted by <> point brackets.
         */


    }
 public static char[] toCharacter(int[] list){
        char[] charList = new char[list.length];
        int j = 0;
        for (int i: list){
            charList[j] = (char) i;
            j += 1;
        }
        return charList;
    } //method using arrays.


}

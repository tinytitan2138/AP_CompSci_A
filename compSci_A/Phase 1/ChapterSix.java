import static java.lang.Math.*;
import java.util.*;

class MatrixSum3{


    public static int sumMatrix(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            sum += sumArray(matrix[i]);
        }
        return sum;
    }


    private static int sumArray(int[] array){
        int num = 0;
        for (int i: array){
            num += i;
        }
        return num;
    }
}

public class ChapterSix {
    public static void main(String[] args) {
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
        for (int i = 100; i < myList.length + 100; i++) {
            myList[j] = i;
            j += 1;
        }//basic array traversal

        for (int i : myList) {
            System.out.println(i);
        }

        for (Human h : the3) {
            System.out.println(h.getName());
        }
        for (Human h : theBig6) {
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
        generic having type parameters denoted by <> point brackets. Since collections API doesnt have
        native types it uses an auto boxer to automatically wrap the variables and to unwrap them
        when returning a value. Classes that implement the List interface can store objects, duplicates,
        and is indexed. The list interface has a boolean add method that puts the new element at the end
        of the list, it always returns true unless there is a class-wrap excepion. There is also size, get,
        set, set also returns the element replaced, add when the first argument is an index is void, remove which
        also returns the object removed, and iterator which returns an instance of the iterator class, this
        allows it to be looped through.
         */
        toUpper(newList);
        System.out.println(Arrays.toString(newList));
        ArrayList<String> dyn = new ArrayList<String>();//this is how you initialize an array list.
        dyn.add(0, "Hello");
        dyn.add(1, "World");
        dyn.add("!");
        String g = dyn.get(2);
        System.out.println(g);
        int size = dyn.size();
        System.out.println(size);
        Iterator<String> list = dyn.iterator();
        while (list.hasNext()) {
            String word = list.next();
            System.out.println(word);
        } //iterator is iterated with a while loop
    /*List<Integer> random = randList(0, 100);
    for (int i: random){
        System.out.println(i);
    }List is iterable
    */

    /*
    Another important concept are matrices, they can be thought of as 2 dimension arrays, the
    horizontal rows are rows, and the verticle columns are column, a nxm matrix has n rows and
    m columns, double[][] matrix = new double[2][3] is a 2x3 matrix. There are 3 main ways
    to traverse matrices, (1) row columns, (2) for each loops, (3) row by row array processing.
    I will note that the length of a matrix is its number of rows; this can be useful to know
    for processing.
     */

        int[][] matrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}; /// 3x3 identity matrix
        int sum = sumMatrixOne(matrix);
        System.out.println(sum);
        sum = sumMatrixTwo(matrix);
        System.out.println(sum);
        sum = MatrixSum3.sumMatrix(matrix);
        System.out.println(sum); // all print out 3


        printMatrix(matrix);
        changeMatrix(matrix);
        printMatrix(matrix);
    }

    public static char[] toCharacter(int[] list) {
        char[] charList = new char[list.length];
        int j = 0;
        for (int i : list) {
            charList[j] = (char) i;
            j += 1;
        }
        return charList;
    } //method using arrays.

    public static void toUpper(String[] list) {
        int i = 0;
        for (String word : list) {
            list[i] = word.toUpperCase();
            i += 1;
            // word = word.toUpperCase() This wouldn't work as it references the element.

        } // only works when referencing the actual index within the list and not the element


    }

    public static List<Integer> randList(int start, int end) {
        List<Integer> randomList = new ArrayList<Integer>();
        for (int i = 0; i <= end - start; i++) {
            randomList.add(i, ((int) ((random() + start) * ((double) end / (start + 1) + 1))));
        }
        return randomList;
    }

    public static int sumMatrixOne(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static int sumMatrixTwo(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }

    public static void changeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = 1;
            }
        }
    //you cant do this with a for each loop
    }

    public static void printMatrix(int[][] matrix) {
        String MatrixString = "";
        for (int[] row : matrix) {
            MatrixString = MatrixString + Arrays.toString(row) + "\n";
        }
        System.out.println(MatrixString);

    }

}
/*
Chapter 6 summary:
Manipulation of one-dimensional arrays, two-dimensional arrays, and array lists
should be second nature to you by now. Know the Java subset methods for the List<E>
class. You must also know when these methods throw an IndexOutOfBoundsException
and when an ArrayIndexOutOfBoundsException can occur.
When traversing an ArrayList:
• Use a for-each loop to access each element without changing it, or to modify
each object in the list using a mutator method.
• Use an Iterator to remove elements. (This is not in the AP subset, but it is the
easiest way to remove elements from an ArrayList.)
A matrix is an array of row arrays. The number of rows is mat.length. The number
of columns is mat[0].length.
When traversing a matrix:
• Use a row-column traversal to access, modify, or replace elements.
• Use a nested for loop to access or modify elements, but not replace them.
• Know how to do row-by-row array processing if you have an appropriate method
that takes an array parameter.
 */
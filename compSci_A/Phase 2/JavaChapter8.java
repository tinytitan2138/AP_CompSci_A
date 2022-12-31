/**
 * 23: it finds the index of 10
 * 24: it tells you if it is an array of positive numbers
 * 25: it returns the array of strings but with no uppercases
 * 26: it is an array of booleans which tell if the equivelant
 * index for the array of strings contains the '@' character
 * 32: boolean b = false;
 * for (String s: a){
 *     if (s.contains("IBM")){
 *         return true;
 *     }
 * }
 * return b;
 * 33: int n = 0;
 * for (int i: a){
 *     if ( 0 == i % 7){
 *         n += 1;
 *     }
 * }
 * return n;
 * 34: if (a[0].equals(a[1])){
 *     return true;
 * }
 * else {return false; }
 * 35: boolean[] b = new boolean[a.length];
 * for (int i = 0; i < b.length; i++){
 *     if (a[i] == 0){
 *         b[i] = false
 *     }
 *     else {
 *         b[i] = true;
 *     }
 * }
 * return b;
 * 41: they check the memory location, check each element not the object
 * 42: a.length already has a value
 * 43: a is an object, print a.length;
 * 44: the elements must all be integers
 * 45: it needs to be a matrix, or you need to get rid
 * of the number
 * 46: the max index is length - 1, it should be
 * i < a.length;
 * 47: it checks the objects, make a for loop
 * that sets b to true and if it is not
 * equal return false
 * 48: it prints the memory location
 * Arrays.toString(a);
 *
 */


public class JavaChapter8 {
    public static void main(String[] args){

    }
}

/*
Chapter Summary:
An array is a sequence of variables of the same data type. The data type can
be any Java primitive data type, such as int, float, double, byte, boolean,
or char, or it can be a class.
Each element in the array is accessed using the array name and an index,
which refers to the element’s position in the array.
Arrays are implemented as objects. Creating an array consists of declaring
an object reference for the array and instantiating the array. The size of the
array is given when the array is instantiated.
In arrays of primitive types, each element of the array contains a value of
that type. In arrays of objects, each element is an object reference.
When an array is instantiated, the elements are given initial values
automatically, depending on the data type. Numeric types are set to 0;
boolean types are set to false; char types are set to the Unicode null
character; and object references are set to null.
Instantiating an array of object references involves two steps: instantiating
the array and instantiating the objects.
Arrays can be instantiated when they are declared by assigning initial
values in a comma-separated list within curly braces. The number of
values in the initialization list determines the number of elements in the
array.
Array elements are accessed using the array name and an index. The first
element’s index is 0 and the last element’s index is the size of the array −1.
Arrays have an integer instance variable, length, which holds the number of
elements in the array.
Attempting to access an element of an array using an index less than 0 or
greater than arrayName.length – 1 will generate an
ArrayIndexOutOfBoundsException at run time.
Aggregate array operations, such as printing and copying arrays, are not
supported for arrays. Using a for loop, you can process each array element
individually.
To change the size of an array, instantiate an array of the desired size with a
temporary name, copy the appropriate elements from the original array to
the new array, and assign the new array reference to the original array.
Assign null to the temporary array name.
Arrays can be passed as arguments to methods and can also be the return
type of methods.
645
When an array is an instance variable of a class, the constructor should
instantiate a new array and copy the elements of the parameter array into
the new array.
A Sequential Search determines whether a particular value, the search key,
is in an array by comparing the search key to each element in the array.
A Selection Sort arranges elements in the array in order by value by
reducing the array into successively smaller subarrays and placing the
largest element in each subarray into the last position of the subarray.
An Insertion Sort arranges elements of an array much like a card player
arranges cards in sorted order in his or her hand. The elements are
inserted one at a time in ascending order into the left side of the array.
To sort an array of objects, you can use the class method provided to
compare objects’ values.
A sorted array can be searched more efficiently using a Binary Search,
which successively reduces the number of elements to search by half.
Arrays of integers can be used as an ordered group of counters.
Methods can accept a variable number of parameters using the varargs …
syntax.



 */

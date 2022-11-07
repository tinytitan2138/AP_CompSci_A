import static java.lang.Math.*;
public class ChapterFour {
    public static void main(String[] args){
        /*
        All classes are subclasses of a super class called Object, Object is not an abstract class, so it
        has implementations. Object in the AP subset only has the equals method and the toString method.
        Whenever you print out an object you are implicitly calling the toString method. This method can
        be overridden, but you needn't use the @Override keyword. Another inherited method is the hashcode
        method, this returns the integer key of the key for the hashmap that stores the object. Strings are an
        immutable object, it cannot directly be changed, any new value assigned to it simply discards the old
        variable, it essentially just creates a copy. Compare 2 strings with equals, and concatenate them with
        +. The char data type has ASCII values which are integer encoded into each unique value,
        numbers precede lowercase letters which precede capital letters. Some other important methods
        are length, substring, and indexOf.
         */
    String word = "hello";
    String word2 = "hello";
    boolean b = (word == word2); // equivelant string literals have the same reference.
    String word3 = new String("hello"); // initialized with string class
    System.out.println(b);
    b = (word == word3); // new reference is made when constructor is called.
    System.out.println(b);

    /*
    Another important concept are wrapper classes. They allow you to use and declare primitive types as objects.
    An example being Integer(). Some important methods being intValue, compareTo, equals, and toString. toString and
    compareTo return a string representation and integer representing true or false respectively. Some important
    methods come from the math class. They are abs, pow, sqrt, and random, all are self-explanatory. Importing
    the class as static allows you to use the methods without referencing the class itself. The random
    method produces a random number from 0.0 to 1.0 that includes 0 but not 1. In order to define your own
    interval you can either multiply it or add to it.
     */
    Integer i = 10;
    Integer j = 10;
    int t = i.compareTo(j);
    System.out.println(i.toString());
    char myChar = 'a';
    System.out.println((int) myChar);
    double x = random() + 3; // 3<= x < 4
    double a = random() * 10; // 0 <= a < 10
    double z = (random() + 3) * 10; // 3 <= z < 40
    System.out.println(z);
    z = (random()* 10) + 10; // 10 <= z < 20
    System.out.println(z); // think of adding n as n <= x < n+1
    //think of multiplying n as, k <= x < n(k+1), n is a scaling factor.
    int rand = (int) (random() * 100);  //always add parenthesis to cast
    // int rounds it,
    //int sas = (int) 0.88313; always round down to the floor.
    //random is then from 0<= x < 100, but the int rounds it all to integer value floors, so it is a random int from
    // 0 to 99
    System.out.println(rand);

    }
}

/*
Chapter 4 summary:
All students should know about overriding the equals and toString methods of
the Object class and should be familiar with the Integer and Double wrapper classes.
Know the AP subset methods of the Math class, especially the use of Math.random()
for generating random integers. Know the String methods substring and indexOf
like the back of your hand, including knowing where exceptions are thrown in the
String methods.
 */
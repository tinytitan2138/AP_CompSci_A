/**
 * 10: double
 * 11: false
 * 12: float
 * 13: Math.E;
 * 20: 6
 * 21: 4
 * 22: 8
 * 23: 8.0
 * 31: int resp = sc.nextInt();
 * int resp2 = sc.nextInt();
 * System.out.println(Math.Min(resp, resp2));
 * 32: int one = sc.nextInt(), two = sc.nextInt(),
 * three = sc.nextInt();
 * int temp = Math.Max(one, two);
 * System.out.println((Math.Max(temp, three)));
 * 33: see main method
 * 34: omitted (too long)
 * 40: round returns a long
 * 41: pow returns a double
 * 42: it is Math.PI
 * 43: it is "" not ''
 * 46: it is Math not math
 * 47: it is PI not PI()
 * 48: it is E not e
 * 49: You need to call the format method
 */
import java.text.*;
import java.lang.Math.*;
import javax.crypto.spec.DESedeKeySpec;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

class Pane{
    JFrame J;
    Pane(){
        J = new JFrame();
        String name = JOptionPane.showInputDialog(J, "Enter name");
    }
}



public class JavaChapter3 {
    public static void main(String[] args){
    double e = Math.E;
     long i = Math.round(5.7);
     int j = (int) Math.round(5.7); // returns a long, needs to be wrapped
    // new Pane();
     JFrame frame = new JFrame();
    // String resp = JOptionPane.showInputDialog(frame, "Give number (int)");
    // int n = Integer.parseInt(resp) + 1;
    // JOptionPane.showMessageDialog(frame, n);
     DecimalFormat df = new DecimalFormat("0.0#%");
     double test = 0.66666666;
     System.out.println(df.format(test));
     NumberFormat nf = NumberFormat.getPercentInstance();
     System.out.println(nf.format(test));
    }
}

/*
Chapter Summary:

Object-oriented programming entails writing programs that use classes and
objects. Using prewritten classes shortens development time and creates
more reliable programs. Programs that use prewritten classes are called
clients of the class.
Benefits of object-oriented programming include encapsulation, reusability,
and reliability.
Classes consist of data, plus instructions that operate on that data. Objects
of a class are created using the class as a template. Creating an object is
called instantiating an object, and the object is an instance of the class.
The new keyword is used to instantiate an object.
The object reference is the variable name for an object and points to the
data of the object.
The data of a class are called fields and consist of instance variables and
static variables. The instructions of the class are called methods. Methods
of a class get or set the values of the data or provide other services of the
class.
The name of a method, along with its argument list and return value, is
called the Application Programming Interface (API) of that method.
Methods that are declared to be public can be called by any client of the
class.
By convention, class names in Java start with a capital letter. Method
names, instance variables, and object names start with a lowercase letter.
In all these names, embedded words begin with a capital letter.
When your program makes a method call, control transfers to the
instructions in the method until the method finishes executing. Then control
is transferred back to your program.
Instance methods are called using the object reference and the dot notation.
A constructor is called when an object is instantiated. A constructor has the
same name as the class and its job is to initialize the object’s data. Classes
can have multiple constructors. Constructors have no return values.
A method’s data type is called the method’s return type. If the data type is
211
anything other than the keyword void, the method returns a value to the
program. When a value-returning method finishes executing, its return
value replaces the method call in the expression.
Accessor methods, also called gets, allow clients to retrieve the current
value of object data. Mutator methods, also called sets, allow clients to
change the value of object data.
When an object reference is first declared, its value is null. Attempting to
use a null object reference to call a method generates an error.
The garbage collector runs occasionally and deletes objects that have no
object references pointing to them.
Java packages are groups of classes arranged according to functionality.
Classes in the java.lang packages are automatically available to Java
programs. Other classes need to be imported.
The String class can be used to create objects consisting of a sequence of
characters. String constructors accept String literals, String objects, or no
argument, which creates an empty String. The length method returns the
number of characters in the String object. The toUpperCase and
toLowerCase methods return a String in upper or lower case. The charAt
method extracts a character from a String, while the substring method
extracts a String from a String. The indexOf method searches a String for
a character or substring.
The DecimalFormat class, in the java.text package, formats numeric output.
For example, you can specify the number of digits to display after the
decimal point or add dollar signs and percentage signs (%).
The Random class, in the java.util package, generates random numbers.
The Scanner class, in the java.util package, provides methods for reading
input from the Java console. Methods are provided for reading primitive
data types and Strings.
When prompting the user for input, phrase the prompt in language the user
understands. Describe the data requested and any restrictions on valid
input values.
Static methods, also called class methods, can be called without
instantiating an object. Static methods can access only the static data of a
class.
Static methods are called using the class name and the dot notation.
System.out.println prints primitive data types or a String to the Java
212
console and adds a newline character. System.out.println with no
argument skips a line. System.out.print prints the same data types to the
Java console, but does not add a newline. Classes provide a toString
method to convert objects to a String in order to be printed.
The Math class provides static constants PI and E and static methods to
perform common mathematical calculations, such as finding the maximum
or minimum of two numbers, rounding values, and raising a number to a
power.
The NumberFormat class, in the java.text package, provides static
methods for formatting numeric output as currency or a percentage.
Wrapper classes provide an object interface for a primitive data type. The
Integer and Double wrapper classes provide static methods for
converting between ints and doubles and Strings.
The JOptionPane class, in the javax.swing package, provides the static
methods showMessageDialog for popping up an output dialog box and
showInputDialog for popping up an input dialog box.




 */

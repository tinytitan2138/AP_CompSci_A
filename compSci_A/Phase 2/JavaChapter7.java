/**
 * 13: class methods have direct access.
 * 14: final
 * 15: static
 * 16: All of the above
 * 24: public String foo2(char c){return Character.toString(c); }
 * 25: public static void foo3(double d)
 * 26: public static int foor4(String s);
 * 27: 1
 * 34: public String toString(int n){String s = "Channel "+ Integer.toString(n);
 * return s;
 * }
 *35: public static boolean (TV one, TV two){
 *     boolean b = false;
 *     if (one.getName.equals(two.getName()){
 *         b = true;
 *     }
 *     else{return b; }
 *     if (one.getNumber == two.getNumber()){
 *         b = true;
 *     }
 *     else {return b; }
 *     if (one.getCable == two.getCable){
 *         b = true;
 *     }
 *     else {return b; }
 *     return b;
 *}
 *36: public int numDigits(int n){
 *     return Integer.toString(n).length;
 *}
 * 37: public String type(){
 *     if (this.getCable){
 *         return "cable";
 *     }
 *     else {return "network"; }
 * }
 * 43: TAX_RATE is not decalres a type,
 * make it empty and use the "this" keyword
 * 44: it is g not Gift for the set method
 * 45: you put the value in the paranthesis
 * 51: return Character.toString(letterGrade);
 * 52: this.numberGrade = numberGrade, return this.numberGrade
 * 53: Seasons.Winter not just Winter
 * 54: let s be of the Seasons enum, set it to both,
 * or dont use a enum in the first place, Autumn also isnt
 * referances throuhg the enum correctly.
 *
 */



public class JavaChapter7 {
    public static void main(String[] args){

    }


}

/*
Chapter Summary:
The members of a Java class include its instance variables, class variables,
and methods.
One copy of each instance variable is created for every object instantiated
from the class. One copy of each class variable and method is shared by
all objects of the class.
By convention, class names are nouns and begin with a capital letter; all
internal words begin with a capital letter, and other letters are lowercase.
Method names are verbs and begin with a lowercase letter; internal words
begin with a capital letter, and all other letters are lowercase. Nonconstant
instance variables are nouns and follow the same capitalization rules as
methods. Constant fields have all capital letters with internal words
separated by an underscore.
The public access modifier allows the class or member to be accessed by
529
other classes. The private access modifier specifies that the class or
member can be accessed only by other members of the same class.
Package access allows other classes in the same package to access the
class or class members.
Classes, constructors, final class variables, and class methods typically are
declared as public, and instance variables typically are declared as
private.
Instance variables reflect the properties that all objects will have in
common. Instance variables are defined by specifying an access modifier,
data type, and identifier, and optionally, an initial value. Instance variables
can be declared to be final.
A method is defined by providing a method header, which specifies the
access modifier, a return type, method name, and parameter list. The
method body is enclosed in curly braces. Value-returning methods return
the result of the method using one or more return statements. A method
with a void return type does not return a value.
The scope of an identifier is the range of code in which that identifier can
be accessed. Instance variables and methods have class scope in that they
can be accessed anywhere in the class.
A method can reference the instance variables of its class, the parameters
sent to the method, and local variables declared by the method and can
call other methods of its class.
A method can be overloaded by defining another method with the same
name but a different signature, that is, with a different number of
parameters or with parameters of different data types.
Constructors are responsible for initializing the instance variables of the
class.
If you don’t provide a constructor, the compiler provides a default
constructor, which is a constructor that takes no arguments. This default
constructor assigns default initial values to all the instance variables.
Numeric variables are given the value of 0, characters are given the value
space, boolean variables are given the value of false, and object
references are given the value of null. Local variables declared in
methods are not given initial values automatically.
Accessor methods are named getIV, where IV is an instance variable name;
the return data type is the same as the instance variable and the body of the
method simply returns the value of the instance variable.
530
Mutator methods are named setIV, where IV is an instance variable name;
the return data type is void, and the method takes one argument, which is
the same data type as the instance variable and contains the new value for
the instance variable. The body of the method should validate the new
value and, if the new value is valid, assign the new value to the instance
variable.
When a method begins executing, the JVM sets the object reference this to
refer to the object for which the method has been called.
The toString method is called automatically when an object reference is
used as a String and its job is to provide a printable representation of the
object data.
The equals method compares two objects for equality; that is, it should
return true only if the corresponding instance variables in both objects are
equal in value, and false otherwise.
Static class variables are created when the class is initialized. Thus, class
variables exist before any objects are instantiated, and each class has only
one copy of the class variables. Static variables that are constants are
usually declared to be public because they typically are provided to allow
the client to set preferences for the operations of a class.
Static class methods can reference only static variables, can call only
static methods, and cannot use the object reference this.
A non-static, or instance, method can reference both class and instance
variables, as well as class and instance methods, and the reference this.
A graphical object usually has instance variables for the starting (x, y)
coordinate. It also provides a draw method that takes a Graphics object as
a parameter and includes the code to draw the graphical object.
Enumeration types can be defined to give meaning to ordered sets that are
represented in a program by numbers. For each name in an enum type
initialization list, a constant object is created with an instance variable
having a sequential numeric value. References can be defined of the enum
type. Objects of the enum type can be compared, printed, and requested to
return their numeric value.
Javadoc, which is part of the Java JDK, generates documentation for
classes. To use Javadoc, you enclose a description of each class, method,
and field in a block comment beginning with  and ending with . In
    //    addition, you can describe each parameter using the @ param tag and
        return value using the @return tag.



 */



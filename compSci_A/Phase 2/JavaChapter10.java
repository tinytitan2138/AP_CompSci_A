import com.sun.jdi.IntegerType;

import javax.print.DocFlavor;

/**
 * 8: super
 * 9: the first statement
 * 10: it must be abstract
 * 11: it is abstract
 * 17: A version was called
 * B version called, n is then 5
 * 18: A version called
 * B version called
 * hi foo3
 * 19: A called B called C() called
 * 20: C version called
 * 22: public G(otherparam, char c){
 *     super(otherparam);
 *     this.c = c;
 * }
 * 23: toString(){
 *     return this.name;
 * }
 * 24: public boolean(G g){
 *     if (this.name.equals(g.getName) && this.first.equals(g.getFirst)){
 *         return true;
 *     }
 *     else {return false; }
 * }
 * 25: public class K extends F implements I{
 *     /code/
 * }
 * 28: yes, d is a c, but you cant
 * referance unique d methods
 * 29: it is a private variable so no super
 * 30: I is an interface not a class
 * 31: you need curly brackets not ;
 * 32: You cant extend them plus Integer is an
 * interface.
 * 33: there are no methods so it must be
 * made abstract
 * 34: n is a private varibale, either have a getter or make
 * it public
 * 35: you need to declare what p is. super needs to be the first line
 * in the overriden constructor.
 */

class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("B");
    }
}
class C extends B{
    public C(){
        super();
        System.out.println("C");
    }
}

//class N extends DocFlavor.STRING, IntegerType

public class JavaChapter10 {
    public static void main(String[] args){
    /*
    I will note that interfaces just contian
    methods.
     */
    C c = new C();


    }

}

/*
Chapter Summary:
Inheritance lets us organize related classes into ordered levels of
functionality, called hierarchies. The advantage is that we write the
common code only once and reuse it in multiple classes.
A subclass inherits methods and fields of its superclass. A subclass can
have only one direct superclass, but many subclasses can in herit from a
common superclass.
Inheritance implements the “is a” relationship between classes. Any object
of a subclass is also an object of the superclass.
All classes inherit from the Object class.
To specify that a subclass inherits from a superclass, the subclass uses the
839
extends keyword in the class definition, as in the following syntax:
A subclass does not inherit constructors or private members of the
superclass. However, the superclass constructors are still available to be
called from the subclass, and the private fields of the superclass are
implemented as fields of the subclass.
To access private fields of the superclass, the subclass needs to use the
accessor and mutator methods provided by the superclass.
To call the constructor of the superclass, the subclass constructor uses the
following syntax:
If used, this statement must be the first statement in the subclass constructor.
A subclass can override an inherited method by providing a new version of
the method. The new method’s API must be identical to the inherited
method. To call the inherited version of the method, the subclass uses the
super object reference using the following syntax:
Any field declared using the protected access modifier is inherited by the
subclass. As such, the subclass can directly access the field without
calling its accessor or mutator method.
An abstract class can be used to specify APIs for methods that subclasses
should implement. An abstract class cannot be used to instantiate objects.
A class is declared to be abstract by including the abstract keyword in
the class header.
An abstract class typically has one or more abstract methods. An abstract
method specifies the API of the method, but does not provide an
implementation. The API of an abstract method is followed by a
semicolon.
When a subclass inherits from an abstract class, it can provide
implementations for any, all, or none of the abstract methods. If the
subclass does not implement all the abstract methods of the superclass,
then the subclass must also be declared as abstract. If, however, the
subclass implements all the abstract methods in the superclass and is not
declared abstract, then the class is not abstract and we can instantiate
objects of that subclass.
840
Polymorphism simplifies the processing of various objects in a hierarchy by
allowing us to use the same method call for any object in the hierarchy. We
assign an object reference of a subclass to a superclass reference, then
make the method call using the superclass object reference. At run time,
the JVM determines to which class in the hierarchy the object actually
belongs and calls the appropriate form of the method for that class.
Interfaces allow a class to inherit behavior from multiple sources. Interface
members can be classes, constants, abstract methods, or other interfaces.
To define an interface, use the following syntax:
To use an interface, a class header should include the implements keyword
and the name of the interface, as in the following
syntax:
To specify that a subclass both inherits from a superclass and uses an
interface, a class header should include the implements keyword and the
name of the interface, as in the syntax that follows.


 */

class An{
    String a;
    int b;
    public An(String a, int b){
        this.a = a;
        this.b = b;
    }
    public void test(){
        System.out.printf("Object: %s%n", this);
    }

}
class Bn{
    An a;
    public Bn(An a){
        this.a = a;
    }

}

public class ChapterFive {
    public static void main(String[] args){
    /*
    Some important aspects of coding is actual program design itself. One design technique is called the
    waterfall model. It is visualized as analysis of specification at the top, with a line connecting
    it to program design, then implementation, then testing and debugging, and finally maintenance.
    Analysis of specification is simply the description of the problem itself, constraints and otherwise.
    Program design is simply the design of the solution, it can be thought of as a plan to achieve
    whatever the goal is, it includes the methods, techniques, objects, etc. Program implementation is
    simply the coding part. The testing part is just testing out all the cases of the program,
    it may be to add in negative values if the program only works for positive numbers etc. The testing
    phase also involved resolving errors, they can be compiled time errors, errors in which certain lines
    of code cant be compiled into byte code, run time errors in which they occur during the execution of the
    program, like index out of bounds or basically anything with an exception call, and finally the hardest being
    logic errors, in which the code executes, but it still doesn't do what was intended. Good programs
    account for user error, I personally just like to use custom-made exceptions and exception handling.
    Another important process is upgrading, like adding new features to the code and what not. OOP basically
    follows this:
    • Identify classes to be written.
    • Identify behaviors (i.e., methods) for each class.
    • Determine the relationships between classes.
    • Write the interface (public method headers) for each class.
    • Implement the methods

    One interesting way in which you can implement OOP is by nouns, that is, any noun that is not
    proper or refers to the user is organized and turned into a class. There may be an object, a collection
    or a set of objects, a controller that handles the collection, and a display, or just GUI. Also,
    any verbs in the description are to be methods. You can find inheritance by analyzing which of these
    classes have similarities, if class A has "is a" relationship with class B, then class B is a candidate
    To analyze the field variables you can check to see which objects have a "has a" relationship with
    something else.
     */
    An a = new An("hello", 5);
    Bn b = new Bn(a);
    b.a.test(); //this is just to note that field variables can be objects.

    /*
     You may be tested in UML model that represents relationships between classes.
     • Represent classes with rectangles.
     • Use angle brackets with the word “abstract” or “interface” to indicate either an
     abstract class or interface.
     • Show the is-a relationship between classes with an open up-arrow.
     • Show the is-a relationship that involves an interface with an open, dotted uparrow.
     • Show the has-a relationship with a down arrow or sideways arrow (indicates
     composition).

     One way to write code is bottom up, that is, you describe methods and what they do, you then
     describe what classes are needed for these methods to function, these are called collaborators. You
     typically start with independent classes that have no collaborators then work your way up.
     There is also top down programming in which you describe the high level functionality first then
     further implement subsidiary classes needed for it to work. Repeated code can be simplified with
     helper methods. Using the private key word is called information hiding. You can create stub method
     which are place-holders for other methods, they allow you to test the calling feature. You may also
     implement algorithms, algorithms are just step-by-step instructions to solve some problem. The AP test
     will test your ability to measure program correctness, or whether a program will work or not. An assertion
     is a prediction about the program at a certain point. Preconditions are logical conditions needed before
     execution of code. A post condition is a boolean statement right after the execution of some code. Finally
     the efficiency of the program takes into account cpu time and space used, it is measured in the steps
     relative to the input size, this is called big o notation.
     */

     /*
     Chapter summary:
     There’s a lot of vocabulary that you are expected to know in this chapter. Learn the
words!
Never make assumptions about a program specification, and always write a design
before starting to write code. Even if you don’t do this for your own programs, these
are the answers you will be expected to give on the AP exam. You are certain to get
questions about program design. Know the procedures and terminology involved in
developing an object-oriented program.
Be sure you understand what is meant by best case, worst case, and average case for
an algorithm. There will be questions about efficiency on the AP exam.
By now you should know what a precondition and postcondition are.
      */

    }
}

/*
VOCABULARY:

Vocabulary Meaning
software development Writing a program
object-oriented program Uses interacting objects
program specification Description of a task
program design A written plan, an overview of the solution
program implementation The code
test data Input to test the program
program maintenance Keeping the program working and up to date
top-down development Implement main classes first, subsidiary classes later
independent class Doesn’t use other classes of the program in its code
bottom-up development Implement lowest level, independent classes first
driver class Used to test other classes; contains main method
inheritance relationship is-a relationship between classes
composition relationship has-a relationship between classes
inheritance hierarchy Inheritance relationship shown in a tree-like diagram
UML diagram Tree-like representation of relationship between classes
data structure Java construct for storing a data field (e.g., array)
encapsulation Combining data fields and methods in a class
information hiding Using private to restrict access
stepwise refinement Breaking methods into smaller methods
procedural abstraction Using helper methods
algorithm Step-by-step process that solves a problem
stub method Dummy method called by another method being tested
debugging Fixing errors
robust program Screens out bad input
compile-time error Usually a syntax error; prevents program from compiling
syntax error Bad language usage (e.g., missing brace)
run-time error Occurs during execution (e.g., int division by 0)
exception Run-time error thrown by Java method
logic error Program runs but does the wrong thing
 */

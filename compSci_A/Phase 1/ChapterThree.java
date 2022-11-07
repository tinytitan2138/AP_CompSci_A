class Animal {
    private String food;
    private String move;
    private String name;
    private static int num;
    public Animal(String food, String move, String name){
        this.setFood(food);
        this.setMove(move);
        this.setName(name);
        num += 1;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getMove() {
        return move;
    }
     public void eat(String food){
        System.out.println("The animal has eaten " + food);
    }
    public String hunt(Animal animal){
        return String.format("%s has hunted and killed a %s",this.name, animal.name );
    }
    public static int getNum(){
        return num;
    }
}

class Sheep extends Animal{ // extends keyword is what imports all the functionality.
    private String tet;
    private static int numSheep; //this is an extra instance variable.
    // The private variables are not inherited
    public Sheep(String food, String move, String name, String tet) {
        super(food, move, name); // calls super method constructor.
        this.tet=tet;
        numSheep += 1; //extended functionality of this constructor
    }
    @Override //overrides this method, still must have the same parameters though.
    public void eat(String food){
        System.out.printf("%s has eaten %s%n", this.getName(), food); //can completely change the code.
    } // I will note that private methods cant be changed.
    public String hunt(Animal animal){
        return super.hunt(animal) + " Sheep dont hunt";
        // super method is called, more is added to it.
    }
    public static String getNumSheep(){
         return String.format("There are <= %s sheep", Animal.getNum());
    //this is a unique method to the Sheep class, it calls the parent static method but refers to the class itself.
    }
    public void Uniqe(){
        System.out.println(tet);
    }
}

class CustomException extends Exception{
    // constructor for custom exception
    CustomException(String prompt){
        super(prompt); //calls super constructor method, thus creating its own custom exception throw.
    }
}

class A{
    public void test(String prompt) {
        System.out.println(Changer(prompt));
    } // method calls internal private method
    public String Changer(String word){
        return word.toLowerCase();
    }

}
class B extends  A{
    public void test(String word){
        super.test(word); //Think of the super keyword as a compressed copy and paste code gotten from the super class.
    } //both the methods are polymorphic, the function is then changed due to this.
    // I will note that this only works if the referenced method is public, as the subclass needs to inherit it.
    public String Changer(String prompt){
        return prompt.toUpperCase(); //polymorphic method.
        //think of this as subclass referencing the old scope, any method that is polymorphic just uses the new methods.
    }
    public void Unique(){
        System.out.println("unique to B");
    }
}

abstract class Shape{ // use the abstract keyword to define an abstract class
    private String name; // old rules of implementation still apply.
    public Shape(String name){
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public double area(); //These methods are only stated to exist, they can later be implemented
    abstract public double perimeter();

    public double semiPerimeter(){return perimeter()/2; }
}

class Circle extends Shape{ // I will note that any abstract class that doesn't contain primarily abstract methods must be extended not implemented.
    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.setRadius(radius);
    }
    public void setRadius(double raidus){
        this.radius=raidus;
    }

    public double getRadius(){
        return this.radius;
    }
    @Override //Override needn't be used if the abstract method is just declared.
    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    } // abstract methods are implemented here. I will not that down-casting allows you to use later realized abstract methods.

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}

interface Vehicle{
    public void Travel(String location);
    public int fuelLeft();
    public boolean hasTraveled();
    default void name(){
        System.out.println("We are traveling in a Vehicle....");
    }
}
abstract class gasGuzzler implements Vehicle{
    private int status = 0;
    private String name;
    private int gas;
    public gasGuzzler(String name, int gas){
        this.setName(name);
        this.setGas(gas);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGas(int gas){
        this.gas = gas;
    }
    public String getName(){
        return this.name;
    }
    public int getGas(){
        return this.gas;
    }
    @Override
    public void Travel(String location){
        System.out.printf("%s has traveled to %s%n",this.name, location );
        this.gas -= 10;
        this.status += 1;
    }
    @Override
    public int fuelLeft(){
        if (this.gas <= 0){
            return 0;
        }
        else {return this.gas; }
    }
    @Override
    public boolean hasTraveled() {
        if (this.status != 0){
            return true;
        }
        else {return false; }
    }
   // @Override
    public void name(){
        Vehicle.super.name();
        System.out.println("It was a " + this);
    }
    abstract public boolean isEnviromental();


}
class hybridCar extends gasGuzzler{
    private int electricity;

    public hybridCar(String name, int gas, int electricity){
        super(name, gas);
        this.setElectricity(electricity);
    }
    public void setElectricity(int electricity){
        this.electricity = electricity;
    }
    public int getElectricity(){
        return this.electricity;
    }
    public boolean isEnviromental(){
        return true;
    }
}

public class ChapterThree{
    public static void main(String[] args) throws Exception{
    /*
    OOP allows for something called inheritance, it basically allows you to create subclasses which are
    derived form another parent or super class. You inherent public variables and methods, you do not
    inherit constructors though, you also inherit static variables and methods but not private ones.
    Anything that isn't private or a constructor is inherited. The super keyword allows you to directly
    reference things within the super class. An example being super(); to reference the super class
    constructor. You can use the super keyword to extend constructors and to call methods. For extending
    methods, you can use the @override keyword then set the identifier equal to the super class method
    name, they call the super method in the code block. You cannot change the public or private keyword,
    you can make protected methods public but not private, you have to add more when overriding, you cannot
    override static methods or final methods or private methods. You also cannot override constructors,
    nor can you throw parent exceptions in the subclass.
     */
    Animal animal = new Animal("grass", "walks", "deer");
    Sheep sheep = new Sheep("grass", "walks", "Sheep", "d");
    System.out.println(sheep.getFood()); // encapsulation allows us to reference private vars despite them not being inherited.
    System.out.println(animal.hunt(sheep));
    System.out.println(sheep.hunt(sheep));
    System.out.println(Animal.getNum());
    System.out.println(Sheep.getNumSheep());

    /*
    Another key concept is polymorphism, basically, anytime you change how an inherited function operates
    you then make it polymorphic. I will not that polymorphic methods operate as if they were copy and
    paste code put into the statement, so if you are calling a super method that calls another method,
    if you were to override the method it is calling to, you would then change how the method operates.
     */
    Animal test = new Sheep("a", "b", "c", "d") ; // You can use the parent class to declare an instance of the sub class

    test.eat("food"); //calls the polymorphic function.
    A a = new B(); // down-casting
    a.test("TeSting"); // returns TESTING
   // B b = new A(); code doesn't work, you can only have the parent class be the subclass.
    A myObject = new B();
    //A.Unique(); not valid code, the reason is because of the casting. It only accessed common methods, polymorphic or not.
        ((B)myObject).Unique(); // this is valid code as it directly casts myObject to the B type.
        //the other code is technically of type A, only it uses the common methods which may or may not be polymorphic.
    //test.Unique(); again, not valid, despite having the variable needed for the unique method.
        ((Sheep) test).Uniqe(); //valid code

    /*
    Another important concept is that of the abstract class and abstract methods. They basically describe
    how a class that implements it ought to operate. So if you were to define abstract methods in your
    interface, you would then need to define them in the implementation. I will also note that
    abstract methods cannot be private or static or final. Since static methods are general for the class
    and not the object, it cannot be overridden in the implementation. Private and final methods are
    not inheritable and thus cannot be overridden, thus they cannot be abstract. Abstract methods
    can have parameters, but they must be empty, as they exist only to describe how classes ought to
    be made. Concrete classes or methods are the ones derived from the abstract.
     */

    Circle myCircle = new Circle("Mr. Circle", 5);
    System.out.printf("Perimeter is: %s%nThe semi perimeter is: %s%n", myCircle.perimeter(), myCircle.semiPerimeter());
    Shape s = new Circle("Tester", 3);
    //s.getRadius(); still is not valid.
    double r = ((Circle) s).getRadius();
    double area = s.area();
    /*
    Interfaces are the aforementioned abstract classes containing only abstract methods. They have
    abstract methods which are later implemented, they may also have default methods which can be overridden,
    these default methods can be called using the super keyword, however, you must also reference the class
    itself too. A class implementing an abstract class can implement more than one class.
     */

    hybridCar pneula = new hybridCar("Pneula", 50, 500);
    pneula.Travel("Starbucks");
    System.out.println(pneula.hasTraveled());
    }
    /*
    Interface vs. Abstract Class
• Use an abstract class for an object that is application-specific
but incomplete without its subclasses.
• Consider using an interface when its methods are suitable
for your program but could be equally applicable in a variety of programs.
• An interface typically doesn't provide implementations for
any of its methods, whereas an abstract class does. (In Java 8,
implementation of default methods is allowed in interfaces.)
• An interface cannot contain instance variables, whereas an
abstract class can.
• It is not possible to create an instance of an interface object
or an abstract class object.
     */


}
/*
Chapter 3 summary:
You should be able to write your own subclasses, given any superclass, and also
design, create, or modify a class that implements an interface.
Be sure you understand the use of the keyword super, both in writing constructors
and calling methods of the superclass.
You should understand what polymorphism is: Recall that it only operates when
methods have been overridden in at least one subclass. You should also be able to
explain the difference between the following concepts:
• An abstract class and an interface.
• An overloaded method and an overridden method.
• Dynamic binding (late binding) and static binding (early binding).
 */
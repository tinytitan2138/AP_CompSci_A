class Human{
    private String name; //limited to scope of the class
    private int age;
    private static int num;
    public Human(String name, int age){
        this.setName(name);
        this.setAge(age);
        num += 1;
        //constructor which calls a set method, allows for both.
    }
    public void setName(String name){
        this.name = name;
    } //some basic setters.
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void Speak(String prompt){
        System.out.printf("%s has said \"%s\"%n", this.name, prompt);
    } //basic void function, returns nothing.
    public static int getNumberOfPeople(){
        return num; //when returning a static variable you needn't use the "this" keyword. As you don't access it through an instance reference.
    } // returns a static variable, meaning the variable is shared among all the objects.
    public static Human Clone(Human h){
        return new Human(h.getName() + " Clone", h.getAge());
    }//this is the only way to clone objects using java.

}
class BankAccount{
    private double balance;
    private String accName;
    private String password;
    private final static String bankName = "BankOfAmerica"; //you cannot use a setter to initalize this.
    private static int num;
    public BankAccount(){num +=1; } // constructor for counting only


    public void setBalance(double balance){
        if (balance < 0){
            this . balance = 0; //dot operator: accesses a field or method
            throw new IllegalArgumentException("You have to have a positive balance");
            //this.balance = 0; This would be unreachable as Exceptions terminate the program
        }
        else {this.balance = balance; }
    }
    public void setAccName(String accName){
        if (accName.matches(".*\\d.*"))  {
            this.accName = "";
            throw new IllegalArgumentException("Please just put in a fucking name");
        } // regex to check if it contains an integer, on AP test maybe just use raw logic.
        else {this.accName = accName; }
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getAccName(){
        return this.accName;
    }

    public double getBalance(String password){
        if (password.equals(this.password)){
            return this.balance;
        }
        else {
            throw new IllegalArgumentException("Incorrect password");

        }
    }
    public static String getBankName(){return bankName; }
    public static int getNum() {return num; }
}

public class ChapterTwo {
    public static void main(String[] args) throws Exception{
    /*
    Classes are essentially abstract data types created by the user. These data types can be something
    that represents lets say a book or a piece of music. These classes are usually public, this means that they
    can be accessed by any client program. Classes typically contain data fields or instance variables. These
    are the internal variables present within a class. You can combine internal methods and variables, which is
    called encapsulation. These variables can be made private, i.e. information hiding. In the AP java subset,
    all instance variables are private. Variables can be static, all this really means is that the variable
    is assigned to only one memory address, therefore, a static variables is shared over any and all
    instances of that class. Static for methods mean that you can access the method without creating an
    instance of the class first. Void methods do not return a value.
     */
    Greeting("Solomon");
    String string1 = Name("Solomon");
    /*
    Classes that are private have things called accessors or getter, they are private methods which
    return an instance variable. A mutator method is something that changes an instance variable,
    it can be a setter, or it can be something else. Non-static methods are called instance methods.
    I will note that static methods are used to return static instance variables. The main class is usually
    a driver class as the main function is static and is used to test other classes. One should be careful of
    method overloading, that is, one should be careful not to have different methods of different parameter have
    the same name. The scope of the variable is the area of the code which can access it, so the scope of
    a private instance variable is simply the class itself. All objects have what is called an instance method,
    it is called in every parameter for every method. It can be called directly through this.someVar. It is
    similar to self from python. It is essentially a reference to the current instance of the class. Another concept
    is primitive and reference types, primitives are data types that are built in, references are ones that require
    you to reference the class itself. You can have multiple identifiers for the same object. This is called aliasing.
    Aliasing that directly references another object can bring about problems though. For example, changing an
    instance variable for one object can affect another thats aliased to it. You can create objects without
    initializing them, this gives them a null value which means that they are a null pointer or null reference.
    Any method called from a null pointer results in a compiled time error. There are formal or dummy parameters
    for each function, just think of it as the defined parameters, the actual parameters are the ones given
    when calling the method. I will note that memory is allocated to these copies within the parameter, they
    are later dereferenced. So if you have a method that is supposed to change the value of the argument, it will
    not work. You can pass in objects as arguments, if you wish to avoid the previusoly mentioned problems, it
    becomes necessary to return the object itself, this references the memory location itself as opposed to
    some copy. You can accomplish this by returning in instance of the class in which the arguments
    are equal to the instance variables of another object.
      */
    Human Solomon = new Human("Solomon Saleh", 16); //this is how you initialize objects with constructors.
    Human Winston = new Human("Phoo Pham", 16);
    Human Thomas = new Human("BOY", 15);
    Human Melanie = new Human("Mommy Melanie", 16);
    Human Dylan = new Human("Dimim", 16);
    Human Katie = new Human("Auntie Katie", 16);
    System.out.printf("There are %s Human(s)%n", Human.getNumberOfPeople());
    Thomas.Speak("Just stuff.");
    Winston.Speak("tits");

    Human PhooPham = Human.Clone(Winston); //this will return a direct copy of the Winston object.
    //PhooPham.Speak("testing"); returns phoo pham clone has said testing

    BankAccount one = new BankAccount(); //this is how you initialize objects with setters.
    BankAccount two = new BankAccount();
    one.setBalance(1000);
    one.setAccName("Solomon Is Cool");
    one.setPassword("password");
    System.out.println(one.getBalance("password"));
    System.out.println(BankAccount.getNum());
    }
public static void Greeting(String name){
        System.out.printf("Hello %s%n", name); //f string, %s is the variable, %n is a new line
        System.out.printf("%s %s%n", name, name);
//void as it has no return type
    }
public static String Name(String name){
        return String.format("Hello %s", name); //returns an f string
    // public static String as the return type is a String.
    }
}
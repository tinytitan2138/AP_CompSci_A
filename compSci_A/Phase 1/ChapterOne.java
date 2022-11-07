//page 73 is the beginning of the book, there are 3 practice exams included.

//* signifies all, so you are importing every single class

class  TesterException extends Exception {

    public TesterException(String prompt){
        super(prompt);
    }
}

public class ChapterOne {
    public static void main(String[] args) throws Exception{
        /*
        This is the main method, it is public, so it can be accessed outside the scope of the class
        it is static so calling the method doesn't create an instance of the class.
        It is void so that it needn't return a value.
        The name is just a convention, but the arguments allow for you to
        interact with the method in the command line.
         */
        System.out.println("Hello World"); //System.out is a in instance of the system object which allows for text to be displayed.

        int i = 1, j = 2;
        boolean True = true;
        boolean False123 = false;
        double d = 0.2;
        long l;
        float f = (float) 0.1;
        float z = 0.01f;
        float k = (float) 3/5;
        final int m = 0; // I will note that final values can be initialized and then assigned a value later, but only ONCE
        /*
        example of the above note
        final int i;
        boolean start = true;
        if (start){i=1}
        else {i=0}

         */

       // System.out.println(octo);
        /*
        these are identifiers and data types, notice the naming rules, these are not conventions, you
        cannot have an identifier be a keyword or start with a number or contain a special character.
        I will note that underscores are allowed. I have also showed the idea of casting, that is,
        transferring one data type to another, you cannot do this for every combination, however. You can
        decide if something can later be changed with the final keyword.
         */
       // System.out.println(k);
        /*
        There are also different number systems. such as decimal numbers, octal numbers, and hexadecimal numbers,
        and also binary. for decimal number such as 201, 201 = (2)(10^2) + (0)(10^1) + (1)(10^0)
        for hexidemal like 0x2CA, 0x2CA is (2_hex)(16^2) + (C_hex)(16^1) + (A_hex)(16^0)
        The system is self expanatory for binary numbers. Just follow the basic pattern for the conversion
        to decimal. The conversion from decimal to any of the number base systems is not as simple.
        You take some decimal number and consistenly mark down the division with it and the base number,
        you then take the number of divisions along with the remainder and repeat until you get 0/base_num
        once that happens, you combine all the remainder values into one singular number with a changed base.


         */

        int dec = 10;
        int binary = 0b1111; //initialize special base numbers like this, 0b for binary
        int octo = 0_476; //0_ for octo
        int hex = 0x2CAF; //0x for hex
        String  new_hex = Integer.toHexString(dec); //since special base numbers are not stored like decimal
        //numbers they must be converted to strings
        int reverse = Integer.parseInt(new_hex, 16); //the parse int functioin just takes in some special
        //string of a certain base number (radix) and converts it into a decimal number.

        /*
        I will now introduce mathematical operations. There is addition +, subtraction -, division /,
        modulus %, and multiplication *

        You must define proper data types for these operations. I will also note that programming languages
        allow for self referance, that is, if a = 3 then, a = a + 2 is an accurate statement.
         */
        int floor = (int) 3./4; //returns 0, the floor of 3/4
        double div = 3./4; //returns 3/4 which is 0.75, this is equivelant to (double) 3/4
        // 3/4.
        j++; // j = j + 1, this the same as j += 1
        k = k +1;
        k /= 1; // k = k/1, so and so forth.
        k %= 2;
        i *= 2;
        j--;
        boolean even = (hex % 2 == 0)  ; // semicolons just need to be on the line
        // this is some basic logic, the hex is not divisible by two so this is always false.
        //double equal signs conerts it into a boolean, you are essentially asking,
        // is hex mod 2 = 0? yes is true, no is false.
        boolean T = true;
        boolean F = false;
        boolean news = (T&&F); // and operator, of both are true then it is true
        news = (T||F); // or operator, if at least one is true then it is true
        news = (T && !F); // the not operator with the and operator, not false is true and so on.
        news = (T ^ F); //exclusive or, has to be or not both
        String myWord = "Hello World\n My name is \"Jack\" " +
                "others call me Smith\\Jake"; //These are escape sequences. they allow for
        //certain special characters to be placed into a string
        System.out.print(myWord); //85
        /*
        Programs have control systems, these are essentially non sequentil structures for executing code,
        this can be if statements, if else statements, nested satements, and switch statements. I will
        note that switch statements are not tested on the AP test. The if else statements are just structures
        that allow you to execute code based on conditionals. Switch statements can be thought of as a
        generalization of a if statement, where depending on some value for a variable, some code can be executed
        depending on the value.
         */
        if (news){
            System.out.print("");
        // if news is true it prints nothing
        }
        else if (!news){
            System.out.print("");
        // if the opposite of news is true it prints nothing
        }
        else if (!news ^ !F){
            System.out.print("");
        //if not news xor not f is true, then it prints nothing.
        }
        else {

        //else, so if every other conditional is false, nothing happens.
        }
        /*
        I will also note that a lot of variables and structure can be dependent on user input,
        for actual programming you would use the scanner class, but for the AP test, if you wanted
        to get lets say an integer from the user, you would write int myNum = IO.readInt();
        I will also note that if (someCondition 1) {if (someCondition 2) {print("hello")} is
        equivalent to if (someCondition 1 && someCondition 2) {print("hello")}

         */

        /*
        I will now introduce iteration. Iterable objects are objects in which you can essentially loop
        through the elements to do something with them. You can iterate through iterables with loops, or
        you use loops with defined indices to do your own operation with them. There are for loops,
        while loops, enhanced for loops, and do while loops.
         */
        int sum = 0;
        for (int index = 1; index <= 10; index++){
            sum += index;
            //loops through 1 to 10, adds up each element.
        }
        while (sum <= 10){
            sum += 1;
            //loops does nothing, only iterates 11 times.
        }
        do {
            sum +=1;
        } while (sum <= 10);
        //identical to the above code.
        String word = "Hello World";
        for (char c: word.toCharArray()){
            sum += (int) c;
        }
        for (int tester = 1; tester <= 0; tester++){
            //loop does nothing as break condition is always false.
            System.out.println("END"); //this code is never reached
        }
        /*I will note the existence of sentinels, they are essentially values
        that are compared to user input which decides when the end the code. For example,
        if you wish the code to be terminated once EXIT is typed in, then the sentinel would be
        EXIT.
        String SENTINEl = "EXIT";
        System.out.println("Type in the people you would like to meet"):
        String resp = "";
        ArrayList<String> myList = new ArrayList<String>();
        int i = 1;
        do {
        System.out.println("Person" + i + ": ");
        resp = IO.readLine();
        myList.append(resp);
        i += 1;
        } while (resp != SENTINEL);
        System.out.println("Code Terminated");
        This is an example of some code that implements a sentinel.

        * */

        /*
        Java has something called exceptions. These are bassically built in programs that terminate
        the program upon finding an error, they then print a message telling you want wrong. This is usually
        preceded by a traceback which tells you the exact line this happened on. The following exceptions
        are used in the AP subset of java: ArithmaticException, NullPointerException, ClassCastException,
        ArrayIndexOutOfBoundsException, IndexOutOfBoundsException, and IllegalArgumentException. You
        can throw one of these exceptions and then follow them with ("Some message"), you can even
        create your own exception. All the exceptions themselves are pretty self-explanatory.
         */

         /*
         String word = "hello";
         if (word.equals("hello") {
         throw new TesterException("world");
         }
         This basically shows how to throw an exception, these are technically
         objects and so you treat them as such.
          */

        /*
        I will also note that primitive types are types that are inherent to java, whereas user
        defined types are things like classes. As well, I will not that Integer.MAX_VALUE and
        Integer.MIN_VALUE are maximum and minimum values that can be stored within java.
         */

    }
}

/*
Chapter 1 summary:
Be sure that you understand the difference between primitive and user-defined types
and between the following types of operators: arithmetic, relational, logical, and assignment. Know which conditions lead to what types of errors.
You should be able to work with numbers—know how to compare them and how
to convert between decimal, binary, and hexadecimal numbers. Know how integers
and floating-point numbers are stored in memory, and be aware of the conditions that
can lead to round-off error.
You should know the Integer constants Integer.MIN_VALUEand Integer.MAX_VALUE.
Be familiar with each of the following control structures: conditional statements,
for loops, while loops, and for-each loops.
Be aware of the AP exam expectations concerning input and output.

I will further note to develop a program that accurately compares floating point numbers. (chapter 1)
 */
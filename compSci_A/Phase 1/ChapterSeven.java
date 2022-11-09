import java.util.*;

class RecursiveException extends Exception{
    public RecursiveException(String prompt){
        super(prompt);
    }
}


public class ChapterSeven {
    public static void main(String[] args) throws Exception{
        /*
        This chapter mainly covers recursion, recursion is basically a self referencing function. The
        multiple choice section asks you to understand the trace process of recursion, the FRQ doesn't
        ask you to write recursive functions though. One must note that function calls are represented
        with the stack data structure, the stack data structure follows the first in last out principle.
        If I call a function recursively 5 times, the very first call is placed at the bottom. I will note that
        recursion is actually a mathematical concept, certain functions like !, exp, and certain sequences
        like the fibonacci sequence are fundamentally self referenced. A properly defined sequence then needs
        to have an initial condition, for example, n! = n x (n-1)!, 1! = 1, 0! = 1, these are initial conditions.

         */
        //System.out.println("Enter list of words, one per line.");
       // System.out.println("Final word should be a period (.)");
       // stackWords(); I have commented them out as I dont want the run time to be annoying.
        /*
        As stated before, you need to have initial conditions, but you must also have something in
        the algorithm that allows you to reach that initial condition, you need something to move you
        along. Often times a recursive function has its parameters decreasing if the initial condition
        requires it. Recursion and loops are kind of two sides of the same coin, loops continue some process
        until a condition is met, recursive functions repeat a process but with a simpler case. For example,
        n! = n *x (n-1) x (n-2) x ... x 1 or   n! = n x (n-1)! I will repeat again that the AP test requires you
        to understand and evaluate recursion, not necessarily make one up. To analyze recursive functions, divide
        it up by recursive call trees then generalize the number of calls as steps, for example, the fib
        sequence done recursively has exponential time complexity.
         */

        /*
        I will note the general rules for recursion:
        1. Avoid recursion for algorithms that involve large local
        arrays—too many recursive calls can cause memory overflow.
        2. Use recursion when it significantly simplifies code.
        3. Avoid recursion for simple iterative methods like factorial,
        Fibonacci, and the linear search on the next page.
        4. Recursion is especially useful for
        • Branching processes like traversing trees or directories.
        • Divide-and-conquer algorithms like mergesort and
        binary search.


        Driver code is often used to hide recursion, all this means, is that you create a private
        method in the class that is recursive then create public methods that call that recursive method
        but also accounts for tests. Recursion is often times used to traverse through matrices.
         */
        //String[] test = "Hello Hello hello hello".split("\\s");
       // System.out.println(test.length); useful to know for frq.

    System.out.println(fibSeq(5));
    System.out.println(Exponent(2, 3));
    System.out.println(Factorial(3));

    }
    public static void stackWords()
    {
        Scanner s = new Scanner(System.in);
        //this moves the algorithm along as it continuously gets a new word.
        String word = s.nextLine(); //read user input, a new word is created for every recursive call.
        if (word.equals("."))
            System.out.println();
        else
            stackWords(); // I suppose you can think of the code after this as being in the stack.
        System.out.println(word); //reached in reverse because of stack data structure.
    } // example of recursion from the book.
    public static long fibSeq(int n) throws Exception {
        if (n == 1 || n == 2){
            return (long) 1;
        }
        else if (n <= 0){
            throw new RecursiveException("Please input a valid index");
        }
        else {
            return fibSeq(n-1) + fibSeq(n - 2);
        }

    }

    public static double Exponent(double base, double exp) throws RecursiveException{
        if (exp == 0){
            return (double) 1;
        }
        else if (exp == 1){
            return base;
        }
        else if (exp < 0){
            return 1./ Exponent(base, (-1 * exp));
        }
        else {
            return base * Exponent(base, exp - 1);
        }

    }

    public static long Factorial(int n) throws RecursiveException{
        if (n == 0 || n == 1){
            return (long) 1;
        }
        else if (n < 0 ){
            throw new RecursiveException("Please input a number that is larger than or equal to 0");
        }

        else {
            return n * Factorial(n-1);
        }

    }

}
/*
Chapter 7 summary:
On the AP exam you will be expected to calculate the results of recursive method
calls. Recursion becomes second nature when you practice a lot of examples. For the
Recursion in Two-Dimensional Grids 307
more difficult questions, untangle the statements with either repeated method calls
(like that shown in the solution to Question 5 on p. 319), or box diagrams (as shown
in the solution to Question 12 on p. 320).
You should understand that recursive algorithms can be very inefficient.


 */

/*
Note for future Solomon:
Create a recursive function for matrix searching.
 */

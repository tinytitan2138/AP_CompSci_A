/**
 * 5: no
 * 6: run time error
 * 7: no error (but u get logic error)
 * 8: run time error
 * 20: 1
 * 21: 5
 * 22: 64
 * 23: n^p
 * 25: foo(s.subString(1, s.length -1);
 * 26: return n + foo(n-1);
 * 27: if (s.equals("AB")){
 *     return true;
 * }
 * else if (s.equals("BA")){
 *     return true;
 * }
 * 28: else{
 *     foo((int) Math.pow(n, 2));
 * }
 * 29: the recursion occurs before
 * any base case
 * 30: it should be n + 1 for less than 0
 * and n - 1 for greater than 0
 * 31: it doesnt check if it is negative,
 * but if it is a natural number it doest matter '
 * 32: n is never adjusted and never reaches
 * the base case
 * 35: return n * foo(n-1) not print
 * 36: the first recursive trace is never
 * adjusted so it never reaches the base case.
 * 37: length - 2 is too much, it should be
 * length - 1 or just length
 * 38: temp is still null if the length
 * of the string is exactly 1.
 */

public class JavaChapter13 {
    public static void main(String[] args){

    }
}

/*
Chapter Summary:

The idea of recursion is to convert or reduce a bigger problem to a smaller,
similar problem. The relationship between the bigger problem and the
smaller problem is called the general case.
By reducing the size of a problem to a smaller problem recursively, we
eventually arrive at a small problem that is easy to solve. That small
problem is called the base case.
Solving a problem using recursion typically involves coding a recursive
method.
A recursive method
can be a static method or an instance method,
can take 0, 1, or more parameters, and
can be a void or a value-returning method.
A recursive method calls itself.
Problem solving using recursion involves two steps: generating a recursive
formulation of the problem for the general case, and solving the base
case(s).
There can be one or more base cases.
Most base cases are simple, but some can be more complex.
Most general cases are simple, but some can be more complex.
A recursive method calls itself repeatedly until a base case is reached.
A recursive method typically includes an if/else statement that tests for the
base case.
If the recursive method does not test for the base case, calling the method
will typically result in a stack overflow run-time error.
Recursion is typically an alternative to iteration. The coding of a recursive
1129
method is typically compact and elegant. However, a recursive method
may not be as efficient as its iterative equivalent.

 */

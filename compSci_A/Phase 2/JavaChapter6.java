/**
 * 1: the code runs forever
 * 2: do while, for, and while all work
 * 3: it is a count controlled loop
 * 4: true
 * 17: 2, 6, 12, 19, 28
 * 18: 10, 19, 27, 34, 40
 * 19:3, 3, 3, 4,
 * 20: 6, 15
 * 26: File f = new File("location");
 * Scanner sc = new Scanner(f)
 * while (f.hasNextInt()) {sum += f.nextInt(); }
 * 27: for (int i = 0; i < 5; i++) {print("hi"); }
 * 28: num = 1;
 * while (num != 0 && num != 100) {
 *     num = sc.nextInt();
 *    if (num != 0 && num !=100){
 *    print(num);  }
 * }
 * 29: sum = 0;
 * for (int i  = 1; i <=5 ; i++){
 *     sum += 1;
 * }
 * 32: it doesnt have curly brackets
 * 33: it should be i--
 * 34: it needs an and operator
 * 35: it needs an and operator.
 * 39: it stops when it is set to three, make it <= 3
 * 40: it is a comma, should be a ;
 * 41: i is declared inside, declare i outside
 * 42: i is already declared. set i = i in the loop
 * or use another variable
 *
 */

import java.util.Random;

import static java.lang.Math.*;
public class JavaChapter6 {
    public static void main(String[] args){
        Random r = new Random();
        int n = 1 + r.nextInt(10);
        while (n != 5 && n !=7){
            n = 1 + r.nextInt(10);
        }
        System.out.println("end");
        int i = 0;

    }
}

/*
Chapter Summary:

Looping repeats a set of operations for each input item while a condition is
true.
The while loop is especially useful for event-controlled looping. The while
loop executes a set of operations in the loop body as long as the loop
condition is true. Each execution of the loop body is an iteration of the
loop.
If the loop condition evaluates to false the first time it is evaluated, the body
of the while loop is never executed.
If the loop condition never evaluates to false, the result is an infinite loop.
In event-controlled looping, processing of items continues until the end of
input is signaled either by a sentinel value or by reaching the end of the
file.
A sentinel value is a special input value that signals the end of the items to
be processed. With a sentinel value, we perform a priming read before the
while loop. The body of the loop processes the input, then performs an
update read of the next data item.
When reading data from an input file, we can test whether we have reached
the end of the file by calling a hasNext method of the Scanner class.
In the accumulation programming technique, we initialize a total variable to
0 before starting the loop. In the loop body, we add each input value to the
total. When the loop completes, the current total is the total for all
processed input values.
In the counting programming technique, we initialize a count variable to 0
before starting the loop. In the loop body, we increment the count variable
for each input value that meets our criteria. When the loop completes, the
count variable contains the number of items that met our criteria.
To find an average, we combine accumulation and counting. We add input
values to the total and increment the count. When the loop completes, we
calculate the average by dividing the total by the count. Before computing
the average, however, we should verify that the divisor (that is, the count)
433
is not 0.
To find the maximum or minimum values in a set of input, we assign the first
input to a running maximum or minimum. In the loop body, we compare
each input value to our running maximum or minimum. If the input value is
less than the running minimum, we assign the input value to the running
minimum. Similarly, if the input value is greater than the running maximum,
we assign the input value to the running maximum. When the loop
completes, the running value is the maximum or minimum value of all the
input values.
To animate an image, the loop body draws the image, pauses for a short
interval, erases the image, and changes the starting x or y values to the next
location for drawing the image.
To avoid generating exceptions when the user types characters other than the
data type expected, use the hasNext methods of the Scanner class.
To construct a loop condition, construct the inverse of the loop termination
condition.
When testing a program that contains a loop, test that the program produces
correct results by inputting values and comparing the results with manual
calculations. Also test that the results are correct if the while loop body
never executes. Finally, test the results with input that is invalid.
The do/while loop checks the loop condition after executing the loop body.
Thus, the body of a do/while loop always executes at least once. This type
of loop is useful for validating input.
The for loop is useful for count-controlled loops, that is, loops for which
the number of iterations is known when the loop begins.
When the for loop is encountered, the initialization statement is executed.
Then the loop condition is evaluated. If the condition is true, the loop
body is executed. The loop update statement is then executed and the loop
condition is reevaluated. Again, if the condition is true, the loop body is
executed, followed by the loop update, then the reevaluation of the
condition, and so on, until the condition evaluates to false.
Typically, we use a loop counting variable in a for loop. We set its initial
value in the initialization statement, increment or decrement its value in the
loop update statement, and check its value in the loop condition.
The loop update statement can increment or decrement the loop variable by
any value.
434
In a for loop, it is important to test that the starting and ending values of the
loop variable are correct. Also test with input for which the for loop body
does not execute at all.




 */

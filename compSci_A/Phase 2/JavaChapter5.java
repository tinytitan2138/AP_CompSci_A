/**
 * 6: yes
 * 7: no, yes, yes, yes
 * 8: if, else if, else
 * 9: equals method
 * 16: Hello 3, Hello 4, Done
 * 17: Season is summer
 * 18: Letter 2
 * 19: Number 3
 * 27: if ((b * c) >= 100) {a = !a;}
 * else {a = true}
 * 28: if (a && b > 10) {c++;}
 * 29: if (b < 10 && c < 10) {a = true;}
 * else {a = false}
 * 30: if (b > 5 || c > 5) {a = true; }
 * else {a = false; }
 * 35: curly and paranathesis are switched
 * 36: else if is before else
 * 37: No
 * 38: probably not, there may be an error with the brackets.
 * 39: You need only one line for indentation, there multiple
 * 40: you need ==
 * 41: no opening brackets or closing brackets, it is nested without an if.
 */

public class JavaChapter5 {
    public static void main(String[] args){

    }
}
/*
Chapter Summary:
Java provides equality, relational, and logical operators to evaluate a
condition, and selection statements to choose which instructions to execute
331
based on whether a condition evaluates to true or false.
The equality operators (==, != ) are used to test whether two operands are
equal. The operands are expressions that evaluate to a primitive numeric
or boolean type or an object reference.
The relational operators (<, <=, >, >=) compare the values of two
operands that are expressions that evaluate to a primitive numeric type.
The logical operators (!, &&, and || ) take boolean expressions as
operands. The logical NOT ( ! ) takes one operand, and inverts its value,
changing true to false and false to true. The AND operator (&&) takes
two boolean expressions as operands; if both operands are true, then the
result is true; otherwise, the result is false. The OR operator (||) also takes
two boolean expressions as operands. If both operands are false, then the
result is false; otherwise, the result is true.
The logical NOT operator (! ) has the highest precedence of these
operators, followed by the relational operators, then the equality
operators, then the logical AND (&&), then the logical OR(|| ).
DeMorgan’s Laws can be used to form equivalent logical expressions to
improve readability of the code.
The if statement is used to perform certain operations for one set of data and
do nothing for all other data.
Curly braces are required when the true or false block of an if statement
consists of more than one statement.
The if/else statement is used to perform certain operations for one set of
data and other operations for all other data.
The if/else if statement is appropriate when the data falls into more than
two mutually exclusive categories and the appropriate instructions to
execute are different for each category.
if/else statements can be coded sequentially and can be nested inside other
if/else statements.
When if statements are nested, the compiler matches any else clause with
the most previous if condition that doesn’t already have an else clause.
Because rounding errors can be introduced in floating-point calculations, do
not use the equality operators to compare two floating-point numbers.
Instead, compare the absolute value of the difference between the numbers
to some threshold value.
332
When you need exact precision in calculations with decimal numbers, you
can use the BigDecimal class in the Java Class Library.
Using the equality operator on object references compares the values of the
references, not the object data. Two object references will be equal only if
they point to the same object.
Use the equals method to determine whether the data in two objects are
equal.
In addition to the equals method, two Strings can also be compared using
the equalsIgnoreCase method and the compareTo method of the String
class.
The conditional operator (?:) is used in expressions where one of two
values should be used depending on the evaluation of a condition. The
conditional operator is useful for validating input and for outputting
similar messages.
The switch statement evaluates an integer or character expression or a
String, then compares the expression’s value to case constants. When a
match is found, it executes the statements until either a break statement or
the end of the switch block is encountered.




 */

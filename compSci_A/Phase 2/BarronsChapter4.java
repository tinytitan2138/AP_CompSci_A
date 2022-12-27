/**
 * 1: B
 * 2: E B
 * 3: C
 * 4: A C
 * 5: D A
 * 6: A D
 * 7: A E
 * 8: E D
 * 9: A
 * 10: C
 * 11: B D
 * 12: A
 * 13: D
 * 14: E
 * 15: A
 * 16: B C
 * 17: C E
 * 18: C
 * 19: C
 * 20: B
 * 21: D A
 * 22: D E
 */

public class BarronsChapter4 {
    public static void main(String[] args){
        /*
        doubleValue is a method from the integer class. Probabilities
        are going to be in intervals. Recall that random plus 1 shifts
        the interval by one. 22 was asking what was false
        not true.
         */

        Integer a = new Integer(5);
        Integer b = new Integer(5);
        boolean c = a.equals(b);
        System.out.println(c);
        String t = "tom", tt = "tomato", aa = "hello world", AA = "helloworld";

        System.out.println(t.compareTo(tt)); // produces a negative number
        System.out.println(aa.equals(AA));

    }
}

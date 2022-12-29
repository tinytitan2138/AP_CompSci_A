import java.sql.PseudoColumnUsage;

/**
 * 1: C  E
 * 2: C
 * 3: E
 * 4: A
 * 5: C
 * 6: B  C
 * 7: D
 * 8: A
 * 9: D
 * 10: B
 * 11: C
 * 12: E
 * 13: A B
 * 14: C
 * 15: A
 * 16: B
 * 17: D  A
 * 18: B
 * 19: D
 * 20: C
 * 21: B
 * 22: E
 * 23: C
 * 24: D
 * 25: A
 * 26: E
 * 27: D
 * 28: D
 * 29: A
 * 30: A
 * 31: B
 * 32: D
 * 33: B
 * 34: D
 * 35: E
 * 36: E
 * 37: E
 */

class Book{
    String name;
    int pageCount;
    boolean status ;
            public  Book(String name, int pageCount, boolean status){
                this.name = name;
                this.pageCount = pageCount;
                this.status = status;

            }
            public void changeStatus(){
                this.status = ! this.status;
            }
}

public class BarronsChapter6 {
    public static void main(String[] args){
        int i = 0;
        while (i <= 5){
            i++;
        }
        System.out.println(i);
              Book b = new Book("The Great Gatsby", 500, false);
              Book c = new Book("a", 1, false);
              Book[] list = {b, c};
              for (Book book: list){
                  book.changeStatus();
              }
             for (Book book: list){
                 System.out.println(book.status);
             }

              int[] l1 = new int[5];
             for (int j: l1){
                 j = 10;
             }
             for (int j: l1){
                 System.out.println(j);

             }
      Integer i1 = new Integer(5);
     // String s1 = i1;

    }
   /*
   Conclusions: Taking too long, just give answers first. When
   initializing an array of integers they are 0 not null. When setting another list
   equal to another, it is pointing to it, so modifications will modify the original list.
   You only need to use get if it is a inherited class. The set method replaced an element.
   Array Lists are dynamic so you cant get a out of bounds error when setting new values.
   The .equals method works for objects only, it compares strings and the memory locations
   of objects. 
    */






}

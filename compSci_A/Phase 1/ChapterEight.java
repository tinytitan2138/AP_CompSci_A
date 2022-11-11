import javax.sound.midi.SysexMessage;
import java.util.Arrays;
class BinarySearchExcepion extends Exception{
    public BinarySearchExcepion(String prompt){
        super(prompt);
    }
}
class MergeSortException extends Exception{
    public MergeSortException(String prompt){
        super(prompt);
    }
}





class SelectionSort{
    private final int[] array;
    public SelectionSort(int[] array){
        this.array = array;
    }

    private void swap(int i, int j){
        int temp = array[j];
        array[j] = array[i];
        array[j] = temp;
    }
    public void selectionSort(){
        int pos, max;
        for (int i = 0; i < array.length - 1; i ++){
            max = array[i];
            pos = i;
            for (int j = i + 1; j < array.length; j ++){
                if (max < array[j]){
                    max = array[j];
                    pos = j;
                }
            swap(i, pos);
            }
        }
    }
    public void print(){
        System.out.println(Arrays.toString(this.array));
    }
}
class sortInsertion{
public static void INSERTIONSORT(int[] array){
    int n = array.length;
    for (int j = 1; j < n; j++){
        int key = array[j];
        int i = j-1;
        while ((i > -1) && (array[i] > key)){
            array[i+1] = array[i];
            i--;
        }
        array[i+1] = key;
    }
/*
It helps to think in terms of cases, the case in which the value is less than
it is then replaced by it and the sort starts again. If it is not less than it notice
how i doesnt update, and notice how i + 1 is just the position of the key.
 */


}
}

class SelectionSORT{
    public static void sort(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            int min_index = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_index])
                    min_index = j;


        int temp = array[min_index];
        array[min_index] = array[i];
        array[i] = temp;
        /*
        We can aswell analyze the cases here. The index is chosen to be 0 and incraments, j is
        chosen to be the value right infront if it, j then incramets through the rest of the list,
        this is all done to find the index where the minimum value is, once it is found it replaces
        minimum index with it and the search starts again.
         */
        }
    }
}

class MergeSort {
    void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;

            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;

        }

    }

    public void sort(int[] arr, int l, int r) throws MergeSortException{
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);

        }


    }
}
    public  class ChapterEight {
        public static void main(String[] args) throws Exception {
        /*
        Some of the most important algorithms within computer science are sorting algorithms,
        one such algorithm is selection sort. The smallest
        element is pushed to the front, then it searches through the n-1 length array starting at index
        one and repeats the process until n-1 passes have occurred, n = length O(n^2), O(n^2)n O(n) worst,
        average, and best respectively. Another algorithm is
        insertion sort, it works like this, you start with the second element and compare it with the
        one behind it, if it is smaller they are swapped, then you repeat but with the element front
        of the one that was swapped, the time complexity is the exact same as selection sort. There are other
        algorithms that divide the problem into smaller sub problems, this methodology is called divide and conquer,
        an example of which is merge-sort. Merge sort works by recursively breaking an array in half until
        you have n arrays, these arrays are then merged together by comparing their adjacent components. You
        then end up with an array sorted in ascending order, if that was what you wanted that is. Merge
        sort is O(nlogn) for average and best and worst. The best sorting algorithm is quick sort,
        it works by picking pivot value to then compare to the rest of the list, anything less than the pivot
        is moved to variable left, and greater than is moved to the right, this is done recursively then they
        are all put together. It is O(logn) but O(n^2) in worst case.
         */
            int[] mylist = {1, 3, 5, 2, 62, 7,};
            // SelectionSort sort = new SelectionSort(mylist);
            // sort.selectionSort();
            //  sort.print(); // seems like the books implementation doesnt work.
            sortInsertion.INSERTIONSORT(mylist);
            System.out.println(Arrays.toString(mylist)); // this one works.
            mylist = new int[]{20, 40, 50, 1, 60};
            SelectionSORT.sort(mylist);
            System.out.println(Arrays.toString(mylist));
            mylist = new int[]{123, 52, 51, 6, 3, 754, 1};
            MergeSort Sorter = new MergeSort();
            Sorter.sort(mylist, 0, mylist.length - 1);
            System.out.println(Arrays.toString(mylist));
            mylist = new int[]{0, 12, 51, 3, 14, 12, 62342, 1};
            mergeSort(mylist);
            System.out.println(Arrays.toString(mylist));
            /*
            These were all merge sort algorithms, the best implementation was the one
            written as a function, the recursion is hard to reverse engineer though. I will
            now introduce the quick sort algorithm. I will further emphasize that it works by picking
            random pivot values, then it sorts it using indices i and j, i is - 1 j i is 0,
            j is compared to the pivot, if it less than the pivot then i is incremented then i and j
            are swapped, if not, then j is incremented and i is not. You then end up with the pivot
            value being in the correct spot, with the values to the left being less than, and the values
            to the right being greater than. This is repeated recursively, they are then placed back together, as
            every recursive trace to a pivot can be placed to either the right or the left of it which would
            get you a sorted list.
             */
            mylist = new int[]{10, 32, 62, 632, 472, 654, 256, 3, 876, 535, 15, 43,};
            quickSort(mylist, 0, mylist.length - 1);
            System.out.println(Arrays.toString(mylist));
            int[] search = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int index = sequentialSearch(search, 5);
            if (index != -1) {
                System.out.printf("%s found within %s at index: %s%n", 5, Arrays.toString(search), index);
            } else System.out.println("wasnt found");
            binarySearch(search, 5, 0, search.length - 1);
            binarySearch(search, 1000, 0, search.length - 1);

            /*
            There are also sequential search and binary search algorithms, they search for the location of
            an index within some array. Sequential search just searches linearly through the whole thing,
            it has O(n) time complexity. Binary search has O(logn) time complexity. Binary search assumes a pre
            ordered list, it works by analyzing if the middle value is equal to the target value, if it is less than
            then it repeats the process but to the right of the middle value, if not, then to the left of the middle
            value. It always starts from the middle of whatever sub-sequence it is.
             */


        } // methods below here

        public static void mergeSort(int[] array) {
            int n = array.length;
            if (n < 2)
                return;
            int mid = n / 2;
            int[] L = new int[mid]; // left and right arrays
            int[] R = new int[n - mid];
            for (int i = 0; i < mid; i++) // duplicates them accordingly
                L[i] = array[i];
            for (int i = mid; i < n; i++)
                R[i - mid] = array[i];

            mergeSort(L); // recursively creates new L and R
            mergeSort(R); // 2 recursive traces, at the end of it is merge
            merge(array, L, R); // merge merges them back into array using comparison.
            /*
            The recursive trace follows a basic pattern of splitting it up until
            you get indiviudal compenents, then the call stack causes you to go backwards
            in which you get an array with 2 elements tat gets sorted, then 4, then so on.
            Eventually you get the final array which is the sorted initial array.
             */


        }

        public static void merge(int[] array, int[] L, int[] R) {
            int n = array.length;
            int mid = n / 2;

            int left = mid;
            int right = n - mid;
            int i = 0, j = 0, k = 0;
            while (i < left && j < right) {
                if (L[i] <= R[j]) {
                    array[k++] = L[i++];
                } // gets the smallest component then incraments the index from that list
                else {
                    array[k++] = R[j++];
                }


            }
            while (i < left)
                array[k++] = L[i++];

            while (j < right)
                array[k++] = R[j++];
            /*
            There will always be a difference of one between i and j (the last element) so it
            gets what is essentially the last element of the list.
             */

        }

        public static void quickSort(int[] array, int start, int end) {
            if (end <= start) return; //base case

            int pivot = partition(array, start, end); // location of pivot value after partition
            quickSort(array, start, pivot - 1); // recursively partitioning the right and left arrays
            quickSort(array, pivot + 1, end);
        }

        public static int partition(int[] array, int start, int end) {
            int pivot = array[end]; //this all essentially works the exact same way as how I described.
            int i = start - 1;
            for (int j = start; j <= end - 1; j++) {
                if (array[j] < pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            i++;
            int temp = array[i];
            array[i] = array[end];
            array[end] = temp;
            return i;
        }

        public static int sequentialSearch(int[] array, int target) {
            int index = 0;
            for (int i = 0; i < array.length; i++)
                if (array[i] == target)
                    index = i;

            if (index != 0)
                return index;
            else return -1;
        }

        public static void binarySearch(int[] array, int target, int low, int high) throws BinarySearchExcepion {
            if (high >= low) {
                int mid = low + (high - low) / 2;
                if (array[mid] == target)
                    System.out.printf("%s was found within %s at index: %s%n", target, Arrays.toString(array), mid);

                else if (array[mid] < target)
                    binarySearch(array, target, mid + 1, array.length - 1);

                else if (array[mid] > target)
                    binarySearch(array, target, 0, mid - 1);
            } else {
                System.out.printf("%s was not found within %s%n", target, Arrays.toString(array));
            }
        }
    }
/*
Chapter 8 summary:
You should not memorize any sorting code. You must, however, be familiar with
the mechanism used in each of the sorting algorithms. For example, you should be
able to explain how the merge method of mergesort works, or how many elements
are in their final sorted position after a certain number of passes through the selection
sort loop. You should know the best and worst case situations for each of the sorting
algorithms.
Be familiar with the sequential and binary search algorithms. You should know that
a binary search is more efficient than a sequential search, and that a binary search can
only be used for an array that is sorted on the search key

Quick idea:
project where user gives a list then chooses what searching or sorting algorithm to use.
 */

import java.util.Arrays;

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
        public static void main(String[] args) throws MergeSortException {
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
        }
    }


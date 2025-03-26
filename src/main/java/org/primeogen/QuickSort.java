package org.primeogen;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,3,7,4,69,420,42};
        System.out.println( Arrays.toString(quicly(arr, 0, arr.length - 1)));

    }

    public static int[] quicly(int[] arr, int lo, int hi){ // this is the recursive function
        if(lo >= hi){ // base case
          return arr;
        }
        int pivotIdx = partition(arr,lo,hi);

        quicly(arr,lo,pivotIdx -1);
        quicly(arr,pivotIdx + 1, hi);
        return arr;

    }

    public static int partition(int[] arr, int lo, int hi){ // produces the pivot index and moves the elements into the respective sides
        int pivot = arr[hi];

        int index = lo -1;

        for( int i = lo; i < hi; i++){
            if(arr[i] <= pivot){
                index++;
               int temp = arr[i];
               arr[i] = arr[index];
               arr[index] = temp;
            }
        }
        index++;
        arr[hi] = arr[index];
        arr[index] = pivot;
        return index;
    }
}

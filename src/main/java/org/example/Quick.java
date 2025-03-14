package org.example;

public class Quick {

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot -1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static int partition(int[] arr,int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for( int j = low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,2,3,1,8,4};

        int left = 0;
        int right = arr.length -1;

        quickSort(arr,left,right);

        for(int num: arr){

        System.out.println(num);;
        }
    }


}

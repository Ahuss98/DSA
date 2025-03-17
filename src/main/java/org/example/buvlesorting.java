package org.example;

import java.util.Arrays;

public class buvlesorting {
    public static void main(String[] args) {
        int[] numbers = {2,6,4,9,1,};
        System.out.println(buble(numbers));
        System.out.println(binary(numbers,1));

    }
        public static int[] buble(int[] array){
        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
        }

        public static boolean binary(int[] array, int myNumb){
            int l = 0;
            int r = array.length -1;

            while(l<=r){
                int mid = l + ((array.length)/2 - 1);
                if(mid == myNumb){
                    return true;
                } else if(mid > myNumb){
                    l = mid+1;
                } else if( mid < myNumb){
                    r = mid -1;
                }
            }

            return false;
        }
}

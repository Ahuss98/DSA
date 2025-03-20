package org.example;

import java.util.Arrays;

public class buvlesorting {
    public static void main(String[] args) {
        int[] numbers = {2,6,4,9,1,};
        System.out.println(Arrays.toString(buble(numbers)));
        System.out.println(binary(buble(numbers),9));
        System.out.println(binrary2(buble(numbers),88));

    }
        public static int[] buble(int[] array){
        for(int i = 0; i< array.length;i++){
            for(int j = 0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }

        }
            return array;
        }

        public static boolean binary(int[] array, int myNumb){
            int l = 0;
            int r = array.length -1;
            while(l<=r){
                int m = l+ (r-l)/2;
                if(array[m] == myNumb){
                    return true;
                } else if (array[m] > myNumb){
                    r = m-1;
                } else {
                    l = m + 1;
                }
            }
            return false;
        }

















        public static boolean binrary2(int[] x, int findMe){
            int l = 0;
            int r = x.length -1;

            while(l<=r){
                int m = l + (r-l)/2;
                if(x[m] == findMe){
                    return true;
                } else if( x[m] > findMe){
                    r = m -1;
                } else if (x[m] < findMe) {
                    l = m + 1;

                }
            }
                return false;
        }
}

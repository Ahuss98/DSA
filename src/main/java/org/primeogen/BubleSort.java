package org.primeogen;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = {4,2,6,1,3,5};

        System.out.println(Arrays.toString(boobley(array)));

    }

    public static int[] boobley(int[] unsortedArr){
        for(int i = 0 ; i < unsortedArr.length; i++){
            for(int j = 0; j < unsortedArr.length -1; j++){
                if(unsortedArr[j] > unsortedArr[j+1]){
                    int temp = unsortedArr[j];
                    unsortedArr[j] = unsortedArr[j+1];
                    unsortedArr[j+1] = temp;
                }
            }
        }
        return unsortedArr;
    }
}

package org.primeogen;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArr = {2,4,55,66,77,999};
        int[] unsortedArr = {23,4,15,6,1,4};
        Arrays.sort(unsortedArr);
        System.out.println(binary(sortedArr,88));
        System.out.println(binary(sortedArr,4));
    }

    public static boolean binary(int[] heystack, int needle){
        int l = 0;
        int r = heystack.length -1;

        while (l<=r){
            int m = l + (r -l)/2;
            if(heystack[m] == needle){
                return true;
            } else if (heystack[m] < needle) {
                l = m + 1;
            } else if (heystack[m] > needle) {
                r = m -1;

            }
        }
        return false;
    }
}

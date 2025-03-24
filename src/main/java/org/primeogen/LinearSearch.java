package org.primeogen;

public class LinearSearch {
    public static void main(String[] args) {
        int[] myarr = {3,5,1,23,99,45};
        System.out.println(linearsear(myarr,32));

    }
    public static boolean linearsear(int[] heystack, int needle ){
        for(int i = 0; i< heystack.length; i++){
            if(heystack[i] == needle){
                return true;
            }
        }

        return false;
    }
}

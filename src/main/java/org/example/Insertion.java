package org.example;

public class Insertion {
    public static void main(String[] args) {
    int nums[] = {6,5,2,8,3,1,9};

    for(int i = 1 ; i < nums.length; i++ ){
        int curr = nums[i];

        int j = i-1;
        while(j >= 0 && nums[j] > curr){
            nums[j+1] = nums[j];
            j--;
        }
        nums[j+1] = curr;
    }
        for(int num : nums){
            System.out.println(num);
        }
    }
}

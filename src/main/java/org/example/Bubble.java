package org.example;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,3,1,9};

        System.out.println("before sorting");
        for(int num : nums){
            System.out.print(num);
        }

        for(int i = 0; i< nums.length;i++){
            for(int j = 0; j< nums.length-i-1;j++){
                if(nums[j] > nums[j+ 1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }


        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num);
        }


    }
}

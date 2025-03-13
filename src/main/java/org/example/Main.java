package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {5,7,9,11,13,15};
        int target = 9;

        int result = linearSearch(nums,target);
        int result1 = binarySearch(nums,target);

        if(result != -1){
            System.out.println("element found at index: " +result);
        } else {
            System.out.println("element not found");
        }


        if(result1 != -1){
            System.out.println("element found at index: " + result1);
        } else {
            System.out.println("element not found");
        }

    }
    public static int linearSearch(int[] nums, int target){
        int steps = 0;
        for(int i = 0; i < nums.length;i++){
            steps++;
            if(nums[i] == target){
                System.out.println("linear was "+steps+ " steps");
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while(left <= right){
        steps++;
        int middleIndex =  (right+left)/2;

            if(nums[middleIndex] == target){
                System.out.println("binary was " + steps+" steps");
                return middleIndex;

            } else if(target < nums[middleIndex]){
                right = middleIndex - 1;

            } else {
                left = middleIndex + 1;

            }
        }
        return -1;
    }

}
package org.example;

public class Selection {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,3,1,9};
        int size = nums.length;

        System.out.println("before sorting");
        for(int num : nums){
            System.out.print(num);
        }

        for(int i = 0; i< size; i++){
            int min_ind = i;
           for(int j = i; j < size; j++){
               if(nums[j] < nums[min_ind]){
                   min_ind = j;
               }
           }

           int temp = nums[i];
           nums[i] = nums[min_ind];
           nums[min_ind] = temp;
        }


        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num);
        }
    }
}

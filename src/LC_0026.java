//Leetcode problem 26
//26. Remove Duplicates from Sorted Array

//Given an integer array nums sorted in non-decreasing
//        order, remove the duplicates in-place such that each unique element
//        appears only once. The relative order of the elements should be kept the same.
//Consider the number of unique elements in nums to be k. After
//        removing duplicates, return the number of unique elements k.
//The first k elements of nums should contain the unique numbers in sorted order.
//        The remaining elements beyond index k - 1 can be ignored.
//
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

//
 // SOLVED at 22.10.25
//

import java.util.Arrays;

public class LC_0026 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 2, 3, 4}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 3}));
        System.out.println(removeDuplicates(new int[]{0, 0, 0, 1, 1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0}));
        System.out.println(removeDuplicates(new int[]{0, 1}));
    }
    
    public static int removeDuplicates(int[] nums) {
        int temp = nums[0];
        int index = 1;
        int result = 1;

        for (int i = 0; i < nums.length - 1; i++) {
           if (temp != nums[i+1]){
                nums[index] = nums[i+1];
                index++;
                temp = nums[i+1];
                result++;
           }
        }

        System.out.println("\n"+Arrays.toString(nums));
        return result;
    }
}

//БОЛЕЕ ПРОСТО РЕШЕНИЕ НО Я ДО НЕГО НЕ ДОПЕР
//public int removeDuplicates(int[] arr) {
//        int i=0;
//        for(int j=1;j<arr.length;j++){
//            if(arr[i]!=arr[j]){
//                i++;
//                arr[i]=arr[j];
//            }
//        }
//        return i+1;
//
//    }

package org.dinesh.datastructures.search;

public class LinearAndBinarySearch {
    public static void main(String[] args) {
        int[] nums = {5,7,9,11,13};
        int target = 13;
        int result = linearSearch(nums, target);
        int result1 = binarySearch(nums, target, 0, nums.length-1);
        int result2 = binarySearchRecursive(nums, target, 0, nums.length-1);
        if(result != -1){
            System.out.println("Element found in Index:"+result);
        }else{
            System.out.println("Element Not Fount");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i=0;i<nums.length;i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Linear Number of Steps:"+steps);
                return i;
            }
        }
        System.out.println("Linear Number of Steps:"+steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        int steps = 0;

        while(left <= right){
            int mid = (left + right)/2;
            steps++;
            if(nums[mid] == target){
                System.out.println("Binary Search Number of Steps:"+steps);
                return mid;
            } else if( nums[mid] < target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        System.out.println("Binary Search Number of Steps:"+steps);
        return -1;
    }


    public static int binarySearchRecursive(int[] nums, int target, int left, int right) {
        int mid = (left + right)/2;
        if(left <= right){
            if(nums[mid] == target){
                return mid;
            } else if( nums[mid] < target){
                return binarySearchRecursive(nums, target, mid+1, right);
            } else {
                return binarySearchRecursive(nums, target, left, mid-1);
            }
        }
        return -1;
    }
}

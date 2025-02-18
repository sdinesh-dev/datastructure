package org.dinesh.datastructures.sorting;

public class SelectionSort {
    public static void main1(String[] args) {
        int[] nums = {6, 5, 2, 8, 9, 4};
        int size = nums.length;
        int minIndex = -1;
        int temp = 0;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int m = i + 1; m < size; m++) {
                if (nums[minIndex] > nums[m]) {
                    minIndex = m;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println("After Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 8, 9, 4};
        int size = nums.length;
        int maxIndex = -1;
        int temp = 0;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size -1 ; i++) {
            maxIndex = i;
            for (int m = i+1; m < size; m++) {
                if (nums[maxIndex] < nums[m]) {
                    maxIndex = m;
                }
            }
            temp = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println("After Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

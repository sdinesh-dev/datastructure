package org.dinesh.datastructures.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 3, 1};
        int size = arr.length;
        int key = 0, j = 0;
        for (int i = 1; i < size; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println();
            for(int num: arr){
                System.out.print(" "+num);
            }
        }
    }
}

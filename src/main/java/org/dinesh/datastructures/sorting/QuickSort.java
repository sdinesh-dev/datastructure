package org.dinesh.datastructures.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,3,8,1,4,6,2,7};
        quickSort(arr, 0, arr.length-1);
        System.out.println("After Sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1, high);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        return i+1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

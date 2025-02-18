package org.dinesh.datastructures.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,5,9,1,6,7};
        System.out.println("Before Sorting:");
        for(int num : arr){
            System.out.print(" "+num);
        }
        System.out.println();

        mergeSort(arr, 0, arr.length-1);

        System.out.println("After Sorting:");
        for(int num : arr){
            System.out.print(" "+num);
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr, int left, int right){
        if(left<right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }


    public static void merge(int[] arr, int left, int mid, int right){
        int arr1len = mid - left + 1;
        int arr2len = right - mid;

        int[] lArr = new int[arr1len];
        int[] rArr = new int[arr2len];

        for(int x=0;x<arr1len;x++){
            lArr[x] = arr[left+x];
        }
        for(int x=0;x<arr2len;x++){
            rArr[x] = arr[mid+1+x];
        }
        int i=0;
        int j=0;
        int k=left;

        while(i<arr1len && j<arr2len){

            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i<arr1len){
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while(j<arr2len){
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }
}

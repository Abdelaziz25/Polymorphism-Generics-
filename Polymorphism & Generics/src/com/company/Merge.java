package com.company;

import java.util.Arrays;

public class Merge <T extends Comparable<? super T>> implements Sort<T>{
    T[] temp;
    public void merge(T[] intArray, int start, int mid, int end)
    {
        int k = start, i = start, j = mid + 1;

        // traverse through elements of left and right arrays
        while (i <= mid && j <= end) {
        if (intArray[i] .compareTo(intArray[j])<0 ) {
            temp[k++] = intArray[i++];
        } else {
            temp[k++] = intArray[j++];
        }
    }

        // Copy remaining elements
        while (i <= mid) {
        temp[k++] = intArray[i++];
    }

        // copy temp array back to the original array to reflect sorted order
        for (i = start; i <= end; i++) {
        intArray[i] = temp[i];
        }
    }
    private void mergesort(T[]array,int low, int high) {

        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(array,low, middle);
            // Sort the right side of the array
            mergesort(array,middle + 1, high);
            // Combine them both
            merge(array,low, middle, high);
        }
    }
    @Override
    public void sort(T[] array) {
        int low = 0;
        int high = array.length - 1;
        temp = Arrays.copyOf(array, array.length);
        mergesort(array,0, array.length - 1);
    }
}

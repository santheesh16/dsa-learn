package com.java.algorithm.sort;

import java.util.Arrays;

public class InsertionSort {
  static int[] insertionSort(int[] arr){
    int size = arr.length;
    for (int i = 1; i < size; i++) {
      int key = arr[i];
      int j = i -1;
      while (j>= 0 && key < arr[j]) {
        arr[j + 1] = arr[j];
        --j;
      }
      arr[j+1] = key;
    }
    return arr;
  }  public static void main(String[] args) {
    int arr[] = {5,1,3,13,18,15, 21, 19, 2};
    System.out.println(Arrays.toString(insertionSort(arr)));
  }
}

/*
 * insertSort(arr)
 *  mark first element as sorted
 *   for each unsorted element x
 *    'extract' the element x
 *     for j <- lastSortedIndex down to 0
 *        if current element j > x
 *          move sorted element to the right by 1
 *     break
 * 
  * Time Complexity 
 * Base Case : O(n)
 * Worst Case : O(n^2)
 * Average Case : O(n^2)
 * 
 * Space Complexit: O(1)
 */
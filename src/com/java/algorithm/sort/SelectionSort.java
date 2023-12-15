package com.java.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {

  static int[] selectionSort(int arr[]){
    int len =arr.length;
    for (int i = 0; i < len - 1; i++) {
      int minidx = i;
      for (int j = i + 1; j < len ; j++) {
        if(arr[i] < arr[minidx]){
          minidx = i;
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = {5,1,3,13,15,18};
    System.out.println(Arrays.toString(selectionSort(arr)));
  }
}



/*
 * 
 * selectSort(array, size)
 *  for i <- 0 to size - 1
 *     set the first unsorted element as mninmun
 *      for each of the unsorted element as minimum
 *        if element > currentMinimum
 *          set element as new minimum
 *      swap minimum with first unsorted position
 *  end selectionSort
 * 
 * Time Complexity 
 * Base Case : O(n^2)
 * Worst Case : O(n^2)
 * Average Case : O(n^2)
 * 
 * Space Complexit: O(1)
 * 
 */
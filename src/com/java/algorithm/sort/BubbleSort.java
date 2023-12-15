package com.java.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

  static int[] bubbleSort(int arr[]){
    int len =arr.length;
    for (int i = 0; i < len - 1; i++) {
      for (int j = 0; j < len - i - 1; j++) {
        if(arr[j] > arr[j + 1]){
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          
        }
      }
      System.out.println(arr[i]);
    }
    return arr;
  }

  static int[] bubbleSortOptimized(int arr[]){
    int len =arr.length;
    for (int i = 0; i < len - 1; i++) {
      boolean swap = false;
      for (int j = 0; j < len - i - 1; j++) {
        if(arr[j] > arr[j + 1]){
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swap = true;
        }
      }
      
      if (swap) {
        break;
      }
      System.out.println(arr[i]);
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = {1,3,5,13,15,18};
    System.out.println(Arrays.toString(bubbleSortOptimized(arr)));
  }
}



/*
 * 
 * for i <- 0 to indexofLastUnsortedElement - 1      * Each & Every Element set Minimum value check for all values
 *  for j <- 0 to indexofLastUnsortedElement - i - 1
 *    if leftElement > rightElememt
 *      swap leftElement and rightElememt
 * end
 * 
 * 
 * Time Complexity 
 * Base Case : O(n)
 * Worst Case : O(n^2)
 * Average Case : O(n^2)
 * 
 * Space Complexit: O(1)
 * 
 */
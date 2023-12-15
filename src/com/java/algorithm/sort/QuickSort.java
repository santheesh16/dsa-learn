package com.java.algorithm.sort;

import java.util.Arrays;

public class QuickSort {

  public static int[] quickSort(int[] arr, int low, int high) {

    if (low < high) {
      int piv = partition(arr, low, high);
      quickSort(arr, low, piv - 1);
      quickSort(arr, piv + 1, high);
    }

    return arr;
  }

  static int partition(int[] arr, int low, int high) {
    int piv = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] < piv) {
        i++;
        int temp = arr[j];
        arr[i] = arr[j];
        arr[j] = temp;
      }

    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 1, 3, 13, 18, 15, 21, 19, 2 };
    System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
  }

}
/*
 *
quickSort(array, leftmostIndex, rightmostIndex)
  if (leftmostIndex < rightmostIndex)
    pivotIndex <- partition(array,leftmostIndex, rightmostIndex)
    quickSort(array, leftmostIndex, pivotIndex - 1)
    quickSort(array, pivotIndex, rightmostIndex)

partition(array, leftmostIndex, rightmostIndex)
  set rightmostIndex as pivotIndex
  storeIndex <- leftmostIndex - 1
  for i <- leftmostIndex + 1 to rightmostIndex
  if element[i] < pivotElement
    swap element[i] and element[storeIndex]
    storeIndex++
  swap pivotElement and element[storeIndex+1]
return storeIndex + 1
 * 
 * Time Complexity
 * Base Case : O(n^2)
 * Worst Case : O(n*logn)
 * Average Case : O(n*logn)
 * 
 * Space Complexit: O(log n)
 */
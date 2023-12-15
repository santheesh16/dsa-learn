package com.java.algorithm.sort;

import java.util.Arrays;

public class MergeSort {

  static int[] mergeSort(int[] arr, int l, int r) {

    if (l < r) {
      int mid = (l + r) / 2;

      mergeSort(arr, l, mid);
      mergeSort(arr, mid + 1, r);
      merge(arr, l, mid, r);
    }

    return arr;

  }

  public static void merge(int[] arr, int l, int mid, int r) {
    int n1 = mid - l + 1;
    int n2 = r - mid;

    int[] lArr = new int[n1];
    int[] rArr = new int[n2];

    for (int x = 0; x < n1; x++) {
      lArr[x] = arr[l + x];
    }
    for (int x = 0; x < n2; x++) {
      rArr[x] = arr[mid + 1 + x];
    }

    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
      if (lArr[i] <= rArr[j]) {
        arr[k] = lArr[i];
        i++;

      } else {
        arr[k] = rArr[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = lArr[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = rArr[j];
      j++;
      k++;
    }

  }

  public static void main(String[] args) {
    int arr[] = { 5, 1, 3, 13, 18, 15, 21, 19, 2 };
    System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
  }

}

/*
 * Time Complexity 
 * Base Case : O(nlogn)
 * Worst Case : O(nlogn)
 * Average Case : O(nlogn)
 * 
 * Space Complexit: O(n)
 * 
 */
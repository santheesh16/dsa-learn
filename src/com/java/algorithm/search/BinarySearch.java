package com.java.algorithm.search;

public class BinarySearch {

  public static int binarySearchIerative(int arr[], int x) {
    int low = 0, high = arr.length - 1;
    int mid = low + (high - low) / 2;
    while (low <= high) {
      if (x == arr[mid]) {
        return mid;
      } 
      if (x > arr[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return mid;
  }

  public static int binarySearchRecursive(int arr[], int x, int low, int high) {
    if (low <= high) {
      int mid = (low + (high - low) ) / 2;
      if (x == arr[mid]) {
        return mid;
      }else if ((arr[mid] > x)) {
        return binarySearchRecursive(arr, x, low, mid - 1);
      } 
      return binarySearchRecursive(arr, x, mid - 1, high);
    }
    return -1;
  }

  public static void main(String[] args) {

    int arr[] = {3, 5,8, 12,14,18,21};
    System.out.println("Ierative :"+ binarySearchIerative(arr, 12));
    System.out.println("Ierative :" + binarySearchRecursive(arr, 12, 0 , arr.length - 1));
  }

}

/*
 * Iterative Method
 * 
 * while(low <= high)
 * mid = (low+high)/2;
 * if(x == arr[mid])
 *  return mid
 * else if(x > arr[mid])
 *  low = mid+1
 * else
 *  high = mid-1
 * 
 * Recursive Method
 * binarySearch(arr, x , low, high)
 * if(low > high)
 * mid = (low+high)/2
 * if(x== arr[mid])
 * return mid
 * else if((x > arr[mid])
 * binarySearch(arr, x, mid+1,high )
 * else
 * binarySearch(arr, x, low,mid-1 )
 * else
 * return -1
 * 
 * 
 * Time Complexity: 
 * Best Case : O(1)
 * Worst Case: O(log n)
 * Average Case : O(log n)
 * 
 * 
 * Space Complexity: O(1)
 */
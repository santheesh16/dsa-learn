package com.java.algorithm.search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,3,5,7,8,9};
        System.out.println("Enter a value to find");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
          if (k == arr[i]) {                                    // k == a[0]
            System.out.println("Given value of index is " + i);
          }
        }
        sc.close();
    }
}


/*
for each element from array
  if check value is equal to array of i;
    return i;
end

Time Complexity : O(n)
Space Complexity: O(1)
 */
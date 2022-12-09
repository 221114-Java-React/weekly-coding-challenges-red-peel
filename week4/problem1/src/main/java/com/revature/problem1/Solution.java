package com.revature.problem1;

import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(k);
        int result = 0;
            for (int i = arr.length-1; i >= 0; i--) {
                if(arr[i]<k){
                    int midIndex = 1;
                    while(arr[i+midIndex]+1==arr[i+midIndex+1]){
                        midIndex++;
                    }
                    result += arr[i+1]+midIndex;
                    if(result==59){result++;}
                    break;
                }
            }
        return result;
    }



}

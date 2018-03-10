package com.test;
/***
Array:  1 2 3 4 5
k: 1
Output: 2 3 4 5 1
k: 2
Output: 3 4 5 1 2
k: 3
Output: 4 5 1 2 3
**/
import java.util.*;
public class LeftCircularArrayRotation {
    public static void main(String args[]) {
        int[] arr=new int[]{1,2,3,4,5};
        int k=2;
        reverseArray(arr,0,k);
        reverseArray(arr,k+1,arr.length-1);
        reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArray(int[] arr,int s,int k){
        while(s<k){
            int temp=arr[s];
            arr[s]=arr[k];
            arr[k]=temp;
            s++;
            k--;
        }
    }
}

package com.test;

/**
Identify the next greater element 
  ref:
  https://www.ideserve.co.in/learn/next-great-element-in-an-array
  
  Note:
  
  For all the popped value if the upcoming value is greater ,then that is the next greater element for the popped the value

*/
import java.util.*;
public class NextGreaterElementInAnArray {
    public static void main(String args[]) {
      int[] input = { 98, 23, 54, 12, 20, 7, 27 };
      Stack<Integer> stackval=new Stack<>();
      stackval.push(input[0]);
      for(int i=1;i<input.length;i++){
          while(!stackval.empty() && stackval.peek()<input[i]){
              System.out.println("Next Greater Element for "+ stackval.pop()+" is "+input[i]);
             
          }
           stackval.push(input[i]);
      }
    while(!stackval.empty()){
              System.out.println("Next Greater Element for "+ stackval.pop()+" is "+null);
             
    }
      
    }
}

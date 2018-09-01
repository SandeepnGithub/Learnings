/******
https://www.youtube.com/watch?v=86CQq3pKSUw&t=326s
2
3
1 2 3
4
-1 -2 -3 -4

Output:
_____________________________________
6
-1

********/
import java.util.*;
import java.lang.*;
import java.io.*;

public class KadanesAlgorithm {
	public static void main (String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   int q=scanner.nextInt();
	   for(int q_i=0;q_i<q;q_i++){
	       int size=scanner.nextInt();
	       int[] arr=new int[size];
	       for(int arr_i=0;arr_i<size;arr_i++){
	           arr[arr_i]=scanner.nextInt();
	       }
	       int sum=arr[0],max_value=arr[0];
	       for(int i=1;i<size;i++){
	           max_value=Math.max(arr[i],max_value+arr[i]);
	           sum=Math.max(sum,max_value);
	       }
	       System.out.println(sum);
	   }
	}
}

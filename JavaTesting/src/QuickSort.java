/******

QuickSort:
_____________________________

In Quicksort we have to first indentify the pivot element and the sort the array such a way that left side should have elements less than the pivot and 

rightside should have greater than pivot.

Note:
After the left should always have lesser partition and right should have greater partition


*******/
public class QuickSort {
    public static void main(String args[]) {
        int[] arr=new int[]{23,4,5,2,3,1,9,10,11,20};
        quicksort(arr,0,arr.length-1);
        for(int a:arr){
            System.out.println(a);
        }
    }
    public static void quicksort(int[] arr,int left,int right){
     //   System.out.println(arr+"--"+left+"---"+right);
        if(left>=right){
            return;
        }
        int pivot=(left+right)/2;
        int partition=sorting(arr,left,right,pivot);
        quicksort(arr,left,partition-1);
        quicksort(arr,partition,right);
    }
    public static int sorting(int[] arr,int left,int right,int pivot){
        while(left<=right){
            while(arr[left]<arr[pivot]){
                left++;
            }
            while(arr[right]>arr[pivot]){
                right--;
            }
            if(left<=right){
                swap(arr,left,right);
            }
            left++;
            right--;
        }
        return left;
    }
    public static void swap(int[] arr,int left,int right){
        int temp=arr[right];
        arr[right]=arr[left];
        arr[left]=temp;
    }
}

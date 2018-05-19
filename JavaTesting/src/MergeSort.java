/*****

MergeSort:
____________________________

Merge we have to split array until it comes to single and two values and we have to srot and merge.

https://www.youtube.com/watch?v=TzeBrDU-JaY


********/

public class MergeSort {
    public static void main(String args[]) {
        int[] arr=new int[]{23,4,5,2,3,1,9,10,11,20};
        mergesort(arr,0,arr.length-1);
        for(int a:arr){
            System.out.println(a);
        }
    }
    public static void mergesort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int middle=(low+high)/2;
        mergesort(arr,low,middle);
        mergesort(arr,middle+1,high);
        mergehalfes(arr,low,high,middle);
    }
    
    public static void mergehalfes(int[] arr,int low,int high,int middle){
        int[] temp=new int[arr.length];
        for(int x=low;x<=high;x++){
            temp[x]=arr[x];
        }
        int i=low;
        int j=middle+1;
        int k=low;
        while(i<=middle && j<=high){
            if(temp[i]<temp[j]){
                arr[k]=temp[i];
                i++;
            }else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            arr[k]=temp[i];
            k++;
            i++;
        }
         while(j<=high){
            arr[k]=temp[j];
            k++;
            j++;
        }
    }
}

public class MaximumSumofKElements {
    public static void main(String args[]) {
        int[] arr={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        int maxValue=0,current_value=0;
        for(int i=0;i<k;i++){
            current_value=current_value+arr[i];
            maxValue=current_value;
        }
        for(int i=k;i<arr.length;i++){
            current_value=current_value+arr[i]-arr[i-k];
            maxValue=Math.max(maxValue,current_value);
        }
        System.out.println(maxValue);
    }
}

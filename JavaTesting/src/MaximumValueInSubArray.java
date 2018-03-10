import java.util.*;
public class MaximumValueInSubArray {
    public static void main(String args[]) {
        int[] array=new int[]{9,6,11,8,10,5,14,13,93,14};
        int k=3;
        LinkedList<Integer> list = new LinkedList();
         
        for (int i = 0; i < k; i++)
        {
            // remove all useless elements present at the front of the list
            while (!list.isEmpty() && array[list.getLast()] < array[i])
            {
                list.removeLast();
            }
             
            // add index of current element at the back
            list.addLast(i);
        }
        System.out.println(list);
        for(int i=k;i<array.length;i++){
            System.out.println(array[list.getFirst()]);
            while(!list.isEmpty()&&list.getFirst()<(i-k+1)){
                list.removeFirst();
            }
            while(!list.isEmpty()&&array[list.getLast()]<array[i]){
                list.removeLast();
            }
            list.add(i);
            
        }
        System.out.println(array[list.getFirst()]);
    }
}

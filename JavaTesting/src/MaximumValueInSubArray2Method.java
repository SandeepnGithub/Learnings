import java.util.*;
/*******
Output:
________________________________________

11
11
11
14
14
93
93



*************/
public class MaximumValueInSubArray2Method {
    public static void main(String args[]) {
      int[] array = {9,6,11,8,10,5,14,13,93,14};
      int k = 4;
      LinkedList<Integer> list=new LinkedList<>();
      int temp=0;
      for(int i=0;i<k;i++){
          if(temp<array[i]){
              temp=array[i];
          }
      }
      list.add(temp);
      System.out.println(list);
      for(int i=k;i<array.length;i++){
          System.out.println(list.getFirst());
        if(list.getFirst()<array[i]){
            list.removeFirst();
            list.add(array[i]);
        }
      }
       System.out.println(list.getFirst());
    }
}

import java.util.*;
public class LeaderInAnArray {
    public static void main(String args[]) {
     int[] array={ 98, 23, 54, 12, 20, 7, 27 };
     List<Integer> list=new ArrayList<>();
     int currentLeader=array[array.length-1];
     list.add(currentLeader);
     for(int i=array.length-2;i>=0;i--){
         if(currentLeader<array[i]){
             currentLeader=array[i];
             list.add(currentLeader);
         }
     }
     System.out.println(list);
    }
}

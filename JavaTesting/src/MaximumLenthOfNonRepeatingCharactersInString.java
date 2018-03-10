import java.util.*;
public class MaximumLenthOfNonRepeatingCharactersInString {
    public static void main(String args[]) {
      String str="ABCDABDEFGCABD";
      Set<Character> set=new HashSet<>();
      int maxLength=0,i=0,j=0;
      while(j<str.length()){
          if(!set.contains(str.charAt(j))){
              set.add(str.charAt(j));
              j++;
              maxLength=Math.max(maxLength,j-i);
          }else{
              set.remove(str.charAt(i));
              i++;
          }
      }
      System.out.println(maxLength);
    }
}

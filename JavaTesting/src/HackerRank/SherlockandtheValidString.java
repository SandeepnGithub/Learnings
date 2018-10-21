/*




https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem







*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockandtheValidString {

    // Complete the isValid function below.
    static String isValid(String s) {
      if(s.length()<=2){
          return "YES";
      }
       Map<Character,Integer> map=new HashMap<>();
       Map<Integer,Integer> mapCount=new HashMap<>();
        for(Character ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> count:map.entrySet()){
            if(mapCount.containsKey(count.getValue())){
                mapCount.put(count.getValue(),mapCount.get(count.getValue())+1);
            }else{
                mapCount.put(count.getValue(),1);
            }
        }
        System.out.println(mapCount);
        if(mapCount.size()==1){
            return "YES";
        }
        if(mapCount.size()>2){
            return "NO";
        }
        int max=Collections.max(mapCount.keySet());
        int min=Collections.min(mapCount.keySet());
        int total=0;
        if(mapCount.get(max)>mapCount.get(min)){
              total=s.length()-mapCount.get(max)*max;
              if(mapCount.containsKey(total)&&mapCount.get(total)==1)
                  return "YES";
               else
                  return "NO";
        }else if(mapCount.get(max)<mapCount.get(min)){
                  total=s.length()-mapCount.get(min)*min;
                  if(mapCount.containsKey(total)&&mapCount.get(total)==1 && total%2!=0 &&(total-1)==min)
                      return "YES";
                   else
                      return "NO";
        }else{
                  return "NO";
        }        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

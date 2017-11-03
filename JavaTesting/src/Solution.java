import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
     
        for(int a0 = 0; a0 < q; a0++){
           List<Set<Integer>> listofSet=new ArrayList<>();
           long finalcost=0;
            int n = in.nextInt();
            int m = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            if(m!=0){
            Integer[][] cities=new Integer[n+1][n+1];
            for(int a1 = 1; a1 < (m+1); a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                cities[city_1][city_2]=1;
                cities[city_2][city_1]=1;
            }
            
            //Check for Connectivity
             Outer:
            for(int i=1;i<(cities.length);i++){
               Set<Integer> setval=new HashSet<>();
                Inner:
                for(int j=1;j<(cities.length);j++){
                    if(cities[i][j] !=null && cities[i][j]==1){
                                setval.add(i);
                                setval.add(j);                          
                    }
                   }
               // System.out.println("-----"+i+"----"+setval);
                if(setval.size()==0){
                    setval.add(i);
                }
                if(i==1){
                    listofSet.add(setval);
                }else{
                    boolean iscontains=false;
                    int count=0;
                    for(int v:setval)
                    {            
                        int cc=0;
                       for(Set set:listofSet){
                        if(set.contains(v)){
                          iscontains =true;
                           count=cc;
                            break;
                        }
                           cc++;
                      }
                    }
                    if(!iscontains){
                        listofSet.add(setval);
                    }else{
                        listofSet.get(count).addAll(setval);
                    }
                    
                }
            }
            for(Set set:listofSet){
         //  System.out.println("Set====>"+set);
            if(x<y){
                finalcost=n*x;
            }else{
                finalcost=finalcost+x+(set.size()-1)*y;
            }
            }
                 
           }else{
                 finalcost=x*n;
            }
          System.out.println(finalcost);
        }
    }
}
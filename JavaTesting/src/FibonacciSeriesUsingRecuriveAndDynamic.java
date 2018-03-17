/******

Output:
_____________________________________________

0 1 1 2 3 5 8 13 21 34 55 89 144  

Using Dynamic Progrmaing fetching the 9 value of the fibonnacci series 34



****************/
public class FibonacciSeriesUsingRecursiveAndDynamic {
    static int value=0,n1=0,n2=1;
    public static void main(String args[]) {
        int n=5;
        System.out.print(n1+" "+n2+" ");
        recursiveFibonacci(13-2);
        System.out.println(" ");
        System.out.println("Using Dynamic Progrmaing fetching the 9 value of the fibonnacci series "+usingDynamicProgramming(9));
    }
    
    public static void recursiveFibonacci(int n){
        if(n>0){
          value=n1+n2;
          n1=n2;
          n2=value;
          System.out.print(value+" ");
           recursiveFibonacci(--n);
        }
        
    }
    
    public static int usingDynamicProgramming(int n){
        if(n<=1){
            return n;
        }
        return usingDynamicProgramming(n-1)+usingDynamicProgramming(n-2);
    }
}

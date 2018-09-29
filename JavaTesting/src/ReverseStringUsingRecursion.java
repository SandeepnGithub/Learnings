/**
 *Reverse String 
Output:
______________________

CBA

*/
public class  ReverseStringUsingRecursion {
    public static void main(String args[]) {
        ReverseStringUsingRecursion myclass=new ReverseStringUsingRecursion();
         System.out.println(myclass.reverse("ABC".toCharArray(),0,2));
    }
    public String reverse(char[] s,int start,int end){
        if(start==end){
            return String.valueOf(s[start]);
        }
        String a=reverse(s,start+1,end)+String.valueOf(s[start]);
        return a;
    }
    
}

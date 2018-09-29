/**
 *Permutation OF String
https://www.youtube.com/watch?v=KBHFyg2AcZ4

*/
public class  PermutationOFString {
    public static void main(String args[]) {
        PermutationOFString myclass=new PermutationOFString();
         myclass.recurse("MARTY",0,4);
    }
    public void recurse(String s,int r,int l){
        if(r==l){
            System.out.println(s);
        }else{
            for(int i=r;i<=l;i++){
                s=swap(s,r,i);
                recurse(s,r+1,l);
                s=swap(s,r,i);
            }
        }
    }
    
    public String swap(String s,int r, int l){
        char[] a=s.toCharArray();
        char temp=a[l];
        a[l]=a[r];
        a[r]=temp;
        return String.valueOf(a);
    }
}

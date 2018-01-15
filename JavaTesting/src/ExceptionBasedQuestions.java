/**
***For Exception based questions
1.if return is specified in finally, try and catch return values wont get returned
2.also if return is specified in finally we will get an error if return is also specified at method level also
3.if no return is specified in  finally and return specified in  try and catch block corresponding return statements will get executed.
*****************/
public class ExceptionBasedQuestions {
    public static void main(String args[]) {
     String val=  value();
     System.out.println(val);
    }
    
    public static  String  value(){
        try{
            System.out.println("hello.............");
            throw new Exception();
           // return "try";
        }catch(Exception ex){
             System.out.println("hello.......ex......"+ex);
             return "catch";
        }finally{
            return "Hello";
        }
      //  return "";
    }
}

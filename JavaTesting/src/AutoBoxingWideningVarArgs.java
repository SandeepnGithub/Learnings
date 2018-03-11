/*
Autoboxing ,Widening varargs
_____________________________________________________

Widening beats autoboxing
Widening beats varargs
Autoboxing beats varargs

Note :
Varargs is given least priority

1. First Compiler will look for the respective primitive value if not 
2. It will go for widening if not 
3. It will go for autoboxing if not
4. It will go for varargs


Note:
varagrs is given least preferrence
Autoboxing to widening possible but reverse is not possible Case 6 and Case 4 discuss about this scenario case 6 has been commented

*/

public class AutoBoxingWideningVarArgs {
    public static void main(String args[]) {
       System.out.println("---------------Start Of Case 1----------------");
       Case1 case1=new Case1();
       case1.display(10);
       System.out.println("---------------End Of Case 1----------------");
       System.out.println("---------------Start Of Case 2----------------");
	   Case2 case2=new Case2();
       case2.display(10);
       System.out.println("---------------End Of Case 2----------------");
       System.out.println("---------------Start Of Case 3----------------");
	   Case3 case3=new Case3();
       case3.display(10);
       System.out.println("---------------End Of Case 3----------------");
       System.out.println("---------------Start Of Case 4----------------");
	   Case4 case4=new Case4();
       case4.display(10);
       System.out.println("---------------End Of Case 4----------------");
       System.out.println("---------------Start Of Case 5----------------");
	   Case5 case5=new Case5();
       case5.display(10);
       System.out.println("---------------End Of Case 5----------------");
       System.out.println("---------------Start Of Case 6----------------");
	   /*Case6 case6=new Case6();
       case6.display(10);*/
       System.out.println("---------------End Of Case 6----------------");
    }
}

class Case1{
     public void display(int a){
        System.out.println("Case1 :Display Int");
    }
    public void display(Integer a){
        System.out.println("Case1 :Display Integer");
    }
    public void display(long a){
        System.out.println("Case1 :Display long");
    }
     public void display(Object a){
        System.out.println("Case1 :Display Object");
    }
	 public void display(int...a){
        System.out.println("Case1 :Display varargs");
    }
}

class Case2{
    public void display(Integer a){
        System.out.println("Case2 :Display Integer");
    }
    public void display(long a){
        System.out.println("Case2 :Display long");
    }
     public void display(Object a){
        System.out.println("Case2 :Display Object");
    }
	 public void display(int...a){
        System.out.println("Case2 :Display Object");
    }
}

class Case3{
    public void display(Integer a){
        System.out.println("Case3 :Display Integer");
    }
	 public void display(int...a){
        System.out.println("Case3 :Display varargs");
    }
}
class Case4{
	 public void display(Object a){
        System.out.println("Case4 :Display Autoboxing Followed by Widening");
    }
}
class Case5{
	 public void display(int...a){
        System.out.println("Case5 :Display Varargs");
    }
}

/*class Case6{
	 public void display(Long a){
        System.out.println("Case6 :Display Widening followed by Autoboxing");
    }
}*/

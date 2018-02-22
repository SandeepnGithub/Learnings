Serialization Concept:

1.If SuperClass implements Serializable Interface then subclass will be serialized automatically

2.If SuperClass does not implement Serialable Interface but subclass implements serializable interface then superclass
  must have a default constructor and super class instance variable will be given default value

3.If Super class implements Serializable interface then if we dont want subclass to be serailized the we need to implement two methods
   writeObject and readObject
   // By implementing writeObject method, 
   // we can prevent
   // subclass from serialization
   private void writeObject(ObjectOutputStream out) throws IOException
    {
        throw new NotSerializableException();
    }     
    // By implementing readObject method, 
    // we can prevent
    // subclass from de-serialization
    private void readObject(ObjectInputStream in) throws IOException
    {
        throw new NotSerializableException();
    }
https://www.geeksforgeeks.org/object-serialization-inheritance-java/


AutoBoxing and Unboxing :

     AutoBoxing(Integer.valueof() will be used at compile time)for Integer i=10;
int-------------------------->Wrapper

      AutoUnBoxing(Integer.intValue() will be used at compile time)for int i=new Integer(10);
int<---------------------------Wrapper
   
   Scenario NullPointer Exception:
           public class AutoBoxingAndUnboxingNPE {
    static Integer a;
    public static void main(String args[]) {
       int i=a;
       System.out.println(i);
    }
}
Note: 
The reason for this behaviour is for autoboxing and unboxing a buffer of wrapper object will be created in the range -127 to 127 
this concept is not there in float and double 
Integer x=10;      |  Integer x=127;    |  Integer x=128;         |    Integer x=1000;  
Integer y=10;	     |  Integer y=127; 	  |  Integer y=128; 	      |    Integer y=1000;       
Sop(x==y);//true   |  Sop(x==y);//true	|  Sop(x==y);//false	    |    Sop(x==y);//false


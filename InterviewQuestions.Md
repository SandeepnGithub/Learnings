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

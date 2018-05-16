/***
Trie Data Structure is used for sums for finding the prefix of a string

Output:
________________________________________

3
the --- Present in trie
these --- Not present in trie
1
their --- Present in trie
thaw --- Not present in trie




*********************/

public class TrieDataStructure {
    static int alphabet_size=26;
    public static TrieNode root;
    static class TrieNode{
        boolean isEndOfWord;
        public TrieNode[] children=new TrieNode[alphabet_size+1];
        public int count;
        TrieNode(){
            count=0;
            isEndOfWord=false;
            for(int i=1;i<=alphabet_size;i++){
            children[i]=null;
            }
        }
    }
    
    public static void insert(String key){
        int keyLength=key.length();
        TrieNode trie=root;
        for(int i=0;i<keyLength;i++){
            int character=key.charAt(i)-'a';
            if(trie.children[character]==null)
              trie.children[character]=new TrieNode();
          trie.children[character].count++;
          trie=trie.children[character];
        }
        trie.isEndOfWord=true;
    }
    
     public static boolean search(String key){
        int keyLength=key.length();
        TrieNode trie=root;
        for(int i=0;i<keyLength;i++){
            int character=key.charAt(i)-'a';
            if(trie.children[character]==null)
               return false;
          trie=trie.children[character];
        }
        System.out.println(trie.count);
        return true;
    }
    
    
    public static void main(String args[]) {
       String keys[] = {"the", "a", "there", "answer", "any",
                         "by", "bye", "their"};
      
        String output[] = {"Not present in trie", "Present in trie"};
      
      
        root = new TrieNode();
      
        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);
      
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);
         
        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);
         
        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);
         
        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);
        
       
    }
}

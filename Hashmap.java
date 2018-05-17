import java.util.*;

class Hashmap{
  public static void main(String[] args) {

  	  HashMap<Integer,String> hm=new HashMap<>();
  	  System.out.println("hash map");

  	  //adding elements in hash map
       
         hm.put(101,"roshan");
         hm.put(102,"mark");
         hm.put(103,"facebook");
         hm.put(105,"linux");

    HashMap<Integer,String> hm1=new HashMap<>();

 		 hm1.put(106,"roshan");
         hm1.put(103,"mark");
         hm1.put(108,"twitter");
         hm1.put(109,"kali");

//putall()method
         System.out.println("before putall() method");
          System.out.println(hm);
         hm.putAll(hm1);
         System.out.println("after putall() method");
          System.out.println(hm);

   //get value of a key
       System.out.println(hm.get(103));  
     //

   //remove the entry from map

       hm.remove(102);
    System.out.println("after removing 102 key");
        System.out.println(hm);

     //to find that a value or key exist in the map or not
        System.out.println("102 key is present or not:"+hm.containsKey(102));
        System.out.println("(mark) value is present or not:"+hm.containsValue("mark"));

  //size() method return the number of entries in map
        System.out.println("size="+hm.size());

//iterate using Entry object

     for(Map.Entry<Integer,String> entry:hm.entrySet())
     	System.out.println(entry.getKey()+"="+entry.getValue());
 // clear() delete all entries from map
        hm.clear();
    System.out.println("after clear Map="+hm);
  




  }




}
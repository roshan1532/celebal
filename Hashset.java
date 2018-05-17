import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
public class Hashset {
	 public static void main(String[] args) {
		
	
   HashSet<String> Hset=new HashSet<String>();

   Hset.add("Item1");
   Hset.add("Item2");
   Hset.add("Item3");
   Hset.add("Item4");
   Hset.add("Item5");

//print the element of hash set
   System.out.println(Hset);
//searching of an object
   System.out.println("contains  the item2 :"+Hset.contains("Item2"));
   Hset.remove("Item3");
        System.out.println("List after removing Item3:"+Hset);

    //iterate using stream on set
    // 1. get stream and use lambda expression
     System.out.println("iterate using  get stream and lambda expression");    
	Hset.stream().forEach(S -> System.out.println(S));
    System.out.println("iterate using   set to Array()+ Stream.of() methods");
    Stream.of(Hset.toArray()).forEach(System.out::println);
}

}
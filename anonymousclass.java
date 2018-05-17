import java.util.*;

interface Person{
    public void details();	
}


class AnonymosDemo{

	public static void main(String[] args) {
		
	
         Person p=new Person(){
            @Override
            public void details(){
            	System.out.println("name= roshan  ID:2015ucp1532  clg: mnit jaipur");
             }
         };
    p.details();
}

}
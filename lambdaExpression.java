import java.util.*;




class Developer{
	private String name;
	private int age;
	private int salary;

	Developer(String name,int age,int salary){
         this.name=name;
         this.age=age;
         this.salary=salary;


	}
public String getName(){
	return this.name;
}

public int getAge(){
	return this.age;
}
public int getsalary(){
    return this.salary;
}

public String toString(){
   return "Name="+name+" age= "+age+" salary= "+salary;
}

}

public class lambdaExpression{

		public static void main(String[] args) {

		List <Developer> lst=new ArrayList<Developer>();
		lst.add(new Developer("roshan",20,5000));
		lst.add(new Developer("arpit",19,10000));
		lst.add(new Developer("rohit",22,7000));
		lst.add(new Developer("saksham",21,4000));
			

	  System.out.println("Before Sort");
		for (Developer developer : lst) {
			System.out.println(developer);
		}
  
   //sort by age
		Collections.sort(lst,new Comparator<Developer>(){
			public int compare(Developer d1,Developer d2){
				return d1.getAge()-d2.getAge();
			}
		});
    System.out.println("After Sort");
		for (Developer developer : lst) {
			System.out.println(developer);
		}
   System.out.println("sort by name and printthe list using lambda expressions");

   		lst.sort((d1,d2)->d1.getName().compareTo(d2.getName()));
        lst.forEach((developer)->System.out.println(developer));
		

		}








}
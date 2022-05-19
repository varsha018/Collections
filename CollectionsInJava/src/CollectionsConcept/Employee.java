package CollectionsConcept;

public class Employee {

	int age;  //global variable
	String name;
	String dept;
	
	
	//the values/arguments provided in constructor Employee() is not same as defined as global variable
	//you need to assign values by "this" keyword.
	
	Employee(int age,String name , String dept ){   // create a class constructor
		this.age= age;     //global var int age will be passed in this constructor..
		this.name=name;
		this.dept=dept;
		
		
	}
	
	
	
}

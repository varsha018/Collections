package CollectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	//for ARRAY you have to give specific length/size of array..it is static and fixed
	//for ARRAYLIST it is dynamic in nature.. you keep on adding/removing values from arraylist,the array size is adjusted..

	public static void main(String[] args) {

		ArrayList ar =new ArrayList();   //it will take all the datatypes..list of array >>you don't specify any length
		
		
		ar.add("100");
		ar.add("200");
		
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add("1/2/09");
		ar.add('c');
		ar.add(true);
		ar.add(12.99);
		ar.add("12/12/2017");
		ar.add("12/23/40");
		
		System.out.println(ar.size());
		
		for(int i=0 ; i<ar.size(); i++) {
			
			System.out.println(ar.get(i));
			
		}
		
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(); // if you want to restrict your array to specific datatype..parameterize it..
		
		a1.add(100);		//WILL ADD ONLY INTEGER VALUE
//		a1.add("queen");  // cannot add string
		
		a1.add(900);
		
		System.out.println(a1.size());
		
		System.out.println("********************");
		ArrayList<String> s1 = new ArrayList<String>(); // if you want to restrict your array to specific datatype..parameterize it..
		
		s1.add("varsha");
		s1.add("ayushi");
		s1.add("shivam");
		
		ArrayList<String> s2 = new ArrayList<String>(); 
		
		s2.add("anoop");
		s2.add("aparana");
		s2.add("priya");
		s2.add("amit");
		s2.add("varsha");
		s2.add("monika");
		
		
		//	s1.addAll(s2);  ////merge array s2 with s1 BEFORE FOR LOOP ,NOT INSIDE
		//  s1.removeAll(s2);	//remove all s2 array ist objects
			s1.retainAll(s2); //retain common of s1 and s2
		
			for(int i=0 ; i<s1.size(); i++) {
			
	//		System.out.println(s1.get(i)); 			//get all values of arralist s1
			System.out.println(s1.get(i));		//merge array s2 with s1
			
		}
		
		System.out.println("********************");
		
		ArrayList<Boolean> b1 = new ArrayList<Boolean>();
		
		ArrayList<Double> d1 = new ArrayList<Double>();
		
		ArrayList<Long> l1 = new ArrayList<Long>();
		
		ArrayList<Character> c1 = new ArrayList<Character>();
		
		//if you want to pass any class/class constructor/methods as array list..
		//define values as params in that constuctor/method and pass as parameter in array..
		
		//we have created employee class constructor.. and we will store all hat in array list..
		//create different objects..of constructor class..e1,e2,e3,e4..
		
		Employee e1 = new Employee(10 , "tom1" , "qa");
		Employee e2 = new Employee(20 , "tom2" , "qa1");
		Employee e3 = new Employee(30 , "tom3" , "qa2");
		Employee e4 = new Employee(40 , "tom4" , "qa3");
		
		
		
		ArrayList<Employee> q1 = new ArrayList<Employee>(); // pass the employee class  here..it will retrict the array list to as defined in employee class
															//only args defined as in employee class that arraylist will take
		
		
		q1.add(e1);
		q1.add(e2);
		q1.add(e3);
		q1.add(e4);
		
		System.out.println(q1.size());
		
		System.out.println(q1.indexOf(e3));
		
		//iterator..
		//you have already created obj of employee class..
		
		    Iterator<Employee> it = q1.iterator(); //**iterate arraylist q1..and since it is iterator..import iterator and store it in iterator type..
		    
		    while (it.hasNext()) {
		    	Employee emp = it.next();
		    	System.out.println(emp.name);
		    	System.out.println(emp.age);
		    	System.out.println(emp.dept);
		    	
		    }
		    
		    
		    
		

	}

}

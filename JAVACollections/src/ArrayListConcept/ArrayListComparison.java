package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparison {

	public static void main(String[] args) {
	
		
		ArrayList<String> StringArList = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> StringArListQ = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
			
		
		//SORT both the arrays...
		
		Collections.sort(StringArList);
		Collections.sort(StringArListQ);
		
		System.out.println(StringArList.equals(StringArListQ));//if the elements are same in both the arrays but are not sorted..it will return false...
		
		//TO FIND OUT MISSING ELEMENTS...
	//	StringArListQ.removeAll(StringArList);
		
	//	System.out.println("Missing elements===>"+StringArListQ);
		
		//TO FIND OUT COMMON ELEMENTS...
		
		StringArList.retainAll(StringArListQ);
		System.out.println("common elements===> " +StringArList);
		
	}

}

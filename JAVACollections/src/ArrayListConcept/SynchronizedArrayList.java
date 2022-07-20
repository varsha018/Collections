package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
	List<String> SyncArrList =	Collections.synchronizedList(new ArrayList<String>());//to synchronize the arrayList
	
	SyncArrList.add("java");
	SyncArrList.add("python");
	SyncArrList.add("ruby");
	
	
	// To add/remove values from synchronized List we DON'T need to perform EXPLICIT Synchronization
	//to fetch the values from synchronized List we need to perform EXPLICIT Synchronization
	
	synchronized (SyncArrList) {
		
		Iterator<String> it = SyncArrList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	//2>> copyOnWriteArrayList >>it's a class
	
	CopyOnWriteArrayList<String> CopyListArr = new CopyOnWriteArrayList<String>();
	
	CopyListArr.add("var");
	CopyListArr.add("ayu");
	
	
	Iterator<String> it = CopyListArr.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	}

}

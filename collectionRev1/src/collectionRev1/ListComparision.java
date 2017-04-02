package collectionRev1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * compares list implementation performance
 * @author jarvis
 * may change 2
 *
 */
public class ListComparision {

	public static void main(String[] args) {
		
		System.out.println("added greeting new");
		System.out.println("phone:98765435362");

		List<Integer> list = new ArrayList<>();
		long t1 = System.currentTimeMillis();
	    for(int i=0;i<100000;i++){
	    	list.add(i);
	    }
	    System.out.println("time taken to populate arraylist:"+ (System.currentTimeMillis()-t1) + " size: "+ list.size());
	    
	    List<Integer> linkedlist = new LinkedList<>();
	    for(int i=0;i<100000;i++){
	    	linkedlist.add(i);
	    }
	    long t2 = System.currentTimeMillis();
	    System.out.println("time taken to populate linkedlist:"+ (System.currentTimeMillis()-t2) + " size: "+ linkedlist.size());
	    
	    long t3 = System.currentTimeMillis();
	    Integer integer = list.get(99999);
	    System.out.println("time taken to fetch data from arraylist :" + (System.currentTimeMillis()-t3));
	    
	    long t4 = System.currentTimeMillis();
	    Integer integer2 = linkedlist.get(99999);
	    System.out.println("time taken to fetch data from linkedlist :" + (System.currentTimeMillis()-t4));
	    
	    long t5 = System.currentTimeMillis();
	    list.add(50000, 4);
	    System.out.println("time taken to insert data from arraylist :" + (System.currentTimeMillis()-t5));
	    
	    long t6 = System.currentTimeMillis();
	    linkedlist.add(50000, 4);
	    System.out.println("time taken to insert data from linkedlist :" + (System.currentTimeMillis()-t6));
	    
	    long t7 = System.currentTimeMillis();
	    list.remove(50000);
	    System.out.println("time taken to remove data from arraylist :" + (System.currentTimeMillis()-t7));
	    
	    long t8 = System.currentTimeMillis();
	    linkedlist.remove(50000);
	    System.out.println("time taken to remove data from linkedlist :" + (System.currentTimeMillis()-t8));
	    
	    int binarySearch = Collections.binarySearch(list, 59999);
	    System.out.println(binarySearch);
	    
	    // added comment for branch2.
	    
	}

}

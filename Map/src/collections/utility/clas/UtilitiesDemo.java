package collections.utility.clas;

import java.util.*;

public class UtilitiesDemo {
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList();
	l.add(22);
	l.add(42);
	l.add(36);
	l.add(12);
	l.add(14);
	
	System.out.println("before sorting:-"+l);//sort()//collections.sort() Natural sorting
	Collections.sort(l);
	System.out.println("after sorting:-"+l);
	
	
//		System.out.println("before sorting"+l);//collections.sort() Customised Sorting
//		Collections.sort(l,new Comp());
//		System.out.println("after sorting"+l);
//		
		
		//System.out.println(Collections.binarySearch(l,18));//binarySearch()
		
	//	System.out.println(Collections.binarySearch(l,36,new Comp()));//binarySearch Comparator();
		
		
	
//		Collections.reverse(l);//reverse();
//		System.out.println(l);
	
	
	//System.out.println(Collections.frequency(l,22));//frequency()
	
	
	//System.out.println(Collections.synchronizedList(l));//collection.SynchronizedList()////Map///Set
	
	
//	List<Integer>c=Collections.unmodifiableList(l);//unmodifiable set,list,map
//	System.out.println(Collections.unmodifiableCollection(l));
//		c.add(90);
//	c.set(42,90);
//		System.out.println(c);
//		
		
//		List al=Collections.singletonList(l);//SingletonList()//map,Set
//		System.out.println(al);
//		al.add(10);
//		System.out.println(al);
//		
		
		Collections.swap(l,2,3);//swap()
		System.out.println(l);
		
		Collections.shuffle(l);//shuffle()
		System.out.println(l);
		
		System.out.println(Collections.max(l));//max()//for Max and min we can pass Comparator as well
		System.out.println(Collections.min(l));//min()
		
		ArrayList<Integer> l1=new ArrayList();//disjoint()
		l1.add(22);
		l1.add(45);
		System.out.println(Collections.disjoint(l,l1));
		
		
		
}


}


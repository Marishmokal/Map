package MapSorting;//Sorting by key without comparator

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortByKey {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put(105,"vaibhav");
	hm.put(72,"mukund");
	hm.put(185,"pranav");
	hm.put(4,"prathmesh");
	
	Set<Entry<Integer,String>>s=hm.entrySet();
	Iterator<Entry<Integer,String>>itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}

package MapSorting;//sorting of keys and values by comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SortingByValues {
public static void main(String[] args) {
	HashMap h=new HashMap();
	h.put("ram",117);
	h.put("sham",172);
	h.put("vicky",25);
	h.put("rahul",99);
	
	Set<Entry<String,Integer>>s=h.entrySet();
	ArrayList<Entry<String,Integer>>al=new ArrayList(s);
	Collections.sort(al,new SortedByKey());
	for(Entry<String,Integer>e:al)
	{
		System.out.println(e);
	}
	
}
}

package sortedmap.methods;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class SortedMap {
	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap();
		t.put("rudra",132);
		t.put("dhruva",171);
		t.put("varad",98);
		t.put("samya",23);
		System.out.println(t);
		
		System.out.println("head key of the map"+t.headMap("samya"));//headMap()
		System.out.println("tail key of the map"+t.tailMap("rudra"));//tailMap()
		System.out.println("submap"+t.subMap("rudra","varad"));//subMap()
		
		System.out.println(t.firstKey());//firstKey()
		System.out.println(t.lastKey());//lastKey()
		
		Set s1=t.keySet();//keySet()
		System.out.println(s1);
		
		Collection c1=t.values();//values()
		System.out.println(c1);
		
		Set s2=t.entrySet();//entrySet()
		System.out.println(s2);
		
		
		Comparator j=t.comparator();//comparator()
		System.out.println(j);
		
		
		
	}
}

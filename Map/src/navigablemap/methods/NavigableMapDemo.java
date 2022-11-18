package navigablemap.methods;

import java.util.Set;
import java.util.TreeMap;

public class NavigableMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> t1 = new TreeMap();
		t1.put(19, "AAA");
		t1.put(5, "JJJ");
		t1.put(48, "FFF");
		t1.put(33, "DDD");
		System.out.println(t1);

//		System.out.println(t1.lowerEntry(33));// lowerEntry()
//		System.out.println(t1.lowerKey(33));// lowkey()
//		System.out.println(t1.floorEntry(19));// floorEntry();
//		System.out.println(t1.floorKey(33));// floorKey()
//		System.out.println(t1.ceilingEntry(33));// ceilingEntry()
//		System.out.println(t1.ceilingKey(33));// ceilingKey()
//		System.out.println(t1.higherEntry(33));// higherEntry()
//		System.out.println(t1.higherKey(33));// higherKey()
//		System.out.println(t1.firstEntry());// firstENtry()
//		System.out.println(t1.lastEntry());// lastEntry()
//		System.out.println(t1.pollFirstEntry());// pollFirstEntry()
//		System.out.println(t1.pollLastEntry());// pollLastEntry()
//		
		
		System.out.println(t1.descendingMap());//descendingMap()
		System.out.println(t1.navigableKeySet());//navigableKeySet()
		System.out.println(t1.descendingKeySet());//descendingKeySet()
		System.out.println(t1.tailMap(33));//tailMap()
		System.out.println(t1.headMap(33));//headMap()
		System.out.println(t1.subMap(5,33));//subMap()

		System.out.println(t1.subMap(5,true,33,true));//subMAp()
		System.out.println(t1.headMap(19,true));//headMap()
		System.out.println(t1.tailMap(19,true));//tailMap()

	}
}

package WeekHashMap.demo;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
public static void main(String[] args) {
	Student65 s1=new Student65(101,"Sam");
	WeakHashMap<Student65,Integer> h=new WeakHashMap<>();
	h.put(s1,102);
	s1=null;
	System.gc();
	System.out.println(h);
	
	
}
}

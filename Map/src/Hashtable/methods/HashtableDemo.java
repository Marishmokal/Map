package Hashtable.methods;//hashtable methods

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashtableDemo {
public static void main(String[] args) {
	Hashtable<String,Integer> h=new Hashtable();
	h.put("ram",105);
	h.put("sham",115);
	h.put("raghu",172);
	h.put("bharat",223);
	System.out.println(h);
	
	
	System.out.println(h.size());//size
	
	System.out.println(h.isEmpty());//isEmpty
	
	Enumeration er=h.keys();//keys()
	while(er.hasMoreElements())
	{
		System.out.println(er.nextElement());
	}
	
	Enumeration er1=h.elements();//elements();
	while(er1.hasMoreElements())
	{
		System.out.println(er1.nextElement());
	}
	
	System.out.println(h.clone());//clone()
}
}

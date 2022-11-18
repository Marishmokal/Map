package IdentityHashMap;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
public static void main(String[] args) {
	Student65 s=new Student65(101,"AAA");
	Student65 s1=new Student65(102,"BBB");
	Student65 s2=new Student65(103,"FFF");
	Student65 s3=new Student65(108,"WWW");
	Student65 s4=s1;
	
	System.out.println(s==s1);
	System.out.println(s1==s2);
	System.out.println(s4==s1);
	
	
	
	IdentityHashMap<Student65,Integer> h=new IdentityHashMap();
	h.put(s,10);
	h.put(s3,20);
	h.put(s2,30);
	h.put(s1,40);
	System.out.println(h);
}
}

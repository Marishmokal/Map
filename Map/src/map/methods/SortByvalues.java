package map.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SortByvalues {
public static void main(String[] args) {
	HashMap<String,Integer> h1=new HashMap();
	h1.put("bharat",1012);
	h1.put("pakistan",948);
	h1.put("afganistan",472);
	h1.put("england",22);
	System.out.println(h1);
	
	Set<Entry<String,Integer>>s1=h1.entrySet();
	ArrayList<Entry<String,Integer>>a1=new ArrayList(s1);
	
	Collections.sort(a1,new SortByComp());
	for(Entry<String,Integer>a2:a1)
	{
		System.out.println(a2);
	}

	
}
}

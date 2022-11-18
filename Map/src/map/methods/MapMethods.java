package map.methods;//methods of map

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class MapMethods {
public static void main(String[] args) {
	HashMap m=new HashMap();
	m.put("marish",104);
	m.put("pranav",108);
	m.put("vaibhav",117);
	m.put("mukund",123);
	System.out.println(m);
	System.out.println(m.put("vaibhav",112));//put()
	System.out.println(m);
//	
	
	HashMap hm=new HashMap();
	hm.put("rushikesh",109);
	hm.put("shree",119);
	
	m.putAll(hm);//putAll()
	System.out.println(m);
//	
//	
	System.out.println(m.size());//size()
//	
	System.out.println(m.isEmpty());//isEmpty()
//	
//	
	//m.clear();
	//System.out.println(m);//clear()
//	
	System.out.println(m.containsKey("rushikesh"));//containsKey()
//	
//	
	System.out.println(m.containsValue(119));//containsValue()
//	
//	
	System.out.println(m.equals(hm));//equals()
//	
//	System.out.println(m.hashCode());//hashcode()l\]
//	
//	
//	System.out.println(m.remove("vaibhav"));//remove()
//	System.out.println(m);
//	
	System.out.println(m.get("rushikesh"));//get()
//	
	/////use to implement cursors of collection on map
//	Set s=m.keySet();
//	System.out.println(s);//keySet()
//	
//	Collection s1=m.values();//values()
//	System.out.println(s1);
//	
//	Set s2=m.entrySet();//entrySet()
//	System.out.println(s2);
//	
//	
	
	
	
	//METHODS OF ENTRY INTERFACE
	Map<String,Integer>map=new HashMap();//getKey() & getValue
    map.put("Vaibahv",12);
    map.put("Mukund",17);
    map.put("Pranav",28);
    
    Iterator<Entry<String,Integer>>itr=map.entrySet().iterator();
    while(itr.hasNext()){
        Map.Entry<String,Integer>entry=itr.next();
        System.out.println("key  "  +entry.getKey()+" value  "  +entry.getValue());
       
    
    
    
//    Entry<String,Integer>entry=itr.next();//setValue
//    entry.setValue(19);
//        System.out.println(map);
 

        
      
    }
    } 
}


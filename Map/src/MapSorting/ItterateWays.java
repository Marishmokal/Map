package MapSorting;//iterate by entrySet,keys,values

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ItterateWays {
public static void main(String[] args) {
	HashMap g=new HashMap();
	g.put("queen",172);
	g.put("king",225);
	g.put("piun",388);
	
	//Set<Entry<String,Integer>>f=g.entrySet();//entrySet
//	Iterator<Entry<String,Integer>>itr=f.iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	
//	
//Set<Entry<String,Integer>>f=g.keySet();//KeySet
//Iterator<Entry<String,Integer>>itr=f.iterator();
//while(itr.hasNext())
//{
//	System.out.println(itr.next());
//}
	
	Collection<Integer>s=g.values();//value()
	Iterator<Integer>itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}

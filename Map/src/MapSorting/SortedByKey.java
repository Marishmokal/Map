package MapSorting;

import java.util.Comparator;
import java.util.Map.Entry;

public class SortedByKey implements Comparator<Entry<String,Integer> >{

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getKey().compareTo(o2.getKey());
	}

}

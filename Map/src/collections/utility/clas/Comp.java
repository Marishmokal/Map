package collections.utility.clas;
import java.util.*;

public class Comp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return -(o1.compareTo(o2));
	}

	


	
	

}

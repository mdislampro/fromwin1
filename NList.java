package lastJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NList {

	public static void main(String[] args) {


		List<Integer>li = new ArrayList<>();
		li.add(5);
		li.add(2);
		li.add(5);
		li.add(1);
		li.add(3);
		li.add(5);
		li.add(7);
		li.add(2);
		li.add(7);
		li.add(9);
		li.add(4);

		System.out.println(li);
		
		Set<Integer>s=new HashSet<>();
		
		for(int i=0;i<li.size();i++) {
			s.add(li.get(i));
		}
	}

}

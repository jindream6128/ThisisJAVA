package chap15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			
			if(element.equals("JSP")){
				iterator.remove();
			}
		}
		System.out.println();
		
		set.remove("JDBC");
		
		for(String ele : set) {
//			if(ele.equals("Java")) {
//				set.remove(ele);
//			}
			System.out.println(ele);
		}
	}

}

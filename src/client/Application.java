package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
	//in Generics certain letters are used HashMap<k = key, V = value>, in Arrays<E = element>, <T = types>, best practice is to use single capital letters
	public static void main(String[] args) {
		Container<Integer, String, Boolean> container = new Container<>(12, "Hello", true);
		
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		boolean val3 = container.getItem3();
		
		Container<Double, Integer, Float> container2 = new Container<>(12.9, 23, 78f);
		
		Set<String> myset1 = new HashSet<String>();
		myset1.add("First");
		myset1.add("Second");
		myset1.add("Whatever");
		
		Set<String> myset2 = new HashSet<String>();
		myset2.add("First");
		myset2.add("First");
		myset2.add("Computer");
		
		Set<String> resultSet = union(myset1, myset2);
		
		Iterator<String> itr = resultSet.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static Set union1(Set set1, Set set2) {// not a generic method it is raw type and can cause issues
		Set result = new HashSet(set1);
		result.addAll(set2);
		return result;
	}
	
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {// generic method first <E> specifies the data type of E
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}
}

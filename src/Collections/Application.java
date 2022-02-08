package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {	
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		
		list1.addAll(newList);
		
		System.out.println(list1);
		
		list1.removeAll(newList);//use clear() to remove all data
		list1.contains(167);//checks to see if data is available or not as a boolean
		list1.isEmpty(); //checks to see if list is empty boolean return value
		list1.retainAll(newList); //only retains values that are in the newlist
		
		System.out.println(list1);
		
		List<Integer> li = new ArrayList<Integer>(list1); //to convert hashset to a list
		
		//Sorting a hashset
		
		HashSet<Integer> list4 = new HashSet<Integer>();
		list4.add(12);
		list4.add(43);
		list4.add(15);
		list4.add(67);
		list4.add(43);
		
		ArrayList<Integer> myList = new ArrayList<Integer>(list4);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
		HashSet<Employee> hashSet = new HashSet<Employee>();
		
		hashSet.add(new Employee("Mike", 3500, "Accounting"));
		hashSet.add(new Employee("Paul", 3000, "Admin"));
		hashSet.add(new Employee("Peter", 4000, "IT"));
		hashSet.add(new Employee("Angel", 2000, "Maint"));
		
		ArrayList<Employee> myList1 = new ArrayList<Employee>(hashSet);
		
		Collections.sort(myList1);
		
		System.out.println( "\n" + myList1 );
	}

}

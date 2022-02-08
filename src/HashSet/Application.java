package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		HashSet<Integer> values = new HashSet<Integer>();
		
		values.add(1);
		values.add(23);
		values.add(13);
		values.add(1);
		
		for(Integer value : values) {
			System.out.println(value);
		}
		
		LinkedHashSet<String> valuesToMaintainOrder = new LinkedHashSet<String>();//maintains insertion order and no duplicates
		valuesToMaintainOrder.add("Random");
		valuesToMaintainOrder.add("Name");
		valuesToMaintainOrder.add("Type");
		valuesToMaintainOrder.add("Random");
		
		for(String value : valuesToMaintainOrder) {
			System.out.println(value);
		}
		
		HashSet<Animal> animals = new HashSet<Animal>();//uses hashcode method to ensure uniquness; must override hasCode in class for hasSet to work on classes or user defined objects
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 8);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangaroo", 5);
		
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		System.out.println(animal1.equals(animal4));
		
		for(Animal value : animals) {
			System.out.println(value);
		}
	}

}

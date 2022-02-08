package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("cat");
		animals.add("DOg");
		animals.add("Bird");
		
		for(int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		for(String value : animals) {
			System.out.println(value);
		}
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>()
;
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 12000, false);
		
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep", "Grand Cherokee", 20000, true));
		
		for(Vehicle automobile : vehicles) {
//			System.out.println(automobile.getMake());
//			System.out.println(automobile.getModel());
//			System.out.println(automobile.getPrice());
//			System.out.println(automobile.isFourWheelDrive());
			System.out.println(automobile);
		}
		
		printElements(vehicles);
		printElements(animals);
	}
	
	public static void printElements(List someList){
		for(int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}

}

package client;

public class Container<i1, i2, i3> {//<> makes a class generic, broke best practice in the Generics definitions, should be single capital letters
//	String item1;
//	String item2;
	
	i1 item1;
	i2 item2;
	i3 item3;
	
	
	public void printItems()
	{
		System.out.println("Printing Contents of container: ");
		System.out.println("Item 1: " + item1);
		System.out.println("Item 2: " + item2);
		System.out.println("Item 3: " + item3);
		
	}


	public Container(i1 item1, i2 item2, i3 item3) {
		super();
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}


	public i1 getItem1() {
		return item1;
	}


	public void setItem1(i1 item1) {
		this.item1 = item1;
	}


	public i2 getItem2() {
		return item2;
	}


	public void setItem2(i2 item2) {
		this.item2 = item2;
	}


	public i3 getItem3() {
		return item3;
	}


	public void setItem3(i3 item3) {
		this.item3 = item3;
	}
}

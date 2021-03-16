package assignment.java.view;

import assignment.java.model.Item;

public class DisplayItem {

	public static void displayResult(Item i)
	{
		String str = String.format("%-14s%-15.3f%-18.3f%-25.3f", i.getName(),i.getPrice(),i.getStl(),i.getFppi());
		System.out.println(str);
	}

	public static void displayResultFormat() {
		System.out.println("\n\n\nOutput:");
		String str = String.format("%-14s%-15s%-18s%-25s", "Name","Price","tax liability","Final Price per Item");
		System.out.println(str);
	}
}

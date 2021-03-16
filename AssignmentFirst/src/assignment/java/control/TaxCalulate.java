package assignment.java.control;

import java.util.ArrayList;

import assignment.java.input.UserInputAccept;
import assignment.java.model.Item;
import assignment.java.view.DisplayItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TaxCalulate {

	public static void main(String[] args) throws IOException {
		ArrayList<Item> list = new ArrayList<Item>();
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)) ;
		char ch ;
		Item i ;
		
		do
		{
			i = UserInputAccept.enterInput() ;
			i.calc_stl();
			
			
			
			list.add(i);
			System.out.print("Do you want to enter another item details(Enter y/n) : ");
			ch = obj.readLine().charAt(0) ;
		}while((ch=='y')||(ch=='Y'));
		
		DisplayItem.displayResultFormat();
		for (Item item : list) {
			DisplayItem.displayResult(item);
		}
		
	}
	
}
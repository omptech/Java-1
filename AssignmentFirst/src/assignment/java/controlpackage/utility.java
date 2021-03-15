package assignment.java.controlpackage;

import java.util.ArrayList;

import assignment.java.inputpackage.UserInputAccept;
import assignment.java.modelpackage.Item;
import assignment.java.viewpackage.Result;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class utility {

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
		
		Result.displayResultFormat();
		for (Item item : list) {
			Result.displayResult(item);
		}
		
	}
	
}
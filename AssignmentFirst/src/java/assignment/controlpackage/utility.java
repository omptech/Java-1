package java.assignment.controlpackage;

import java.util.ArrayList;
import java.assignment.inputpackage.UserInputAccept;
import java.assignment.modelpackage.Item;
import java.assignment.viewpackage.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class utility {

	public static void main(String[] args) throws IOException {
		ArrayList<Item> list = new ArrayList<Item>();
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)) ;
		char ch ;
		Item i ;
		Double effectivePriceOfAllItems= 0.0 ;
		Double totalPrice ;
		do
		{
			i = UserInputAccept.enterInput() ;
			i.calc_stl() ;
			totalPrice = i.getQty()*i.getFppi() ;
			i.setTotal_Price(totalPrice);
			effectivePriceOfAllItems+=i.getTotal_Price() ;
			list.add(i);
			System.out.print("Do you want to enter another item details(Enter y/n) : ");
			ch = obj.readLine().charAt(0) ;
		}while((ch=='y')||(ch=='Y'));
		
		Result.displayResultFormat();
		for (Item item : list) {
			Result.displayResult(item);
		}
		String str = String.format("\n%88.3f",effectivePriceOfAllItems );
		System.out.println(str);
	}
	
}

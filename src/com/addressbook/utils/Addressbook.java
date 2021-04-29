package com.addressbook.utils;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		
			int option;
			Hashtable<String, List<Person>> addressBooks = new Hashtable<String, List<Person>>(); 
			do {
			System.out.println(" Enter A to Add AddressBook\n Enter B to Edit AddressBook\n  Enter E to Exit\n");
			option=s.nextInt();
			switch(option) {
			   case 1:
			 		 AddressBookOperations.addAddressBook(addressBooks);
			    	 break;
			   case 2:
			    	 AddressBookOperations.editAddressBook(addressBooks); 
			         break;
			   case 3:
				     System.exit(0);
				     break;
		    }
			}
		    while(option != 0); 	    
	}
		     
}	

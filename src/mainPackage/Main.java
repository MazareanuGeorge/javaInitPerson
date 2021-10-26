package mainPackage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import personPackage.Person;

public class Main {
	public static void clearScreen() {   
	    System.out.print("\033[H\033[2J");   
	    System.out.flush();   
	   } 
	public static void main(String[] args) throws Exception {
		int optionNumber;
		Person personRead;
		ArrayList<Person> personArrayList = new ArrayList();
		Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Enter name");
			System.out.println("2.Print name");
			System.out.println("3.Print all names");
			System.out.println("4.Exit");
			while(true) {
				System.out.print("Enter option:");
	            try {
		            	optionNumber = scn.nextInt();
		            	break;
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid option");
	                scn.nextLine();
	            }
	        }
			switch(optionNumber) {
			case 1:
			{
				personRead = new Person();
				personArrayList.add(personRead);
				break;
			}
			case 2: {
				if(!personArrayList.isEmpty())
				System.out.println(personArrayList.get(personArrayList.size()-1).toString());
				break;
			}
			case 3:{
				if(!personArrayList.isEmpty())
				for(Person person : personArrayList) {
					System.out.println(person.toString());
				}
				break;
			}
			case 4:{
				System.exit(0);
			}
			default:{
				System.out.println("Invalid option");
				break;
			}
			}
	}
	}
}


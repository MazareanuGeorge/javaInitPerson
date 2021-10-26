package personPackage;

import java.util.Scanner;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Person() throws Exception {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Enter First Name :");
            try {
            	this.firstName = scan.nextLine();
            	if(this.firstName.isBlank() || this.firstName.isEmpty())
            		throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Invalid first name");
            }
        }
		this.firstName = Character.toUpperCase(this.firstName.charAt(0)) + this.firstName.substring(1);
		while(true) {
			System.out.print("Enter Last Name :");
            try {
            	this.lastName = scan.nextLine();
            	if(this.lastName.isBlank() || this.lastName.isEmpty())
            		throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Invalid last name");
            }
        }
		this.lastName = Character.toUpperCase(this.lastName.charAt(0)) + this.lastName.substring(1);
		System.out.print("Enter Middle Name :");
		this.middleName = scan.nextLine();
		if(!middleName.isBlank())
		this.middleName = Character.toUpperCase(this.middleName.charAt(0)) + this.middleName.substring(1);
	}
	
	@Override
	public String toString() {
		return "Your name is " + firstName+ " " + middleName  +" "+ lastName + "!";
	}
	
}

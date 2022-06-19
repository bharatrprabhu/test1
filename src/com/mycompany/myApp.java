/**
 * 
 */
package com.mycompany;

import java.util.Scanner;

import com.mycompany.employeeinfo.Employee;
import com.mycompany.services.CredentialService;

/**
 * @author bharat_2
 *
 */
public class myApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      System.out.println("Please enter the Department from the following");
	        System.out.println("1. Technical");
	        System.out.println("2. Admin");
	        System.out.println("3. Human Resource");
	        System.out.println("4. Legal");
	        Scanner myInput = new Scanner(System.in);
	        int a = myInput.nextInt();
	        while (a < 1 || a > 4) {
	            System.out.println("Please select departments from above list Number 1..4");
	            a = myInput.nextInt();
	        }

	        System.out.println("Ënter First Name");
	        String fname = myInput.next();
	        System.out.println("Enter Last Name");
	        String lname = myInput.next();
	        Employee newEmp = new Employee(fname, lname);

	        CredentialService cServices = new CredentialService();
	        cServices.generateEmailAddress(newEmp, a);
	        cServices.generatePassword(newEmp);

	        cServices.showCredentials(newEmp);
	}

}

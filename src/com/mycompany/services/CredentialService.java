/**
 * 
 */
package com.mycompany.services;

import java.util.Random;

import com.mycompany.employeeinfo.Employee;

/**
 * @author bharat_2
 *
 */
public class CredentialService {

	 static Random r = new Random();
	    static char[] choicesLower = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
	    static char[] choicesUpper = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
	    static char[] choicesNum = ("0123456789").toCharArray();
	    static char[] choicesSpec = ("$#_@").toCharArray();

	    public String generatePassword(Employee employee) {
	        String pwd= generatePassword();
	        employee.setPassword(pwd);
	        return pwd;
	    }
	    public String generatePassword() {
	        int len = 8;
	        StringBuilder password = new StringBuilder(len);
	        password.append(choicesNum[r.nextInt(choicesNum.length)]);
	        password.append(choicesNum[r.nextInt(choicesNum.length)]);
	        password.append(choicesNum[r.nextInt(choicesNum.length)]);
	        password.append(choicesUpper[r.nextInt(choicesUpper.length)]);
	        password.append(choicesSpec[r.nextInt(choicesSpec.length)]);
	        password.append(choicesLower[r.nextInt(choicesLower.length)]);
	        password.append(choicesUpper[r.nextInt(choicesUpper.length)]);
	        password.append(choicesUpper[r.nextInt(choicesUpper.length)]);
	        return password.toString();
	    }

	    public String generateEmailAddress(Employee employee, int dept) {
	        boolean deptOK = true;
	        String emailAddress = "Can not generate Email Address";
	        switch (dept) {
	            case 1:// Technical Department
	                emailAddress = "tech.mycomp.com";
	                break;
	            case 2://Admin Department
	                emailAddress = "admin.mycomp.com";
	                break;
	            case 3:// Human Resource
	                emailAddress = "hr.mycomp.com";
	                break;
	            case 4://Legal Department
	                emailAddress = "legal.mycomp.com";
	                break;
	            default:
	                deptOK = false; //unknown department
	        }
	        if (deptOK) {
	            if (employee != null) {
	                employee.setEmailAddress(emailAddress);
	                emailAddress = employee.getEmailAddress();
	            }
	        }
	        return emailAddress;
	    }
	    
	    public void showCredentials(Employee employee){
	        System.out.println(" ");
	        System.out.println("********************************************************************************");
	        System.out.println("Dear " + employee.getFirstName() + "  your generated credentials are as follows ");
	        System.out.println("Email    --------> " + employee.getEmailAddress());
	        System.out.println("Password --------> " + employee.getPassword());
	        System.out.println("********************************************************************************");
	    }
}

package com.mycompany.employeeinfo;

public class Employee {
	   private String firstName = "";
	    private String lastName = "";
	    private String emailAddress = "";
	    private String password = "";

	    public Employee(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getEmailAddress() {
	        return emailAddress;
	    }

	    public void setEmailAddress(String domain) {
	        this.emailAddress = firstName + lastName + "@" + domain;
	    }
}

/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Shrute", 4416.66);
		dwight.employeeToString();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		
		Employee vot = new Employee(1444, "Vot", "Ishapen", 3555.55);
		vot.employeeToString();
		
	michael.raiseSalary(20);
	dwight.raiseSalary(40);
	jim.raiseSalary(15);
	pam.raiseSalary(33);
	vot.raiseSalary(18);
	
		michael.getAnnualSalary(6583.33);
		dwight.getAnnualSalary(4416.66);
		jim.getAnnualSalary(4416.66);
		pam.getAnnualSalary(2250);
		vot.getAnnualSalary(3555.55);
	
		michael.employeeToString();
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		vot.employeeToString();
		
	
	}
	
	


	
}

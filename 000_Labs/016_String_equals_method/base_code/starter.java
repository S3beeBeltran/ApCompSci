/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	String Wizard = new String();
	String Warrior = new String();
	String Rogue = new String();


	System.out.println(" What role would you like to take?... ");
	System.out.println(" 1. Wizard ");
	System.out.println(" 2. Warrior ");
	System.out.println(" 3. Rogue ");
	
	int x = sc.nextInt();
	if( x == 1){
	
	System.out.println( "You chose Wizard! ");
	}
	if( x == 2){
		
	System.out.println(" You chose Warrior! ");
	}
	if(x == 3){
		System.out.println(" You chose Rogue! ");
	}
	else{
		System.out.println(" You didnt pick a number, try again.");
	}
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc = new Scanner(System.in);
	int z;
	z = 444;
	System.out.println("Hello, you are trying to guess a random number between 1 - 1000, goodluck!...");
	System.out.println("Enter your guess below...");
	int x = sc.nextInt();
	while(true){
		if(x != z){
		System.out.println("Sorry, wrong number.");
		x = sc.nextInt();
		
		if(x == z){
		System.out.println("Good job!");
		}
		}
	{
	break;
	
	}

	 
			
	}
}
}
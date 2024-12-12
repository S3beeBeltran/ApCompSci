/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number between 1 - 1000: ");
	int x = sc.nextInt();
	
	int y = (int)(Math.random() * 1000);
	if( x == y){
		System.out.println("You guessed correct! Welcome to diddy's party!");
	}
	else{
		System.out.print("You're wrong, you suck.");

}





	}
}

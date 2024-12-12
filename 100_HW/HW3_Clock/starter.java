/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter what day it is, 0 - 6...");
	int x = sc.nextInt();
	if( x == 0){
		System.out.println("It's the weekend! 10am wake up!");
	}
	else if(x == 1){
		System.out.println("It's a weekday! 5am wake up!");
	}
	else if(x == 2){
		System.out.println("It's a weekday! 5am wake up!");
	}
	else if(x == 3){
		System.out.println("It's a weekday! 5am wake up!");
	}
	else if(x == 4){
		System.out.println("It's a weekday! 5am wake up!");
	}
	else if(x == 5){
		System.out.println("It's a weekday! 5am wake up!");
	}
	else if(x == 6){
		System.out.println("It's the weekend! 10am wake up!");
	}
	else{
		System.out.println("Thats not a valid number");
	}
	}
}

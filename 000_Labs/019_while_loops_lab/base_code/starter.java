/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x = 0;
	System.out.println("hello, print your name below...");
	String name = sc.nextLine();
	System.out.println("how many times would you like your name to be printed onto the screen?...");
	int z = sc.nextInt();
	
	while(x < z){
		System.out.println(name);
	
		x = x + 1;
}


		
	}
}

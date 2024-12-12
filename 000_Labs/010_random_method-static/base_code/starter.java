/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int x = (int) (Math.random() * 10);
	int y = (int) (Math.random() * 101);
	Double z = (Math.random() * 3.6);
	Double a = (Math.random() * 590);
	
	System.out.println("x: " + x);
	System.out.println("y: " + y);
	System.out.println("z: " + z);
	System.out.print("a: " + a);
	}
}

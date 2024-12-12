/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Type a whole number: ");
	int y = sc.nextInt();
	System.out.println("Type another whole number: ");
	int g = sc.nextInt();
	System.out.println("Type your final whole number: ");
	int la = sc.nextInt();
	
	if((y > g) && ( g > la)){
	System.out.println( la + " is the smallest integer, " + y + " is the largest.");
	}
	
	
	if((g > y) && (la > g)){
		System.out.println(y + " is the smallest integer, "+ la + " is the largest.");
	}
	
	
	if((g > la) && (la>y)){
		System.out.println(y + " is the smallest integer, " + g + " is the largest.");
	}
	
	
	if((y>la) && (la>g)){
	System.out.println(g + " is the smallest integer, " + y + " is the largest.");
	}
	
	
	if((g>y) && (y>la)){
		System.out.println(la + " is the smallest integer, " + g + " is the largest");
	}
	
	
	if((la>y) && (y>g)){
		System.out.println(g + " is the smallest integer, " + la + " is the largest");
	}
	}
	
}

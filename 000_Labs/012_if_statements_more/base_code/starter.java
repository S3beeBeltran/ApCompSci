/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Type a whole number: ");
	int ghost = sc.nextInt();
	System.out.println("Type another whole number: ");
	int face = sc.nextInt();
	
	if(ghost==face){

	System.out.println("These values are the same! ");
	}
	else	{
	System.out.print("These values are different. ");
	}
	
	
	}
}

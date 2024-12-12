/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	int a;
	a = 1;
	int c;
	c = 2;
	int d;
	d = 3;
	int e;
	e = 4;
	int f;
	f = 5;
	int g;
	g = 100.0;

	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number...");
	int b = sc.nextInt();
	System.out.println("Here are the next five numbers...");
	System.out.println( (b) + ","  + (b + a)  + "," + (b + a + a)  + "," + (b + a + a + a) + "," + (b + a + a + a+ a) );
	System.out.println("Here are the next five multiples of " + (b) + "...");
	System.out.println( (b * a) +"," + (b * c) + "," + (b * d) + "," + (b * e) + "," + (b * f));
	System.out.println( "Here is " + b + " divided by 100...");
	System.out.println( b/g);

	}
}

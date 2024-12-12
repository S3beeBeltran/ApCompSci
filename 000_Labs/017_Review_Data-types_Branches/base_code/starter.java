/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Hello player!, please enter your name to continue...");
	String n = sc.nextLine();

	System.out.println( " Welcome to the game "+ n + " please have fun! ");
	
	System.out.println( " Please select one of the titles to choose from... ");
	System.out.println( "  puff daddy ");
	System.out.println( "  freak ");
	System.out.println( "  fidel castro ");
	String x = sc.nextLine();
	if( x.equals("puff daddy")){
	
	System.out.println( "You chose Puff Daddy! You may now choose P.diddy's character traits. You have a total of 20 points to spend. ");
	}
	else if( x.equals("freak")){
		
	System.out.println(" You chose Freak! You may now choose Freak's character traits. You have a total of 20 points to spend.");
	}
	else if(x.equals("fidel castro")){
		System.out.println(" You chose Fidel Castro! You may now choose Fidel Castro's character traits. You have a total of 20 points to spend.");
	}
	else{	
		System.out.println(" Hey bub, you didn't pick a number... try again and input either 1, 2, or 3.");
	}
	
	
	System.out.println(" - strength - Buff and able to carry larger items - 15p");
	System.out.println(" - dexterity - Agile and moves quick - 15p ");
	System.out.println(" - intelligence - Better at magic spells! - 10p ");
	System.out.println(" - charisma - How personable. - 5p ");
	
	String s = sc.nextLine();
	if( s.equals("strength") ){
		System.out.println("You chose Strength, you are now buff and able to carry larger items.");
		System.out.println("That leaves you with Charisma, you self asorbed butthead. ");
	}
	else if( s.equals("dexterity") ){
		System.out.println("You chose Dexterity, you are now agile and move quick.");
		System.out.println(" That leaves you with Charisma, you self asorbed butthead. ");
	}
	else if( s.equals("intelligence") ){
		System.out.println("You chose Intelligence, you are now better at magic spells!");
		System.out.println(" That leaves you with Charisma, you self asorbed butthead");
	}
	else if( s.equals("charisma") ){
		System.out.println("You chose Charisma, how personable. Just becase you are so amazing and filled with human hope, you get no other traits.");

	}
	else{
		System.out.println("Thats not a valid response.");
	}
	
	System.out.print( n + " ,you are left with 0 points, as " + x + ". " + "You have " + s + " and Charisma.");
	}
}

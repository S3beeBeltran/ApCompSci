/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Spiderman test = new Spiderman();
		test.setActor("Tobey Maguire");
		test.setAge(49);
		test.setVillain("Green Goblin");
		
		Spiderman two = new Spiderman("Andrew Garfield");
		two.setActor("Andrew Garfield");
		two.setAge(41);
		two.setVillain("Electro");
		
		Spiderman three = new Spiderman("Spider-ham");
		three.setActor("John Mulaney");
		three.setAge(42);
		three.setVillain("Ducktor Doom");
		
		System.out.println("The villain is " + three.getVillain());
		
	}
}

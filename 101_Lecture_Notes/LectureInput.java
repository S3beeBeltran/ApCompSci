/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("hello, "+ name +"!");
       
        System.out.println("Please enter a number: ");
        int bob = sc.nextInt();
        sc.nextLine();
        System.out.println("please enter another number:");
        int somethingElse = sc.nextInt();
        sc.nextLine();
        
        System.out.println("The sum of these numbers are: " + (bob + somethingElse));
        
        System.out.println("What's your favorite food?");
        String food = sc.nextLine();
	}
}
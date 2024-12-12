/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("You're a student getting ready for school and have to make a few important choices. How will you start your day?");
        System.out.println("1.You wake up early to get a head start on your day.");
        System.out.println("2.You hit the snooze button a couple of times, so you’re rushing to get ready.");
        System.out.println("3.You spend a few minutes planning your day before getting out of bed.");
        
        int answer1 = sc.nextInt(); // 1, 2, or 3
        
        if(answer1 == 1){
            System.out.println("You double check everything but still end up forgetting to bring your lunch.");
            System.out.println("Next would you :");
            System.out.println("1. Catch a ride with mom");
            System.out.println("2. Take the bus");
            System.out.println("3. Subway Surf");
            int answer2 = sc.nextInt();
            if(answer2 == 1)
            System.out.println("You catch a ride with mom and you're 10 minutes early");
            else if(answer2 == 2)
            System.out.println("You see a couple of your friends and start to talk to them about lil T man.");
            else if(answer2 == 3)
            System.out.println("You get to school early after nearly becoming a big red splat on a tunnel entrance.");
        }
        else if (answer1 == 2){
            System.out.println("You put on your shirt backwards and don't notice.");
            System.out.println("Next would you :");
            System.out.println("1. Catch a ride with mom");
            System.out.println("2. Take the bus");
            System.out.println("3. Subway Surf");
            int answer2 = sc.nextInt();
            if(answer2 == 1)
            System.out.println("You catch a ride with mom and she tries telling you about your shirt but you're too zoned out to notice");
            else if(answer2 == 2)
            System.out.println("You see a couple of your friends and one of them points out your shirt is inside out, you are now EMBARASSED.");
            else if(answer2 == 3)
            System.out.println("You nearly get caught by a fat police officer and his stinky mutt but you escape them and manage to make it to school on time.");
        }
        else if (answer1 == 3){
            System.out.println("You smell like burning dog poop for the rest of the day...");
            System.out.println("Next would you :");
            System.out.println("1. Catch a ride with mom");
            System.out.println("2. Take the bus");
            System.out.println("3. Subway Surf");
            int answer2 = sc.nextInt();
            if(answer2 == 1)
            System.out.println("You catch a ride with mom, she doesnt notice your stench. She's too busy listening to her podcast.");
            else if(answer2 == 2)
            System.out.println("You see a couple of your friends and they bash you for smelling like dog crap...");
            else if(answer2 == 3)
            System.out.println("You fell and sprained your ankle, you make it to school late hobbling on one leg. Everyone pinches their nose when you walk into your first period...");
        }
        else{
            System.out.println("You didnt type a correct answer!");
        }
    }
}
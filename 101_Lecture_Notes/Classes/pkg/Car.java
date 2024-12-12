/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    // Global Variables
    String model;
    double maxSpeed;
    boolean isElectric;
    String color;
    
    
    // Constructors
    public Car(){
        model = "Renault 5 turbo";
        maxSpeed = 155.3;
        isElectric = false;
        color = "red";
}
public Car(String m, double s, String c){
    model = m;
    maxSpeed = s;
    isElectric = false;
    color = c;
}
public void paint(String c){
    color = c;
}

public void vroom(){
    int count = 0;
    while( count < maxSpeed){
        System.out.print(model + " goes VROOOOOOOOOOM. ");
        count = count + 10;
    }
}






}

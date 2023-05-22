import java.util.Scanner;

abstract class Vehicle{
    abstract void move();
}

class Helicopter extends Vehicle{
    void move(){
        System.out.println("Helicopter flies in air.");
    }
}

class Car extends Vehicle{
    void move(){
        System.out.println("Car moves on road.");
    }
}

class Train extends Vehicle{
    void move(){
        System.out.println("Train runs on track");
    }
}

public class _4_VehicleMove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mode of vehicle: ");
        String vehicle = sc.nextLine().toLowerCase();

        switch (vehicle) {
            case "helicopter":
                Helicopter h = new Helicopter();
                h.move();  
            break;
            
            case "car":
                Car c = new Car();
                c.move();  
            break;
            
            case "train":
                Train t = new Train();
                t.move();  
            break;
        
            default:
                System.out.println("Invalid input!");
            break;
        }
    }
}

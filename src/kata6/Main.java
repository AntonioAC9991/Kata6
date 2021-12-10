package kata6;

import java.util.Scanner;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        while(true) {
            System.out.println("Write exit for exit");
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            if(nextLine.equals("exit")||nextLine.equals("Exit")||nextLine.equals("EXIT")) {
                break;
            } else if(nextLine.equals("car")||nextLine.equals("Car")||nextLine.equals("CAR")) {
                toyBusiness.createCar();
            } else if(nextLine.equals("helicopter")||nextLine.equals("Helicopter")||nextLine.equals("HELICOPTER")) {
                toyBusiness.createHelicopter();
            } else {
                System.out.println("COMMAND UNKNOWN");
            }
        }
    }
}

package kata6;

import java.util.Scanner;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
        while(true) {
            System.out.println("Write exit for exit");
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            if(nextLine.equals("exit")||nextLine.equals("Exit")||nextLine.equals("EXIT")) {
                break;
            } else if(nextLine.equals("car")||nextLine.equals("Car")||nextLine.equals("CAR")) {
                Car car1 = new Car(serialNumberGenerator.next());
                car1.pack();
                car1.label();
            } else if(nextLine.equals("helicopter")||nextLine.equals("Helicopter")||nextLine.equals("HELICOPTER")) {
                Helicopter helicopter1 = new Helicopter(serialNumberGenerator.next());
                helicopter1.pack();
                helicopter1.label();
            } else {
                System.out.println("COMMAND UNKNOWN");
            }
        }
    }
}

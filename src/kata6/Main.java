package kata6;

import java.util.Scanner;
import toys.Car;
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
            } 
        }
    }
    
}

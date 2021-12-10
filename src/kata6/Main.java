package kata6;

import java.util.Scanner;
import toyproducts.models.CarToy;
import toyproducts.models.HelicopterToy;
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
            } else if(nextLine.equals("car")) {
                toyBusiness.createToy(nextLine);
            } else if(nextLine.equals("helicopter")) {
                toyBusiness.createToy(nextLine);
            } else {
                System.out.println("COMMAND UNKNOWN");
            }
        }
    }
}

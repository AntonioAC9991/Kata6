package kata6;

import business.ToyBusiness;
import factories.ToyFactory;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ToyFactory toyFactory = new AmericanToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness(toyFactory);
        while(true) {
            System.out.println("Write exit for exit");
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            if(nextLine.equals("exit")||nextLine.equals("Exit")||nextLine.equals("EXIT")) {
                break;
            } else if(nextLine.equals("car")) {
                toyBusiness.produceToy(nextLine);
            } else if(nextLine.equals("helicopter")) {
                toyBusiness.produceToy(nextLine);
            } else {
                System.out.println("COMMAND UNKNOWN");
            }
        }
    }
}

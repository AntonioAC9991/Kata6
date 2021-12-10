package toys;

public class Car {
    private Integer serialNumber;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void pack(){
        System.out.println("Car serial number: " + serialNumber.toString()+" is packed.\n");
    }

    public void label(){
        System.out.println("Car serial number: " + serialNumber.toString()+" is labelled.\n");
    }
}

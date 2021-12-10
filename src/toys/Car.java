package toys;

public class Car {
    private Integer serialNumber;
    private String type;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
        type = "Car";
    }
    public void pack(){
        System.out.println(type + " serial number: " + serialNumber.toString()+" is packed.\n");
    }

    public void label(){
        System.out.println(type + " serial number: " + serialNumber.toString()+" is labelled.\n");
    }
}

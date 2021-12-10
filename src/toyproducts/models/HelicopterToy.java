package toyproducts.models;

import toyproducts.Toy;

public class HelicopterToy implements Toy{
    private Integer serialNumber;
    private String type;

    public HelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        type = "Helicopter";
    }
    public void pack(){
        System.out.println(type + " serial number: " + serialNumber.toString()+" is packed.\n");
    }

    public void label(){
        System.out.println(type + " serial number: " + serialNumber.toString()+" is labelled.\n");
    }
}

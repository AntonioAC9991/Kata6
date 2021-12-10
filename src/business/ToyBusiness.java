package business;

import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public abstract class ToyBusiness {
    public SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
    /**
    public Toy createToy(String type) {
        switch(type){
            case("car"):
                CarToy car = new CarToy(serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
            case("helicopter"):
                HelicopterToy helicopter = new HelicopterToy(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
    }
    * */
    
}

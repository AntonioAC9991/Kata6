package toys;

import toyproducts.Toy;
import toyproducts.models.HelicopterToy;
import toyproducts.models.CarToy;

public class ToyBusiness {
    private SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
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
}

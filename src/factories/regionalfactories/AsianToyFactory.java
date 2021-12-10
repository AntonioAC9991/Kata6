package factories.regionalfactories;

import business.ToyBusiness;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory{

    @Override
    public Toy createToy(String type) {
        switch(type){
            case("car"):
                return new AsianCarToy(serialNumberGenerator.next());
            case("helicopter"):
                return new AsianHelicopterToy(serialNumberGenerator.next());
            default:
                return null;
        }
    }
}

package factories.regionalfactories;

import business.ToyBusiness;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory{

    @Override
    public Toy createToy(String type) {
        switch(type){
            case("car"):
                return new AmericanCarToy(serialNumberGenerator.next());
            case("helicopter"):
                return new AmericanHelicopterToy(serialNumberGenerator.next());
            default:
                return null;
        }
    
    }
    
}

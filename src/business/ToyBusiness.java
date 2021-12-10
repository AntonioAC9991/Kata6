package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class ToyBusiness {
    private ToyFactory toyFactory;

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type){
        return toyFactory.produceToy(type);
    }    
}

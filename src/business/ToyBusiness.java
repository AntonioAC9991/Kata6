package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import toyproducts.Toy;
import java.util.HashMap;
import java.util.Map;

public class ToyBusiness {
    private Map<String,ToyFactory> toyFactories = new HashMap<>();
    private SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();

    public ToyBusiness() {
        this.serialNumberGenerator = new SerialNumberGenerator();
        this.toyFactories = new HashMap();
    }
    public void add (String name, ToyFactory tf){
        toyFactories.put(name, tf);
    }
    
    public Toy produceToy(String name){
        return toyFactories.get(name).produceToy(serialNumberGenerator.next());
    }    
}

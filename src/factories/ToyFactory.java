package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    public SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    public Toy produceToy(String type) {
        Toy toy = createToy(type);
        toy.pack();
        toy.label();
        return toy;
        
    }
    public abstract Toy createToy(String type);
}

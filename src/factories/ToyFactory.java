package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    public Toy produceToy(Integer serialNumber){
        Toy toy = createToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }
    public abstract Toy createToy(Integer type);
}

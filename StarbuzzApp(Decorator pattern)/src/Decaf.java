public class Decaf extends Beverage {
    public Decaf(){
        description = "Decaf";
    }

    @Override
    protected double cost() {
        return 1.99;
    }
}

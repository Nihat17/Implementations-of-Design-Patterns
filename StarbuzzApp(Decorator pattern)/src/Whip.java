public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " Whip";
    }

    @Override
    protected double cost() {
        return beverage.cost() + .69;
    }
}

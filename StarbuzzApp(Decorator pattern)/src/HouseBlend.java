public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }
    @Override
    protected double cost() {
        return 1.89;
    }
}

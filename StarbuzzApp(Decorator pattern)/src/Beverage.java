public abstract class Beverage {
    protected String description = "Unknown description";

    protected String getDescription(){
        return description;
    }
    protected abstract double cost();
}

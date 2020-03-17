public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVegies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}

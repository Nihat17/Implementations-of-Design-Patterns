import com.pizza.Pizza;
import com.pizzastore.ChicagoStylePizzaStore;
import com.pizzastore.NYStylePizzaStore;
import com.pizzastore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args){

        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}

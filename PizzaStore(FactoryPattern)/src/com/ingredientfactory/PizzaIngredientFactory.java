package com.ingredientfactory;

import com.ingredient.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVegies();
    Pepperoni createPepperoni();
    Clams createClam();
}

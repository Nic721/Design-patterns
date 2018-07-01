package method;

import pizza.NYCheesePizza;
import pizza.NYPepperPizza;
import pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if ("cheese".equals(ordertype)) {
			pizza = new NYCheesePizza();
		} else if ("pepper".equals(ordertype)) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}

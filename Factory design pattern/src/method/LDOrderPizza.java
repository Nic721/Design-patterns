package method;

import pizza.LDCheesePizza;
import pizza.LDPepperPizza;
import pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if ("cheese".equals(ordertype)) {
			pizza = new LDCheesePizza();
		} else if ("pepper".equals(ordertype)) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}

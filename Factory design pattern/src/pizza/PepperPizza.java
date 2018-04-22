package pizza;

public class PepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("PepperPizza");
		
		System.out.println(name+" preparing;");
	}

}

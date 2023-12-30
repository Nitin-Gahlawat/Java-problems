//Question
	//WAP to show Example of Singleton Class(Class with one instance only).
//Answer
package classes;
class CoffeeMachine {
	private float sugarQty;
	private float waterQty;
	private float milkQty;
	private float coffeeQty;
	static private CoffeeMachine instance = null;

	private CoffeeMachine() {
		sugarQty = 1;
		waterQty = 1;
		milkQty = 2;
		coffeeQty = 3;
	}

	public void setSugarQty(float sugarQty) {
		this.sugarQty = sugarQty;
	}

	public float getSugarQty() {
		return sugarQty;
	}

	public void setWaterQty(float waterQty) {
		this.waterQty = waterQty;
	}

	public float getWaterQty() {
		return waterQty;
	}

	public float getCoffee() {
		return 1.5f;
	}

	public void setMilkQty(float milkQty) {
		this.milkQty = milkQty;
	}

	public float getMilkQty() {
		return milkQty;
	}

	public void setCoffeeQty(float coffeeQty) {
		this.coffeeQty = coffeeQty;
	}

	public float getCoffeeQty() {
		return coffeeQty;
	}

	static CoffeeMachine getInstance() {
		if (instance == null)
			instance = new CoffeeMachine();
		return instance;
	}
}

public class SingletonClass {
	public static void main(String[] args) {
		CoffeeMachine c1 = CoffeeMachine.getInstance();
		CoffeeMachine c2 = CoffeeMachine.getInstance();
		CoffeeMachine c3 = CoffeeMachine.getInstance();
		System.out.println("c1 " + c1);
		System.out.println("c2 " + c2);
		System.out.println("c2 " + c3);
		if (c1 == c2 && c1 == c3)
			System.out.println("Same instance");
	}
}

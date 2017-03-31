
public class Car {
	public double gas, gasCap;
	public static double GAS_PRICE = (float) 2.01;
	public double totalPrice = 0.00;
	
	public Car(double price){
		GAS_PRICE = price;
	}
	
	public double getGasTank() {
		return gas;
	}
	public void addGas(double gasTank) {
		if(gasTank < this.gasCap){
			this.gas += gasTank;
		}
	}
	public double getGasCap() {
		return gasCap;
	}
	public static float getGasPrice() {
		return GAS_PRICE;
	}
	public float getCost(double gas){
		return (float) (gas * GAS_PRICE);
	}
	private void pump(double gallons){
		
	}
}

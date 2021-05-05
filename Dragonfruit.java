package Fruit;

public class Dragonfruit extends Fruit {
	
	protected double weight;
	protected double price;
	
	    public Dragonfruit (String name, double w, double p) {
	    	
		super(name);
		this.weight = w;
		this.price = p;
		
		if (this.weight < 10) {
			totPrice(); //overloading with no arguments
			System.out.println(name);
			System.out.println("If weight LESS than 10kg, Total price: RM" + totPrice());
		
		}
			else if (this.weight > 10 && this.weight < 20) {
			double pp = 1.99; 
			totalPrice(pp); //overloading with 1 argument
			System.out.println(name);
			System.out.println("If weight MORE than 10kg, Total price: RM" + totalPrice(pp));
		}
		
			else {
			double pp = 0.99;
			double dd = 0.1; 
			totalPrice(dd, pp); //overloading with 2 arguments
			System.out.println(name);
			System.out.println("If weight MORE than 20kg, Total price: RM" + totPrice(dd,pp));
		}
		
		public double totWeight() {
			return this.weight * this.weight;
		}
		
		public double totalPrice(double pr) {
			return pr * this.weight;
		}
		
		public double totalPrice(double qq, double pr) {
			return (pr * this.weight) * qq;
		}
}

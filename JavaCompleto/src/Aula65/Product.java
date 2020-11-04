package Aula65;

public class Product {
	
	protected String name;
	protected double price;
	protected int quantity;
	
	
	public double TotalStock() {
		return quantity * price;
		
	}
	public void AddProduct(int quantity) {
		int x = this.quantity;
		this.quantity = x + quantity;
		
		
		
	}
	public void RemovePrduct(int quantity) {
		this.quantity -= quantity;
		if(this.quantity < 0 ) {
			this.quantity = 0;
		}

	}
	//toSting aula 66	
	public String toString() {
		return name + ", $ " + price + " , " + quantity + " units , " + "Total $ " + TotalStock();
	}
		
}

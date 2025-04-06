package com.product;
/*3.Define a Product class with attributes: productId, productName, price, stock.
   Implement methods for purchaseProduct (reduce stock), addStock, and displayProductDetails.
   Ensure stock does not go negative.
   Create a Main class to demonstrate the working.*/
public class Product {
 
	int productId;
	String productName;
	String ownerName;
	double price;
	int stock;
	
	
	public Product(int productId, String productName,String ownerName, double price,int stock) {
		this.productId = productId;
		this.productName = productName;
		this.price = price ;
		this.stock = stock;
		this.ownerName = ownerName;
		
		// resuse stock
		
		
	}
	 

	public void displayProductDetails(){
		System.out.println("======Product Details=====");
		System.out.println("   ProductId:    "+ productId);
		System.out.println("   OwnerName:    "+ ownerName);
		System.out.println("   ProductName:  "+productName);
		System.out.println("   Price:        "+price);
		System.out.println("   stock:        "+ stock);
		
	}


	public void purchaseProduct(int quantity){
		if(quantity<=0) {
			System.out.println("Quantity must be grater than 0: ");
			
		}
		else if(quantity > stock){
			System.out.println("Not enougth stock avalablie .current stock is "+stock);
		}
		else {
			stock -= quantity;
			System.out.println("unit perchaed susscessfuly: " +  quantity);
		}
		
	}

	public void addStock() {
		
	}
	
}

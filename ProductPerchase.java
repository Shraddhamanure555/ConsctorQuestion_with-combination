package com.product;
/*3. Define a Product class with attributes: productId, productName, price, stock.
   Implement methods for purchaseProduct (reduce stock), addStock, and displayProductDetails.
   Ensure stock does not go negative.
   Create a Main class to demonstrate the working.*/
public class ProductPerchase {
	public static void main(String args[]){
	Product pt = new Product(1110,"Laptops","Govrav Mathre",30.33,500);//value pass
	pt.displayProductDetails();
	pt.purchaseProduct(25);
	pt.addStock();
	Product pt1 = new Product(42545,"IPL Match","Mira patil",10.15,5);
	pt1.displayProductDetails();
	pt1.purchaseProduct(25);
	}

}

//Question
	//WAP to show Example of Classes and Objects in java using product and Customer class.
//Answer
package classes;

class Product {
	int item_number;
	String item_name;
	int cost;

	public Product(int item_number, String item_name, int cost) {
		this.item_number = item_number;
		this.item_name = item_name;
		this.cost = cost;
	}

	public int getItem_number() {
		return item_number;
	}

	public String getItem_name() {
		return item_name;
	}

	public int getCost() {
		return cost;
	}
	public String toString() {
		return "item no: "+item_number+"\nitem-name: "+ item_name +"\ncost: "+cost;
	}
}

class Customer {
	long customer_id =2000;
	String Customer_name;
	int mobile;
    private static int counter=0;
	public Customer(String Customer, int mobile) {
		this.customer_id = customer_id + counter++;
		this.Customer_name = Customer;
		this.mobile = mobile;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public String getCustomer_name() {
		return Customer_name;
	}

	public int getMobile() {
		return mobile;
	}
	public String toString() {
		return "customer id "+ customer_id +"\nCustomer name: "+Customer_name+"\nmobile "+mobile;
	}
}

public class ProductAndCustomer {
	public static void main(String[] args) {
		Product pro=new Product(2000,"Matlab", 1200);
		System.out.println(pro);
		Customer cus=new Customer("John",1456789);
		System.out.println(cus);
		
		Customer cus1=new Customer("Smith",1456789);
		System.out.println(cus1);
	}
}

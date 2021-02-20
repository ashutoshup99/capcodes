package pratice;

public class Order {
	int Quantity;
	String Product;
	int Orderdate;
	String Ordertype;
	public Order() {
		super();
	}
	public Order(int quantity, String product, int orderdate, String ordertype) {
		super();
		Quantity = quantity;
		Product = product;
		Orderdate = orderdate;
		Ordertype = ordertype;
	}
	@Override
	public String toString() {
		return "Order [Quantity=" + Quantity + ", Product=" + Product + ", Orderdate=" + Orderdate + ", Ordertype="
				+ Ordertype + "]";
	}
	
	}

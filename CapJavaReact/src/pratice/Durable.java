package pratice;

public class Durable extends Order {
	String bread;
	String butter;
	String cake;
	String pizza;
	String burger;
	public Durable() {
		super();
	}
	public Durable(int quantity, String product, int orderdate, String ordertype, String bread, String butter,
			String cake, String pizza, String burger) {
		super(quantity, product, orderdate, ordertype);
		this.bread = bread;
		this.butter = butter;
		this.cake = cake;
		this.pizza = pizza;
		this.burger = burger;
	}
	@Override
	public String toString() {
		return "Durable [bread=" + bread + ", butter=" + butter + ", cake=" + cake + ", pizza=" + pizza + ", burger="
				+ burger + ", Quantity=" + Quantity + ", Product=" + Product + ", Orderdate=" + Orderdate
				+ ", Ordertype=" + Ordertype + "]";
	}
	
}

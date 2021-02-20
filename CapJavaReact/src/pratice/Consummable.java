package pratice;

public class Consummable extends Order {
	String toothbrush;
	String bucket;
	String shoes;
	String lunchbox;
	public Consummable(int quantity, String product, int orderdate, String ordertype, String toothbrush, String bucket,
			String shoes, String lunchbox) {
		super(quantity, product, orderdate, ordertype);
		this.toothbrush = toothbrush;
		this.bucket = bucket;
		this.shoes = shoes;
		this.lunchbox = lunchbox;
	}
	public Consummable() {
		super();
	}
	@Override
	public String toString() {
		return "Consummable [toothbrush=" + toothbrush + ", bucket=" + bucket + ", shoes=" + shoes + ", lunchbox="
				+ lunchbox + ", Quantity=" + Quantity + ", Product=" + Product + ", Orderdate=" + Orderdate
				+ ", Ordertype=" + Ordertype + "]";
	}
	
}

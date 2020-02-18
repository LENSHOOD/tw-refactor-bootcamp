package cc.xpbootcamp.warmup.cashier;

public class ItemInfo {
	private String desc;
	private double price;
	private int qty;

	public ItemInfo(String desc, double price, int qty) {
		super();
		this.desc = desc;
		this.price = price;
		this.qty = qty;
	}

	public String getDescription() {
		return desc;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return qty;
	}

    public double totalAmount() {
		return price * qty;
    }
}
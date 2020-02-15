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

	String getDescription() {
		return desc;
	}

	double getPrice() {
		return price;
	}

	int getQuantity() {
		return qty;
	}

    double totalAmount() {
        return price * qty;
    }
}
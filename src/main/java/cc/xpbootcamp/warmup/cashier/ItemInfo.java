package cc.xpbootcamp.warmup.cashier;

import java.math.BigDecimal;

public class ItemInfo {
	private String desc;
	private BigDecimal price;
	private int qty;

	public ItemInfo(String desc, double price, int qty) {
		super();
		this.desc = desc;
		this.price = BigDecimal.valueOf(price);
		this.qty = qty;
	}

	public String getDescription() {
		return desc;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getQuantity() {
		return qty;
	}

    public BigDecimal totalAmount() {
		return price.multiply(BigDecimal.valueOf(qty));
    }
}
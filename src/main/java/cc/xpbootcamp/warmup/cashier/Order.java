package cc.xpbootcamp.warmup.cashier;

import java.util.List;

public class Order {
    public static final double TAX_RAT = 0.1;
    private String customerName;
    private String customerAddress;
    private List<ItemInfo> itemInfoList;

    public Order(String customerName, String customerAddress, List<ItemInfo> itemInfoList) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.itemInfoList = itemInfoList;
    }

    String getCustomerName() {
        return customerName;
    }

    String getCustomerAddress() {
        return customerAddress;
    }

    List<ItemInfo> getItemInfos() {
        return itemInfoList;
    }

    double tax() {
        return baseAmount() * TAX_RAT;
    }

    private double baseAmount() {
        return itemInfoList.stream().map(ItemInfo::totalAmount).reduce(Double::sum).orElse(0.0);
    }

    double totalAmount() {
        return baseAmount() + tax();
    }
}

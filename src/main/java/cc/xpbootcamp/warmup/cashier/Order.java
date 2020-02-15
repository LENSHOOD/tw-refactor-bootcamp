package cc.xpbootcamp.warmup.cashier;

import java.util.List;

public class Order {
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
}

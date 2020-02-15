package cc.xpbootcamp.warmup.cashier;

import java.util.List;
import java.util.function.Function;

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

    double tax() {
        return sumItemInfosBy(ItemInfo::tax);
    }

    double totalAmount() {
        return sumItemInfosBy(ItemInfo::totalAmount);
    }

    private double sumItemInfosBy(Function<ItemInfo, Double> getNumber) {
        return itemInfoList.stream().map(getNumber).reduce(Double::sum).orElse(0.0);
    }
}

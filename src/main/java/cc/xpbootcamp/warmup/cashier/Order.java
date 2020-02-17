package cc.xpbootcamp.warmup.cashier;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.List;

public class Order {
    private static final double TAX_RAT = 0.1;
    private static final double DISCOUNT_RATE = 0.02;
    private String customerName;
    private String customerAddress;
    private List<ItemInfo> itemInfoList;
    private ZonedDateTime createTime;

    public Order(String customerName, String customerAddress, List<ItemInfo> itemInfoList, ZonedDateTime createTime) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.itemInfoList = itemInfoList;
        this.createTime = createTime;
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

    double discount() {
        return eligibleForDiscount() ? twoDigitDoubleMultiple(baseAmount() + tax(), DISCOUNT_RATE) : 0;
    }

    private double twoDigitDoubleMultiple(double d1, double d2) {
        BigDecimal result = BigDecimal.valueOf(d1)
                .multiply(BigDecimal.valueOf(d2))
                .setScale(2, RoundingMode.HALF_UP);

        return result.doubleValue();
    }

    private boolean eligibleForDiscount() {
        return createTime.getDayOfWeek() == DayOfWeek.WEDNESDAY;
    }

    double tax() {
        return baseAmount() * TAX_RAT;
    }

    private double baseAmount() {
        return itemInfoList.stream().map(ItemInfo::totalAmount).reduce(Double::sum).orElse(0.0);
    }

    double totalAmount() {
        return baseAmount() + tax() - discount();
    }
}

package cc.xpbootcamp.warmup.cashier;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.List;

public class Order {
    private static final BigDecimal TAX_RAT = BigDecimal.valueOf(0.1);
    private static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.02);
    private List<ItemInfo> itemInfoList;

    private ZonedDateTime createTime;

    public Order(List<ItemInfo> itemInfoList, ZonedDateTime createTime) {
        this.itemInfoList = itemInfoList;
        this.createTime = createTime;
    }

    List<ItemInfo> getItemInfos() {
        return itemInfoList;
    }

    public ZonedDateTime getCreateTime() {
        return createTime;
    }

    BigDecimal discount() {
        return eligibleForDiscount() ? baseAmount().add(tax()).multiply(DISCOUNT_RATE) : BigDecimal.ZERO;
    }

    private boolean eligibleForDiscount() {
        return createTime.getDayOfWeek() == DayOfWeek.WEDNESDAY;
    }

    BigDecimal tax() {
        return baseAmount().multiply(TAX_RAT);
    }

    private BigDecimal baseAmount() {
        return itemInfoList.stream().map(ItemInfo::totalAmount).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

    BigDecimal totalAmount() {
        return baseAmount().add(tax()).subtract(discount());
    }
}

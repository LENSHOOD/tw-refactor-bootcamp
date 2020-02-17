package cc.xpbootcamp.warmup.cashier;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class OrderTest {

    @Test
    void should_get_1_57_discount_when_price_is_71_5_at_wednesday() {
        ZonedDateTime wednesday = ZonedDateTime.of(
                LocalDateTime.of(2020, 2, 5, 0, 0, 0),
                Clock.systemDefaultZone().getZone());
        List<ItemInfo> itemInfos = Collections.singletonList(new ItemInfo("fake-item", 71.5, 1));
        Order order = new Order(itemInfos, wednesday);

        double discount = order.discount();

        assertThat(discount, is(1.57));
    }

    @Test
    void should_get_0_discount_when_price_is_71_5_at_not_wednesday() {
        ZonedDateTime notWednesday = ZonedDateTime.of(
                LocalDateTime.of(2020, 2, 1, 0, 0, 0),
                Clock.systemDefaultZone().getZone());
        List<ItemInfo> itemInfos = Collections.singletonList(new ItemInfo("fake-item", 71.5, 1));
        Order order = new Order(itemInfos, notWednesday);

        double discount = order.discount();

        assertThat(discount, is(0.0));
    }
}
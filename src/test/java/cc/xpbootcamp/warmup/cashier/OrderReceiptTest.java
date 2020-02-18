package cc.xpbootcamp.warmup.cashier;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;

class OrderReceiptTest {
    @Test
    void shouldPrintItemInfosAndSalesTaxInformationWhenNotWednesday() {
        ZonedDateTime notWednesday = ZonedDateTime.of(
                LocalDateTime.of(2020, 2, 1, 0, 0, 0),
                Clock.systemDefaultZone().getZone());
        List<ItemInfo> itemInfos = new ArrayList<>(Arrays.asList(
                new ItemInfo("牛奶", 10.0, 2),
                new ItemInfo("饼干", 5.0, 5),
                new ItemInfo("巧克力", 20.0, 1)
        ));

        OrderReceipt receipt = new OrderReceipt(new Order(itemInfos, notWednesday));

        String output = receipt.printReceipt();

        assertThat(output, containsString("牛奶, 10.00 x 2, 20.00\n"));
        assertThat(output, containsString("饼干, 5.00 x 5, 25.00\n"));
        assertThat(output, containsString("巧克力, 20.00 x 1, 20.00\n"));
        assertThat(output, containsString("税额: 6.50\n"));
        assertThat(output, not(containsString("折扣: ")));
        assertThat(output, containsString("总价: 71.50\n"));
    }

    @Test
    void shouldPrintItemInfosAndDiscountAndSalesTaxInformationWhenWednesday() {
        ZonedDateTime wednesday = ZonedDateTime.of(
                LocalDateTime.of(2020, 2, 5, 0, 0, 0),
                Clock.systemDefaultZone().getZone());
        List<ItemInfo> itemInfos = new ArrayList<>(Arrays.asList(
                new ItemInfo("牛奶", 10.0, 2),
                new ItemInfo("饼干", 5.0, 5),
                new ItemInfo("巧克力", 20.0, 1)
        ));

        OrderReceipt receipt = new OrderReceipt(new Order(itemInfos, wednesday));

        String output = receipt.printReceipt();

        assertThat(output, containsString("牛奶, 10.00 x 2, 20.00\n"));
        assertThat(output, containsString("饼干, 5.00 x 5, 25.00\n"));
        assertThat(output, containsString("巧克力, 20.00 x 1, 20.00\n"));
        assertThat(output, containsString("税额: 6.50\n"));
        assertThat(output, containsString("折扣: 1.43\n"));
        assertThat(output, containsString("总价: 70.07\n"));
    }
}
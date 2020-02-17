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

class OrderReceiptTest {
    @Test
    void shouldPrintCustomerInformationOnOrder() {
        ZonedDateTime notWednesday = ZonedDateTime.of(
                LocalDateTime.of(2020, 2, 1, 0, 0, 0),
                Clock.systemDefaultZone().getZone());
        Order order = new Order("Mr X", "Chicago, 60601", new ArrayList<ItemInfo>(), notWednesday);
        OrderReceipt receipt = new OrderReceipt(order);

        String output = receipt.printReceipt();


        assertThat(output, containsString("Mr X"));
        assertThat(output, containsString("Chicago, 60601"));
    }

    @Test
    void shouldPrintLineItemAndSalesTaxInformation() {
        ZonedDateTime notWednesday = ZonedDateTime.of(
                LocalDateTime.of(2020, 2, 1, 0, 0, 0),
                Clock.systemDefaultZone().getZone());
        List<ItemInfo> itemInfos = new ArrayList<>(Arrays.asList(
                new ItemInfo("milk", 10.0, 2),
                new ItemInfo("biscuits", 5.0, 5),
                new ItemInfo("chocolate", 20.0, 1)
        ));

        OrderReceipt receipt = new OrderReceipt(new Order(null, null, itemInfos, notWednesday));

        String output = receipt.printReceipt();

        assertThat(output, containsString("milk\t10.0\t2\t20.0\n"));
        assertThat(output, containsString("biscuits\t5.0\t5\t25.0\n"));
        assertThat(output, containsString("chocolate\t20.0\t1\t20.0\n"));
        assertThat(output, containsString("Sales Tax\t6.5"));
        assertThat(output, containsString("Total Amount\t71.5"));
    }

}
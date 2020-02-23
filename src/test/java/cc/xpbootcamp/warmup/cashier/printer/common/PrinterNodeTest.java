package cc.xpbootcamp.warmup.cashier.printer.common;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrinterNodeTest {

    static class TestNode extends PrinterNode {
        @Override
        protected PrintElement doPrint(PrintElement printElement) {
            return printElement.append("test");
        }
    }

    @Test
    void should_output_get_test_string_when_input_set_test() {
        PrinterNode node = new TestNode();

        PrintedMatter printedMatter = node.print(PrintElement.blankPrintElement());

        assertThat(printedMatter.get()).isEqualTo("test");
    }

    @Test
    void should_output_get_two_test_string_when_input_set_test_and_set_to_chain_twice() {
        PrinterNode node = new TestNode();
        node.addNode(new TestNode());

        PrintedMatter printedMatter = node.print(PrintElement.blankPrintElement());

        assertThat(printedMatter.get()).isEqualTo("testtest");
    }

    @Test
    void should_output_get_empty_string_when_input_is_null() {
        PrinterNode node = new TestNode();

        PrintedMatter printedMatter = node.print(null);

        assertThat(printedMatter.get()).isEqualTo("");
    }
}
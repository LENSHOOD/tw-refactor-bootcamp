package cc.xpbootcamp.warmup.cashier.printer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrinterNodeTest {
    @Test
    void should_output_get_test_string_when_input_set_test() {
        PrinterNode node = new PrinterNode() {
            @Override
            protected Input doPrint(Input input) {
                return input.append("test");
            }
        };

        Output output = node.print(new Input());

        assertThat(output.get()).isEqualTo("test");
    }

    @Test
    void should_output_get_two_test_string_when_input_set_test_and_set_to_chain_twice() {
        PrinterNode node = new PrinterNode() {
            @Override
            protected Input doPrint(Input input) {
                return input.append("test");
            }
        };
        node.setNext(new PrinterNode() {
            @Override
            protected Input doPrint(Input input) {
                return input.append("test");
            }
        });

        Output output = node.print(new Input());

        assertThat(output.get()).isEqualTo("testtest");
    }

    @Test
    void should_output_get_empty_string_when_input_is_null() {
        PrinterNode node = new PrinterNode() {
            @Override
            protected Input doPrint(Input input) {
                return input.append("test");
            }
        };

        Output output = node.print(null);

        assertThat(output.get()).isEqualTo("");
    }
}
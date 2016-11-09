package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Maximum Element")
public class MaximumElementTest {

    private MaximumElement cut;

    @BeforeEach
    void init() {
        cut = new MaximumElement();
    }

    @Test
    @DisplayName("can push to the stack")
    void push() {
        List<String> commands = new ArrayList<>();
        commands.add("1 1");
        cut.execute(commands);
        assertEquals(1, cut.stack.size());
    }

    @Test
    @DisplayName("can delete from the stack")
    void pop() {
        List<String> commands = new ArrayList<>();
        commands.add("1 1");
        commands.add("2");
        cut.execute(commands);
        assertEquals(0, cut.stack.size());
    }

    @Test
    @DisplayName("can print out the top of the stack")
    void print() {
        List<String> commands = new ArrayList<>();
        commands.add("1 1");
        commands.add("3");
        List<Integer> max = cut.execute(commands);
        assertEquals(1, max.get(0).intValue());
    }

    @Test
    @DisplayName("can pass solution test")
    void solutionTest() {
        List<String> commands = new ArrayList<>();
        commands.add("1 97");
        commands.add("2");
        commands.add("1 20");
        commands.add("2");
        commands.add("1 26");
        commands.add("1 20");
        commands.add("2");
        commands.add("3");
        commands.add("1 91");
        commands.add("3");
        List<Integer> output = cut.execute(commands);
        assertEquals(26, output.get(0).intValue());
        assertEquals(91, output.get(1).intValue());
    }

}

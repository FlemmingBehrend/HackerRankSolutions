package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.expectThrows;

@DisplayName("Array DS")
public class ArraysDSTest {

    private ArraysDS cut;

    @BeforeEach
    void init() {
        cut = new ArraysDS();
    }

    @Test
    @DisplayName("if given empty array then return empty array")
    void emptyArray() {
        int[] empty = new int[0];
        assertEquals(0, cut.revert(empty).length);
    }

    @Test
    @DisplayName("if given null array throw exception")
    void nullArray() {
        expectThrows(IllegalArgumentException.class, () -> cut.revert(null));
    }

    @Test
    @DisplayName("if given array with a single number return the same array")
    void singleNumber() {
        int[] single = {1};
        assertEquals(1, cut.revert(single)[0]);
    }

    @Test
    @DisplayName("if given an array [1,2] return reverted array [2,1]")
    void twoNumbers() {
        int[] two = {1,2};
        int[] result = cut.revert(two);
        assertEquals(2, result.length);
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    @DisplayName("if given multiple numbers [2,5,4,6,8] return reverted [8,6,4,5,2]")
    void multipleNumbers() {
        int[] multiple = {2,5,4,6,8};
        int[] result = cut.revert(multiple);
        assertEquals(5, result.length);
        assertEquals(8, result[0]);
        assertEquals(6, result[1]);
        assertEquals(4, result[2]);
        assertEquals(5, result[3]);
        assertEquals(2, result[4]);
    }

}

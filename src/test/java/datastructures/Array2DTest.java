package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.expectThrows;

@DisplayName("2D Array DS")
public class Array2DTest {

    private Array2D cut;

    int[][] finalTestInput =
            {{1, 1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 0},
                    {0, 0, 2, 4, 4, 0},
                    {0, 0, 0, 2, 0, 0},
                    {0, 0, 1, 2, 4, 0}};

    @BeforeEach
    void init() {
        cut = new Array2D();
    }

    @Test
    @DisplayName("throws error if called with null")
    void initArray() {
        expectThrows(IllegalArgumentException.class, () -> cut.calculate(null));
    }

    @Test
    @DisplayName("throws an exception if input is 2x3")
    void matrixIs2x3() {
        int[][] input = {{1, 1}, {1, 1}, {1, 1}};
        expectThrows(IllegalArgumentException.class, () -> cut.calculate(input));
    }

    @Test
    @DisplayName("throws an exception if input is 3x2")
    void matrixIs3x2() {
        int[][] input = {{1, 1, 1}, {1, 1, 1}};
        expectThrows(IllegalArgumentException.class, () -> cut.calculate(input));
    }

    @Test
    @DisplayName("return the first hourglass when it is the only one")
    void firstIsReturned() {
        int[][] input =
               {{1, 1, 1},
                {0, 1, 0},
                {1, 1, 1}};
        int result = cut.calculate(input);
        assertEquals(7, result);
    }

    @Test
    @DisplayName("return the biggest hourglass when there is two")
    void twoHourGlass() {
        int[][] input =
                {{1, 1, 1, 1},
                 {0, 0, 1, 1},
                 {1, 1, 1, 1}};
        int result = cut.calculate(input);
        assertEquals(7, result);
    }

    @Test
    @DisplayName("return the biggest hourglass when there are multiple in X direction")
    void multipleX() {
        int[][] input =
                {{1, 1, 1, 1, 2, 2, 2},
                 {0, 0, 1, 1, 3, 3, 3},
                 {1, 1, 1, 1, 4, 4, 4}};
        int result = cut.calculate(input);
        assertEquals(21, result);
    }

    @Test
    @DisplayName("return the biggest hourglass when there are multiple in Y direction")
    void multipleY() {
        int[][] input =
                {{1, 1, 1},
                 {0, 1, 0},
                 {1, 1, 1},
                 {0, 1, 0},
                 {1, 1, 4}};
        int result = cut.calculate(input);
        assertEquals(10, result);
    }

    @Test
    @DisplayName("final test for solution")
    void solutionTest() {
        int result = cut.calculate(finalTestInput);
        assertEquals(19, result);
    }

}

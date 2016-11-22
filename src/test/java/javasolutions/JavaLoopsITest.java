package javasolutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Java Loops 1")
public class JavaLoopsITest {

    private JavaLoopsI cut;

    @BeforeEach
    void init() {
        cut = new JavaLoopsI();
    }

    @Test
    @DisplayName("given 1 return numbers from 1 - 10")
    void multiplyByOne() {
        List<String> result = cut.multiplyBy(1);
        assertEquals(result.size(), 10);
        assertEquals("1 x 1 = 1", result.get(0));
        assertEquals("1 x 10 = 10", result.get(9));
    }

    @Test
    @DisplayName("given 2 return numbers multiplied by 2")
    void multiplyByTwo() {
        List<String> result = cut.multiplyBy(2);
        assertEquals("2 x 1 = 2", result.get(0));
        assertEquals("2 x 10 = 20", result.get(9));
    }

    @Test
    @DisplayName("given 20 return numeers multiplied by 20")
    void multipleByTwenty() {
        List<String> result = cut.multiplyBy(20);
        assertEquals("20 x 1 = 20", result.get(0));
        assertEquals("20 x 10 = 200", result.get(9));
    }

}

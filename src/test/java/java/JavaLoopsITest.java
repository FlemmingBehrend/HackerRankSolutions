package java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.JavaLoopsI;
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
        assertEquals(result.get(0), "1 x 1 = 1");
        assertEquals(result.get(9), "1 x 10 = 10");
    }

    @Test
    @DisplayName("given 2 return numbers multiplied by 2")
    void multiplyByTwo() {
        List<String> result = cut.multiplyBy(2);
        assertEquals(result.get(0), "2 x 1 = 2");
        assertEquals(result.get(9), "2 x 10 = 20");
    }

    @Test
    @DisplayName("given 20 return numeers multiplied by 20")
    void multipleByTwenty() {
        List<String> result = cut.multiplyBy(20);
        assertEquals(result.get(0), "20 x 1 = 20");
        assertEquals(result.get(9), "20 x 10 = 200");
    }

}

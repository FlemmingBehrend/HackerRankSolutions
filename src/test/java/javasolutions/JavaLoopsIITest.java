package javasolutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Java Loops II")
public class JavaLoopsIITest {

    private JavaLoopsII cut;

    @BeforeEach
    void init() {
        cut = new JavaLoopsII();
    }

    @Test
    @DisplayName("0 1 1 should output 1")
    void input011() {
        String result = cut.calculate(0,1,1);
        assertEquals("1", result);
    }

    @Test
    @DisplayName("0 2 1 should output 2")
    void input021() {
        String result = cut.calculate(0,2,1);
        assertEquals("2", result);
    }

    @Test
    @DisplayName("010 should give empty string")
    void noIterationsShouldResultInEmptyString() {
        String result = cut.calculate(0, 1, 0);
        assertEquals("", result);
    }

    @Test
    @DisplayName("511 should output 6")
    void input511() {
        String result = cut.calculate(5, 1, 1);
        assertEquals("6", result);
    }

    @Test
    @DisplayName("012 should output 1 2")
    void input012() {
        String result = cut.calculate(0, 1, 2);
        assertEquals("1 3", result);
    }

    @Test
    @DisplayName("023 should output 2 6 14")
    void input023() {
        String result = cut.calculate(0, 2, 3);
        assertEquals("2 6 14", result);
    }

    @Test
    @DisplayName("535 should output 8 14 26 50 98")
    void input535() {
        String result = cut.calculate(5, 3, 5);
        assertEquals("8 14 26 50 98", result);
    }

}

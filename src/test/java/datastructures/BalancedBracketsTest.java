package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Balanced Brackets")
public class BalancedBracketsTest {

    private BalancedBrackets cut;

    @BeforeEach
    void init() {
        cut = new BalancedBrackets();
    }

    @Test
    @DisplayName("outputs NO if no closing ( bracket")
    void noMatchingBracket1() {
        test("NO", "(");
    }

    @Test
    @DisplayName("outputs NO if no closing { bracket")
    void noMatchingBracket2() {
        test("NO", "{");
    }

    @Test
    @DisplayName("outputs NO if no closing [ bracket")
    void noMatchingBracket3() {
        test("NO", "[");
    }

    @Test
    @DisplayName("outputs YES if matching () brackets")
    void matchingBrackets1() {
        test("YES", "()");
    }

    @Test
    @DisplayName("outputs YES if matching {} brackets")
    void matchingBrackets2() {
        test("YES", "{}");
    }

    @Test
    @DisplayName("outputs YES if matching [] brackets")
    void matchingBrackets3() {
        test("YES", "[]");
    }

    @Test
    @DisplayName("output NO if {[()]")
    void missingBracket() {
        test("NO", "{[()]");
    }

    @Test
    @DisplayName("output NO if not the same order")
    void notSameOrder() {
        test("NO", "{[(])}");
    }

    @Test
    @DisplayName("tests solution")
    void solutionTest() {
        test("YES", "{[()]}");
        test("YES", "{{[[(())]]}}");
        test("NO", "}][}}(}][))]");
        test("YES", "[](){()}");
        test("YES", "({}([][]))[]()");
        test("NO", "{)[](}]}]}))}(())(");
    }

    private void test(String output, String input) {
        assertEquals(output, cut.execute(input));
    }

}

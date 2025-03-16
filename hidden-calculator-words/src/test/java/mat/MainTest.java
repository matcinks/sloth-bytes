package mat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static final String LOL = "LOL";
    private static final String BOSS = "BOSS";
    private static final String SHOE = "SHOE";
    private static final String HELLO = "HELLO";

    @Test
    void should_return_lol_string() {
        // given
        String number = "707";
        // when
        String result = Main.turnCalc(number);
        // then
        assertNotNull(result);
        assertEquals(LOL, result);
    }

    @Test
    void should_return_boss_string() {
        // given
        String number = "5508";
        // when
        String result = Main.turnCalc(number);
        // then
        assertNotNull(result);
        assertEquals(BOSS, result);
    }

    @Test
    void should_return_shoe_string() {
        // given
        String number = "3045";
        // when
        String result = Main.turnCalc(number);
        // then
        assertNotNull(result);
        assertEquals(SHOE, result);
    }

    @Test
    void should_return_hello_string() {
        // given
        String number = "07734";
        // when
        String result = Main.turnCalc(number);
        // then
        assertNotNull(result);
        assertEquals(HELLO, result);
    }

    @Test
    void should_throw_illegal_argument_exception() {
        // given
        String number = "-1";
        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> Main.turnCalc(number));
    }
}

package task2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BracketsTest {

    @Test
    public void testBrackets() {
        String line  = "( ( ( ) ) [ ] { } [ ] ) [ ]";
        assertTrue(Brackets.brackets(line));
    }

    @Test
    public void testBracketsNegative() {
        String line  = "( ( ( ) ) [ ] { } [ ] )  ]";
        assertFalse(Brackets.brackets(line));
    }

    @Test
    public void testOpeningParenthesis() {
        String line  = "{{";
        assertFalse(taskFromCh.Brackets.parentheses(line));
    }
}
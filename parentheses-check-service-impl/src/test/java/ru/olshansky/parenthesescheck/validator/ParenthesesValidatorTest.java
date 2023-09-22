package ru.olshansky.parenthesescheck.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParenthesesValidatorTest {

    private final ParenthesesValidator parenthesesValidator = new ParenthesesValidator();

    @Test
    void checkBracketsHappyPath() {
        assertTrue(parenthesesValidator.isValid("test (a) test."));
        assertTrue(parenthesesValidator.isValid("(test)"));
        assertTrue(parenthesesValidator.isValid("test(test)"));
        assertTrue(parenthesesValidator.isValid("test((test))"));
        assertTrue(parenthesesValidator.isValid("(test)test((test))"));
    }

    @Test
    void checkBracketsOtherWay() {
        assertFalse(parenthesesValidator.isValid("test (x(fd(bv(f((fdg(test))))."));
        assertFalse(parenthesesValidator.isValid("test (test."));
        assertFalse(parenthesesValidator.isValid("test () test."));
        assertFalse(parenthesesValidator.isValid("()"));
        assertFalse(parenthesesValidator.isValid(")"));
        assertFalse(parenthesesValidator.isValid("("));
        assertFalse(parenthesesValidator.isValid("((((((((("));
        assertFalse(parenthesesValidator.isValid("))))))))))"));
        assertFalse(parenthesesValidator.isValid("())"));
        assertFalse(parenthesesValidator.isValid("test )a( test."));
        assertFalse(parenthesesValidator.isValid("test ()a( (test)."));
        assertFalse(parenthesesValidator.isValid("((test)))"));
        assertFalse(parenthesesValidator.isValid("(((test))"));
    }
}
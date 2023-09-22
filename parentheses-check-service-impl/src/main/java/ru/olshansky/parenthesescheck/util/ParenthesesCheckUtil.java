package ru.olshansky.parenthesescheck.util;

import lombok.experimental.UtilityClass;

import java.util.Stack;

/**
 * Утилита проверки скобок в тексте
 * @author olshansky
 * @since 08.09.2023
 */
@UtilityClass
public class ParenthesesCheckUtil {

    private static final char OPEN_BRACKET = '(';
    private static final char CLOSE_BRACKET = ')';
    private static final String PARENTHESES = "()";

    /**
     * Проверяет, корректно ли закрыты открывающие круглые скобки
     * @param input проверяемый текст
     * @return Флаг, определяющий, корректно ли закрыты круглые скобки
     */
    public static boolean isEqualCountAndCorrect(String input) {
        var stack = new Stack<Character>();
        for (var c : input.toCharArray()) {
            if (c == OPEN_BRACKET) {
                stack.push(c);
            } else if (c == CLOSE_BRACKET) {
                if (stack.isEmpty() || stack.pop() != OPEN_BRACKET) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * Проверяет, есть ли в исходном тексте пустые скобки
     * @param input проверяемый текст
     * @return Флаг, определяющий, есть ли в исходном тексте пустые скобки
     */
    public static boolean isNotHasEmptyBrackets(String input) {
        return !input.contains(PARENTHESES);
    }
}

package ru.olshansky.parenthesescheck.api;

import java.util.List;
import java.util.function.Predicate;

/**
 * API проверки корректности заполнения круглых скобок
 * @author olshansky
 * @since 08.09.2023
 */
public interface ParenthesesValidatorApi extends ValidatorApi<String> {

    /**
     * Перечень проверок, которые определяют, корректно ли закрыты открывающие круглые скобки
     */
    List<Predicate<String>> getCheckList();
}

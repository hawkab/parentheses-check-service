package ru.olshansky.parenthesescheck.api;

import java.util.List;
import java.util.function.Predicate;

/**
 * Базовый интерфейс валидатора
 * @author olshansky
 * @since 08.09.2023
 */
public interface ValidatorApi<INPUT_TYPE> {

    /**
     * @return перечень проверок
     */
    List<Predicate<INPUT_TYPE>> getCheckList();

    /**
     * Проверяет, что входные данные соответствуют совокупности проверок целевого валидатора
     * @param inputData входные данные
     * @return флаг, определяющий, что совокупность проверок вернула успех
     */
    default boolean isValid(INPUT_TYPE inputData) {
        return getCheckList().stream()
                .allMatch(validator -> validator.test(inputData));
    }
}

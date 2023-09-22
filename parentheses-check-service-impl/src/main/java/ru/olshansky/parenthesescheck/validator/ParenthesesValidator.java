package ru.olshansky.parenthesescheck.validator;

import org.springframework.stereotype.Service;
import ru.olshansky.parenthesescheck.api.ParenthesesValidatorApi;
import ru.olshansky.parenthesescheck.util.ParenthesesCheckUtil;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Сервис проверки корректности заполнения круглых скобок
 *
 * @author olshansky
 * @since 08.09.2023
 */
@Service
public class ParenthesesValidator implements ParenthesesValidatorApi {

    /**
     * Перечень проверок, которые определяют корректность заполнения круглых скобок во входных данных
     */
    private static final List<Predicate<String>> CHECK_LIST = Arrays.asList(
            ParenthesesCheckUtil::isEqualCountAndCorrect,
            ParenthesesCheckUtil::isNotHasEmptyBrackets);

    @Override
    public List<Predicate<String>> getCheckList() {
        return CHECK_LIST;
    }
}


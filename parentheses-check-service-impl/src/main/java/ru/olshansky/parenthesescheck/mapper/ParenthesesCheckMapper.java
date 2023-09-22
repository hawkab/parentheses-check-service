package ru.olshansky.parenthesescheck.mapper;

import org.springframework.stereotype.Service;
import ru.olshansky.parenthesescheck.dto.ParenthesesCheckResponseDTO;

/**
 * Преобразователь, который используется для формирования ответа сервиса
 * @author olshansky
 * @since 08.09.2023
 */
@Service
public class ParenthesesCheckMapper {
    public ParenthesesCheckResponseDTO toDTO(boolean isCorrect) {
        return ParenthesesCheckResponseDTO.builder()
                .correct(isCorrect)
                .build();
    }
}

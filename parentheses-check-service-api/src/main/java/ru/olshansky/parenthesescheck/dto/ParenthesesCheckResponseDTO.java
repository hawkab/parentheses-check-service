package ru.olshansky.parenthesescheck.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Формат ответа сервиса на запрос проверки текста на корректность заполнения круглых скобок
 * @author olshansky
 * @since 08.09.2023
 */
@Data
@Builder
@Schema(description = "Формат запроса к сервису проверки текста на корректность заполнения круглых скобок")
public class ParenthesesCheckResponseDTO implements Serializable {

    /**
     * Флаг, определяющий, корректно ли заполнены круглые скобки в тексте запроса
     */
    @JsonProperty("isCorrect")
    @Schema(description = "Флаг, определяющий, корректно ли заполнены круглые скобки в тексте запроса")
    private boolean correct;
}

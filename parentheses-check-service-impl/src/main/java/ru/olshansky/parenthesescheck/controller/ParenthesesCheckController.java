package ru.olshansky.parenthesescheck.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.olshansky.parenthesescheck.dto.ParenthesesCheckRequestDTO;
import ru.olshansky.parenthesescheck.dto.ParenthesesCheckResponseDTO;
import ru.olshansky.parenthesescheck.mapper.ParenthesesCheckMapper;
import ru.olshansky.parenthesescheck.validator.ParenthesesValidator;


/**
 * Контроллер обработки запросов, связанных с проверкой корректности заполнения круглых скобок
 * @author olshansky
 * @since 08.09.2023
 */
@Validated
@RestController
@RequiredArgsConstructor
@Tag(name = "Контроллер обработки запросов, связанных с проверкой корректности заполнения круглых скобок")
public class ParenthesesCheckController {
    private final ParenthesesValidator validator;
    private final ParenthesesCheckMapper mapper;

    @Operation(summary = "Проверить текст на корректность заполнения круглых скобок")
    @PostMapping(value = "/api/checkBrackets")
    public ParenthesesCheckResponseDTO checkBrackets(@RequestBody @Valid @NotNull ParenthesesCheckRequestDTO request) {
        return mapper.toDTO(validator.isValid(request.getText()));
    }
}

package ru.olshansky.parenthesescheck.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.olshansky.parenthesescheck.api.ParenthesesValidatorApi;
import ru.olshansky.parenthesescheck.dto.ParenthesesCheckRequestDTO;
import ru.olshansky.parenthesescheck.dto.ParenthesesCheckResponseDTO;

/**
 * Интеграционный клиент работы с {@link ParenthesesValidatorApi} для подключения в сторонних сервисах
 * @author olshansky
 * @since 08.09.2023
 */
@FeignClient(name = "${clients.parenthesescheckservice.name}", url = "${clients.parenthesescheckservice.url}")
public interface ParenthesesCheckClient {

    /**
     * Проверяет, корректно ли закрыты открывающие круглые скобки
     * @param request проверяемый текст
     * @return Флаг, определяющий, корректно ли закрыты круглые скобки
     */
    @PostMapping(value = "/api/checkBrackets")
    ParenthesesCheckResponseDTO checkBrackets(@RequestBody ParenthesesCheckRequestDTO request);
}

# parentheses-check-service
Сервис осуществляет проверку корректности заполнения круглых скобок

## Системные требования
- OpenJDK 20

Многомодульное приложение, состоит из 2х модулей:
> #### Модуль [parentheses-check-service-api](parentheses-check-service-api/README.md)
> Описывает интерфейс взаимодействия с данным микросервисом, а так же содержит интеграционные
feign-клиенты для возможности подключения в других сервисах

> #### Модуль [parentheses-check-service-impl](parentheses-check-service-impl/README.md)
> Содержит реализацию API из parentheses-check-service-api

* Аналитическая документация: https://beautifulcode.sber.ru/task/java или [TASK.md](TASK.md)
* Подключен swagger-ui: /swagger-ui/index.html ![swagger.png](imgs/swagger.png)
* Подключен health-check: /actuator/health ![healthcheck.png](imgs/healthcheck.png)
* Подключен prometheus: /actuator/prometheus ![prometheus.png](imgs/prometheus.png)
* В /actuator/info добавлена информация о дате, версии и ревизии приложения ![git-info](imgs/git-info.png)

#### Сборка
Из папки parentheses-check-service выполнить команду
- `mvn clean install`
![building.png](imgs/building.png)

#### Запуск
Из папки parentheses-check-service выполнить команду:
- `java -jar parentheses-check-service-impl/target/*.jar`
![img.png](imgs/starting.png)

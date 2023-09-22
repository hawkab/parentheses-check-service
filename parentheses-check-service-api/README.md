# Модуль parentheses-check-service-api
Для использования feign-клиентов подключается как maven-зависимость:
```
    <dependency>
        <groupId>ru.olshansky</groupId>
        <artifactId>parentheses-check-service-api</artifactId>
        <version>1.0.0</version>
    </dependency>
```
При подключении зависимости требуется указание переменных `clients.parenthesescheckservice.url` и 
`clients.parenthesescheckservice.name` в application.yml

Поскольку в данном модуле используется spring-starter, то следует убедиться,
что версии вашего проекта не конфликтуют с версиями данного приложения.

В случае конфликтов потребуется добавить тег `exclusions`, для исключения конфликтующей зависимости:

```
<dependency>
    <groupId>ru.olshansky</groupId>
    <artifactId>parentheses-check-service-api</artifactId>
    <version>1.0.0</version>
    <exclusions>
        <exclusion>
            <groupId>(groupId конфликтующей зависимости)</groupId>
            <artifactId>(artifactId конфликтующей зависимости)</artifactId>
        </exclusion>
    </exclusions>
</dependency>

```
<< [Назад](../README.md)
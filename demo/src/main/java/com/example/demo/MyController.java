package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // Первый эндпоинт: возвращает текст (Ваши ФИО и группу)
    @GetMapping(value = "/", produces = "text/plain;charset=UTF-8")
    public String home() {
        return "Плетнева Надежда Михайловна, группа БАС2402";
    }

    // Второй эндпоинт: возвращает числа (например, текущий год и номер версии)
    @GetMapping("/api/stats")
    public String getStats() {
        return "Year: 2026, Version: 1, Status Code: 200";
    }
}
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // Первый эндпоинт: возвращает текст
    @GetMapping(value = "/", produces = "text/plain;charset=UTF-8")
    public String home() {
        return "Плетнева Надежда Михайловна, группа БАС2402";
    }

    // Второй эндпоинт: возвращает числа
    @GetMapping("/api/stats")
    public String getStats() {
        return "985";
    }
}

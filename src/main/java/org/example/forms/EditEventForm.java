package org.example.forms;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

public record EditEventForm(

        @NotBlank(message = "Название обязательно")
        @Length(min = 3, message = "Длина названия должна быть больше 2 символов")
        String name,

        @Min(value = 30, message = "Длительность должна быть больше 30 минут")
        int duration,

        @NotNull(message = "Стоимость обязательна")
        int cost,

        @NotNull(message = "Дата проведения обязательна")
        @Future(message = "Дата проведения должна быть назначена раньше настоящего времени")
        LocalDateTime date,

        @NotBlank(message = "Категория обязательна")
        String categoryName,

        @NotBlank(message = "Сложность обязательна")
        String difficultyName,

        String imageUrl,

        @NotNull(message = "Гончар обязателен")
        String potterName,

        String description,

        @Min(value = 1, message = "Количество участников обязательно")
        int maxParticipants
) {
}

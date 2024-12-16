package org.example.forms;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

public record AddPotterForm(
        @NotNull(message = "Имя гончара обязательно")
        @Length(min = 3, message = "Имя гончара должно быть больше 3 символов")
        String name,

        @NotNull(message = "Дата трудоустройства обязательна")
        @Past(message = "Дата трудоустройства должна быть настоящего времени")
        LocalDate employmentDate,

        String imageUrl
) {
}

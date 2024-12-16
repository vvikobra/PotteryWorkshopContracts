package org.example.forms;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record EditProfileForm(
        @NotBlank(message = "Имя пользователя обязательно")
        String name,

        @NotBlank(message = "Пароль обязателен")
        @Length(min = 8, message = "Пароль не может быть меньше 8 символов")
        String password,

        @NotBlank(message = "Подтверждение пароля обязательно")
        String confirmPassword
) {
}

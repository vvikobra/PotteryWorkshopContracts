package org.example.forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record SignUpForm(
        @NotEmpty(message = "Имя пользователя обязательно!")
        @Size(min = 5, max = 20, message = "Имя пользователя должно быть от 5 до 20 символов")
        String name,

        @NotEmpty(message = "Почта обязательна!")
        @Email
        String email,

        @NotBlank(message = "Пароль обязателен!")
        @Size(min = 8, max = 20)
        String password,

        @NotBlank(message = "Подтверждение пароля обязательно!")
        @Size(min = 8, max = 20)
        String confirmPassword

) {
}

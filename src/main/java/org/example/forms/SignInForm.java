package org.example.forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record SignInForm(

        @NotEmpty(message = "Почта обязательна!")
        @Email
        String email,

        @NotBlank(message = "Пароль обязателен!")
        @Size(min = 8, max = 20)
        String password
) {
}

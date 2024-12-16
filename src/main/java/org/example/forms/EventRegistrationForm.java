package org.example.forms;

import jakarta.validation.constraints.Min;

public record EventRegistrationForm(
        @Min(value = 1, message = "Необходимо указать количество билетов")
        int ticketQuantity
) {
}

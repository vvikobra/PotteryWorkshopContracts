package org.example.viewmodels.base;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record OrderViewModel(
        UUID id,
        LocalDate orderDate,
        LocalDateTime eventDate,
        int ticketQuantity,
        String eventName,
        int totalCost,
        String statusName
) {
}

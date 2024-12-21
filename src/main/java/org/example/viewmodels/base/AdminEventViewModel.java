package org.example.viewmodels.base;

import java.time.LocalDateTime;
import java.util.UUID;

public record AdminEventViewModel(
        UUID id,
        String name,
        LocalDateTime date,
        int cost,
        String categoryName,
        String difficultyName
) {
}

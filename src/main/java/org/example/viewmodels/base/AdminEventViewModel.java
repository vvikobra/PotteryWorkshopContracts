package org.example.viewmodels.base;

import java.time.LocalDateTime;

public record AdminEventViewModel(
        String id,
        String name,
        LocalDateTime date,
        int cost,
        String categoryName,
        String difficultyName
) {
}

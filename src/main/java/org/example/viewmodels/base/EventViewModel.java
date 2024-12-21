package org.example.viewmodels.base;

import java.time.LocalDateTime;
import java.util.UUID;

public record EventViewModel(
        UUID id,
        String name,
        int duration,
        int cost,
        int discountCost,
        String description,
        LocalDateTime date,
        String imageUrl,
        String categoryName,
        String difficultyName,
        String potterName
) {

}
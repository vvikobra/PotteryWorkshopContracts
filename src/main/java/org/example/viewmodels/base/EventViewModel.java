package org.example.viewmodels.base;

import java.time.LocalDateTime;

public record EventViewModel(
        String id,
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

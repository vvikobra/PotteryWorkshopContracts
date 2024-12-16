package org.example.viewmodels.base;

import java.util.UUID;

public record PotterViewModel(
        UUID id,
        String name,
        int experienceYears,
        int experienceMonths,
        String imageUrl
) {
}

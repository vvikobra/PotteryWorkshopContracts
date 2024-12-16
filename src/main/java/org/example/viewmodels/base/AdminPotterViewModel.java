package org.example.viewmodels.base;

import java.time.LocalDate;
import java.util.UUID;

public record AdminPotterViewModel(
        UUID id,
        String name,
        LocalDate employmentDate,
        boolean isEmployed
) {
}

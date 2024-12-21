package org.example.viewmodels.forms;

import org.example.viewmodels.base.BaseViewModel;

import java.util.UUID;

public record EventEditViewModel(
        BaseViewModel base,
        UUID eventId
) {
}

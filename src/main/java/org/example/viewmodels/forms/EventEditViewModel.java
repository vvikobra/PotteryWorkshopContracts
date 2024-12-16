package org.example.viewmodels.forms;

import org.example.viewmodels.base.BaseViewModel;

public record EventEditViewModel(
        BaseViewModel base,
        String eventId
) {
}

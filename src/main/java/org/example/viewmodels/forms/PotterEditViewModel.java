package org.example.viewmodels.forms;

import org.example.viewmodels.base.BaseViewModel;

import java.util.UUID;

public record PotterEditViewModel(
        BaseViewModel base,
        UUID potterId
) {
}

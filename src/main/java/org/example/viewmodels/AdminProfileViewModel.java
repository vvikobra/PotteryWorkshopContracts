package org.example.viewmodels;

import org.example.viewmodels.base.BaseViewModel;

public record AdminProfileViewModel(
        BaseViewModel base,
        String name,
        String email
) {
}

package org.example.viewmodels;

import org.example.viewmodels.base.BaseViewModel;
import org.example.viewmodels.base.EventViewModel;
import org.example.viewmodels.base.PotterViewModel;

public record EventRegistrationViewModel(
        BaseViewModel base,
        EventViewModel event,
        PotterViewModel potter
) {
}

package org.example.viewmodels;

import org.example.viewmodels.base.BaseViewModel;
import org.example.viewmodels.base.DiscountEventViewModel;
import org.example.viewmodels.base.PotterViewModel;

public record DiscountEventRegistrationViewModel(
        BaseViewModel base,
        DiscountEventViewModel event,
        PotterViewModel potter
) {
}

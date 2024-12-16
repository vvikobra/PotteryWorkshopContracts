package org.example.viewmodels;

import org.example.viewmodels.base.BaseViewModel;
import org.example.viewmodels.base.DiscountEventViewModel;

import java.util.List;

public record ListDiscountEventViewModel(
        BaseViewModel base,
        List<DiscountEventViewModel> events
) {
}
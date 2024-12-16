package org.example.viewmodels;

import org.example.viewmodels.base.BaseViewModel;
import org.example.viewmodels.base.OrderViewModel;

import java.util.List;

public record UserProfileViewModel(
        BaseViewModel base,
        String name,
        String email,
        List<OrderViewModel> orders
) {
}

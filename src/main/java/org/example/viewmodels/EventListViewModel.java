package org.example.viewmodels;

import org.example.viewmodels.base.AdminEventViewModel;
import org.example.viewmodels.base.BaseViewModel;

import java.util.List;

public record EventListViewModel(
        BaseViewModel base,
        List<AdminEventViewModel> events
) {
}

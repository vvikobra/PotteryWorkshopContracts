package org.example.viewmodels.home;

import org.example.viewmodels.base.BaseViewModel;
import org.example.viewmodels.base.EventViewModel;

import java.util.List;

public record HomeViewModel(
        BaseViewModel base,
        List<EventViewModel> events
) {
}

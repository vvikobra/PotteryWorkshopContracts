package org.example.viewmodels;

import org.example.viewmodels.base.BaseViewModel;
import org.example.viewmodels.base.EventViewModel;
import org.example.viewmodels.base.PotterViewModel;

import java.util.List;

public record PotterDetailsViewModel(
        BaseViewModel base,
        PotterViewModel potter,
        List<EventViewModel> events
) {
}
package org.example.viewmodels;

import org.example.viewmodels.base.BaseViewModel;
import org.example.viewmodels.base.EventViewModel;

import java.util.List;

public record UpcomingEventsViewModel(
        BaseViewModel base,
        List<EventViewModel> events
) {
}
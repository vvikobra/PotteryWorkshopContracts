package org.example.viewmodels;

import org.example.viewmodels.base.BaseViewModel;
import org.example.viewmodels.base.PotterViewModel;

import java.util.List;

public record PotterListViewModel(
        BaseViewModel base,
        List<PotterViewModel> potters
) {
}

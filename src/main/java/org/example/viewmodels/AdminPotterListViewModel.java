package org.example.viewmodels;

import org.example.viewmodels.base.AdminPotterViewModel;
import org.example.viewmodels.base.BaseViewModel;

import java.util.List;

public record AdminPotterListViewModel(
        BaseViewModel base,
        List<AdminPotterViewModel> potters
) {
}

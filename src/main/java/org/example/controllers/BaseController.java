package org.example.controllers;

import org.example.viewmodels.base.BaseViewModel;

public interface BaseController {
    BaseViewModel createBaseViewModel(String title);
}

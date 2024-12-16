package org.example.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface HomeController extends BaseController {

    @GetMapping()
    String createHomeViewModel(Model model);

}
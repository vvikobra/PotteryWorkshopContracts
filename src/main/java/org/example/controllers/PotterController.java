package org.example.controllers;

import jakarta.validation.Valid;
import org.example.forms.AddPotterForm;
import org.example.forms.EditPotterForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/potters")
public interface PotterController extends BaseController {

    @GetMapping()
    String showPotters(Model model);

    @GetMapping("/admin")
    String adminShowPotters(Model model);

    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String addPotter(
            @Valid @ModelAttribute("form") AddPotterForm addPotterForm,
            BindingResult bindingResult,
            Model model);

    @GetMapping("/{potterId}/edit")
    String editForm(
            @PathVariable UUID potterId,
            Model model);

    @PostMapping("/{potterId}/edit")
    String editPotter(@PathVariable UUID potterId,
                     @Valid @ModelAttribute("form") EditPotterForm editPotterForm,
                     BindingResult bindingResult,
                     Model model);

    @PostMapping("/{potterId}/dismiss")
    String dismissPotter(@PathVariable UUID potterId);

    @GetMapping("/{potterId}")
    String showPotterDetails(@PathVariable UUID potterId,
                             Model model);
}
package org.example.controllers;

import jakarta.validation.Valid;
import org.example.forms.EditProfileForm;
import org.example.forms.SignUpForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.UUID;

@RequestMapping("/users")
public interface UserController extends BaseController {

    @GetMapping("/login")
    String login(Model model);

    @GetMapping("/register")
    String registerForm(Model model);

    @PostMapping("/register")
    String register(@Valid @ModelAttribute("form") SignUpForm signUpForm,
                    BindingResult bindingResult,
                    Model model);

    @GetMapping("/edit")
    String editForm(Principal principal,
                    Model model);

    @PostMapping("/edit")
    String editProfile(
            Principal principal,
            @Valid @ModelAttribute("form") EditProfileForm editProfileForm,
            BindingResult bindingResult,
            Model model);

    @GetMapping("/profile/{status}")
    String showUserProfile(Principal principal,
                           @PathVariable String status,
                           Model model);

    @PostMapping("/{orderId}")
    String cancelOrder(@PathVariable UUID orderId);
}
package org.example.controllers;

import jakarta.validation.Valid;
import org.example.forms.AddEventForm;
import org.example.forms.EditEventForm;
import org.example.forms.EventRegistrationForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.UUID;

@RequestMapping("/events")
public interface EventController extends BaseController {

    @GetMapping()
    String showAllEvents(Model model);

    @GetMapping("/create")
    String createForm(Model model);

    @PostMapping("/create")
    String createEvent(
            @Valid @ModelAttribute("form") AddEventForm addEventForm,
            BindingResult bindingResult,
            Model model);

    @GetMapping("/{eventId}/edit")
    String editForm(
            @PathVariable UUID eventId,
            Model model);

    @PostMapping("/{eventId}/edit")
    String editEvent(@PathVariable UUID eventId,
                     @Valid @ModelAttribute("form") EditEventForm editEventForm,
                     BindingResult bindingResult,
                     Model model);

    @GetMapping("/upcoming")
    String showUpcomingEvents(Model model);

    @GetMapping("/discount")
    String showDiscountEvents(Model model);

    @GetMapping("/{eventId}")
    String registerToEventForm(Principal principal,
                               @PathVariable UUID eventId,
                               Model model);

    @GetMapping("/discount/{eventId}")
    String registerToDiscountEventForm(Principal principal,
                                       @PathVariable UUID eventId,
                                       Model model);

    @PostMapping("/{eventId}")
    String registerToEvent(Principal principal,
                           @PathVariable UUID eventId,
                           @Valid @ModelAttribute("form") EventRegistrationForm eventRegistrationForm,
                           BindingResult bindingResult,
                           Model model);

    @PostMapping("/discount/{eventId}")
    String registerToDiscountEvent(Principal principal,
                                   @PathVariable UUID eventId,
                                   @Valid @ModelAttribute("form") EventRegistrationForm eventRegistrationForm,
                                   BindingResult bindingResult,
                                   Model model);
}
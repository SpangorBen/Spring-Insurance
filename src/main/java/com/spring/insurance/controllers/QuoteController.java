package com.spring.insurance.controllers;

import com.spring.insurance.models.AutoInsurancePolicy;
import com.spring.insurance.models.HealthInsurancePolicy;
import com.spring.insurance.models.HomeInsurancePolicy;
import com.spring.insurance.models.Quote;
import com.spring.insurance.models.User;
import com.spring.insurance.models.enums.InsuranceStatus;
import com.spring.insurance.models.enums.QuoteStatus;
import com.spring.insurance.services.interfaces.InsuranceService;
import com.spring.insurance.services.interfaces.QuoteService;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/quotes")
public class QuoteController {

    private static final Logger logger = LoggerFactory.getLogger(QuoteController.class);

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private QuoteService quoteService;

    // --- Auto Insurance Quote ---

    @GetMapping("/auto")
    public String showAutoQuoteForm(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser == null) {
            return "redirect:/login";
        }

        model.addAttribute("autoInsurancePolicy", new AutoInsurancePolicy());
        model.addAttribute("userEmail", loggedInUser.getEmail());

        return "autoQuoteForm";
    }

    @PostMapping("/auto")
    public String calculateAutoQuote(@ModelAttribute("autoInsurancePolicy") AutoInsurancePolicy autoInsurancePolicy,
                                     HttpSession session,
                                     Model model) {
        try {
            User loggedInUser = (User) session.getAttribute("loggedInUser");
            if (loggedInUser == null) {
                return "redirect:/login";
            }

            autoInsurancePolicy.setUser(loggedInUser);
            autoInsurancePolicy.setStatus(InsuranceStatus.INACTIVE);

            autoInsurancePolicy = insuranceService.createAutoInsurancePolicy(autoInsurancePolicy);

            Quote quote = quoteService.calculateAutoQuote(autoInsurancePolicy);
            quote = quoteService.saveQuote(quote);

            model.addAttribute("quote", quote);

            return "redirect:/";
        } catch (Exception e) {
            logger.error("Error creating AutoInsurancePolicy", e);
            model.addAttribute("error", e.getMessage());
            return "autoQuoteForm";
        }
    }

    // --- Home Insurance Quote ---
    @GetMapping("/home")
    public String showHomeQuoteForm(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser == null) {
            return "redirect:/login";
        }

        model.addAttribute("homeInsurancePolicy", new HomeInsurancePolicy());
        model.addAttribute("userEmail", loggedInUser.getEmail());

        return "homeQuoteForm";
    }

    @PostMapping("/home")
    public String calculateHomeQuote(@ModelAttribute("homeInsurancePolicy") HomeInsurancePolicy homeInsurancePolicy,
                                     HttpSession session, Model model) {
        try {
            User loggedInUser = (User) session.getAttribute("loggedInUser");
            if (loggedInUser == null) {
                return "redirect:/login";
            }

            homeInsurancePolicy.setUser(loggedInUser);
            homeInsurancePolicy.setStatus(InsuranceStatus.INACTIVE);

            homeInsurancePolicy = insuranceService.createHomeInsurancePolicy(homeInsurancePolicy);

            Quote quote = quoteService.calculateHomeQuote(homeInsurancePolicy);
            quote = quoteService.saveQuote(quote);

            model.addAttribute("quote", quote);

            return "redirect:/";
        } catch (Exception e) {
            logger.error("Error creating HomeInsurancePolicy", e);
            model.addAttribute("error", e.getMessage());
            return "homeQuoteForm";
        }
    }

    // --- Health Insurance Quote ---

    @GetMapping("/health")
    public String showHealthQuoteForm(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser == null) {
            return "redirect:/login";
        }

        model.addAttribute("healthInsurancePolicy", new HealthInsurancePolicy());
        model.addAttribute("userEmail", loggedInUser.getEmail());

        return "healthQuoteForm";
    }

    @PostMapping("/health")
    public String calculateHealthQuote(@ModelAttribute("healthInsurancePolicy") HealthInsurancePolicy healthInsurancePolicy,
                                       HttpSession session, Model model) {
        try {
            User loggedInUser = (User) session.getAttribute("loggedInUser");
            if (loggedInUser == null) {
                return "redirect:/login";
            }

            healthInsurancePolicy.setUser(loggedInUser);
            healthInsurancePolicy.setStatus(InsuranceStatus.INACTIVE);

            healthInsurancePolicy = insuranceService.createHealthInsurancePolicy(healthInsurancePolicy);

            Quote quote = quoteService.calculateHealthQuote(healthInsurancePolicy);
            quote = quoteService.saveQuote(quote);

            model.addAttribute("quote", quote);

            return "redirect:/";
        } catch (Exception e) {
            logger.error("Error creating HealthInsurancePolicy", e);
            model.addAttribute("error", e.getMessage());
            return "healthQuoteForm";
        }
    }

    // --- Accept/Reject Quote ---

    @GetMapping("/{quoteId}/accept")
    public String acceptQuote(Long quoteId, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser == null) {
            return "redirect:/login";
        }

        Quote quote = quoteService.getQuoteById(quoteId);
        quote.setQuoteStatus(QuoteStatus.ACCEPTED);
        quote = quoteService.saveQuote(quote);

        return "redirect:/";
    }

    @GetMapping("/{quoteId}/reject")
    public String rejectQuote(Long quoteId, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser == null) {
            return "redirect:/login";
        }

        Quote quote = quoteService.getQuoteById(quoteId);
        quote.setQuoteStatus(QuoteStatus.REJECTED);
        quote = quoteService.saveQuote(quote);

        return "redirect:/";
    }
}
package com.example.demo.controller;

import com.example.demo.repository.ApprenticeRepository;
import com.example.demo.repository.CompanyRepository;
import com.example.demo.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private ApprenticeRepository apprenticeRepository;

    @Autowired
    private ContractRepository contractRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Vue pour les Entreprises
    @GetMapping("/view/companies")
    public String viewCompanies(Model model) {
        model.addAttribute("entreprises", companyRepository.findAll());
        return "companies-list";
    }

    // Vue pour les Apprentis
    @GetMapping("/view/apprentices")
    public String viewApprentices(Model model) {
        model.addAttribute("apprentis", apprenticeRepository.findAll());
        return "apprentices-list";
    }

    // Vue pour les Contrats
    @GetMapping("/view/contracts")
    public String viewContracts(Model model) {
        model.addAttribute("contrats", contractRepository.findAll());
        return "contracts-list";
    }
}
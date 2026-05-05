package com.example.demo.controller;

import com.example.demo.dto.CompanyDTO;
import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyRepository repository;

    @PostMapping
    public Company create(@RequestBody CompanyDTO dto) {
        Company c = new Company();
        c.setRaisonSociale(dto.getRaisonSociale());
        c.setSiret(dto.getSiret());
        c.setCodeNaf(dto.getCodeNaf());
        c.setConventionCollective(dto.getConventionCollective());
        c.setEffectif(dto.getEffectif());
        c.setOpco(dto.getOpco());
        c.setAdresse(dto.getAdresse());

        return repository.save(c);
    }

    @GetMapping
    public List<Company> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Company getById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }
}
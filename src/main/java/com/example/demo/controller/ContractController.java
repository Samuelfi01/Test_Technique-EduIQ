package com.example.demo.controller;

import com.example.demo.dto.ContractRequestDTO;
import com.example.demo.model.Contract;
import com.example.demo.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contracts")
public class ContractController {

    @Autowired
    private ContractService contractService;

    // Créer un nouveau contrat
    @PostMapping
    public Contract create(@RequestBody ContractRequestDTO dto) {
        return contractService.create(dto);
    }

    // Récupérer un contrat par son ID
    @GetMapping("/{id}")
    public Contract getById(@PathVariable Long id) {
        return contractService.getById(id);
    }

    // Valider un contrat (passer de BROUILLON à VALIDE)
    @PostMapping("/{id}/validate")
    public Contract validate(@PathVariable Long id) {
        return contractService.validate(id);
    }
}
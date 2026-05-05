package com.example.demo.service;

import com.example.demo.model.Contract;
import com.example.demo.repository.ContractRepository;
import com.example.demo.dto.ContractRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;

    public Contract create(ContractRequestDTO dto) {
        Contract c = new Contract();
        c.setApprenticeId(dto.getApprenticeId());
        c.setCompanyId(dto.getCompanyId());
        c.setDateDebut(dto.getDateDebut());
        c.setDateFin(dto.getDateFin());
        c.setDureeHebdo(dto.getDureeHebdo());
        c.setType(dto.getType());
        c.setNbAnnees(dto.getNbAnnees());
        c.setRemuneration(dto.getRemuneration());
        c.setStatut("BROUILLON");

        return contractRepository.save(c);
    }

    public Contract getById(Long id) {
        return contractRepository.findById(id)
                .orElseThrow();
    }

    public Contract validate(Long id) {
        Contract c = getById(id);
        c.setStatut("VALIDE");
        return contractRepository.save(c);
    }
}
package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class ContractRequestDTO {
    public Long apprenticeId;
    public Long companyId;
    public LocalDate dateDebut;
    public LocalDate dateFin;
    public int dureeHebdo;
    public String type;
    public int nbAnnees;
    public double remuneration;
}
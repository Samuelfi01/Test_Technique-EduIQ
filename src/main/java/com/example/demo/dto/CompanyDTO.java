package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {
    private String raisonSociale;
    private String siret;
    private String codeNaf;
    private String conventionCollective;
    private int effectif;
    private String opco;
    private String adresse;
}
package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long apprenticeId;
    private Long companyId;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    private int dureeHebdo;
    private String type;
    private int nbAnnees;
    private double remuneration;

    private String statut;
    private String tenantId;

    // getters & setters (OBLIGATOIRES si pas Lombok)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getApprenticeId() { return apprenticeId; }
    public void setApprenticeId(Long apprenticeId) { this.apprenticeId = apprenticeId; }

    public Long getCompanyId() { return companyId; }
    public void setCompanyId(Long companyId) { this.companyId = companyId; }

    public LocalDate getDateDebut() { return dateDebut; }
    public void setDateDebut(LocalDate dateDebut) { this.dateDebut = dateDebut; }

    public LocalDate getDateFin() { return dateFin; }
    public void setDateFin(LocalDate dateFin) { this.dateFin = dateFin; }

    public int getDureeHebdo() { return dureeHebdo; }
    public void setDureeHebdo(int dureeHebdo) { this.dureeHebdo = dureeHebdo; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getNbAnnees() { return nbAnnees; }
    public void setNbAnnees(int nbAnnees) { this.nbAnnees = nbAnnees; }

    public double getRemuneration() { return remuneration; }
    public void setRemuneration(double remuneration) { this.remuneration = remuneration; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public String getTenantId() { return tenantId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
}
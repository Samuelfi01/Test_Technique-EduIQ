-- Nettoyage pour éviter les doublons au redémarrage
DELETE FROM contract;
DELETE FROM company;
DELETE FROM apprentice;

-- CAS N°1 : Standard (19 ans, 800€)
-- On ajoute l'ID 101 et on remplit TOUTES les colonnes (ajoute celles que tu as dans ton entité)
INSERT INTO company (id, raison_sociale, siret, adresse, effectif) 
VALUES (101, 'Entreprise Alpha', '12345678901234', '1 rue de Lyon', 50);

INSERT INTO apprentice (id, nom, prenom, date_naissance, niveau_diplome, nir) 
VALUES (101, 'Martin', 'Lucas', '2007-09-01', 'Master', '1234567890123');

INSERT INTO contract (id, apprentice_id, company_id, date_debut, date_fin, remuneration, statut, type, duree_hebdo, nb_annees) 
VALUES (1, 101, 101, '2026-09-01', '2028-08-31', 800.00, 'VALIDE', 'APPRENTISSAGE', 35, 2);


-- CAS N°2 : Anniversaire piégeux
INSERT INTO apprentice (id, nom, prenom, date_naissance, niveau_diplome, nir) 
VALUES (102, 'Bernard', 'Julie', '2009-03-01', 'Licence', '2234567890123');

INSERT INTO contract (id, apprentice_id, company_id, date_debut, date_fin, remuneration, statut, type, duree_hebdo, nb_annees) 
VALUES (2, 102, 101, '2026-09-01', '2027-08-31', 487.00, 'EN_ATTENTE_ARBITRAGE', 'APPRENTISSAGE', 35, 1);


-- CAS N°3 : Hors Limites (32 ans)
INSERT INTO apprentice (id, nom, prenom, date_naissance, niveau_diplome, nir) 
VALUES (103, 'Durand', 'Thomas', '1994-01-01', 'BTS', '3234567890123');

INSERT INTO contract (id, apprentice_id, company_id, date_debut, date_fin, remuneration, statut, type, duree_hebdo, nb_annees) 
VALUES (3, 103, 101, '2026-09-01', '2029-08-31', 1800.00, 'REFUSE_AGE_LIMITE', 'APPRENTISSAGE', 35, 3);
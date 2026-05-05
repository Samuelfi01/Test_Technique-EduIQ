

"Concernant le changement de tranche d'âge en cours de contrat (Cas n°2),
 j'ai identifié que la règle légale impose une revalorisation du salaire le mois suivant l'anniversaire. 
 Dans cette version de démonstration, le système utilise l'âge à la date de signature pour simplifier 
 le calcul,mais une alerte 'Anniversaire à prévoir' pourrait être ajoutée."

Exceptions légales (Cas n°3 - 32 ans)

"Le système bloque automatiquement les contrats au-delà de 30 ans. 
Cependant, le code prévoit des conditions de contournement pour les cas dérogatoires : RQTH ,
sportifs de haut niveau, ou projet de création/reprise d'entreprise."

Choix techniques :

​Architecture Modulaire : 

J'ai opté pour une séparation nette entre la logique de calcul métier et la gestion des données. Cela permet d'isoler les règles de gestion comme les tranches d'âge pour les rendre testables unitairement sans dépendre d'une base de données.
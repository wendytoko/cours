/*---------------------------------------
-------------------Les jointures---------
-----------------------------------------*/

## INNER JOIN : utilisateurs | commandes

-- --> afficher toutes les commandes associées aux utilisateurs

select u.id_utilisateur, u.prenom, u.nom, c.numero_facture, c.prix_total
from utilisateurs u
inner join commandes c 
on u.id_utilisateur = c.utilisateur_id;


###-------LEFT JOIN-------------####
-- --> afficher tous les utilisateurs avec leurs commandes
-- et afficher également les utilisateurs qui n'ont pas effectué de commandes
-- => on va utiliser une jointure externe sur la table de gauche utilisateurs
select * 
from utilisateurs u
left join commandes c
on  u.id_utilisateur = c.utilisateur_id;

-- filtrer sur la valeur NULL
-- => afficher les utilisateurs qui n'ont pas de commandes
select u.id_utilisateur, u.prenom, u.nom, c.utilisateur_id
from utilisateurs u
left join commandes c
on  u.id_utilisateur = c.utilisateur_id
where c.utilisateur_id is null;

###-------RIGHT JOIN-------------####
-- => afficher toutes les commandes avec le nom de l'utilisateur correcpondant

select id_utilisateur, prenom, nom, utilisateur_id, date_achat, numero_facture
from utilisateurs u
right join commandes c
on u.id_utilisateur = c.utilisateur_id;## on va pouvoir retrouver le nom de l'utilisateur même si il a été supprimé 


###-------FULL JOIN = LEFT + RIGHT JOIN-------------####
-- => afficher tous les utilisateurs qui ont des commandes ou pas
-- => afficher toutes les commandes qui sont associées ou pas à un utilisateur 


select id_utilisateur, prenom, nom, utilisateur_id, date_achat, numero_facture 
from utilisateurs u
left join commandes c
on  u.id_utilisateur = c.utilisateur_id;
UNION
select id_utilisateur, prenom, nom, utilisateur_id, date_achat, numero_facture
from utilisateurs u
right join commandes c
on u.id_utilisateur = c.utilisateur_id;


###-------CROSS JOIN ------------####
-- => afficher les combinaisons possibles entre un utilisateur et une commande
select id_utilisateur, prenom, nom, numero_facture
from utilisateurs u
cross join commandes c;

 
#### meme requete sans les jointures
select  id_utilisateur, prenom, nom, numero_facture
from utilisateurs, commandes;

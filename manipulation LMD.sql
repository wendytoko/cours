/*------------------------------------------------------*/
/*--------Insertion des données : clause SELECT---------*/
/*------------------------------------------------------*/

## Exemple d'insertion dans la table 'hotels'
/* insertion d'une ligne à la fois

*/

## NB : pas d'auto increment sur id_hotel => affectation manuelle de la valeur
insert into hotels (id_hotel, libelle, etoile) values (1,'Sky Hotel', '*');
insert into hotels (id_hotel, libelle, etoile) values (2,'Art Hotel', '**');

/* insertion de plusieurs lignes à la fois*/
insert into hotels (id_hotel, libelle, etoile) 
values (3,'Rose Hotel', '***'), (4, 'Lions Hotel', '****');
                                                    
## Exemple d'insertion dans la table 'types_chambres'
/* auto increment sur id_type_chambre => MySQL gère l'affectation et l'auto incrémentation de la PK
*/

insert into types_chambres (nombre_lit, type_lit, description) values (1, 'lit simple', 'un lit simple avec douche');
insert into types_chambres (nombre_lit, type_lit, description) values (2, 'lit simple', '2 lits simples avec douche');
insert into types_chambres (nombre_lit, type_lit, description) values (3, 'lit simple', 'un lit simple avec douche et WC séparés');
insert into types_chambres (nombre_lit, type_lit, description) values (1, 'lit double', 'un lit double avec douche');
insert into types_chambres (nombre_lit, type_lit, description) values (1, 'lit double', 'un lit double avec douche et WC séparés');

## Exemple d'insertion dans la table 'chambres'

INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (1, 5, '5', 'Reservé pour');
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (1, 6, '6', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (2, 1, '1', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (2, 2, '2', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (2, 3, '3', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (2, 4, '4', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (2, 5, '5', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (2, 6, '6', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (2, 7, '7', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (3, 1, '1', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (3, 2, '2', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (3, 3, '3', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (3, 4, '4', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (3, 5, '5', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (3, 6, '6', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (3, 7, '7', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (4, 1, '1', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (4, 2, '2', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (4, 3, '3', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (4, 4, '4', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (4, 5, '5', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (4, 6, '6', NULL);
INSERT INTO  chambres (hotel_id, type_chambre_Id, numero_chambre, commentaire) VALUES (4, 7, '7', NULL);


## Exemple d'insertion dans la table 'tarifs'
INSERT INTO  tarifs ( hotel_id, type_chambre_id, date_debut, date_fin, prix) VALUES ( 1, 3, '2017-10-01', '2018-04-14', 69.990);
INSERT INTO  Tarifs ( hotel_id, type_chambre_id, date_debut, date_fin, prix) VALUES ( 1, 4, '2017-10-01', '2018-04-14', 59.990);
INSERT INTO  Tarifs ( hotel_id, type_chambre_id, date_debut, date_fin, prix) VALUES ( 1, 5, '2017-10-01', '2018-04-14', 69.990);
INSERT INTO  Tarifs ( hotel_id, type_chambre_id, date_debut, date_fin, prix) VALUES ( 1, 6, '2017-10-01', '2018-04-14', 79.990);
INSERT INTO  Tarifs ( hotel_id, type_chambre_id, date_debut, date_fin, prix) VALUES ( 1, 7, '2017-10-01', '2018-04-14', 89.990);
INSERT INTO  Tarifs ( hotel_id, type_chambre_id, date_debut, date_fin, prix) VALUES ( 2, 1, '2017-12-15', '2018-04-15', 57.490);
INSERT INTO  Tarifs ( hotel_id, type_chambre_id, date_debut, date_fin, prix) VALUES ( 2, 2, '2017-12-15', '2018-04-15', 68.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 3, '2017-12-15', '2018-04-15', 80.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 4, '2017-12-15', '2018-04-15', 68.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 5, '2017-12-15', '2018-04-15', 80.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 6, '2017-12-15', '2018-04-15', 91.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 7, '2017-12-15', '2018-04-15', 103.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 1, '2017-12-15', '2018-04-15', 57.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 2, '2017-12-15', '2018-04-15', 68.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 3, '2017-12-15', '2018-04-15', 80.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 4, '2017-12-15', '2018-04-15', 68.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 5, '2017-12-15', '2018-04-15', 80.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 6, '2017-12-15', '2018-04-15', 91.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 7, '2017-12-15', '2018-04-15', 103.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 1, '2017-10-01', '2018-04-14', 49.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 2, '2017-10-01', '2018-04-14', 59.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 3, '2017-10-01', '2018-04-14', 69.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 4, '2017-10-01', '2018-04-14', 59.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 5, '2017-10-01', '2018-04-14', 69.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 6, '2017-10-01', '2018-04-14', 79.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 7, '2017-10-01', '2018-04-14', 89.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 1, 1, '2017-04-01', '2017-09-30', 57.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 1, 2, '2017-04-01', '2017-09-30', 68.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 1, 3, '2017-04-01', '2017-09-30', 80.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 1, 4, '2017-04-01', '2017-09-30', 68.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 1, 5, '2017-04-01', '2017-09-30', 80.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 1, 6, '2017-04-01', '2017-09-30', 91.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 1, 7, '2017-04-01', '2017-09-30', 103.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 1, '2017-04-01', '2017-09-30', 57.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 2, '2017-04-01', '2017-09-30', 68.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 3, '2017-04-01', '2017-09-30', 80.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 4, '2017-04-01', '2017-09-30', 68.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 5, '2017-04-01', '2017-09-30', 80.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 6, '2017-04-01', '2017-09-30', 91.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 4, 7, '2017-04-01', '2017-09-30', 103.490);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 1, '2017-04-16', '2017-12-14', 49.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 2, '2017-04-16', '2017-12-14', 59.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 3, '2017-04-16', '2017-12-14', 69.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 4, '2017-04-16', '2017-12-14', 59.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 5, '2017-04-16', '2017-12-14', 69.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 6, '2017-04-16', '2017-12-14', 79.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 2, 7, '2017-04-16', '2017-12-14', 89.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 1, '2017-04-16', '2017-12-14', 49.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 2, '2017-04-16', '2017-12-14', 59.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 3, '2017-04-16', '2017-12-14', 69.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 4, '2017-04-16', '2017-12-14', 59.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 5, '2017-04-16', '2017-12-14', 69.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 6, '2017-04-16', '2017-12-14', 79.990);
INSERT INTO  Tarifs ( hotelId, TypeChambreId, DateDebut, DateFin, Prix) VALUES ( 3, 7, '2017-04-16', '2017-12-14', 89.990);

/*------------------------------------------------------*/
/*--------Sélection des données : clause SELECT---------*/
/*------------------------------------------------------*/

### RECUP DE TOUTES LES COLONNES ET DE TOUTES LES LIGNES DE LA TABLE
select * from types_chambres;

## recup de deux colonnes de la table

select nombre_lit, description from types_chambres;

## sélection sur plusieurs tables
select hotels.libelle, hotels.etoile, chambres.numero_chambre, types_chambres.description
from chambres, hotels, types_chambres;

# utilisation des alias on met 'as' ou rien dans le from
select ho.libelle, ho.etoile, ch.numero_chambre, tch.description
from chambres as ch, hotels ho, types_chambres tch;

## les tris
/*tri sur la date_debut en ascendant
*/
select hotel_id, type_chambre_id, date_debut, prix 
from tarifs
order by date_debut asc; #en descendant c'est desc

##Options TOP, LIMIT - OFFSET 
# les 5 eres lignes
select * from types_chambres limit 5 offset 2;# recup les 5 eres lignes à partir de la 2eme ligne

### la clause WHERE - restriction sur le résultat + (AND)

select * from chambres where id_chambre = 2 and id_chambre = 1;

### le regroupement avec la clause GROUP BY
/*
	> Group by : pour supprimer les doublons
*/

select numero_chambre from chambres group by numero_chambre;

select * from types_chambres group by type_lit;

select count(id_type_chambres) from types_chambres; # count () me dit combien d'id type il y a, compte nb d'occurence

select count(id_type_chambres) as nombres_chambres, type_lit from types_chambres; # regroupement des chambres par catégorie (type lit) avec as qui renomme la colonne du resultat

## MB : fonctions à utiliser avec le GROUP BY

/* count */
select count(*) as nombre_hotels from hotels;

/* SUM : addictionner des valeurs */
# => calculer la somme des prix par type
select type_chambre_id, sum(prix) as prix_cumul from tarifs group by type_chambre_id;

/* MAX, MIN : valeurs max et min */
select max(prix) as prix_max from tarifs;

## opérateurs arithmétiques

/* mulitiplication du prix */
select prix, prix*3 as prix3Nuits
from tarifs;

/* opérateurs de comparaison */

select type_chambre_id, description, prix
from tarifs
inner join types_chambres
on types_chambres.id_type_chambres = tarifs.type_chambre_id
where prix < 50;

/* opérateurs logiques*/

select *
from tarifs
where date_debut between '2019-01-10' and '2019-01-11';

select*
from chambres
where id_chambre between 1 and 5;

-- comparateur LIKE
-- => recup nom d'hotel avec un s

select * from hotels
where libelle like '%s%';

-- => recup nom d'hotel commençant par un s

select * from hotels
where libelle like 's%';

/*------------------------------------------------------*/
/*--------Suppression des données : clause delete-------*/
/*------------------------------------------------------*/

## suppression de toutes les lignes de la table
delete from hotels;

## suppression de l'hotel à l'id_htoel = 1

delete from hotels where id_hotel = 1;

## suppression des chambres qui ont un numéro supérieur à 28
delete from chambres where id_chambre > 28;

## conditionner la suppression avec un SELECT
-- => supprimer les chambres donc l'hotel n'existe pas dans la table hotels
delete from chambres
where hotel_id not in (select id_hotel from hotels);

/*------------------------------------------------------*/
/*--------Modification des données : clause UPDATE------*/
/*------------------------------------------------------*/

## modif de tous les prix de la table tarifs
update tarifs set prix = 99;

### modif d'une seule ligne de la table
update tarifs set prix = 99 where id_tarif = 1;

### calcul lors de la modif
update tarifs set prix = prix*1.20;

#modif de plusieurs colonnes
update chambres set numero_chambre = 520, commentaire = 'comments'
where id_chambre = 2;

SELECT CURRENT_DATE(), CURDATE(), NOW() ;
hotels









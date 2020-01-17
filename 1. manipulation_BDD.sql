/*-----------------------------------------*/
/*-----Création d'une Base de Données------*/
/*-----------------------------------------*/

create database db_gestion_hotel;

create database if not exists bdd_gestion_hotel;

/*-----------------------------------------*/
/*-----Suppression d'une Base de Données---*/
/*-----------------------------------------*/

drop database bdd_gestion_hotel;

/*-----------------------------------------------------*/
/*-----Création de tables dans la Base de Données------*/
/*-----------------------------------------------------*/

## création de la table hotels

create table db_gestion_hotel.hotels (
		id_hotel integer, 
        libelle varchar(50),
        etoile varchar(7) 
);

create table hotel (
		id_hotel integer, 
        libelle varchar(50),
        etoile varchar(7) 
);
/*-----------------------------------------------------*/
/*-----Suppression d'une table dans la Base de Données-*/
/*-----------------------------------------------------*/

drop table hotels;

/*------------------------------------------------------*/
/*-----Modification d'une table dans la Base de Données-*/
/*------------------------------------------------------*/

## renommer une table

rename table hotel to hotels;

## modif de la table 'hotels' => définition de la colonne 'id_hotel' comme clé primaire PK

alter table hotels add primary key (id_hotel);

## modif de de la table 'hotels' => ajout d'une nouvelle colonne 'commentaire'

alter table hotels add commentaire varchar(400);

## modif de de la table 'hotels' => suppression de la colonne 'commentaire'

alter table hotels drop column commentaire;

## modif de de la table 'hotels' => suppression de la clé primaire

alter table hotels drop primary key;

/*------------------------------------------------------*/
/*-----Création d'autres tables dans la Base de Données-*/
/*------------------------------------------------------*/

## création de la table 'chambre'

/*
auto_increment = génération et auto incrémentation de la valeur de id_chambre par MySQL.
                 valeur à partir de 1 et incrémentation de 1.
                 */

create table chambres (id_chambre integer primary key auto_increment, 
						numero_chambre varchar(10),
                        commentaire varchar(400));

## création de la table 'tarifs'
create table tarifs (id_tarif integer auto_increment,
					date_debut date,
					date_fin date,
					prix decimal(7,3),
constraint pk_tarifs primary key (id_tarif)
                    );
                    
## création de la table 'types_chambres'
create table types_chambres (id_type_chambres integer primary key auto_increment,
							 nombre_lit integer check(value between 1 and 999),
                             type_lit varchar (60) default 'lit simple', ##lit simple par défaut
                             description varchar(255) not null);	##colonne obligatoire
				
/*------------------------------------------------------*/
/*-----Ajout de la clé étrangère : Foreign Key FK-------*/
/*------------------------------------------------------*/

#### tables chambres - types_chambres 

/* déclarer la pk id_type_chambre de la table types_chambre

		>> chambres = table enfant (porteuse de la FK
        >> hotels = table parent
*/

## ajout de la colonne 'type_chambre_id' qui va porter la fk dans la table chambres
		

alter table chambres add type_chambre_id integer;
alter table chambres add hotel_id integer;

## définition de la colonne type_chambre_id comme FK

alter table chambres add foreign key (type_chambre_id) references types_chambres(id_type_chambres);
alter table chambres add foreign key (hotel_id) references hotels(id_hotel);

### afficher la requête SQL de création de la table chambre : récup le num de la contrainte de la FK
show create table chambres;

## suppression de la fk avec le nom de la contrainte
alter table chambres drop foreign key chambres_ibfk_1;

## donner un nom à la contrainte de la FK

alter table chambres add constraint FK_types_chambres
						foreign key (type_chambre_id)
                        references types_chambres(id_type_chambres);
                        
## Definitinon de la colonne 'hotel_id' comme FK
                    
alter table chambres add constraint FK_hotels foreign key (hotel_id) references hotels(id_hotel);

## suppression de la table tarifs
drop table tarifs;

## recréation de la table 'tarifs' avec déclation des clés PK FKs


create table tarifs (id_tarif integer auto_increment,
					date_debut date,
					date_fin date,
					prix decimal(7,3),
                    hotel_id integer, ##colonne porteuse de la FK de hotels
                    type_chambre_id integer,##colonne porteuse de la FK de types_chambres
                    
constraint pk_tarifs primary key (id_tarif),
constraint FK_hotel_tarifs foreign key (hotel_id) references hotels(id_hotel),
constraint FK_typechambres_tarifs foreign key (type_chambre_id) references types_chambres(id_type_chambres)
                    );










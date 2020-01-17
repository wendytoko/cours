/* ------------------------------------------------------------------- */
/* ------Tables pour INNER RIGHT LEFT FULL CROSS JOIN ---------------- */
/* ------------------------------------------------------------------ */

CREATE TABLE `dbb_jointures`.`utilisateurs` (
  `id_utilisateur` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NULL,
  `prenom` VARCHAR(45) NULL,
  `ville` VARCHAR(45) NULL,
  PRIMARY KEY (`id_utilisateur`));


CREATE TABLE `dbb_jointures`.`commandes` (
  `id_commande` INT NOT NULL AUTO_INCREMENT,
  `date_achat` DATE NULL,
  `numero_facture` VARCHAR(45) NULL,
  `prix_total` VARCHAR(45) NULL,
  `utilisateur_id` INT,
  PRIMARY KEY (`id_commande`),
  FOREIGN KEY (utilisateur_id) REFERENCES utilisateurs(id_utilisateur));
  

INSERT INTO utilisateurs(nom,prenom,ville) VALUES
    ('Hunter', 'Thompson','washington'),
    ('Joyce', 'Carol', 'boston'),
	( 'Black', 'Elk', 'vancouver'),
    ( 'Rainer', 'Maria', 'london'),
    ( 'John', 'Kennedy', 'new york'),
    ( 'Annie', 'Proulx', 'paris');

INSERT INTO  commandes ( date_achat, numero_facture, prix_total, utilisateur_id) VALUES 
					('2018-01-15', 'F00110', 490.90, 1),
                    ('2017-09-14', 'F00111', 500.60, 1),
                    ('2018-02-10', 'F00112', 705.80, 2),
                    ('2018-03-12', 'F00113', 485.23, 4),
                    ('2017-12-15', 'F00114', 238.14, 5);
                    
   INSERT INTO  commandes ( date_achat, numero_facture, prix_total) VALUES                  
					('2015-03-09', 'F00100', 238.14),
                    ('2014-06-10', 'F00101', 238.14);



/* ---------------------------------------- */
/* ------Tables pour NATUREL JOIN --------- */
/* --------------------------------------- */
CREATE TABLE `dbb_jointures`.`pays` (
  `id_pays` INT NOT NULL AUTO_INCREMENT,
  `nom_pays` VARCHAR(45) NULL,
  PRIMARY KEY (`id_pays`));


CREATE TABLE `dbb_jointures`.`employes` (
  `id_employe` INT NOT NULL AUTO_INCREMENT,
  `prenom` VARCHAR(45) NULL,
  `nom` VARCHAR(45) NULL,
  `ville` VARCHAR(45) NULL,
  `id_pays` INT,
  PRIMARY KEY (`id_employe`),
  FOREIGN KEY (id_pays) REFERENCES pays(id_pays));


INSERT INTO  pays ( nom_pays) VALUES 
					('france'),
                    ('canada'),
                    ('belgique'),
                    ('suisse'),
                    ('USA');
  

INSERT INTO employes(prenom, nom,ville,id_pays) VALUES
					('Hunter', 'Thompson','washington',5),
					('Joyce', 'Carol', 'boston',5),
					( 'Black', 'Elk', 'vancouver',2),
					( 'Rainer', 'Maria', 'paris',1),
					( 'John', 'Kennedy', 'new york',5);

INSERT INTO employes(prenom, nom,ville) VALUES( 'Annie', 'Proulx', 'paris');

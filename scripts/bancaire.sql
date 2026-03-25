CREATE DATABASE IF NOT EXISTS bancaire;
USE bancaire;

-- =====================
-- Tables
-- =====================

CREATE TABLE IF NOT EXISTS type_compte (
    id_type      INT PRIMARY KEY AUTO_INCREMENT,
    libelle      VARCHAR(50) NOT NULL,
    taux         DOUBLE DEFAULT 0.0,
    plafond      DOUBLE DEFAULT 0.0
);

CREATE TABLE IF NOT EXISTS client (
    matricule    VARCHAR(10) PRIMARY KEY,
    nom          VARCHAR(50) NOT NULL,
    prenom       VARCHAR(50) NOT NULL,
    adresse      VARCHAR(100),
    telephone    VARCHAR(20),
    mot_de_passe VARCHAR(50) NOT NULL,
    role         VARCHAR(10) NOT NULL DEFAULT 'CLIENT'
);

CREATE TABLE IF NOT EXISTS compte (
    num_compte   VARCHAR(10) PRIMARY KEY,
    solde        DOUBLE NOT NULL DEFAULT 0.0,
    date_ouvert  DATE NOT NULL,
    id_type      INT,
    matricule    VARCHAR(10),
    FOREIGN KEY (id_type)   REFERENCES type_compte(id_type),
    FOREIGN KEY (matricule) REFERENCES client(matricule)
);

CREATE TABLE IF NOT EXISTS operation (
    num_mvt      INT PRIMARY KEY AUTO_INCREMENT,
    date_mvt     DATE NOT NULL,
    montant      DOUBLE NOT NULL,
    type_mvt     CHAR(1) NOT NULL,
    num_compte   VARCHAR(10),
    FOREIGN KEY (num_compte) REFERENCES compte(num_compte)
);

-- =====================
-- Données initiales
-- =====================

INSERT INTO type_compte (libelle, taux, plafond) VALUES
    ('Courant',              0.0, 0.0),
    ('Rémunéré',             2.0, 0.0),
    ('Sécurisé',             0.0, 5000.0),
    ('Rémunéré et Sécurisé', 2.0, 5000.0);

INSERT INTO client VALUES
    ('AGE001', 'Admin', 'Agence', 'Antananarivo', '0341234567', 'admin', 'AGENCE');

INSERT INTO client VALUES
    ('CLI001', 'Dupont', 'Jean', 'Antananarivo', '0340000001', '1234', 'CLIENT');

INSERT INTO compte VALUES
    ('CPT001', 1500.0, CURDATE(), 1, 'CLI001');
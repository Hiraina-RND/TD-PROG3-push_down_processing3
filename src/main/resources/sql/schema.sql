CREATE TABLE vehicule (
    id SERIAL PRIMARY KEY,
    numero VARCHAR(255) UNIQUE,
    marque VARCHAR(255) NOT NULL,
    model VARCHAR(255) NOT NULL
);

CREATE TYPE permis_categories_enum AS ENUM('A', 'B', 'C', 'D');

CREATE TABLE chauffeur (
    id SERIAL PRIMARY KEY,
    id_vehicule INT REFERENCES vehicule(id),
    permis_categories permis_categories_enum
);

CREATE TYPE destination_enum AS ENUM('ANTANANARIVO', 'AMPEFY', 'ANDASIBE');

CREATE TABLE trajet (
    id SERIAL PRIMARY KEY,
    id_vehicule INT REFERENCES vehicule(id),
    nbre_km DOUBLE PRECISION NOT NULL,
    destination destination_enum NOT NULL
);
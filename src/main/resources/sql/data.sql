INSERT INTO vehicule (id, numero, marque, model)
VALUES (1, 'TAA1234', 'Toyota', 'Hilux'),
       (2, 'TBB5678', 'Hyundai', 'i20'),
       (3, 'TCC9012', 'Nissan', 'Navara'),
       (4, 'TDD3456', 'Suzuki', 'Swift');

INSERT INTO chauffeur (id_vehicule, permis_categories)
VALUES (1, 'B'),
       (2, 'B'),
       (3, 'C'),
       (4, 'B');

INSERT INTO trajet (id_vehicule, nbre_km, destination)
VALUES (1, 120.5, 'AMPEFY'),
       (1, 350.0, 'ANDASIBE'),
       (2, 15.2, 'ANTANANARIVO'),
       (3, 220.75, 'AMPEFY'),
       (3, 410.3, 'ANDASIBE'),
       (4, 18.0, 'ANTANANARIVO'),
       (2, 95.6, 'AMPEFY'),
       (4, 305.4, 'ANDASIBE');
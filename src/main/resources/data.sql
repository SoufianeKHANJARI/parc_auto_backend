INSERT INTO Entreprise (id, corporate_name, mail, phone, address, state, logo) VALUES
  (1, 'Société de Transport 1', 'contact@societe1.com', '+33123456789', '1 Rue des Fleurs, 75000 Paris', 'Active', 'logo_entreprise1.png'),
  (2, 'Société de Livraison 2', 'contact@societe2.com', '+33987654321', '5 Avenue Victor Hugo, 69000 Lyon', 'Active', 'logo_entreprise2.jpg'),
  (3, 'Société de Logistique 3', 'contact@societe3.com', '+33741852963', '3 Rue du Commerce, 33000 Bordeaux', 'Active', 'logo_entreprise3.gif'),
  (4, 'Société de Services 4', 'contact@societe4.com', '+33654123789', '2 Avenue de la République, 69000 Lyon', 'Active', 'logo_entreprise4.png'),
  (5, 'Société de Commerce 5', 'contact@societe5.com', '+33789456123', '1 Rue du Progrès, 59000 Lille', 'Active', 'logo_entreprise5.jpg');
INSERT INTO Parc (id_parc, corporate_name, phone, address, mail, logo, is_delete, entreprise_id) VALUES
  (1, 'Entreprise A', '+33123456789', '1 Rue des Fleurs, 75000 Paris', 'entrepriseA@example.com', 'logo_parc_a.png', false, 1),
  (2, 'Entreprise B', '+33987654321', '5 Avenue Victor Hugo, 69000 Lyon', 'entrepriseB@example.com', 'logo_parc_b.jpg', false, 2),
  (3, 'Entreprise C', '+33741852963', '3 Rue du Commerce, 33000 Bordeaux', 'entrepriseC@example.com', 'logo_parc_c.gif', false, 3),
  (4, 'Entreprise D', '+33654123789', '2 Avenue de la République, 69000 Lyon', 'entrepriseD@example.com', 'logo_parc_d.png', false, 4),
  (5, 'Entreprise E', '+33789456123', '1 Rue du Progrès, 59000 Lille', 'entrepriseE@example.com', 'logo_parc_e.jpg', false, 5);

INSERT INTO Car (id, brand, mat, fuel, circulation_date, power, model, nbr_place, description, couleur, is_delete, photo_voiture, parc_id) VALUES
  (1, 'Renault', 'XYZ123', 'Diesel', '2020-01-01', '110', 'Clio', 5, 'Véhicule fiable et économique', 'Bleu', false, 'car_photo.jpg', 1),
  (2, 'Peugeot', 'ABC456', 'Gasoline', '2022-05-15', '130', '208', 4, 'Citadine dynamique et moderne', 'Rouge', false, 'car_photo2.png', 1),
  (3, 'Citroën', 'DEF789', 'Hybrid', '2023-07-01', '180', 'C5 Aircross', 5, 'SUV spacieux et confortable', 'Gris', false, 'car_photo3.jpg', 1),
  (4, 'Volkswagen', 'GHI123', 'Diesel', '2021-02-10', '150', 'Golf', 5, 'Compacte performante et polyvalente', 'Noir', false, 'car_photo4.png', 2),
  (5, 'Ford', 'JKL456', 'Gasoline', '2020-08-25', '120', 'Fiesta', 5, 'Citadine économique et pratique', 'Blanc', false, 'car_photo5.jpg', 2);
INSERT INTO Driver (id, driving_licence, driving_date, driving_photo, name, mail, phone, address, info, state, login, password, parc_id) VALUES
  (1, 'ABCD1234', '2018-10-26', 'driver_photo.jpg', 'John Doe', 'john.doe@example.com', '+33123456789', '12 Rue des Fleurs, 75000 Paris', 'Conducteur expérimenté et responsable', 'Active', 'johndoe', 'password123', 1),
  (2, 'EFGH5678', '2021-03-12', 'driver_photo2.png', 'Jane Smith', 'jane.smith@example.com', '+33987654321', '5 Avenue Victor Hugo, 69000 Lyon', 'Conductrice motivée et sérieuse', 'Active', 'janesmith', 'password456', 1),
  (3, 'IJKL9012', '2019-06-15', 'driver_photo3.jpg', 'Pierre Dupont', 'pierre.dupont@example.com', '+33741852963', '3 Rue du Commerce, 33000 Bordeaux', 'Conducteur ponctuel et rigoureux', 'Active', 'pierredupont', 'password789', 2),
  (4, 'MNOP3456', '2022-09-20', 'driver_photo4.png', 'Marie Durand', 'marie.durand@example.com', '+33654123789', '2 Avenue de la République, 69000 Lyon', 'Conductrice souriante et agréable', 'Active', 'mariedurand', 'password456', 2),
  (5, 'QRST7890', '2020-12-25', 'driver_photo5.jpg', 'Paul Martin', 'paul.martin@example.com', '+33789456123', '1 Rue du Progrès, 59000 Lille', 'Conducteur fiable et discret', 'Active', 'paulmartin', 'password123', 3);
  INSERT INTO Admin (id, name, mail, phone, address, info, state, department_id, role, login, password, entreprise_id) VALUES
    (1, 'Pierre Dupont', 'pierre.dupont@example.com', '+33789456123', '1 Rue du Commerce, 75000 Paris', 'Administrateur général', 'Active', 1, 'Administrateur', 'pierredupont', 'password789', 1),
    (2, 'Marie Durand', 'marie.durand@example.com', '+33654123789', '2 Avenue de la République, 69000 Lyon', 'Responsable RH', 'Active', 2, 'RH', 'mariedurand', 'password456', 1);
    INSERT INTO Mission (id, driver_dto_id, car_dto_id, description, date_debut, date_fin, status, created_at, start_km, end_km, start_state, end_state, driver_license, is_delete, parc_id) VALUES
      (1, 1, 1, 'Mission de livraison de colis', '2023-11-14', '2023-11-15', 'En cours', '2023-11-14 10:00:00', 100, 120, 'Bon état', 'Bon état', 'ABCD1234', false, 1),
      (2, 2, 2, 'Intervention technique chez un client', '2023-11-16', '2023-11-16', 'Terminée', '2023-11-16 09:00:00', 20, 40, 'Bon état', 'Léger accrochage', 'EFGH5678', false, 1);
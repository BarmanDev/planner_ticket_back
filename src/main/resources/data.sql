
INSERT INTO events (title, date, time, capacity, description, location, image) VALUES ('Camela', '2024-02-10', '18:00:00', 100, 'Concierto', 'Gijon', '/images/concert1.jpg');
INSERT INTO events (title, date, time, capacity, description, location, image) VALUES ('La Oreja de Van Gogh', '2024-05-30', '20:00:00', 2000, 'Concierto', 'Gijon', '/images/concert2.jpg');
INSERT INTO events (title, date, time, capacity, description, location, image) VALUES ('Pimpinela', '2024-02-10', '18:00:00', 100, 'Concierto', 'Gijon', '/images/concert3.jpg');
INSERT INTO events (title, date, time, capacity, description, location, image) VALUES ('Nebulossa', '2024-05-30', '20:00:00', 2000, 'Concierto', 'Oviedo', '/images/concert4.jpg');
INSERT INTO events (title, date, time, capacity, description, location, image) VALUES ('Mago de Oz', '2024-02-10', '18:00:00', 100, 'Concierto', 'Gijon', '/images/concert5.jpg');
INSERT INTO events (title, date, time, capacity, description, location, image) VALUES ('Calamaro', '2024-05-30', '20:00:00', 2000, 'Concierto', 'Oviedo', '/images/concert6.jpg');
INSERT INTO events (title, date, time, capacity, description, location, image) VALUES ('Joaquin Savina', '2024-05-30', '20:00:00', 2000, 'Concierto', 'Oviedo', '/images/concert6.jpg');

-- INSERT INTO events (title, date, time, capacity, description, image) VALUES
--   ('Evento 1', '2024-02-10', '18:00:00', 100, 'Descripción del evento 1', '/images/evento1.jpg');


-- INSERT INTO events (title, date, time, capacity, description, image)
-- VALUES ('Nebulossa', '2024-05-30', '20:00:00', 2000, 'lololooooooooooo piiiii tamagochi a dormir', '/images/evento1.jpg');

-- password admin HolaPepe24
INSERT INTO users (id_user, password, username, email) VALUES (default, "$2a$12$Hb02zayAURjDGYhnQGf94.etYJu1QjDB2qNPxmhVjf1m4hhZOqJHy", "admin", "admin@pepe.com");
INSERT INTO users (id_user, password, username, email) VALUES (default, "$2a$12$Hb02zayAURjDGYhnQGf94.etYJu1QjDB2qNPxmhVjf1m4hhZOqJHy", "pepe", "pepe@pepe.com");
INSERT INTO roles (id_role, name) VALUES (default, "ROLE_ADMIN");
INSERT INTO roles (id_role, name) VALUES (default, "ROLE_USER");
INSERT INTO roles_users (role_id, user_id) VALUES (1,1);
INSERT INTO roles_users (role_id, user_id) VALUES (2,2);

INSERT INTO list_us ( list_us, user_id, title, date, time, capacity, description, location, image) VALUES (default, default, 'Joaquin Savina', '2024-05-30', '20:00:00', 2000, 'Concierto', 'Oviedo', '/images/concert6.jpg');
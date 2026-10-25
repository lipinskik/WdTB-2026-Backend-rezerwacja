-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp),
    ('113362@student.merito.pl',   'Student 1',  'USER',    current_timestamp),
    ('81462@student.merito.pl',    'Student 2',  'USER',    current_timestamp),
    ('112943@student.merito.pl',   'Student 3',  'USER',    current_timestamp);
-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);
-- ===== LAB 02 · room =====
insert into room (name, room_type, capacity, hourly_price, active, street, city, postal_code) values
    ('Sala Diamentowa', 'CONFERENCE',     12, 120.00, true,  'Rynek 15',           'Wrocław', '50-101'),
    ('Biuro 101',       'PRIVATE_OFFICE',  4,  70.00, true,  'Plac Grunwaldzki 10', 'Wrocław', '50-384'),
    ('Open Space Desk', 'OPEN_SPACE',      1,  25.00, false, 'Krasińskiego 1',      'Wrocław', '50-449');

-- ===== LAB 02 · booking =====
insert into booking (room_name, start_time, end_time, total_price, confirmed) values
    ('Sala Diamentowa', '2026-11-01 10:00:00', '2026-11-01 14:00:00', 480.00, true),
    ('Biuro 101',       '2026-11-02 09:00:00', '2026-11-02 17:00:00', 560.00, true),
    ('Open Space Desk', '2026-11-03 12:00:00', '2026-11-03 15:00:00', 75.00,  false);

-- ===== LAB 02 · client =====
insert into client (full_name, email, phone, company_name, registered_on) values
    ('Jan Kowalski',  'jan.kowalski@example.com', '600100200', 'Tech Solutions', '2026-10-01'),
    ('Anna Nowak',    'anna.nowak@startup.io',    '501202303', null,             '2026-10-15'),
    ('Piotr Zielony', 'piotr@freelance.pl',       null,        'Piotr Dev',      '2026-10-20');
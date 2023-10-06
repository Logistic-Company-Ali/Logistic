CREATE TABLE clients
(
    id bigserial primary key,
    address varchar(255),
    email varchar(30),
    fio_ruk varchar(50),
    full_name varchar(50),
    inn varchar(15),
    kpp varchar(15),
    phone varchar(50),
    short_name varchar(50)
);
INSERT INTO clients (address, email, fio_ruk, full_name, inn, kpp, phone, short_name) VALUES
        ('Cherkessk1', 'email1.@email.ru', 'FIO_RUK_CLIENT1', 'OOO ORG_CLIENT1 FULL', '090911125531', '0901002012', '+79991112231', 'OOO ORG_CLIENT1 SHOT'),
        ('Cherkessk2', 'email2.@email.ru', 'FIO_RUK_CLIENT2', 'OOO ORG_CLIENT2 FULL', '090911125532', '0901002012', '+79991112232', 'OOO ORG_CLIENT2 SHOT'),
        ('Cherkessk3', 'email3.@email.ru', 'FIO_RUK_CLIENT3', 'OOO ORG_CLIENT3 FULL', '090911125533', '0901002012', '+79991112233', 'OOO ORG_CLIENT3 SHOT'),
        ('Cherkessk4', 'email4.@email.ru', 'FIO_RUK_CLIENT4', 'OOO ORG_CLIENT4 FULL', '090911125534', '0901002012', '+79991112234', 'OOO ORG_CLIENT4 SHOT');

CREATE TABLE transport_company
(
    id bigserial primary key,
    address varchar(50),
    email varchar(50),
    fio_ruk varchar(50),
    full_name varchar(50),
    inn varchar(50),
    kpp varchar(50),
    phone varchar(50),
    short_name varchar(50)
);
INSERT INTO transport_company (address, email, fio_ruk, full_name, inn, kpp, phone, short_name) VALUES
             ('Cherkessk', 'emailTcompany@email.tu', 'FIO_RUK_TCOMPANY', 'TCOMPANY FULL', '09102151244', '090101001', '+79922214555', 'TCOMPANY SHOT');

CREATE TABLE truck_types
(
    id bigserial primary key,
    tariff_by_hour integer,
    tariff_by_km integer,
    type varchar(50)
);
INSERT INTO truck_types (tariff_by_hour, tariff_by_km, type) VALUES
                        (1000, 100, 'Фура'),
                        (500, 50, 'Газель'),
                        (1000, 100, 'Микроавтобус');

CREATE TABLE trucks
(
    id bigserial primary key,
    height integer,
    length integer,
    load_capacity integer,
    model varchar(50),
    number varchar(50),
    width integer,
    transport_company_id bigint REFERENCES transport_company (id),
    truck_types_id bigint REFERENCES truck_types (id)
);
INSERT INTO trucks (height, length, load_capacity, model, number, width, transport_company_id, truck_types_id) VALUES
                    (2, 5, 5, 'Газель НЕКСТ', 'В009АН09', 2, 1, 2),
                    (2, 4, 3, 'Мерседес', 'В001АН09', 2, 1, 3),
                    (3, 10, 25, 'ВОЛЬВО', 'В119АН09', 2, 1, 1);

CREATE TABLE drivers
(
    id bigserial primary key,
    lastname varchar(50),
    name varchar(50),
    patronymic varchar(50),
    truck_id bigint REFERENCES trucks (id)
);
INSERT INTO drivers (lastname, name, patronymic, truck_id) VALUES
                    ('Ivanov', 'Ivan', 'Ivanovich', 1),
                    ('Petrov', 'Petr', 'Petrovich', 2),
                    ('Nikolaev', 'Nikolai', 'Nikolaevich', 3);

CREATE TABLE orders
(
    id bigserial primary key,
    address_loading varchar(50),
    address_unloading varchar(50),
    cargo varchar(50),
    cargo_volume integer,
    cargo_weight integer,
    distance integer,
    note varchar(50),
    status varchar(50),
    tariff_type integer,
    total_time integer,
    client_id bigint REFERENCES clients (id),
    truck_id bigint REFERENCES trucks (id)
);
INSERT INTO orders (address_loading, address_unloading, cargo, cargo_volume, cargo_weight, distance, note, status, tariff_type, total_time, client_id, truck_id) VALUES
                    ('Address_Loading1', 'Address_unloading1', 'cargo1', 5, 6, 300, 'Perevozka gruza1', 'Загрузка', 1, 8, 1, 3),
                    ('Address_Loading2', 'Address_unloading2', 'cargo2', 10, 6, 500, 'Perevozka gruza2', 'В ПУТИ', 2, 10, 2, 2),
                    ('Address_Loading3', 'Address_unloading3', 'cargo3', 50, 6, 200, 'Perevozka gruza1', 'РАЗГРУЗКА', 1, 3, 3, 3),
                    ('Address_Loading4', 'Address_unloading4', 'cargo4', 3, 6, 100, 'Perevozka gruza1', 'ЗЫКРЫТ', 2, 2, 4, 1);

CREATE TABLE roles
(
    id bigserial primary key,
    role varchar(50)
);
INSERT INTO roles (role) VALUES
                ('ROLE_ADMIN'),
                ('ROLE_OPER'),
                ('ROLE_USER');


CREATE TABLE users
(
    id bigserial primary key,
    lastname varchar(50),
    username varchar(50),
    name varchar(50),
    password varchar(80),
    patronymic varchar(50),
    email varchar(50)
);
INSERT INTO users (lastname, username, name, password, patronymic, email) VALUES
                   ('FIO_ADMIN', 'admin', 'IMIA_ADMIN', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i', 'OTCHESTVO_ADMIN', 'admin@mail'),
                   ('FIO_OPER', 'oper', 'IMIA_OPER', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i', 'OTCHESTVO_OPER', 'oper@mail');

CREATE TABLE users_roles
(
    user_id    bigint not null references users (id),
    role_id    bigint not null references roles (id),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp,
    primary key (user_id, role_id)
);
INSERT INTO users_roles (user_id, role_id)
VALUES (1, 1),
       (2, 2);
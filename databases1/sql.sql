/* connect to the s1232 db */
use s1232
go
-- comment here
-- creating a db

-- ex 1a
create table DOM (
id_domu numeric(5) primary key,
miasto varchar(30) not null ,
ulica varchar(50),
metraz numeric(4,1),
cena_proponowana numeric(9,2)
);

-- ex 1b
create table KLIENT (
id_klienta numeric(3) primary key,
imie varchar(15) not null,
nazwisko varchar(15) not null,
miasto varchar(30) not null,
ulica varchar(50) not null
);

-- ex 1c
create table TRANSAKCJE (
id_transakcji numeric(5) identity(1,1) primary key,
id_domu numeric(5) foreign key (id_domu) references dom(id_domu),
id_klienta numeric(3) foreign key (id_klienta) references klient(id_klienta),
cena_uzyskana numeric(9,2) not null,
data_transakcji date default getdate() -- 'RRRR-MM-DD'
);


-- ex 2a
insert into dom values
(1, 'Gdańsk', 'Grunwaldzka 100', 52.5,350000),
(2, 'Gdynia', 'Morska 15D/5', 32.5, 290000),
(3, 'Sopot', 'Armii Krajowej 1', 28.5, 290000),
(4, 'Warszawa', 'Aleje Jerozolimskie 300', 105.5, 290000),
(5, 'Kraków', 'Wawelska 15', 178.5, 1399999.99)

-- ex 2b
insert into klient values
(1, 'Adam', 'Mickiewicz', 'Gdańsk', 'Polna 2'),
(2, 'Stanisław', 'Wrycza', 'Sopot', 'Uniwersytecka 1'),
(3, 'Dariusz', 'Kralewski', 'Gdańsk', 'Marszałkowska 144'),
(4, 'Dorota', 'Jendza', 'Pszczółki', 'Miodowa 5'),
(5, 'Piotr', 'Radzikowski', 'Warszawa', 'Zielona 412')

-- ex 2c
insert into transakcje values
(1, 1, 330000, '2019-08-10'),
(2, 2, 270000, '2019-09-11'),
(3, 3, 450000, '2019-10-12')

-- ex 3
select * from dom;

-- ex 4
select imie, nazwisko, miasto from klient order by miasto;

-- ex 5
select ulica, miasto, metraz from dom order by metraz desc;

-- ex 6
select * from dom where metraz<200;

-- ex 7
-- select

-- ex 8
-- select

-- ex 9
select * from klient where miasto='Gdańsk';

-- ex 10
select cena_proponowana from dom where miasto='Gdańsk';

-- ex 11
select cena_proponowana from DOM where ulica like 'Morska%' or ulica like 'Wawelska%';

-- ex 12
select cena_proponowana from DOM where miasto='Gdańsk' or miasto='Sopot' order by cena_proponowana desc;

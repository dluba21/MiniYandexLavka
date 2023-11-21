-- -- CREATE TYPE
-- DROP TYPE IF EXISTS genre;
-- CREATE TYPE genre AS ENUM (
--     'ADVENTURE',
--     'HORROR',
--     'COMEDY',
--     'ACTION',
--     'SPORTS'
--     );
--
-- -- CREATE TABLE
-- DROP TABLE IF EXISTS movies;
-- CREATE TABLE movies (
--                         id SERIAL PRIMARY KEY,
--                         title VARCHAR NOT NULL,
--                         release_year SMALLINT,
--                         genre genre,
--                         price NUMERIC(4, 2)
-- );
--
--
-- INSERT INTO movies(id, title, release_year, genre, price)
-- VALUES
--     (1, 'The Shaw shank Redemption', 1994, 'HORROR', 15.99),
--     (2, 'Ant Man', 2019, 'ADVENTURE', 15.00),
--     (3, 'Fallen', 1996, 'HORROR', 23.99),
--     (4, 'The barbershop', 2006, 'COMEDY', 6.50),
--     (5, 'The last dance', 2021, 'SPORTS', 55.99),
--     (6, 'Peter Pan', 2004, 'ADVENTURE', 15.99),
--     (7, 'Fast & Furious 7', 2018, 'ACTION', 36.00),
--     (8, 'Harry Potter', 2000, 'ACTION', 26.50),
--     (9, 'Jungle book', 2004, 'ADVENTURE', 25.00);
-- DO $$
--     begin
--         raise notice 'oooooooookaaaaaay done!';
--     end;
-- $$;


-- CREATE TABLE DISTRICTS (
--     ID INTEGER PRIMARY KEY,
--     NAME VARCHAR(32)
-- );
--
-- CREATE TABLE MOVEMENT_TYPE (
--    ID INTEGER PRIMARY KEY,
--    DESCRIPTION VARCHAR(32)
-- );


\c AndrewDB


CREATE TABLE COURIERS (
--     DISTRICT_ID INTEGER REFERENCES DISTRICTS(ID),
--     MOVEMENT_TYPE_ID INTEGER REFERENCES MOVEMENT_TYPE(ID),
    ID INTEGER PRIMARY KEY,
    DISTRICT VARCHAR(20),
    MOVEMENT_TYPE VARCHAR(20),
    START_WORK_TIME TIME,
    END_WORK_TIME TIME
);

insert into COURIERS
values
(1, 'TAGANSKIY', 'CAR', '09:00:00', '17:00:00'),
(2, 'BASSMANNIY', 'FOOT', '18:00:00', '01:00:00'),
(3, 'KRASNOSELSKIY', 'BIKE', '14:00:00', '21:00:00'),
(4, 'TAGANSKIY', 'CAR', '14:00:00', '21:00:00');


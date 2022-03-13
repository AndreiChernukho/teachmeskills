CREATE TABLE IF NOT EXISTS people
(
    id                      BIGSERIAL    NOT NULL PRIMARY KEY,
    name                    VARCHAR(255)  NOT NULL,
    sex	                    VARCHAR(255)  NOT NULL,
    birthday                date         NOT NULL
    );

CREATE TABLE IF NOT EXISTS hobby_type
(
    id                      BIGSERIAL    NOT NULL PRIMARY KEY,
    hobby_type              VARCHAR(255)  NOT NULL
    );

CREATE TABLE IF NOT EXISTS hobby
(
    id                      BIGSERIAL    NOT NULL PRIMARY KEY,
    hobby_name              VARCHAR(255)  NOT NULL,
    hobby_type_id           BIGSERIAL    NOT NULL,
    foreign key (hobby_type_id) references hobby_type(id)
    );

CREATE TABLE IF NOT EXISTS people_hobby
(
    id                      BIGSERIAL    NOT NULL PRIMARY KEY,
    people_id               BIGSERIAL    NOT NULL,
    hobby_id                BIGSERIAL    NOT NULL,
    foreign key (people_id ) references people(id),
    foreign key (hobby_id) references hobby(id)
    );
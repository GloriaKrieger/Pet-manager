--liquibase formatted sql

--changeset gloria:1
create table pets (
    id int not null AUTO_INCREMENT,
    pet_Code varchar(255),
    name varchar(255),
    type varchar(255),
    color varchar(255),
    country varchar(255)
);

insert into pets(pet_Code, name, type, color, country) values('202211151535','Mustikas','Cat','Black','Estonia');
insert into pets(pet_Code, name, type, color, country) values('202211151536','Roy','Dog','Brown','Latvia');
insert into pets(pet_Code, name, type, color, country) values('202211151537','Charles','Horse','White','Norway');
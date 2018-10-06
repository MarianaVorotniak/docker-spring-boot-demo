--liquibase formatted sql


--changeset mariana:create
create table students(
    id int,
    name varchar(50)
);
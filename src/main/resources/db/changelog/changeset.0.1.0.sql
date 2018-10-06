--liquibase formatted sql


--changeset mariana:insert
insert into students (id, name) values (4, "user");
#!/usr/bin/env bash

docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=MyDB1 -e MYSQL_USER=user -e MYSQL_PASSWORD=password -d mysql:5.6
docker build . -t docker-spring-boot
docker run -p 8085:8085 --name docker-spring-boot --link mysql-server:mysql -d docker-spring-boot

echo Ready!
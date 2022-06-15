![Logo CollectiCats](https://raw.githubusercontent.com/jeffrey-fontys/s3-portfolio/main/images/CollectiCats_logo_trans.png)

[![Main](https://github.com/jeffrey-fontys/collecticats/actions/workflows/maven.yml/badge.svg)](https://github.com/jeffrey-fontys/collecticats/actions/workflows/maven.yml)
[![Nightly](https://github.com/jeffrey-fontys/collecticats/actions/workflows/nightly.yml/badge.svg)](https://github.com/jeffrey-fontys/collecticats/actions/workflows/nightly.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=collecticats_api-gateway&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=collecticats_api-gateway)  
[![Alpine Linux](https://img.shields.io/badge/Alpine_Linux-%230D597F.svg?style=for-the-badge&logo=alpine-linux&logoColor=white)](https://www.alpinelinux.org/)
[![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://maven.apache.org/)
[![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)
[![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)](https://java.com/)
[![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)](https://www.mongodb.com/)
[![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)](https://www.postman.com/)
[![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/)
[![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)](https://swagger.io/)

CollectiCats is a web based collecting/trading game where players can collect virtual cats and trade them with each other. These cats have unique properties as a result of their genes. Try to collect as many special and rare cats as you can!

This repository contains the back-end code for the CollectiCats application. 

<!-- omit in toc -->
## Table of Contents
- [Running the CollectiCats back end](#running-the-collecticats-back-end)
  - [With Docker Compose](#with-docker-compose)
    - [Prerequisites](#prerequisites)
    - [Setting port numbers](#setting-port-numbers)
    - [Starting up the services](#starting-up-the-services)
    - [Shutting the services down](#shutting-the-services-down)
- [API Documentation](#api-documentation)

## Running the CollectiCats back end

### With Docker Compose

Use Docker Compose to quickly set up the CollectiCats back end on your local machine or self-hosted server.  
[Read more about Docker Compose here.](https://docs.docker.com/compose/)

#### Prerequisites

In order to run the CollectiCats back end with this route, please make sure that up-to-date versions of the following application(s) are installed on your system:

- Docker Desktop  
*or*
- Docker Engine
- Docker CLI
- Docker Compose

#### Setting port numbers

In order for the software to run correctly on your system, it might be necessary to specify which ports the application is allowed use. The back end contains two services that require an available port on your system to function: the API-gateway and the Eureka discovery server. Included in the project root directory is a `.env.example` file. To set the ports, remove the `.example` part of the filename on your system and enter your desired port numbers into the file, as shown in the example with the default values below. Remember to save the file when you are done.

```
GATEWAY_PORT=8080
EUREKA_PORT=8761
```

#### Starting up the services

The `docker-compose.yml` file located at the root of this repository can be used to quickly and easily start up the back end of the CollectiCats application.

Simply navigate to the root directory of the project (which contains the docker-compose file) with your terminal emulator and run the following command:

```
docker-compose up -d
```

Docker Compose should now start pulling the latest CollectiCats images from Docker Hub and afterwards start them up.

It might take a short while before the services have discovered each other. If you see errors immediately after starting the containers, please be patient and try again.

#### Shutting the services down

When you are finished using the CollectiCats back end application and wish to shut down the containers, run either of the following commands in a terminal emulator from the project root directory.

To shut down the containers temporarily:

```
docker-compose stop
```

To shut down and remove the containers:

```
docker-compose down
```

## API Documentation

The CollectiCats back end functions solely as an API server and serves only this functionality and its corresponding documentation. The API endpoints and documentation can be reached through the default port 8080 or the port specified for the API-gateway in your [environment file](#setting-port-numbers). The documentation is served with [Swagger UI](https://swagger.io/tools/swagger-ui/) and can be accessed at the following address:

```
http://{host}:{gateway_port}/swagger-ui.html
```

All API endpoints can be accessed through [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) requests as detailed in the documentation. Responses are formatted in JSON+[HAL](https://en.wikipedia.org/wiki/Hypertext_Application_Language).

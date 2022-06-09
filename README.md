# CollectiCats

![Logo CollectiCats](https://raw.githubusercontent.com/jeffrey-fontys/s3-portfolio/main/images/CollectiCats_logo_trans.png)

[![Main](https://github.com/jeffrey-fontys/collecticats/actions/workflows/maven.yml/badge.svg)](https://github.com/jeffrey-fontys/collecticats/actions/workflows/maven.yml)
[![Nightly](https://github.com/jeffrey-fontys/collecticats/actions/workflows/nightly.yml/badge.svg)](https://github.com/jeffrey-fontys/collecticats/actions/workflows/nightly.yml)

CollectiCats is a web based collecting/trading game where players can collect virtual cats and trade them with each other. These cats have unique properties as a result of their genes. Try to collect as many special and rare cats as you can!

## Running the CollectiCats back end

### With Docker Compose

The docker-compose file located at the root of this repository can be used to set up the back end of the CollectiCats application quickly, provided Docker Compose is installed on your machine. Simply navigate to the folder containing the docker-compose file with your terminal emulator and run the following command:

```
docker-compose up -d
```

Once the services are all up and running, the endpoints of the API can be reached through port 8080.

[Read more about Docker Compose here.](https://docs.docker.com/compose/)

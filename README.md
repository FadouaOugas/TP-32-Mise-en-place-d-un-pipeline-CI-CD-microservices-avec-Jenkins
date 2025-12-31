# Architecture Microservices - Gestion de Flotte et Clients

Projet refactorisé et personnalisé - Architecture microservices complète avec Service Registry, Gateway API, et microservices métier.

## Technologies

- Spring Boot 3.x
- Spring Cloud
- Eureka Server (Service Discovery)
- Spring Cloud Gateway (API Gateway)
- Docker & Docker Compose
- CI/CD Pipeline

## Architecture

### Infrastructure
- **registry-server** - Eureka Service Registry (Port 8761)
- **routing-gateway** - API Gateway (Port 8888)

### Microservices
- **client-management-core** - Gestion des clients (Port 8081)
- **automobile-fleet-core** - Gestion de la flotte automobile (Port 8082)

## Démarrage

### Option 1 : Docker Compose

```bash
cd infrastructure
docker-compose up -d
```

### Option 2 : Manuel

#### 1. Démarrer Eureka Registry

```bash
cd registry-server
mvn spring-boot:run
```

Accès : `http://localhost:8761`

#### 2. Démarrer les Microservices

```bash
cd client-management-core
mvn spring-boot:run
```

```bash
cd automobile-fleet-core
mvn spring-boot:run
```

#### 3. Démarrer la Gateway

```bash
cd routing-gateway
mvn spring-boot:run
```

Accès : `http://localhost:8888`

## Endpoints via Gateway

### Gestion Clients

- `GET /clients` - Liste des clients
- `GET /clients/{id}` - Détails d'un client
- `POST /clients` - Créer un client
- `PUT /clients/{id}` - Mettre à jour un client
- `DELETE /clients/{id}` - Supprimer un client

### Gestion Automobiles

- `GET /automobiles` - Liste de la flotte
- `GET /automobiles/{id}` - Détails d'une automobile
- `POST /automobiles` - Ajouter une automobile
- `PUT /automobiles/{id}` - Mettre à jour une automobile
- `DELETE /automobiles/{id}` - Retirer une automobile

## Découverte de Services

Tous les microservices s'enregistrent automatiquement auprès d'Eureka au démarrage.

Accédez au dashboard Eureka : `http://localhost:8761`

## Pipeline CI/CD

Le pipeline inclut :

1. **Build** - Compilation Maven
2. **Test** - Tests unitaires et d'intégration
3. **Package** - Création d'images Docker
4. **Deploy** - Déploiement automatique

Configuration : `.gitlab-ci.yml` ou `Jenkinsfile`

## Auteur

**Fadoua Ougas**

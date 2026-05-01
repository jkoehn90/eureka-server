# Eureka Server — Microservices System

Part of the **Microservices System** — a distributed backend built with Java, Spring Boot, and Spring Cloud.

## Overview

The Eureka Server is the **service registry and discovery** component of the Microservices System. All other services register themselves with Eureka on startup, and the API Gateway uses Eureka to dynamically resolve service locations without hardcoded URLs.

## Tech Stack

| Technology | Purpose |
|---|---|
| Java 17 | Core language |
| Spring Boot 3.5.x | Application framework |
| Spring Cloud Netflix Eureka | Service registry |

## Architecture Role

```
                    ┌─────────────────┐
                    │  Eureka Server  │  ← You are here
                    │  (port 8761)    │
                    └────────┬────────┘
                             │ registers/discovers
          ┌──────────────────┼──────────────────┐
          ▼                  ▼                  ▼
    [User Service]   [Product Service]   [Order Service]
          │                  │                  │
          └──────────────────┴──────────────────┘
                             │
                      [API Gateway]
```

## Configuration

| Property | Value |
|---|---|
| Port | `8761` |
| Register with Eureka | `false` (server doesn't register itself) |
| Fetch registry | `false` (server doesn't fetch from itself) |

## Getting Started

### Prerequisites
- Java 17+
- Maven

### Running Locally

```bash
mvn spring-boot:run
```

### Verify
Open your browser and navigate to:
```
http://localhost:8761
```
You should see the Eureka dashboard showing all registered services.

## Related Services

| Service | Port | Repo |
|---|---|---|
| API Gateway | 8080 | [api-gateway](../api-gateway) |
| User Service | 8081 | [user-service](../user-service) |
| Product Service | 8082 | [product-service](../product-service) |
| Order Service | 8083 | [order-service](../order-service) |
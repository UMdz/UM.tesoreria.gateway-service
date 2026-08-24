# Changelog

Todos los cambios notables en este proyecto serán documentados en este archivo.

El formato está basado en [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
y este proyecto adhiere a [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.4.0] - 2026-08-24

### Added
- Added new service route for 'tesoreria-aura-service' (`/api/tesoreria/aura/**`)
- Added CI/CD workflows for develop and staging environments with automated deployment

### Changed
- Renamed route ID from 'mercadopago-service' to 'tesoreria-mercadopago-service' for consistency

### Technical
- Java 25, Spring Boot 4.1.0, Spring Cloud 2025.1.2

## [0.3.0] - 2026-06-15

### Added
- Added new service routes for 'tesoreria-guarani-service' (`/api/tesoreria/guarani/**`) and 'tesoreria-umhub-service' (`/api/tesoreria/umhub/**`)
- Extended CORS configuration to support `192.168.1.*` network

### Changed
- Updated Spring Boot version to 4.1.0 (from 4.0.7)
- Updated Spring Cloud version to 2025.1.2 (from 2025.1.1)
- Updated architecture and deployment diagrams with new services

### Technical
- Java 25, Spring Boot 4.1.0, Spring Cloud 2025.1.2

## [0.2.0] - 2026-05-07

### Added
- Added CORS configuration for local development and internal networks (CorsConfig.java)
- Added new service route for 'haberes-etec-service' (`/api/haberes/etec/**`)

### Changed
- Updated Spring Boot version to 4.0.6 (from 4.0.5)
- Updated architecture and deployment diagrams to reflect current state (removed Config-Server, updated service list)

### Technical
- Java 25, Spring Cloud 2025.1.0

## [0.1.2] - 2026-04-04

### Changed
- Updated Spring Boot version to 4.0.5 (from 4.0.2)
- Updated GitHub Actions to latest versions (checkout@v6, setup-java@v5, cache@v5, deploy-pages@v5, docker actions@v4-v7)
- Updated Maven workflow Dockerfile configuration

### Technical
- Migrated from Eureka to Consul for service discovery (from previous release)
- Updated Java version to 25

## [0.1.1] - 2026-02-03

### Changed
- Updated Java version to 25 (from 24)
- Updated Spring Boot version to 4.0.2 (from 3.5.8)
- Updated Spring Cloud version to 2025.1.0 (from 2025.0.0)
- Enhanced CI/CD workflow with JDK 25 support
- Updated Dockerfile to use Eclipse Temurin 25 JRE

## [0.1.0] - 2025-07-20

### Added
- Added new service route for 'haberes-novedades-proxy'
- Added SonarCloud integration for code quality analysis
- Added comprehensive documentation with Mermaid diagrams
- Added multi-stage Docker build for optimized images

### Changed
- Updated Spring Boot version to 3.5.3
- Enhanced CI/CD workflow with improved GitHub Actions
- Improved Docker security with non-root user and minimal image
- Updated documentation generation process

### Security
- Implemented security best practices in Docker container
- Added container vulnerability scanning in CI/CD

## [0.0.1-SNAPSHOT] - 2025-07-19

### Added
- Configuración inicial del proyecto Spring Cloud Gateway
- Integración con Eureka Client para service discovery
- Implementación de Caffeine Cache
- Sistema de documentación automática con GitHub Pages y Wiki
- Configuración de CI/CD con GitHub Actions
- Soporte para Docker y Docker Compose
- Actuator endpoints para monitoreo
- Enrutamiento a múltiples servicios (haberes, tesoreria, mercadopago, afipws, chequera)
- Scripts de generación automática de documentación

### Changed
- Migración a Java 24
- Actualización a Spring Boot 3.5.0
- Actualización a Spring Cloud 2025.0.0
- Actualización de dependencias y configuración
- Mejoras en el pipeline de CI/CD
- Optimización del Dockerfile

### Removed
- Config Server (migración a Eureka)
- Dependencias obsoletas

### Technical
- Configuración de logging mejorada
- Actualización de versiones de Spring Boot y Spring Cloud
- Mejoras en la configuración de Eureka
- Optimización de la configuración de caché

---

**Nota:** Este changelog se basa únicamente en el historial de git verificable. Los commits incluyen:
- Migración a Java 24 (3 semanas atrás)
- Actualizaciones de documentación y dependencias (3-4 meses atrás)
- Implementación de sistema de documentación automática (4 meses atrás)
- Upgrade a Spring Boot 3.4.2 y agregado de Caffeine cache
- Actualizaciones de versiones de Spring Boot y Spring Cloud
- Configuración de Eureka y eliminación de config server
- Implementación de facturador
- Mejoras en pipeline
- Agregado de Actuator
- Configuración de Docker 
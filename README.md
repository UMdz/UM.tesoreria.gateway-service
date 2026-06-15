# UM.tesoreria.gateway-service

✒️ Autor: Daniel Quinteros

![Java](https://img.shields.io/badge/Java-25-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.0-brightgreen)
![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2025.1.2-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.9.x-red)
![License](https://img.shields.io/badge/License-MIT-blue)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=UM-services_UM.tesoreria.gateway-service&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=UM-services_UM.tesoreria.gateway-service)

## Estado del CI/CD

[![UM.tesoreria.gateway-service CI](https://github.com/UM-services/UM.tesoreria.gateway-service/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/UM-services/UM.tesoreria.gateway-service/actions/workflows/maven.yml)

Gateway Service para la arquitectura de microservicios de UM Tesorería. Este servicio actúa como punto de entrada único para todas las solicitudes a los microservicios, proporcionando enrutamiento dinámico, balanceo de carga y seguridad centralizada.

## Características Principales

- Enrutamiento dinámico de solicitudes a múltiples servicios
- Balanceo de carga con Consul Client
- Service discovery automático con Consul
- Control y monitoreo del tráfico
- Caché optimizado con Caffeine
- Configuración CORS para desarrollo local y redes internas
- Documentación automática con GitHub Pages y Wiki
- CI/CD con GitHub Actions

## Servicios Enrutados

El gateway enruta las siguientes rutas a sus respectivos servicios:

- `/api/haberes/core/**` → haberes-core-service
- `/api/haberes/etec/**` → haberes-etec-service
- `/api/haberes/report/**` → haberes-report-service
- `/api/haberes/novedades/proxy/**` → haberes-novedades-proxy
- `/api/tesoreria/core/**` → tesoreria-core-service
- `/api/tesoreria/report/**` → tesoreria-report-service
- `/api/tesoreria/facturador/**` → tesoreria-facturador-service
- `/api/tesoreria/sender/**` → tesoreria-sender-service
- `/api/tesoreria/mercadopago/**` → tesoreria-mercadopago-service
- `/api/tesoreria/guarani/**` → tesoreria-guarani-service
- `/api/tesoreria/umhub/**` → tesoreria-umhub-service
- `/api/chequera/backend/**` → tesoreria-chequera-backend
- `/api/afipws/**` → pyafipws-service

## Requisitos

- Java 25
- Maven 3.9.x o superior
- Spring Boot 4.1.0
- Spring Cloud 2025.1.2
- Docker (opcional, para contenedorización)

## Configuración

El servicio se configura a través del archivo `bootstrap.yml`. Las principales configuraciones incluyen:

- Puerto: 8080 (configurable via APP_PORT)
- Service discovery con Consul
- Rutas de servicios
- Configuración CORS para orígenes locales y redes internas
- Configuración de logging
- Endpoints de Actuator

## Documentación

- [Documentación Técnica](https://um-services.github.io/UM.tesoreria.gateway-service)
- [Wiki del Proyecto](https://github.com/UM-services/UM.tesoreria.gateway-service/wiki)

## Estado del Proyecto

- [Issues Activos](https://github.com/UM-services/UM.tesoreria.gateway-service/issues)
- [Milestones](https://github.com/UM-services/UM.tesoreria.gateway-service/milestones)
- [Historial de Cambios](CHANGELOG.md)

## Desarrollo

1. Clonar el repositorio:
```bash
git clone https://github.com/UM-services/UM.tesoreria.gateway-service.git
```

2. Instalar dependencias:
```bash
mvn install
```

3. Ejecutar el servicio:
```bash
mvn spring-boot:run
```

### Desarrollo con Docker

1. Construir la imagen:
```bash
docker build -t um-tesoreria-gateway .
```

2. Ejecutar el contenedor:
```bash
docker run -p 8080:8080 um-tesoreria-gateway
```

## Contribuir

1. Fork del repositorio
2. Crear una rama para la nueva funcionalidad (`git checkout -b feature/nueva-funcionalidad`)
3. Commit de los cambios (`git commit -am 'Agrega nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Crear un Pull Request

## Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

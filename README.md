# 1. Proyecto de Seguridad con Spring Security 6
Este proyecto es una guía completa para principiantes sobre cómo implementar Spring Security 6 con Spring Boot 3. A continuación, se detallan los principales conceptos y pasos abordados en el video.

## Descripción
Este proyecto tiene como objetivo enseñar a los desarrolladores cómo asegurar sus aplicaciones utilizando Spring Security 6. Se cubren temas desde la arquitectura básica hasta la implementación de autenticación y autorización con diferentes proveedores.

## Contenido
### Arquitectura de Spring Security
- **Cadena de filtros de seguridad**: Evaluación de solicitudes HTTP a través de una serie de filtros predeterminados y personalizados.
- **Delegating Filter Proxy**: Creación de filtros personalizados para validaciones específicas.

### Autenticación y Autorización
- **Authentication Manager**: Gestión de la autenticación de usuarios utilizando diferentes proveedores.
- **Proveedores de autenticación**: Autenticación con usuarios en bases de datos y otros métodos como OAuth2.

### Implementación
- **Password Encoder**: Codificación y validación de contraseñas utilizando algoritmos seguros.
- **User Details Service**: Conexión a bases de datos para la gestión de usuarios y roles.

### Ejemplos de Código
- Configuración de la conexión a la base de datos.
- Definición de endpoints seguros y públicos.
- Creación de usuarios y roles en memoria y en bases de datos.

# 2. Proyecto de Seguridad con Spring y JWT
Este proyecto demuestra cómo integrar Spring Security con JSON Web Tokens (JWT) para asegurar aplicaciones web. Sigue los pasos descritos a continuación para configurar y ejecutar el proyecto.

## Requisitos
- Conocimientos previos de Spring Security
- Familiaridad con el API Streams de Java

## Descripción
Este proyecto se basa en una guía completa de Spring Security y añade la funcionalidad de JWT para mejorar la seguridad. JWT permite identificar y autorizar usuarios de manera segura mediante tokens.

## Estructura del Proyecto
1. **Spring Security**: Configuración básica de seguridad.
2. **JWT**: Integración de JSON Web Tokens para autenticación y autorización.

## Pasos para la Implementación
1. **Configuración de Spring Security**:
    - Configurar el `AuthenticationManager` y el `SecurityFilterChain`.
    - Crear usuarios y roles en la base de datos.

2. **Integración de JWT**:
    - Añadir un filtro para validar los tokens JWT.
    - Generar y validar tokens utilizando la librería `java-jwt`.

# 3. Integración de OAuth2 con Google y GitHub en Spring Security
Este proyecto demuestra cómo integrar OAuth2 en una aplicación Spring Boot utilizando los servicios de autenticación de Google y GitHub.

## Descripción
El video explica cómo configurar y utilizar OAuth2 en una aplicación Spring Boot para autenticar usuarios a través de Google y GitHub. Se cubren los siguientes temas:

1. **Configuración inicial del proyecto**: Uso de Spring Initializr para crear un proyecto con las dependencias necesarias.
2. **Creación de controladores**: Implementación de controladores públicos y privados.
3. **Configuración de seguridad**: Definición de la cadena de filtros de seguridad y configuración de OAuth2.
4. **Autenticación con GitHub**: Registro de una aplicación en GitHub y obtención de credenciales.
5. **Autenticación con Google**: Registro de una aplicación en Google Console y obtención de credenciales.

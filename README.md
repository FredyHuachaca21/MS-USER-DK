# Nombre del Proyecto: "Microservicio Usuario"

# Descripción
Descripción breve del proyecto: Este proyecto es un microservicio desarrollado con Spring Boot que gestiona usuarios y se conecta a SQL Server en un contenedor Docker.

# Requisitos
- Java 21
- Maven 3.8.1
- Docker 20.10.8
- SQL Server 2019
- Spring Boot 3.2.2
- Spring Data JPA
- Spring Web
- Lombok

# Configuración y Despliegue
## Configuración
1. Clonar el repositorio de GitHub:
   ```bash
    git clone https://github.com/FredyHuachaca21/MS-USER-DK.git
    ```
2. Ingresar al directorio del proyecto:
    ```bash
     cd MS-USER-DK
     ```
3. Compilar el proyecto:
    ```bash
    mvn clean package -DskipTests
    ```  

## Construcción y Ejecución con Docker
1. Construir la Imagen Docker del Microservicio:
    ```bash
    docker build -t ms-user:1 .
    ```
2. Crear la Red de Docker:
    ```bash
    docker network create fredgar-network
    ```
3. Crear el Contenedor de SQL Server:
    ```bash
    docker run -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=Password123' -p 1433:1433 --name sql-server -d --network fredgar-network mcr.microsoft.com/mssql/server:latest
    ```
4. Crear el Contenedor del Microservicio:
    ```bash
    docker run -p 9090:9090 --name ms-user -d --network fredgar-network ms-user:1
    ```
   
## Uso
1. Endpoint de Usuarios:
   - Método: GET
   - URL del Microservicio: http://localhost:9090/users/all
   - Respuesta: Lista de Usuarios
   - Método: POST
   - URL del Microservicio: http://localhost:9090/users/save
   - Respuesta: Usuario Guardado
   - Método: PUT
   - URL del Microservicio: http://localhost:9090/users/update
   - Respuesta: Usuario Actualizado
   - Método: DELETE
   - URL del Microservicio: http://localhost:9090/users/delete/{id}
## Contacto
- website: [fredgar.com.pe](https://fredgar.com.pe)
   

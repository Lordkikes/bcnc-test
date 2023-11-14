# BCNC TEST

## Descripción
Esta aplicación Spring Boot proporciona un servicio REST para consultar precios de productos en una cadena de comercio electrónico.

## Instrucciones

### Construcción del Proyecto
1. Clona este repositorio.
2. Aseguraese de tener Docker y Docker Compose instalados.
3. Abre una terminal y navega al directorio del proyecto.
2. Ejecuta el siguiente comando para construir e iniciar la aplicación: 
```bash
docker compose up -d --build 
```

### Ejecución de Tests
1. Pruebas Unitarias: Ejecuta las pruebas unitarias desde tu entorno de desarrollo o mediante el siguiente comando:
```bash
./mvnw test
```
2. Pruebas de Integración: Ejecuta las pruebas de integración con el siguiente comando:
``` bash
./mvnw verify
```

### Uso del Servicio
- Acceder al servicio REST a través de la URL: `http://localhost:8080/prices/getPrice`
- Utiliza los parámetros de consulta: `fecha`, `productId`, y `brandId`.
- La respuesta es en formato JSON.

### Documentación de la API
La API está documentada con OpenAPI y Swagger. Puedes acceder a la documentación de la API a través de la siguiente URL después de iniciar la aplicación: `http://localhost:9292/swagger-ui.html`
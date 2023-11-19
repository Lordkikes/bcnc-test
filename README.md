# BCNC TEST 👨🏻‍💻

## Descripción 📃
<p style="text-align: justify;">
Esta aplicación Spring Boot proporciona un servicio REST para consultar precios de productos en una cadena de comercio electrónico.</p>
<p style="text-align: justify;">
Mi decisión de obtener la lista de precios en la aplicación y luego filtrarlos se debe a que puedo ofrecer una mayor flexibilidad en la lógica, facilitando cambios a futuro sin afectar a la base de datos. Además, por mantener la lógica de filtrado en la aplicación puedo seguir el principio de Separación de Responsabilidades (PRINCIPIOS SOLID), donde la base de datos se encarga exclusivamente de recuperar datos, y la aplicación se encarga de la lógica de negocio.

Este enfoque no solo optimiza la estructura y mantenimiento del código, sino que también promueve una arquitectura más modular y escalable.
</p>

## Instrucciones ✏️

### Construcción del Proyecto
1. Clona este repositorio.
2. Aseguraese de tener Docker y Docker Compose instalados.
3. Abre una terminal y navega al directorio del proyecto.
2. Ejecuta el siguiente comando para construir e iniciar la aplicación: 
```bash
docker compose up -d --build 
```

### Ejecución de Tests 🔍
1. Pruebas Unitarias: Ejecuta las pruebas unitarias desde tu entorno de desarrollo o mediante el siguiente comando:
```bash
./mvnw test
```
2. Pruebas de Integración: Ejecuta las pruebas de integración con el siguiente comando:
``` bash
./mvnw verify
```

### Uso del Servicio 🚀
- Acceder al servicio REST a través de la URL: `http://localhost:9292/prices`
- Utiliza los parámetros de consulta: `fecha`, `productId`, y `brandId`.
- La respuesta es en formato JSON.

### Documentación de la API 📘
La API está documentada con OpenAPI y Swagger. Puedes acceder a la documentación de la API a través de la siguiente URL después de iniciar la aplicación: `http://localhost:9292/swagger-ui.html`
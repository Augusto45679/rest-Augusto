## Estructura del proyecto

### 1. config: 
Este paquete se utiliza para definir configuraciones específicas de Spring o del proyecto. En tu caso, parece haber una clase llamada CustomRevisionListener, lo que sugiere que probablemente estés utilizando algo relacionado con auditorías de cambios en las entidades (posiblemente con Hibernate Envers u otra herramienta de auditoría). Aquí se colocan clases que gestionan configuraciones globales como CORS, seguridad, interceptores, etc.

### 2. controllers: 
Aquí se definen los controladores (como PersonaController). Los controladores son responsables de manejar las solicitudes HTTP (GET, POST, PUT, DELETE) y dirigirlas a los servicios adecuados para que se realicen las operaciones necesarias. Un controlador usualmente tiene mapeos de rutas para definir qué acciones ejecutar cuando se recibe una petición en una URL específica.

### 3. entities:
Las entidades dentro de esta paquete representan las tablas en la base de datos

### 4. services:
Se utilizan para implementar las operaciones de negocio que los controladores llaman. Estos servicios interactúan con los repositorios para acceder a los datos. El BaseService podría ser una clase genérica que contiene lógica común para varios servicios (como manejo de transacciones, validaciones, etc.).

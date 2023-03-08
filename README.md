# Backend_Proyecto

Tienda de playeras de anime - Backend
Este es el backend de la tienda en línea de playeras de anime odyssey desarrollada en Java con Spring Boot. 
Aquí se encuentra la lógica del servidor y la conexión con la base de datos.

Tecnologías utilizadas
Java 17: se utiliza como lenguaje de programación.
Spring Boot: se utiliza como framework para el desarrollo de la aplicación.
MySQL: se utiliza como base de datos para almacenar los datos de la tienda.

Instalación
Clonar el repositorio.
Configurar las variables de entorno en un archivo .env.
Ejecutar ./mvnw spring-boot:run para iniciar el servidor en modo de desarrollo.
Funcionalidades
El backend de la tienda en línea de playeras de anime cuenta con las siguientes funcionalidades:

Registro e inicio de sesión de usuarios.
CRUD de productos: se pueden crear, leer y actualizar productos de la base de datos.

Endpoints
A continuación, se muestran los endpoints disponibles en la API:

GET /api/users: Obtener todos los usuarios
GET /api/users{id}: Obtener el usuario por id
POST /api/users: crea un nuevo usuario.
POST /api/login/users: inicia sesión en la cuenta de un usuario.
GET /api/products: obtiene todos los productos de la tienda.
GET /api/products/{id}: obtiene un producto específico por su ID.
POST /api/products: crea un nuevo producto.
PUT /api/products/{id}: actualiza un producto específico por su ID.
GET /api/shoppingCart: obtiene todos los pedidos realizados en la tienda.
POST /api/shoppinhCart: crea un nuevo pedido.
PUT / api/shoppingCart:  Actualizar producto agregado al carrito.
DELETE / api/shoppingCart:  Eliminar productos agregados al carrito.
PUT /api/shoppinhCart/{id}: Obtener producto a agregado a carrito por id.
GET /api/size{id}: Obtener elemento por id de la talla.
GET /api/size: Obtener la lista de todas las tallas.
POST /api/size: Agregar una nueva talla a la base de datos.

Contacto
Si tienes alguna pregunta o problema con la API, no dudes en contactarnos a través de nuestro correo electrónico o GitHub. 
Estaremos encantados de ayudarte en lo que necesites.

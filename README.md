# Sistema de Gestión para Ferias Empresariales

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=java)
![License](https://img.shields.io/badge/License-MIT-blue)
![Status](https://img.shields.io/badge/Status-Stable-brightgreen)

Aplicación Java para gestionar empresas, stands, visitantes y sus interacciones en ferias comerciales. Desarrollada con Java Swing y arquitectura MVC.

## 📌 Tabla de Contenidos
- [Características Principales](#-características-principales)
- [Requisitos](#-requisitos)
- [Instalación](#-instalación)
- [Uso](#-uso)
- [Capturas de Pantalla](#-capturas-de-pantalla)
- [Diagrama UML](#-diagrama-uml)
- [Contribución](#-contribución)
- [Licencia](#-licencia)
- [Agradecimientos](#-agradecimientos)

---

## 🚀 Características Principales

### **Módulo de Empresas**
- Registro de empresas con nombre, sector y correo electrónico.
- Edición y eliminación de empresas existentes.
- Tabla dinámica para visualizar todas las empresas registradas.

### **Módulo de Stands**
- Asignación de stands a empresas con número único, ubicación y tamaño.
- Listado de stands disponibles vs. ocupados.
- Capacidad para reasignar o liberar stands.

### **Módulo de Visitantes**
- Registro de visitantes con nombre, identificación y email.
- Búsqueda rápida de visitantes por identificación.

### **Interacciones**
- Sistema de calificación de stands (1-5 estrellas).
- Comentarios asociados a visitantes y stands.
- Reportes automáticos de calificaciones promedio por stand.

---

## 📋 Requisitos
- **Java JDK 17+** ([Descargar](https://www.oracle.com/java/technologies/downloads/))
- **Git** ([Descargar](https://git-scm.com/))
- **IDE Recomendado**: 
  - NetBeans ([Enlace](https://netbeans.apache.org/))
  - IntelliJ IDEA ([Enlace](https://www.jetbrains.com/idea/))

---

## 🛠️ Instalación

1. **Clonar el Repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/feria-empresarial.git
   cd feria-empresarial

 Abrir en el IDE:

- Importa el proyecto como un proyecto Java existente.
- Asegúrate de configurar el JDK 17+ en las propiedades del proyecto.

Compilar y Ejecutar:

- Busca la clase MainApp en el paquete views.
- Ejecútala como aplicación Java.


 
Uso
Registrar una Empresa

- Navega a la pestaña Empresas.
- Completa los campos: Nombre, Sector, Email.
- Haz clic en Guardar para registrar.

Asignar un Stand
En la pestaña Stands, ingresa:

- Número único.
- Ubicación (ej: "Pabellón A").
- Tamaño (pequeño/mediano/grande).

Selecciona una empresa del menú desplegable.
Haz clic en Asignar Stand.


Registrar un Visitante

- Dirígete a la pestaña Visitantes.
- Completa: Nombre, Identificación, Email.
- Presiona Guardar Visitante.


Registrar una Interacción

En la pestaña Interacciones:
- Selecciona un visitante y un stand.
- Ingresa un comentario y calificación (1-5).

Haz clic en Registrar Interacción.

¡Este README te ayudará a entender y usar este proyecto fácilmente!

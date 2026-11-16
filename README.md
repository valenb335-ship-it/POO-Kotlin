# POO-Kotlin
Análisis del paradigma orientado a objetos en Kotlin: ejemplos ejecutables de abstracción, encapsulamiento, herencia, polimorfismo y corrutinas.

Repositorio con los ejemplos de código del artículo técnico **"El Paradigma Orientado a Objetos en Kotlin"**, realizado como trabajo de promoción de la asignatura **Programación Orientada a Objetos** (Facultad de Ingeniería, Universidad Nacional de la Patagonia San Juan Bosco, 2026).

**Autora:** Valentina Lara Benitez

## Contenido

Cada ejemplo está en su propio paquete y simula una funcionalidad de una aplicación móvil.

| Concepto | Paquete | Ejemplo | Conceptos aplicados |
|---|---|---|---|
| Abstracción | `abstraccion` | Envío de notificaciones por email y SMS; turnos programables y registrables | Clases abstractas, interfaces, herencia entre interfaces, resolución de conflictos con `super<T>` |
| Herencia | `herencia` | App de *delivery*: cada comercio crea su propio tipo de envío | `open`, `override`, `super`, `protected`, patrón *Factory Method* |
| Polimorfismo | `polimorfismo` | App de *streaming*: descarga y reanudación de canciones, *podcasts* y audiolibros | Polimorfismo dinámico (enlace dinámico) y estático (sobrecarga), interfaces |
| Concurrencia | `concurrencia` | Carga de un perfil con dos peticiones simultáneas al servidor | Corrutinas, `suspend`, `async` / `await`, `coroutineScope` |
| Paralelismo | `paralelismo` | Aplicación de un filtro a varias fotos en distintos núcleos | `Dispatchers.Default`, `withContext`, `awaitAll` |

El **encapsulamiento** se aplica en todos los ejemplos mediante modificadores de visibilidad (`private`, `protected`) y propiedades con acceso controlado.

## Requisitos

- **JDK 21** (o superior compatible con Gradle 8.10).
- No es necesario instalar Gradle: el proyecto incluye el *wrapper* (`gradlew`).
- Dependencias: `kotlinx-coroutines-core` (se descarga automáticamente).

## Cómo ejecutar los ejemplos

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/valenb335-ship-it/POO-Kotlin.git
   ```
2. Abrir la carpeta en IntelliJ IDEA y esperar a que Gradle cargue el proyecto.
3. Abrir el archivo del ejemplo deseado y hacer clic en el botón ▶ junto a la función `main`:

| Ejemplo | Archivo |
|---|---|
| Abstracción | `src/main/kotlin/abstraccion/main.kt` |
| Herencia | `src/main/kotlin/herencia/main.kt` |
| Polimorfismo | `src/main/kotlin/polimorfismo/main.kt` |
| Concurrencia | `src/main/kotlin/concurrencia/CargarPerfil.kt` |
| Paralelismo | `src/main/kotlin/paralelismo/ColocarFiltro.kt` |
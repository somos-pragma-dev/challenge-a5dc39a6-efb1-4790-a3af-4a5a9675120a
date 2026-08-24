# Desarrollo de una API REST Empresarial para E-Commerce

El objetivo de este reto es desarrollar una API REST para la gestión de productos y pedidos en un e-commerce. El sistema debe manejar la autenticación y autorización basada en JWT, modelar datos con relaciones OneToMany y ManyToMany, y proporcionar documentación automática con OpenAPI. Los datos se persistirán utilizando JPA y se manejarán errores de manera centralizada. Se requiere validación de entradas y paginación en los endpoints de listado. El sistema debe ser probado unitariamente y mediante pruebas de integración, y containerizado con Docker.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Arquitectura Empresarial con Spring Boot |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 40 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Modelado de Datos y Persistencia

**Objetivo:** Definir y persistir entidades de Producto, Orden y Cliente con relaciones adecuadas.

**Tiempo estimado:** 8 horas

**Instrucciones:**

- Identificar y definir las entidades necesarias para el e-commerce.
- Establecer relaciones OneToMany y ManyToMany entre las entidades.
- Implementar la persistencia de datos utilizando JPA.

**Entregable:** Entidades definidas y persistencia funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la cardinalidad y las relaciones entre las entidades.
- Piensa en cómo manejar las relaciones en la base de datos.

</details>

### Fase 2: Autenticación y Autorización

**Objetivo:** Implementar autenticación y autorización basada en JWT con roles de ADMIN y USER.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Configurar Spring Security para manejar la autenticación y autorización.
- Definir los roles de ADMIN y USER y asignar accesos diferenciados por endpoint.

**Entregable:** Autenticación y autorización funcional con JWT.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga los flujos de autenticación y autorización comunes en aplicaciones web.
- Considera cómo proteger los endpoints según el rol del usuario.

</details>

### Fase 3: Documentación Automática

**Objetivo:** Proveer documentación automática de la API utilizando OpenAPI 3.0 y Swagger UI.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Configurar OpenAPI para documentar automáticamente la API.
- Hacer accesible la documentación en /api-docs.

**Entregable:** Documentación automática accesible en /api-docs.

<details>
<summary>Pistas de conocimiento</summary>

- Explora las capacidades de OpenAPI y Swagger UI para documentar APIs.
- Asegúrate de que la documentación sea clara y completa.

</details>

### Fase 4: Manejo de Errores

**Objetivo:** Implementar manejo centralizado de errores con respuestas estandarizadas en formato JSON.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Configurar @ControllerAdvice para manejar errores de manera centralizada.
- Estandarizar las respuestas de error en formato JSON.

**Entregable:** Manejo centralizado de errores funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga los tipos de errores comunes en aplicaciones web y cómo manejarlos.
- Piensa en cómo estandarizar las respuestas de error para mejorar la experiencia del usuario.

</details>

### Fase 5: Validación de Entradas

**Objetivo:** Implementar validación de entradas utilizando Bean Validation.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Utilizar anotaciones como @Valid, @NotNull y @Size para validar las entradas.
- Asegurar que los datos ingresados cumplan con los requisitos definidos.

**Entregable:** Validación de entradas funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Explora las anotaciones de Bean Validation y cómo utilizarlas.
- Piensa en los requisitos de validación para cada entidad.

</details>

### Fase 6: Paginación y Ordenamiento

**Objetivo:** Implementar paginación y ordenamiento en los endpoints de listado.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Utilizar Pageable para implementar paginación y ordenamiento en los endpoints de listado.
- Asegurar que los resultados se puedan paginar y ordenar según los parámetros proporcionados.

**Entregable:** Paginación y ordenamiento funcional en los endpoints de listado.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga cómo utilizar Pageable para paginar y ordenar resultados.
- Piensa en cómo los usuarios interactuarán con los endpoints de listado.

</details>

### Fase 7: Pruebas Unitarias

**Objetivo:** Escribir pruebas unitarias para la capa de servicio utilizando JUnit 5 y Mockito.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Escribir pruebas unitarias para cubrir al menos el 80% de la capa de servicio.
- Utilizar Mockito para simular dependencias y verificar el comportamiento esperado.

**Entregable:** Pruebas unitarias funcionales para la capa de servicio.

<details>
<summary>Pistas de conocimiento</summary>

- Explora las mejores prácticas para escribir pruebas unitarias.
- Utiliza Mockito para simular dependencias y verificar el comportamiento esperado.

</details>

### Fase 8: Pruebas de Integración

**Objetivo:** Escribir pruebas de integración para verificar los flujos principales de la aplicación.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Escribir pruebas de integración utilizando @SpringBootTest para verificar los flujos principales.
- Asegurar que los flujos principales de la aplicación funcionen correctamente.

**Entregable:** Pruebas de integración funcionales para verificar los flujos principales.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga las mejores prácticas para escribir pruebas de integración.
- Asegúrate de verificar los flujos principales de la aplicación.

</details>

### Fase 9: Containerización con Docker

**Objetivo:** Containerizar la aplicación utilizando Docker y crear un Dockerfile multi-stage optimizado para producción.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Crear un Dockerfile multi-stage para containerizar la aplicación.
- Optimizar el Dockerfile para producción.

**Entregable:** Dockerfile multi-stage funcional y optimizado para producción.

<details>
<summary>Pistas de conocimiento</summary>

- Explora las mejores prácticas para containerizar aplicaciones con Docker.
- Piensa en cómo optimizar el Dockerfile para producción.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una arquitectura en capas y por qué se utiliza en aplicaciones empresariales?
- **paraQueSirve**: ¿Para qué sirve la autenticación y autorización en una API REST y cómo se implementa con JWT?
- **comoSeUsa**: ¿Cómo se utiliza OpenAPI para documentar automáticamente una API REST?
- **erroresComunes**: ¿Cuáles son los errores comunes al manejar autenticación y autorización y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el modelado de datos en un e-commerce y cómo afectan al diseño de la aplicación?

## Criterios de Evaluacion

- Implementar entidades con relaciones adecuadas.
- Configurar autenticación y autorización con JWT.
- Proveer documentación automática con OpenAPI.
- Implementar manejo centralizado de errores.
- Validar entradas utilizando Bean Validation.
- Implementar paginación y ordenamiento en endpoints de listado.
- Escribir pruebas unitarias para la capa de servicio.
- Escribir pruebas de integración para verificar flujos principales.
- Crear y optimizar un Dockerfile multi-stage para producción.

---

*Reto generado automaticamente por Challenge Generator - Pragma*

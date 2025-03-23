# 🧪 Simulación de Pruebas Automatizadas con Selenium WebDriver y JUnit

Este proyecto implementa **seis casos de prueba automatizados** utilizando **Selenium WebDriver**, **JUnit** y el entorno de desarrollo **Eclipse**, aplicando buenas prácticas de automatización y patrones de diseño como **Page Object Model (POM)**.

## 🌐 Sitio bajo prueba
https://www.saucedemo.com/v1/

## 🛠 Tecnologías utilizadas
- Java 17
- Eclipse IDE
- Selenium WebDriver
- JUnit 4
- Maven
- Git & GitHub

## 📂 Estructura del proyecto
Simulacion/ ├── src/ │ └── test/ │ ├── java/ │ │ └── pruebas/ │ │ ├── BaseTest.java │ │ ├── LoginTest.java │ │ ├── ProductListTest.java │ 
│ ├── CartTest.java │ │ ├── CheckoutValidationTest.java │ │ ├── OrderSummaryTest.java │ │ └── ThankYouMessageTest.java │ └── resources/ │\
└── Driver/ │ └── chromedriver.exe ├── pom.xml

## ✅ Casos de prueba automatizados
1. Autenticación de usuario válido
2. Visualización de productos en el inventario
3. Agregar un producto al carrito y validarlo
4. Validación de error por campo obligatorio vacío (First Name)
5. Verificación del resumen de la orden antes de finalizar
6. Confirmación de mensaje final tras completar la compra

## ▶️ Ejecución
1. Importar el proyecto en Eclipse (como proyecto Maven).
2. Verificar que `chromedriver.exe` esté ubicado en `src/test/resources/Driver/`.
3. Ejecutar los casos:
   - Click derecho en la clase deseada > `Run As` > `JUnit Test`.

## 🧪 Requisitos para correr
- Java 17
- Chrome instalado
- ChromeDriver compatible con tu versión de Chrome
- Eclipse IDE 
- JUnit 4 configurado (si usas Maven, se configura vía `pom.xml`)

## 🧭 Patrón aplicado
- ✅ Page Object Model (POM)
- ✅ BaseTest reutilizable con @Before y @After
- ✅ Código desacoplado y mantenible


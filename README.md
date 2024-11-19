<h1>Conversor de Moneda - Challenge ONE - Java - Back-end</h1>
  <p><strong>Challenge ONE</strong> - Proyecto para el desarrollo de un conversor de monedas utilizando <strong>Java</strong> y <strong>Spring Boot</strong> en el back-end.</p>

  <h2>Descripción</h2>
  <p>Este proyecto es parte del <strong>Challenge ONE</strong>, en el que se desarrolla un servicio web RESTful que convierte montos entre diferentes monedas. El backend está implementado en <strong>Java</strong> utilizando el framework <strong>Spring Boot</strong>.</p>
  <p>La aplicación permite a los usuarios realizar conversiones de divisas de manera sencilla y rápida a través de una API REST. Se incluyen funcionalidades como la conversión entre monedas predeterminadas y la consulta de tasas de cambio.</p>

  <h2>Funcionalidades</h2>
  <p>Las principales funcionalidades de la aplicación son las siguientes:</p>
  <ul>
      <li><strong>Conversión entre monedas:</strong> Los usuarios pueden convertir una cantidad de una moneda a otra utilizando las tasas de cambio definidas.</li>
      <li><strong>Obtener tasas de cambio:</strong> La API devuelve la tasa de cambio actual entre dos monedas seleccionadas.</li>
      <li><strong>Soporte para monedas populares:</strong> El sistema está configurado para trabajar con monedas como el dólar (USD), euro (EUR), peso argentino (ARS), entre otras.</li>
  </ul>

  <h2>Tecnologías Utilizadas</h2>
  <ul>
      <li><strong>Java</strong>: Lenguaje de programación utilizado para el desarrollo de la lógica del back-end.</li>
      <li><strong>Spring Boot</strong>: Framework utilizado para crear la API RESTful de manera rápida y eficiente.</li>
      <li><strong>RESTful API</strong>: El servicio está diseñado como una API REST que permite realizar operaciones de conversión de moneda.</li>
      <li><strong>JUnit</strong>: Herramienta utilizada para realizar pruebas unitarias en el backend.</li>
      <li><strong>Postman</strong>: Utilizado para probar las rutas de la API y verificar las respuestas.</li>
  </ul>

  <h2>Diagrama de Arquitectura</h2>
  <p>A continuación se presenta el diagrama de arquitectura del sistema, que ilustra cómo se organizan los diferentes componentes:</p>
  <img src="https://via.placeholder.com/800x400?text=Diagrama+de+Arquitectura" alt="Diagrama de Arquitectura" style="max-width: 100%; height: auto;">

  <h2>Instrucciones para Ejecutar el Proyecto</h2>
  <p>Para ejecutar la aplicación, sigue estos pasos:</p>
  <ol>
      <li><strong>Clonar el repositorio</strong>:
          <pre><code>git clone https://github.com/tu-usuario/conversor-de-moneda.git</code></pre>
      </li>
      <li><strong>Acceder al directorio del proyecto</strong>:
          <pre><code>cd conversor-de-moneda</code></pre>
      </li>
      <li><strong>Instalar las dependencias del proyecto</strong>:
          <pre><code>mvn install</code></pre>
      </li>
      <li><strong>Ejecutar la aplicación</strong>:
          <pre><code>mvn spring-boot:run</code></pre>
      </li>
      <li>La API estará disponible en <a href="http://localhost:8080" target="_blank">http://localhost:8080</a>.</li>
  </ol>

  <h2>Uso de la API</h2>
  <p>A continuación, se detallan los endpoints principales de la API:</p>

  <h3>1. Conversión de Moneda</h3>
  <p>Este endpoint permite convertir una cantidad de una moneda a otra.</p>
  <pre><code>GET /api/convert?from={moneda_origen}&to={moneda_destino}&amount={cantidad}</code></pre>
  <ul>
      <li><strong>from:</strong> Código de la moneda origen (ej. USD, EUR, ARS).</li>
      <li><strong>to:</strong> Código de la moneda destino (ej. USD, EUR, ARS).</li>
      <li><strong>amount:</strong> Cantidad a convertir.</li>
  </ul>
  <h4>Ejemplo de solicitud:</h4>
  <pre><code>GET http://localhost:8080/api/convert?from=USD&to=ARS&amount=100</code></pre>
  <h4>Respuesta:</h4>
  <pre><code>
  {
      "from": "USD",
      "to": "ARS",
      "amount": 100,
      "convertedAmount": 10500.50,
      "rate": 105.005
  }
  </code></pre>

  <h3>2. Obtener tasas de cambio</h3>
  <p>Este endpoint devuelve la tasa de cambio actual entre dos monedas.</p>
  <pre><code>GET /api/rate?from={moneda_origen}&to={moneda_destino}</code></pre>
  <h4>Ejemplo de solicitud:</h4>
  <pre><code>GET http://localhost:8080/api/rate?from=USD&to=EUR</code></pre>
  <h4>Respuesta:</h4>
  <pre><code>
  {
      "from": "USD",
      "to": "EUR",
      "rate": 0.85
  }
  </code></pre>

  <h2>Pruebas</h2>
  <p>Se han incluido pruebas unitarias utilizando <strong>JUnit</strong> para verificar la funcionalidad de la API. Para ejecutar las pruebas, simplemente usa el siguiente comando:</p>
  <pre><code>mvn test</code></pre>

  <h2>Contribución</h2>
  <p>Si deseas contribuir a este proyecto, sigue estos pasos:</p>
  <ol>
      <li>Haz un fork del repositorio.</li>
      <li>Crea una nueva rama para la funcionalidad o corrección de bugs que deseas agregar (<code>git checkout -b feature/nueva-funcionalidad</code>).</li>
      <li>Realiza tus cambios y haz commits adecuados.</li>
      <li>Abre un pull request describiendo tus cambios.</li>
  </ol>

  <h2>Licencia</h2>
  <p>Este proyecto está bajo la licencia <strong>MIT</strong>. Consulta el archivo LICENSE para más detalles.</p>

</body>
</html>

#POC calculadora

Este POC de un microservicio "calculadora", usando maven + spring-boot, donde se expone una API que debe ser capaz, a partir de unos parámetros de entrada, de realizar operaciones aritméticas.

Este proyecto contiene las librerías tracer en maven.

##Stack tecnológico

	-Java 17
	-Maven 3.6.1
	-Springboot
	-Springdoc openApi
	
##Instalación

1. Se descargaría el repositorio de GitHub
> git clone https://github.com/CristianLopGon/calculadora.git

2. Se ejecuta mvn clean install

3. Localizar la carperta /target estará el archivo calculadora-0.0.1-SNAPSHOT.jar

4. Desde una consola ir a la ruta de /target y ejecutar:

```
	java -jar calculadora-0.0.1-SNAPSHOT.jar
```

##Uso

Después de que se haya ejecutado, podemos utilizar la API Calculadora.

La API se despliega en el http://locahost:8080. Acepta peticiones para **suma, resta, multiplicacion** y **division**. Cualquier otra palabra usada para el parámetro operación dará un error indicando que sólo es posible el uso de estos anteriores.

Por el momento la API sólo acepta dos parámetros Double de entrada: **param1** y **param2**

###Ejemplo

Un ejemplo de uso de la API puede ser:

> GET http://localhost:8080/calculadora/calcula?param1=3.5&param2=4&operacion=suma

##Test

Para ejecutar los test, se debe emplear en una consola el comando 
> mvn test

##Swagger

Para la infrmación de la API se ha utilizado **springdoc-openapi**. Ésta es accesible mediante:

> GET http://localhost:8080/swagger-ui/index.html
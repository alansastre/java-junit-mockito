
## Crear un nuevo proyecto con maven + junit: 

Crear nuevo proyecto maven. 

Añadir en el pom.xml dentro de la etiqueta project: 

```xml
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.8.1</version>
            <scope>test</scope>
        </dependency>

    </dependencies>
```

## Tests con JUnit 

Los test se crean en paquetes java dentro del directorio `src/test/java`

Se crean clases java con métodos donde cada uno lleva la anotación `@Test`.

Mediante el uso de aserciones (métodos de la clase Asssertions) testeamos métodos 
del código principal (`src/main/java`). 

En cada clase de test, añadir el siguiente import: 

```java
import static org.junit.jupiter.api.Assertions.*;
```

## Conceptos Testing unitario con JUnit

1. Aserciones, cómo crear tests, cómo testear
2. @DisplayName
3. assertAll()
4. assertThrows()
5. @BeforeEach, @AfterEach, @BeforeAll, @AfterAll
6. @Disabled
7. Tests condicionales:
   1. Anotaciones: @Enabled...
   2. Assumptions: assumeTrue()...
8. @Nested
9. Tests con repetición:
   1. @RepeatedTest 
   2. @ParameterizedTest
10. @Tag 
11. Suites de testing

# Mockito 

https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html

### Clases a testear en la aplicación 

1. Controlador: clases que reciben peticiones HTTP y ejecutan métodos de servicios/repositorios para llevar una acción
   1. Servicio
   2. Repositorio
2. Servicio: clase que recibe las llamadas de los controladores, tienen métodos para realizar acciones CRUD y demás acciones de lógica de negocio.
   1. Servicio
   2. Repositorio
3. Repositorio: capa que interactúa con la base de datos para realizar las operaciones CRUD.

Las entidades se utilizan en todas las anteriores. 

### Escenario: 

método Controlador --> Método Servicio 1 --> Método Servicio 2 --> método Repositorio 1

Se harán test para cada uno de forma individualizada. Por lo tanto no es necesario que desde cualquiera de ellos 
se testeen también sus dependencias. 

### Objetivo de mockito 

No tener que testear todo una y otra vez.

método Controlador --> Mock Servicio 1

Framework para facilitar el testing de métodos de clases que tienen/usan dependencia/s. 

Las clases que normalmente se testean con mockito van a ser capas:

* Controlador que depende de un servicio. El servicio es una dependencia y se puede hacer mock de la misma. 
* Servicio que depende de un repositorio. El repositorio es una dependencia y se puede hacer mock de la misma.
* Servicio que depende de otro servicio. El repositorio es una dependencia y se puede hacer mock de la misma.

EmployeeService que depende de EmployeeRepository. 

1. JUnit 

Al testear EmployeeService se está ejecutando EmployeeRepository 

## Comprobaciones desde los test: 

* Métodos assert (JUnit): sirven para comprobar si se cumple una condición sobre el resultado obtenido. 
* Método verify (Mockito): sirve para verificar si un método en el mock ha sido ejecutado un número determinado de veces.

## Esquema de pasos para trabajar con Mockito

1. Configurar mock/s: when(), thenReturn()
2. Ejecutar el comportamiento o método a testear 
3. Comprobar y verificar

## Formas de inicializar Mockito

* Utilizando el método estático `mock()`
* Utilizando las anotaciones `@Mock` y `@InjectMocks` inicializando `@ExtendWith(MockitoExtension.class)`
* Utilizando las anotaciones `@Mock` y `@InjectMocks` inicializando `MockitoAnnotations.openMocks(this)` en un setUp()


## Caso M3

* Crear casos de test para lograr ~80 % de cobertura
* JUnit y Mockito
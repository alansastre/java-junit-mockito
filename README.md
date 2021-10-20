
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

## Conceptos Testing unitario

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

## Caso M3

* Crear casos de test para lograr ~80 % de cobertura
* JUnit y Mockito
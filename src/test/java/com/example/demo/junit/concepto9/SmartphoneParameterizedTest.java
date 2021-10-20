package com.example.demo.junit.concepto9;

import com.example.demo.domain.Employee;
import com.example.demo.domain.SmartColor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;

/**
 * @ParameterizedTest permite crear tests repetidos pero en base a una entrada de datos
 *
 * El test se repite tantas veces como datos reciba
 *
 * Opciones para carga de datos:
 * 1. @CsvSource - Leer datos estilo csv dentro de la propia anotación
 * 2. @CsvFileSource- Leer datos desde un archivo csv que normalmente estará ubicado en el directorio src/test/resources
 * 3. @EnumSource - Leer las constantes de una enumeración
 * 4. @MethodSource - Leer datos de un método java (puede estar en cualquier clase, sea de test o no)
 */
public class SmartphoneParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "Pepe,30",
            "Antonio,99",
            "Raulito,40"
    })
    void test0(String name, Integer age){
        System.out.println(name + " " + age);
    }

    @ParameterizedTest
    @CsvSource({
            "1, Empleado 1, 40, 20000",
            "2, Empleado 2, 30, 40000",
            "3, Empleado 3, 55, 60000",
            "4, Empleado 4, 55, 60000"
    })
    void test1(Long id, String name, Integer age, Double salary){
        System.out.println(id + " " + name + " " + age + " " + salary);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/employees.csv")
    void test2(Long id, String name, Integer age, Double salary){
        System.out.println(id + " " + name + " " + age + " " + salary);
    }

    @ParameterizedTest
    @EnumSource(SmartColor.class)
    void name(SmartColor color) {

        System.out.println(color);
    }

    // EJEMPLO 1: LEER STRINGS DE OTRO MÉTODO
    @ParameterizedTest
    @MethodSource("getNames")
    void test3(String name){
        System.out.println(name);
    }

    public static List<String> getNames() {
        return List.of("Nombre1", "Nombre2", "Nombre3");
    }

    // EJEMPLO 2: LEER OBJETOS DE OTRO MÉTODO

    @ParameterizedTest
    @MethodSource("getEmployees")
    void test4(Employee employee){
        System.out.println(employee);
    }

    public static List<Employee> getEmployees() {
        return List.of(
                new Employee(1L, "name1", 20),
                new Employee(2L, "name2", 30),
                new Employee(3L, "name3", 40)
        );
    }
}

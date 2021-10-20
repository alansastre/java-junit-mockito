package com.example.demo.junit.concepto8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Los tests anidados.
 *
 * Clases de test dentro de otras clases con el objetivo de agrupar métodos de tests
 * por categoría o temática.
 *
 * La anotación @Nested sobre una clase interna indica que serán tests anidados
 */
@DisplayName("Operaciones CRUD sobre smartphones")
public class NestedTest {



    @DisplayName("Funcionalidad buscar sobre smartphones")
    @Nested
    class RetrieveTests {

        @DisplayName("findOne - Buscar 1 smartphone")
        @Test
        public void test1(){
        }

        @DisplayName("findAll - Buscar todos los smartphones")
        @Test
        public void test2(){
        }

    }

    @DisplayName("Funcionalidad crear y modificar sobre smartphones")
    @Nested
    class SaveTests {

        @DisplayName("create - Crear un smartphones")
        @Test
        public void test1(){
        }

        @DisplayName("update - Actualizar un smartphone existente")
        @Test
        public void test2(){
        }
    }

}

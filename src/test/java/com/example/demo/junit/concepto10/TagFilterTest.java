package com.example.demo.junit.concepto10;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagFilterTest {

    @Tag("database")
    @Test
    void test1() {
    }

    @Test
    void test2() {
    }

    @Tag("database")
    @Test
    void test3() {
    }
}

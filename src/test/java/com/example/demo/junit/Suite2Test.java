package com.example.demo.junit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

// paquetes
@SelectPackages("com.example.demo")
//@SelectPackages({"com.example.demo.service.concepto1", "com.example.demo.service.concepto2"})

// clases
//@SelectClasses(TagFilterTest.class)
//@SelectClasses({TagFilterTest.class, SmartphoneParameterizedTest.class})

// tags
//@IncludeTags("database")
public class Suite2Test {
}

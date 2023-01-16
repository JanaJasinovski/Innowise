package service;

import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Arrays;

public class ServiceTest {
    private final Service service = new ServiceImpl();

    @BeforeAll
    static void init() {
        System.out.println("Before all: ");
    }

//    @BeforeEach
//    void prepare(Service service) {
//        System.out.println("Before each: " + this);
//        this.service = service;
//    }

    @Test
    void arrayContainingBFromAIntTest() {
        int a = 1234566;
        int b = 3;
        int[] expectedResult = service.arrayContainingBFromAInt(a, b);
        Assertions.assertEquals(Arrays.asList(1,2,3).toString(), Arrays.toString(expectedResult));
    }

    @AfterAll
    static void destroy() {
        System.out.println("After all: ");
    }

}



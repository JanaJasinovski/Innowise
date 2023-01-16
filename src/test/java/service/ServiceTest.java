package service;

import org.example.exception.InCorrectParameterException;
import org.example.model.Service;
import org.example.model.impl.ServiceImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
    private final Service service = new ServiceImpl();

    @BeforeAll
    static void init() {
        System.out.println("Before all: ");
    }

//    @BeforeEach
//    void prepare(ServiceImpl service) {
//        System.out.println("Before each: " + this);
//        this.service = service;
//    }

    @Test
    void arrayContainingBFromAIntIfAGreaterThenBTest() throws InCorrectParameterException {
        int a = 1234566;
        int b = 3;
        int[] expectedResult = service.arrayContainingBFromAInt(a, b);
        assertEquals(Arrays.asList(1,2,3).toString(), Arrays.toString(expectedResult));
    }

    @Test
    void throwExceptionIfFirstNumberLessAsSecondInArrayContainingBFromAIntIfAGreaterThenBMethodTest() {
        int a = 123;
        int b = 4;
        Assertions.assertThrows(RuntimeException.class, () -> service.arrayContainingBFromAInt(a, b));
    }

    @Test
    void returnAIfBIsZeroInArrayContainingBFromAIntIfAGreaterThenBMethodTest() {
        int a = 12345;
        int b = 0;
        int[] expectedResult = service.arrayContainingBFromAInt(a, b);
        assertEquals(Arrays.asList(1,2,3,4,5).toString(), Arrays.toString(expectedResult));
    }

    @AfterAll
    static void destroy() {
        System.out.println("After all: ");
    }

}



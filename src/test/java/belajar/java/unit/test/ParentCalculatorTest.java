package belajar.java.unit.test;

import belajar.java.unit.test.resolver.Resolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

//inheritance di test
@Extensions({
        @ExtendWith(Resolver.class)
})
public class ParentCalculatorTest {

    public Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }
}

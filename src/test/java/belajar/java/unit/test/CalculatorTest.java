package belajar.java.unit.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Class Calculator")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    //test method add dengan skenario success
    @Test
    @DisplayName("Test method add success(Integer, Integer)")
    public void testAddSuccess(){
        var result = calculator.add(12,4);
        //ekspektasi hasil test berhasil
        assertEquals(16, result);
    }

    @Test
    @DisplayName("Test method divide success(Integer, Integer)")
    public void testDivideSuccess(){
        var result = calculator.divide(4,2);
        assertEquals(2,result);
    }

    @Test
    @DisplayName("Test method divide error(Integer, Integer)")
    public void testDivideError(){
        //ekspektasi hasil test error
        assertThrows(IllegalArgumentException.class, () -> {calculator.divide(2,0);});
    }
}

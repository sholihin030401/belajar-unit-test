package belajar.java.unit.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.Random;

public class RandomCalculatorTest extends ParentCalculatorTest{

    @Test
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var res = calculator.add(a,b);
        var exp = a+b;

        Assertions.assertEquals(exp, res);
    }

    @RepeatedTest(
            value = 5,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomRepeat(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var res = calculator.add(a,b);
        var exp = a+b;

        Assertions.assertEquals(exp, res);
    }

    @DisplayName("test calculating")
    @ParameterizedTest(name = "{displayName} with parameter {0}")
    @ValueSource(ints = {1,2,3,4,5,6,7})
    void testWithParameter(int value){
        var expected = value + value;
        var result = calculator.add(value, value);

        Assertions.assertEquals(expected, result);
    }

    //menambahkan parameter dari method lain
    public static List<Integer> parameterSource(){
        return List.of(1,2,3,4,5);
    }

    @DisplayName("test calculating")
    @ParameterizedTest(name = "{displayName} with parameter {0}")
    @MethodSource({"parameterSource"})
    void testWithMethodSource(int value){
        var expected = value + value;
        var result = calculator.add(value, value);

        Assertions.assertEquals(expected, result);
    }

}

package belajar.java.unit.test;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayName("Test Class Calculator")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    //eksekusi sebelum dan setelah unit test ketika semua method dieksekusi dan harus static
    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    //eksekusi sebelum dan setelah unit test ketika masing-masing method dieksekusi
    @BeforeEach
    public void setUp(){
        System.out.println("before each test");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("after each test");
    }

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
    @Disabled //menonaktifkan unit test
    @DisplayName("Test method divide error(Integer, Integer)")
    public void testDivideError(){
        //ekspektasi hasil test error
        assertThrows(IllegalArgumentException.class, () -> {calculator.divide(2,0);});
    }

    //cek Edit Configuration di Select Run/Debug Configuration, pilih Environtment Variables dan tambahkan name = PROFILE, value = DEV
    //membatalkan test secara manual, tidak error testnya namun dibatalkan menggunakan TestAbortedException
    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)){
            throw new TestAbortedException("test dibatalkan");
        }
    }

    //membatalkan test secara otomatis menggunakan assumeTrue
    @Test
    public void testAssumtions(){
        assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }
}

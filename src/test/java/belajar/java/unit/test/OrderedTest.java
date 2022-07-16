package belajar.java.unit.test;

import org.junit.jupiter.api.*;

//jika ingin mengimplementasikan inner class dalam class test, gunakan annotation @Nested di dalam class inner nya
//Lifecycle PER_CLASS untuk membuat satu object turunan, PER_METHOD untuk membuat object turunan disetiap method
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//mencoba mengurutkan test
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    private int counter = 0;

    @Nested
    @DisplayName("when how")
    public class OrderCount{

        @Test
        void setUp(){
            System.out.println("counter must be start with 0");
        }

        @Test
        void infoTest(TestInfo info){
            System.out.println(info.getDisplayName());
            System.out.println(info.getTestClass().orElse(null));
        }
    }

    @Test
    @Order(3)
    void test1() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(1)
    void test2() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(2)
    void test3() {
        counter++;
        System.out.println(counter);
    }
}

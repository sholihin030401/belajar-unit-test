package belajar.java.unit.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

//@Tag atau @Tags (untuk yg lebih dari 1) digunakan untuk memilih test mana saja yg dijalankan
//run pada terminal dengan perintah mvn test -Dgroups=condition-test
@Tag("condition-test")
public class ConditionTest {

    //test ini hanya boleh run di OS Windows
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testOnlyRunWindows(){

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisableWindows(){

    }

    //test ini hanya boleh run di java 14
    @Test
    @EnabledOnJre({JRE.JAVA_14})
    public void testOnlyRunJava14(){

    }

    //test ini running pada java 8 > java 14
    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_18)
    public void testRunJava8To18(){

    }
}

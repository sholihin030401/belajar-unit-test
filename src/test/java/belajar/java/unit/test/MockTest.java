package belajar.java.unit.test;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

//membuat object tiruan menggunakan mockito
public class MockTest {

    @Test
    void testMock(){
        List<String> list = Mockito.mock(List.class);

        //test behaviour dari class
        Mockito.when(list.get(1)).thenReturn("Ichwan");
        Mockito.when(list.get(10)).thenReturn("Sholihin");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(10));

        //verifikasi apakah objet get(1) dipanggilnya sekali
        Mockito.verify(list, Mockito.times(1)).get(1);
    }
}

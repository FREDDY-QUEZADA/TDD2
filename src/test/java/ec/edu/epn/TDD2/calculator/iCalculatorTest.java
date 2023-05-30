package ec.edu.epn.TDD2.calculator;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;

import static org.junit.Assert.*;

public class iCalculatorTest
{
       @Test
    public void give_two_integers_when_addition_then_ok()
       {
            iCalculator c = Mockito.mock(iCalculator.class);  // simulacion de implementacion con MOCkito
            Mockito.when(c.addition(2,3)).thenReturn(5);//
            assertEquals(5,c.addition(2,3)); // llamar al metodo de la interfaz

       }

    @Test
    public void give_two_integers_when_subtraction_then_ok()
    {
        iCalculator c = Mockito.mock(iCalculator.class);  // simulacion de implementacion con MOCkito
        Mockito.when(c.subtraction(4,2)).thenReturn(2);//
        assertEquals(2,c.subtraction(4,2)); // llamar al metodo de la interfaz

    }

    @Test
    public void give_two_integers_when_multiplication_then_ok()
    {
        iCalculator c = Mockito.mock(iCalculator.class);  // simulacion de implementacion con MOCkito
        Mockito.when(c.multiplication(4,2)).thenReturn(8);//
        assertEquals(8,c.multiplication(4,2)); // llamar al metodo de la interfaz

    }
    @Test
    public void give_two_integers_when_division_then_ok()
    {
        iCalculator c = Mockito.mock(iCalculator.class);  // simulacion de implementacion con MOCkito
        Mockito.when(c.division(20,2)).thenReturn(10);//
        assertEquals(10,c.division(20,2)); // llamar al metodo de la interfaz

    }

}
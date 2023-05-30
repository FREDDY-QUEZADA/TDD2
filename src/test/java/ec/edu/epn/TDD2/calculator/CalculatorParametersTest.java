package ec.edu.epn.TDD2.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

// pruebas de parametros con corredores

@RunWith(value = Parameterized.class)

public class CalculatorParametersTest {

    private int a, b, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters()// Lista de Arreglo de objetos - parametros
    {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{2,4,6});
        objects.add(new Object[]{1,8,9});
        objects.add(new Object[]{2,5,7});
        objects.add(new Object[]{7,3,10});
        objects.add(new Object[]{22,4,26});
        objects.add(new Object[]{12,14,26});
        return objects;

    }


    public CalculatorParametersTest  (int a , int b, int expected)   // Constructor Parametrizado
    {
        this.a =a;
        this.b = b;
        this.expected = expected;

    }



    @Test
    public void given_parameters_when_addition_them_summation()
    {

        Calculator c = new Calculator(); // instacia de la clase
       int actual = c.addition(a,b);
              assertEquals(expected,actual);


    }

}
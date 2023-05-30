package ec.edu.epn.TDD2.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest
{
 Calculator c = null;

    @BeforeClass// Anotacion ejecuccion una sola ves  antes de la clase
    public static void setupClass()
    {

        System.out.println("setupClass()");

    }


 @Before // ejecute este metodo antes de las etiquetas test
    public void setup()
    {
        c = new Calculator();
        System.out.println("setup()");


    }

    @Test
    public void given_two_integers_when_addition_them_ok()
    {

     Calculator c = new Calculator();  // Instacia de la clase
        int expected = 6; // prueba Test valor esperado
        //nt actual = c.addition(4,2);// instacia con el metodo
        //assertEquals(expected,actual); // prueba unitaria
        assertEquals(6,c.addition(4,2));
        System.out.println("Test 1");


    }
    @Test
    public void given_two_integers_when_subtraction_them_ok(){

     Calculator c = new Calculator (); // Instacia de la clase
        //int expected = 2; //Valor Esperado
        //int actual = c.subtraction(4,2); // instacia con el metodo
        //assertEquals(expected,actual);// Prueba unitaria
          assertEquals(2,c.subtraction(4,2));
        System.out.println("Test 2");
    }
    @Test(expected = ArithmeticException.class) // etiqueta tipo test con menejo de expeciones
    //@Test
    public void given_two_integers_when_division_them_ok(){

     Calculator c = new Calculator ();//Instacia de la clase
        assertEquals(3,c.division(6,0));
        System.out.println("Test 3"); //
    }


    @Test(timeout = 150)// Tiempo de esperado
    //@Test
    public void given_two_integers_when_multiplication_them_timeout()
    {

     Calculator c = new Calculator (); //Instacia de la clase
        assertEquals(8,c.multiplication(4,2)); // Prueba Unitaria
        System.out.println("Test 4");

    }

    @After // etiqueta para que se ejecute despues de cada prueba
    public  void tearDown () // ejecuacion de metodo despues de cualquier test
    {
     System.out.println("tearDown");
     c.setAns(0);// valor a 0
     c=null;
    }

    @AfterClass // se ejecuta al final
    public static void tearDownClass()
    {
        System.out.println("tearDownClass");


    }

}
package ec.edu.epn.TDD2.calculator;

import javafx.util.Duration;

public class Calculator {

    private int ans; // variable para guardar la respuesta


    public int addition(int a, int b) { return a+b; }

    public int subtraction(int a, int b) {  return a-b; }

    public int division(int a, int b) {  return a/b;  }

    public int multiplication(int a, int b)    {
        try // captura de error
        {
            Thread.sleep(100); // hilo para desacticar el metodo en milisegundo

        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a*b;
    }

    public int getAns()
    {
        return ans;
    }

    public void setAns(int ans)
    {
        this.ans = ans;
    }
}

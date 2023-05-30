package ec.edu.epn.TDD2.payment;
//prueba
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
     private PaymentGateway gateway = null; //refactorizacion
     private PaymentProcessor processor = null; //refactorizacion
   @Before
   public void setUp()
   {
       gateway = Mockito.mock(PaymentGateway.class);
       processor = new PaymentProcessor(gateway);

   }



    //PRUEBA DE TRUE
    @Test
    public void give_payment_when_is_correct_then_ok()
    {
           //  PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
            // PaymentProcessor processor = new PaymentProcessor(gateway);

             Mockito.when(gateway.requestPayment(Mockito.any())).
                     thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.Ok));
             assertTrue(processor.makePayment(100));
     }

     //PRUEBA DE FALSE

    @Test
    public void give_payment_when_is_correct_then_error()
    {
        //PaymentGateway gateway = Mockito.mock(PaymentGateway.class);
        //PaymentProcessor processor = new PaymentProcessor(gateway);

        Mockito.when(gateway.requestPayment(Mockito.any())). // repuesta estatus
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(processor.makePayment(100));
    }
}
package ec.edu.epn.TDD2.payment;
//pago
public class PaymentProcessor
{
      private PaymentGateway gateway; // objeto

          public PaymentProcessor(PaymentGateway gateway) // constructor
      {
            this.gateway = gateway;
      }

      public boolean makePayment(double amount)
      {
          PaymentResponse response = gateway.requestPayment(new PaymentRequest(amount));
          if(response.getStatus() == PaymentResponse.PaymentStatus.Ok)
          return true;
          else
              return false; // si no se debita


      }
}

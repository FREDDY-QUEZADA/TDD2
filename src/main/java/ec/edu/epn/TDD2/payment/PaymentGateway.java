package ec.edu.epn.TDD2.payment;
//PASARELA DE PAGO
public interface PaymentGateway
{
    public PaymentResponse requestPayment(PaymentRequest paymentRequest); // declaracion metodo parametrizado


 }

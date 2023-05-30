package ec.edu.epn.TDD2.payment;

public class PaymentResponse

{

    enum  PaymentStatus // OBJETO numerador
  {
      Ok, ERROR; // estatus

  }
  private PaymentStatus status; // VARIABLE PARA MANEJAR ESTATUS

    public PaymentResponse(PaymentStatus status)
    {
        this.status = status;
    }
    // CONSTRUCTOR

    public PaymentStatus getStatus() {
        return status;
    }
}

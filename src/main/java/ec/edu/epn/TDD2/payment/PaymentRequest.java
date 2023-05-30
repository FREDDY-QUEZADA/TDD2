package ec.edu.epn.TDD2.payment;

public class PaymentRequest
{
    private double amount;
//CONSTRUCTOR
    public PaymentRequest(double amount)
    {
        this.amount = amount;
    }

    public double getAmount()
    {
        return amount;
    }

}

package in.spring;

public class PaymentService {
    CreditCardPayment creditCardPayment;

    PaymentService(CreditCardPayment creditCardPayment) {

        this.creditCardPayment = creditCardPayment;

    }

    public void makePayment(){
        creditCardPayment.pay();
    }
}

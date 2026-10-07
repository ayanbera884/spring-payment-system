package in.spring;

public class OrderService {

    PaymentService payment;

    OrderService (PaymentService payment) {
        this.payment = payment;
    }
    public void placeOrder() {
        System.out.println("Order placed");
        payment.makePayment();
    }

}

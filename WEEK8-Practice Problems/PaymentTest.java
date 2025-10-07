// Problem 3: Interface for Payment Gateway
// File: PaymentGateway.java
interface PaymentGateway {
 void pay(double amount);
 void refund(double amount);
}
// File: CreditCardPayment.java
class CreditCardPayment implements PaymentGateway {
 @Override
 public void pay(double amount) {
 System.out.println("Paid via Credit Card: " + amount);
 }
 @Override
 public void refund(double amount) {
 System.out.println("Refund to Credit Card: " + amount);
 }
}
// File: UPIPayment.java
class UPIPayment implements PaymentGateway {
 @Override
 public void pay(double amount) {
 System.out.println("Paid via UPI: " + amount);
 }
 @Override
 public void refund(double amount) {
 System.out.println("Refund to UPI: " + amount);
 }
}
// File: PaymentTest.java
public class PaymentTest {
 public static void main(String[] args) {
 PaymentGateway pg1 = new CreditCardPayment();
 pg1.pay(2000);
 pg1.refund(500);
 PaymentGateway pg2 = new UPIPayment();
 pg2.pay(1000);
 pg2.refund(200);
 }
}
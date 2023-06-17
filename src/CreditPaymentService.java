public class CreditPaymentService {
    public double calculate(double amount, int term) {
        double rate = 9.99;
        double monthlyRate = rate / 12 / 100;
        int numberOfPayments = term * 12;
        double monthlyPayment = (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -numberOfPayments));
        int roundedMonthlyPayment = (int) monthlyPayment;
        return roundedMonthlyPayment;
    }
}
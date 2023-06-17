public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        double amount = 1000000;

        int term1Year = 1;
        double monthlyPayment1Year = creditPaymentService.calculate(amount, term1Year);
        System.out.println("Ежемесячный платеж на 1 год: " + monthlyPayment1Year);

        int term2Years = 2;
        double monthlyPayment2Years = creditPaymentService.calculate(amount, term2Years);
        System.out.println("Ежемесячный платеж на 2 года: " + monthlyPayment2Years);

        int term3Years = 3;
        double monthlyPayment3Years = creditPaymentService.calculate(amount, term3Years);
        System.out.println("Ежемесячный платеж на 3 года: " + monthlyPayment3Years);
    }
}

package Domain.Application.Requests;

public class CalculateMonthlyRePaymentRequest {
    private double interest;
    private double quantity;
    private int quotes;

    public CalculateMonthlyRePaymentRequest(
            double interest,
            double quantity,
            int quotes
    ) {
        this.interest = interest;
        this.quantity = quantity;
        this.quotes = quotes;
    }

    public double interest() {
        return interest;
    }

    public double quantity() {
        return quantity;
    }

    public int quotes() {
        return quotes;
    }
}
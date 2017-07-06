package Domain.Application;

import Domain.Application.Requests.CalculateMonthlyRePaymentRequest;

public class CalculateMonthlyRePaymentAction {

    /**
     * Formula used to calculate the monthly payment
     *
     *     (interest * quantity requested)                0.07 * 1000
     *  ------------------------------------  =>  --------------------------- = 76.715309691
     *     1 - (1 + interest) ^ (- quotes)              1 - (1 + 0.07)^-36
     */
    public double execute(CalculateMonthlyRePaymentRequest request) {
        return (request.interest() * request.quantity())/(1-Math.pow((1+request.interest()),-request.quotes()));
    }
}
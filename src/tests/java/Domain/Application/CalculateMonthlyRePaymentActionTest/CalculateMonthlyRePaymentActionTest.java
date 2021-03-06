package Domain.Application.CalculateMonthlyRePaymentActionTest;

import Domain.Application.CalculateMonthlyRePaymentAction;
import Domain.Application.Requests.CalculateMonthlyRePaymentRequest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateMonthlyRePaymentActionTest {
    @Test
    public void testExecute() {
        CalculateMonthlyRePaymentAction action = new CalculateMonthlyRePaymentAction();

        double response = action.execute(
                new CalculateMonthlyRePaymentRequest(
                    0.07,
                    1000,
                    36
                )
        );

        assertEquals(
            76.71530969127662,
            response,
            0.0
        );
    }
}

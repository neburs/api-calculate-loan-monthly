package app.Controllers;

import Domain.Application.CalculateMonthlyRePaymentAction;
import Domain.Application.Requests.CalculateMonthlyRePaymentRequest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/calculate-monthly-repayment")
public class CalculateMonthlyRePaymentController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response calculateMonthlyRePayment(
            @QueryParam("interest") String interest,
            @QueryParam("quantity") String quantity,
            @QueryParam("quotes") String quotes) {

        Double interestFinal;
        Double quantityFinal;
        Integer quotesFinal;

        try {
            interestFinal = Double.parseDouble(interest);
            quantityFinal = Double.parseDouble(quantity);
            quotesFinal = Integer.parseInt(quotes);

        } catch (NumberFormatException e) {
            return Response.status(Response.Status.NOT_FOUND).entity("Invalid value " + e.getMessage()).build();
        }

        CalculateMonthlyRePaymentAction action = new CalculateMonthlyRePaymentAction();

        Double monthlyRePayment = action.execute(
            new CalculateMonthlyRePaymentRequest(
                interestFinal,
                quantityFinal,
                quotesFinal
            )
        );
        return Response.ok("{" +
                "\"interest\": " + interestFinal + "," +
                "\"quantity\": " + quantityFinal + "," +
                "\"quotes\": " + quotesFinal + "," +
                "\"monthly-repayment\": " + monthlyRePayment +
                "}").build();
    }
}

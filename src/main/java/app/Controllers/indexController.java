package app.Controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class indexController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response home() {
        return Response.ok("{'The api is live'}").build();
    }
}

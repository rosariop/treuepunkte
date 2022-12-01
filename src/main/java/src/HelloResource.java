package src;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {

    @Path("/tester")
    @GET
    public Response tester(){
        return Response.ok("tester").build();
    }
}

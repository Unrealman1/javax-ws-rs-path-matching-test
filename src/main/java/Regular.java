import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class Regular {

    @GET
    @Path("test1/{id: [0-9]*}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test1(@PathParam("id") Long id) {
        return "id: " + id.toString();
    }

    @GET
    @Path("test2/{id: \\d+?}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2(@PathParam("id") Long id) {
        return "id: " + id.toString();
    }

    @GET
    @Path("{id : [0-9]+?}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test3(@PathParam("id") Long id) {
        return "id: " + id.toString();
    }

    @GET
    @Path("{id: [0-9]*?}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test4(@PathParam("id") Long id) {
        return "id: " + id.toString();
    }
}

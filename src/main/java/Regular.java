import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class Regular {

    @GET
    @Path("test1/{id:[0-9]*}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test1(@PathParam("id") Long id) {
        return "id: " + id;
    }

    @GET
    @Path("test2/{id: \\d+?}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2(@PathParam("id") Long id) {
        return "id: " + id;
    }

    @GET
    @Path("{id : [0-9]+?}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test3(@PathParam("id") Long id) {
        return "id: " + id;
    }

    @GET
    @Path("{id: [0-9]*?}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test4(@PathParam("id") Long id) {
        return "id: " + id;
    }

    @GET
    @Path("/log/top{p:/?}{numberOfItems:([0-9]*)}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test5(@DefaultValue("null") @PathParam(value = "numberOfItems") Integer numberOfItems) {
        return "id: " + numberOfItems;
    }
}

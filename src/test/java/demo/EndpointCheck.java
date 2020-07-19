package demo;

import demo.controller.EndpointController;
import demo.controller.Request;
import io.restassured.response.Response;
import org.junit.Test;

public class EndpointCheck {
    EndpointController controller = new EndpointController();

    @Test
    public void getAPI(){
        controller.getEndPoint();
    }

    @Test
    public void postAPI(){
        Request request = new Request();
        request.setTitle("recommendation");
        request.setBody("motorcycle");
        request.setUserId(12);

        Response response = controller.postEndPoint(request);
        response.getBody().prettyPrint();
        System.out.println(response.getStatusCode());
    }
}

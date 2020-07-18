package demo;

import demo.controller.EndpointController;
import org.junit.Test;

public class EndpointCheck {
    EndpointController controller = new EndpointController();
    @Test
    public void getAPI(){
        controller.getEndPoint();
    }
}

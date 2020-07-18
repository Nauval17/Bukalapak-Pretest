package demo.controller;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class EndpointController {

    public void getEndPoint(){
        Response response = RestAssured
                .given()
                .baseUri("http://jsonplaceholder.typicode.com")
                .header("Content-type","application/json")
                .header("Accept","application/json")
                .get("/posts");

        response.getBody().prettyPrint();
        System.out.println(response.getStatusCode());
    }

    public Response postEndPoint(){
        Response response = RestAssured
                .given()
                .baseUri("http://jsonplaceholder.typicode.com")
                .header("Content-type","application/json")
                .header("Accept","application/json")
                .post("/posts");
        return response;
    }
}

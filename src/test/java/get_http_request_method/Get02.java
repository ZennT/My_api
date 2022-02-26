package get_http_request_method;

/*
            Given https://restful-booker.herokuapp.com/booking/1001
            When user sends a GET request to the url
            Then HTTP status code should be 404
            And   response body contains "Not Found"
            And status line should be HTTP/1.1 404 Not Found
            And body does not contain "techproed"
            And Server is "Cowboy"
             */

import base_urls.HerokuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get02 extends HerokuAppBaseUrl {
    @Test
    public void get02(){
//      set the base url
        spec.pathParams("firstPar", "booking","secPar",1001);

//        set the expected data

//        send the get request and get response
        Response response = given().spec(spec).when().get("/{firstPar}/{secPar}");

//        do the validation
//        response.then().statusCode(404).statusLine("HTTP/1.1 404 Not Found");
        response.then().statusCode(404).statusLine("HTTP/1.1 404 Not Found").contentType("text/plain; charset=utf-8");

        //System.out.println(response.headers());
        System.out.println(response.header("server"));
        //Assert.assertEquals("Cowboy",response.header("Server"));
        Assert.assertTrue(response.header("Server").contains("Cowboy"));

    }




}

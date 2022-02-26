package get_http_request_method;

import base_urls.HerokuAppBaseUrl;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
        1. set the url
        given
        2. set the expected data
        3. send the request and get the response
        when
        4. do the validation and assertion
        then
         */

/*
TASK
Given https://restful-booker.herokuapp.com/booking/3
When user sends a GET request to the url
Then HTTP status code should be 200
And   content type should be Json
And status line should be HTTP/1.1 200 OK
*/

// status code --> 200, 300, 400
// status line  --> HTTP/1.1 200 OK  --> hata var ise hangi line da oldugunu gosterir

public class Get01 extends HerokuAppBaseUrl {

    // this is primitive way, we don't prefer
    @Test
    public void get01(){

//        1. set the url
        String endpoint = "https://restful-booker.herokuapp.com/booking/3";


//        3. send the request and get the response
        Response response = given().when().get(endpoint);  // given ile request
//                                                            when ile response


        response.prettyPrint();

    }

    @Test
    public void test(){

//       1. set the url
//        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();
//        HerokuApp class da @Before kismina aldigimiz icin ihtiyacimiz kalmadi


        spec.pathParams("first","booking","secPar",3);  //int ve boolean no ""


//        2. set the expected data

//        3. send the get request and get the response

        Response response = given().spec(spec).when().get("/{first}/{secPar}");





        response.prettyPrint();

//        4. do the validation
//        response.then().statusCode(200).statusLine("HTTP/1.1 200 OK").contentType("application/json");
        response.then().statusCode(200).statusLine("HTTP/1.1 200 OK").contentType(ContentType.JSON);
        System.out.println(response.headers());




    }
}

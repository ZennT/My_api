package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class HerokuAppBaseUrl {

    // this will be null for now, until I set it
    //declare
    protected RequestSpecification spec; // it is protected bec i want to use it in subclasses(inherited ones)

    @Before
    public void setUp(){

        //initialize
        spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build(); // kullanacagimiz api dokumanin adresi


//                uri vs url -->

//                base + path + query = uri
//                https://www.amazon.com
        //                              /Amazon-Essentials-Pullover-Sweatshirt-Character/dp/B0864L926P   --> path
        //                              ?ref_=ast_sto_dp    &   th=1&psc=1                               --> query


    }

}

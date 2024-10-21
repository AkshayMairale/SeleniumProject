package Base;

import EndPoints.APIConstants;
import Modules.PayloadManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeTest;


   public class BaseTest {
    public RequestSpecBuilder requestSpecification;
    public Assertions assertions;
    public Response response;
    public JsonPath jsonPath;
    public ValidatableResponse validatableResponse;
    public PayloadManager payloadManager;
    @BeforeTest
    public void SetUp(){
        payloadManager=new PayloadManager();
        //assertions = new Assertions();
        requestSpecification= new RequestSpecBuilder();
        requestSpecification.setBaseUri(APIConstants.BASE_URL);
        requestSpecification.addHeader("Content-Type","Application/");
        requestSpecification.build().log().all();

//        requestSpecification= (RequestSpecBuilder) RestAssured.
//                given()
//                .baseUri(APIConstants.BASE_URL)
//                .contentType(ContentType.JSON).log().all();
    }

}


package Main;

import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.given;

public class TestBase {
   public RequestSpecification url;

    @BeforeClass
    public void beforeClass() {
        url = given()
                .baseUri("https://670255f7bd7c8c1ccd3e95a1.mockapi.io")
                .log().all();

    }
}

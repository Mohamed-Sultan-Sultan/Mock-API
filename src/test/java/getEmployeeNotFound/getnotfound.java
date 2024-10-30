package getEmployeeNotFound;

import Main.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getnotfound extends TestBase {
    @Test
    public void NotFound() {
        given()
                .spec(url)
                .when().get("/api/v1/employees/50")
                .then().log().all()
                .assertThat().statusCode(200);
    }
}

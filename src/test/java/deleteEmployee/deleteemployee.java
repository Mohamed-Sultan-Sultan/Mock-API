package deleteEmployee;

import Main.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class deleteemployee extends TestBase {
    @Test
    public void DeleteEmployee() {
        given()
                .spec(url)
                .when().delete("/api/v1/employees/31")
                .then().log().all()
                .assertThat().statusCode(200);
    }
}

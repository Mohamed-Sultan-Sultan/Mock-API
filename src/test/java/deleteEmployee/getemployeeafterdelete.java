package deleteEmployee;

import Main.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.empty;

public class getemployeeafterdelete extends TestBase {
    @Test
    public void AfterDelete() {
        given()
                .spec(url)
                .when().get("/api/v1/employees/31")
                .then().log().all()
                .assertThat().statusCode(404);
    }

}

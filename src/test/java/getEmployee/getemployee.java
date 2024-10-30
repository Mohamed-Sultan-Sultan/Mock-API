package getEmployee;

import Main.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class getemployee extends TestBase {
    @Test
    public void GetEmployee() {
        given()
                .spec(url)
                .when().get("/api/v1/employees/10")
                .then().log().all()
                .assertThat().statusCode(200);
    }
    @Test
    public void GetEmployee2() {
        given()
                .spec(url)
                .when().get("/api/v1/employees/10")
                .then().log().all()
                .assertThat().contentType("application/json");
    }
    @Test
    public void GetEmployee3() {
        given()
                .spec(url)
                .when().get("/api/v1/employees/10")
                .then().log().all()
                .assertThat().body("name",equalTo("Spencer Shields Sr."));
    }
    @Test
    public void GetEmployee4() {
        given()
                .spec(url)
                .when().get("/api/v1/employees/10")
                .then().log().all()
                .assertThat().body("id",not(empty()));
    }

}


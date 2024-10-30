package addEmployee;

import Main.TestBase;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class createEmployee extends TestBase{
    HashMap<String,String> add =new HashMap<>();
    @Test
    public void CreateEmployee() {
        add.put("name","Ahmed Moamer");
        add.put("dept","Sports");
        given()
                .spec(url)
                .contentType("application/json")
                .body(add )
                .when().post("/api/v1/employees")
                .then().log().all()
                .assertThat().statusCode(201);
    }
    @Test
    public void CreateEmployee2() {
        add.put("name","Ahmed Moamer");
        add.put("dept","Sports");
        given()
                .spec(url)
                .contentType("application/json")
                .body(add )
                .when().post("/api/v1/employees")
                .then().log().all()
                .assertThat().body("name",equalTo("Ahmed Moamer"));
    }
}

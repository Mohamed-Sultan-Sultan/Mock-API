package editEmployee;

import Main.TestBase;
import org.testng.annotations.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class editemployee extends TestBase {
    HashMap<String,String> edit=new HashMap<>();
    @Test
    public void EditEmployee() {
        edit.put("name","Denise Sultan");
        edit.put("dept","Sports");
        given()
                .spec(url)
                .contentType("application/json")
                .body(edit)
                .when().put("/api/v1/employees/16")
                .then().log().all()
                .assertThat().statusCode(200);
    }
    @Test
    public void EditEmployee2() {
        edit.put("name","Denise Sultan");
        edit.put("dept","Sports");
        given()
                .spec(url)
                .contentType("application/json")
                .body(edit)
                .when().put("/api/v1/employees/16")
                .then().log().all()
                .assertThat().body("name",equalTo("Denise Sultan"));
    }


}

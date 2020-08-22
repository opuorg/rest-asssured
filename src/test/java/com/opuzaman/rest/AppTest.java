
import static io.restassured.RestAssured.delete;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import org.hamcrest.Matchers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AppTest {

final static String ROOT_URI = "http://dummy.restapiexample.com/api/v1/employees";

	@Test
	public void simple_get_test() {
		Response response = get(ROOT_URI);
		// System.out.println(response.asString());
		System.out.println("result");
		// System.out.println(response.asString());
		response.then().assertThat().statusCode(200);
		// System.out.println(response.then().extract().path("data.employee_name"));
		response.then().assertThat().body("data", hasItems("employee_name"));
		// response.then().assertThat().path("data.employee_name").hasItems("Tiger Nixon");

	  
		// assertThat(response.then().extract().path("data.employee_name")).hasItems("Tiger Nixon");
		// response.then().assertThat().path("data.employee_name", hasItems("Tiger Nixon"));
		// response.then().body("name", hasItems("Pankaj"));
	}

	
}

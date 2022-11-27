package StepDefinitons;

import static io.restassured.RestAssured.given; 
import static io.restassured.RestAssured.when;

import java.util.List;
import java.util.Map;

import cucumber.api.PendingException;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;
import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import pojo.AddUser;
import cucumber.api.PendingException;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import cucumber.api.PendingException;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class Steps extends CommonMethods {
   // String base_uri ="https://gorest.co.in" ;
    Response res;
   // AddUser user=new AddUser(2968,"RahulShetty@gmail.com","male","active");
   
   String url="https://gorest.co.in";
   String token="be8f1f11ccafe8d4240ce5651c1eeedabf0982ce18e7932e79094dc9288098cf";
   String b1="{ \"name\": \"Vishwamitra Pillai\",\r\n"
   		+ "    \"email\": \"pillai_vishwamitra@schmitt.info43\",\r\n"
   		+ "    \"gender\": \"female\",\r\n"
   		+ "    \"status\": \"active\"}";
	@Given("I want to login using username and passowrd")
	public void i_want_to_login_using_username_and_passowrd() {
		//requestSpec=RestAssured.given();
		AddUser user1=new AddUser();
		user1.setEmail("hira#39@gmail.com");
		user1.setGender("female");
		user1.setStatus("active");
		user1.setName("hira");
		res=RestAssured.given().spec(requestSpec).body(user1).when().post("/public/v2/users")
		.then().log().all().statusCode(201).extract().response();
		//res = requestSpec.body(user1).when().post("/public/v2/users")
			//	.then().statusCode(201);
		
		
	}

	@When("I call the login API and Porvide body")
	public void i_call_the_login_API_and_Porvide_body() {
		int statuscode=res.getStatusCode();
		System.out.println(statuscode);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("I validate the response code and response")
	public void i_validate_the_response_code_and_response() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
	
	@Given("I want to login using {string} {string}")
	public void i_want_to_login_using_and(String string, String string2) {
		AddUser u1=new AddUser();
		u1.setEmail("abc@gmail.com");
		u1.setGender("Female");
		String gender=u1.getGender();
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		System.out.println(gender);
		
	    
	}

	@When("I want to extract X-auth")
	public void i_want_to_extract_X_auth() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I want to validate response")
	public void i_want_to_validate_response() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
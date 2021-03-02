
package com.quinbay.restassured;
import com.Example;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
public class RestAssuredDemo {

    public static void main(String[] args) {

        RestAssured.baseURI="https://reqres.in/";  //if used multiple times
//        given()
//                .queryParam("page","1")
//                .header("Content-Type","application/json")
//                .log()
//                .all()
//        .when()
//                .get("/api/users")                 //get request
//        .then()
//                .statusCode(200)
//                .assertThat()
//                .body("page",equalTo(1))
//                .log()
//                .all();
//
//
//        String body="{\n"+"\"name\":\"morpheus\",\n"+"\"job\":\"leader\"}";
//        given()
//                .queryParam("page","1")
//                .header("Content-Type","application/json")
//                .log()
//                .all()
//        .when()
//                .body(body)
//                .post("/api/users")                 //get request
//        .then()
//                .statusCode(201)
//                .assertThat()
//                .body("name",equalTo("morpheus"))
//                .assertThat()
//                .body("job",equalTo("leader"))
//                .assertThat()
//                .body(matchesJsonSchemaInClasspath("Test1.json"))
//                .log()
//                .all();

        Response response = given()
                .queryParam("page", "1")
                .header("Content-Type", "application/json")
                .log()
                .all()
                .when()
                .get("/api/users");
        System.out.println("Response" + response.prettyPrint());
        assertThat("Response incorrect", response.getStatusCode(), equalTo(200));

        String resString = response.asString();
        System.out.println("RESPONSE STRING :"+resString);
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            Example pojo=objectMapper.readValue(resString,Example.class);
            assertThat("Page not matched",pojo.getPage(),equalTo(1));
            assertThat("Size not matched",pojo.getData().size(),equalTo(6));
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
        assertThat("Duration time is more than expected",response.timeIn(TimeUnit.SECONDS),lessThan(10L));
    }



}


package com.quinbay.restassured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class RequestSpecifications {
    public static void main(String[] args) {
        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
        reqBuilder.setBaseUri("https://reqres.in/");
        reqBuilder.setBasePath("/api");
        reqBuilder.setContentType(ContentType.JSON);
        reqBuilder.log(LogDetail.ALL);
        RequestSpecification reqSpec = reqBuilder.build();
    Response response = given()
        .queryParam("page", "2")
        .spec(reqSpec)
        .when().get("/users");
    response.prettyPrint();

//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectStatusLine("HTTP/1.1 201 Ok")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                .queryParam("page", "2")
//                .spec(reqSpec)
//                .when()
//                .get("/users")
//                .then()
//                .spec(responseSpecification);

//        String body="{\n"+"\"name\":\"morpheus\",\n"+"\"job\":\"leader\"}";
//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(201)
//                .expectStatusLine("HTTP/1.1 201 Created")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                .queryParam("page", "2")
//                .spec(reqSpec)
//                .when()
//                .body(body)
//                .post("/api/users")
//                .then()
//                .spec(responseSpecification);

//        String body="{\n"+"\"name\":\"morpheus\",\n"+"\"job\":\"leader\"}";
//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectStatusLine("HTTP/1.1 200 OK")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                .queryParam("page", "2")
//                .spec(reqSpec)
//                .when()
//                .body(body)
//                .put("/users")
//                .then()
//                .spec(responseSpecification);



//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(204)
//                .expectStatusLine("HTTP/1.1 204 No Content")
//               // .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                .queryParam("page", "2")
//                .spec(reqSpec)
//                .when()
//                .delete("/users")
//                .then()
//                .spec(responseSpecification);

//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectStatusLine("HTTP/1.1 200 OK")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                .queryParam("id", "2")
//                .spec(reqSpec)
//                .when()
//                .get("/users")
//                .then()
//                .spec(responseSpecification);


//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(404)
//                .expectStatusLine("HTTP/1.1 404 Not Found")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                .queryParam("id", "23")
//                .spec(reqSpec)
//                .when()
//                .get("/users")
//                .then()
//                .spec(responseSpecification);


//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectStatusLine("HTTP/1.1 200 OK")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                .queryParam("delay", "3")
//                .spec(reqSpec)
//                .when()
//                .get("/users")
//                .then()
//                .spec(responseSpecification);

//        String body="{\n"+"\"email\":\"eve.holt@reqres.in\",\n"+"\"password\":\"pistol\"}";
//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectStatusLine("HTTP/1.1 200 OK")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//               // .queryParam("page", "3")
//                .spec(reqSpec)
//                .when()
//                .body(body)
//                .post("/register")
//                .then()
//                .spec(responseSpecification);

//        String body="{\n"+"\"email\":\"sydney@fife\"}";
//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(400)
//                .expectStatusLine("HTTP/1.1 400 Bad Request")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                // .queryParam("page", "3")
//                .spec(reqSpec)
//                .when()
//                .body(body)
//                .post("/register")
//                .then()
//                .spec(responseSpecification);


//        String body="{\n"+"\"email\":\"eve.holt@reqres.in\",\n"+"\"password\":\"cityslicka\"}";
//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectStatusLine("HTTP/1.1 200 OK")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                // .queryParam("page", "3")
//                .spec(reqSpec)
//                .when()
//                .body(body)
//                .post("/login")
//                .then()
//                .spec(responseSpecification);


//        String body="{\n"+"\"email\":\"peter@klaven\"}";
//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(400)
//                .expectStatusLine("HTTP/1.1 400 Bad Request")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                // .queryParam("page", "3")
//                .spec(reqSpec)
//                .when()
//                .body(body)
//                .post("/login")
//                .then()
//                .spec(responseSpecification);

//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectStatusLine("HTTP/1.1 200 OK")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                .queryParam("page", "1")
//                .spec(reqSpec)
//                .when()
//                .get("/unknown")
//                .then()
//                .spec(responseSpecification);


//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectStatusLine("HTTP/1.1 200 OK")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                .queryParam("page", "1")
//                .spec(reqSpec)
//                .when()
//                .get("/unknown/2")
//                .then()
//                .spec(responseSpecification);


//        String body="{\n"+"\"name\":\"morpheus\",\n"+"\"job\":\"zion resident\"}";
//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectStatusLine("HTTP/1.1 200 OK")
//                .expectContentType(ContentType.JSON)
//                .expectResponseTime(Matchers.lessThan(10000L))
//                .log(LogDetail.ALL)
//                .build();
//        given()
//                //.queryParam("page", "1")
//                .spec(reqSpec)
//                .when()
//                .body(body)
//                .patch("/users/2")
//                .then()
//                .spec(responseSpecification);


        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(404)
                .expectStatusLine("HTTP/1.1 404 Not Found")
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(10000L))
                .log(LogDetail.ALL)
                .build();
        given()
                //.queryParam("page", "1")
                .spec(reqSpec)
                .when()
                .get("/unknown/23")
                .then()
                .spec(responseSpecification);
    }
}
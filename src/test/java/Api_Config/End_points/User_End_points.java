package Api_Config.End_points;

import io.restassured.response.Response;
import Api_Config.Models.User;

import static io.restassured.RestAssured.*;
import static io.restassured.http.ContentType.JSON;

public class User_End_points
{

    public static Response createUser(User user)
    {
        return given()
                .contentType(JSON)
                .body(user)
                .when()
                .post("/api/users");
    }

    public static Response updateUser(String userId, User user)
    {
        return given()
                .contentType(JSON)
                .body(user)
                .when()
                .put("/api/users/" + userId);
    }

    public static Response getUser(String userId)
    {
        return given()
                .when()
                .get("/api/users/" + userId);
    }

    public static Response deleteUser(String userId)
    {
        return given()
                .when()
                .delete("/api/users/" + userId);
    }
}
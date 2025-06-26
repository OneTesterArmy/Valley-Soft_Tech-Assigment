package Tests;

import Api_Config.End_points.User_End_points;
import Base.Base;
import Api_Config.Models.User;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import static org.hamcrest.Matchers.*;

public class Test_Create_User extends Base
{
    public static String createdUserId;

    @Test
    public void createUserTest()
    {
        User_End_points userAPI = new User_End_points();
        User user = new User("John Doe", "Developer");

        Response response = userAPI.createUser(user);
        response.then().statusCode(201)
                .body("name", equalTo("John Doe"))
                .body("job", equalTo("Developer"))
                .body("id", notNullValue())
                .body("createdAt", notNullValue());

        createdUserId = response.jsonPath().getString("id");
        System.out.println("User created with ID: " + createdUserId);
    }
}

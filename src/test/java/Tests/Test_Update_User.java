package Tests;

import Base.Base;
import Api_Config.End_points.User_End_points;
import Api_Config.Models.User;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;


public class Test_Update_User extends Base
{
        @Test
        public void updateUserTest()
        {
            String userId = Test_Create_User.createdUserId;
            User_End_points userAPI = new User_End_points();

            User updatedUser = new User("John Doe", "Senior Developer");

            Response response = userAPI.updateUser(userId, updatedUser);
            response.then().statusCode(200)
                    .body("job", equalTo("Senior Developer"))
                    .body("updatedAt", notNullValue());

            System.out.println("User updated successfully for ID: " + userId);
        }
}


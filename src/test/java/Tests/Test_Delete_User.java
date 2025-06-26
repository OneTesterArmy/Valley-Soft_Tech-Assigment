package Tests;
import Base.Base;
import Api_Config.End_points.User_End_points;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;

public class Test_Delete_User extends Base
{
    @Test
    public void deleteUserTest()
    {
        String userId = Test_Create_User.createdUserId;
        User_End_points userAPI = new User_End_points();

        Response response = userAPI.deleteUser(userId);
        response.then().statusCode(204);

        System.out.println("User deleted for ID: " + userId);
    }
}
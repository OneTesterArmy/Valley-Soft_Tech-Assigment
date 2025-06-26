package Tests;
import Base.Base;
import Api_Config.End_points.User_End_points;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class Test_Get_Deleted_Users extends Base
{

    @Test
    public void getDeletedUserTest()
    {
        String userId = Test_Create_User.createdUserId;
        User_End_points userAPI = new User_End_points();

        Response response = userAPI.getUser(userId);
        response.then().statusCode(404);

        System.out.println("Verified deletion (404) for ID: " + userId);
    }
}
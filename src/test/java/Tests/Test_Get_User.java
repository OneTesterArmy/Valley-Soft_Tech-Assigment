package Tests;
import Base.Base;
import Api_Config.End_points.User_End_points;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.notNullValue;


public class Test_Get_User extends Base
{
        @Test
        public void getUserTest()
        {
            String userId = Test_Create_User.createdUserId;
            User_End_points userAPI = new User_End_points();

            Response response = userAPI.getUser(userId);

            // Since Reqres does not store created users, this will likely fail or return dummy data
            response.then().statusCode(200)
                    .body("data.id", notNullValue())
                    .body("data.email", containsString("@reqres.in"));

            System.out.println("Fetched user info for ID: " + userId);
        }
}

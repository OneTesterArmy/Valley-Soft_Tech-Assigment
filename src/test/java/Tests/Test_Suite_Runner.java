package Tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(
        {
        Test_Create_User.class,
        Test_Update_User.class,
        Test_Get_User.class,
        Test_Delete_User.class,
        Test_Get_Deleted_Users.class
})
public class Test_Suite_Runner
{
}

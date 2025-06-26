package Base;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class Base
{
    @BeforeAll
    public static void setup()
    {
        RestAssured.baseURI = "https://reqres.in/api/";
        RestAssured.authentication = RestAssured.DEFAULT_AUTH;
        //  This clears any global auth
    }
}
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class getS1
{
    public static void main(String [] args)
    {
        Response response = given().auth().basic("smoke","smokeSecret").given().contentType("application/json").get("https://auth.ref.o2.co.uk/identity/v1/identity/EMAIL/merge4@mailinator.com/details?active=false");
        response.prettyPrint();
    }
}

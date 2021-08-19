import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class getS2
{
    public static void main(String [] args)
    {
            Response response = given().auth().basic("smoke","smokeSecret").get("https://api0.ref.o2.co.uk/identity/v1/identity/EMAIL/merge4@mailinator.com/details?active=false");
            response.prettyPrint();

    }
}

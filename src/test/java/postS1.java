import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class postS1
{
    public static void main(String [] args)
    {
        String body = "{\"email\":\"3008@mailinator.com\"}";
        Response response = given().contentType(ContentType.JSON).body(body).post("https://auth.ref.o2.co.uk/identity/v4/identity");
        response.prettyPrint();
        response.getStatusCode();

    }
}

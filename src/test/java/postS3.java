import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class postS3
{
    public static void main(String [] args)
    {
        Response response = given().contentType(ContentType.JSON).log().all().body(new File("/home/sagar/projects/testingAutomation/src/test/resources/user.json")).post("https://auth.ref.o2.co.uk/identity/v4/identity");
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }

}

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class postS8
{
    public static void main (String [] args)
    {
        postS7 user = new postS7("dfg","asd","123@test.com");
        Response response = given().contentType(ContentType.JSON).body(user).log().all().post("https://auth.ref.o2.co.uk/identity/v4/identity");
        response.prettyPrint();
        System.out.println(response.getStatusCode());

    }
}

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class postS2
{
    public static void main (String [] args)
    {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("email","randomtest0990@mailinator.com");
        Response response =given().contentType(ContentType.JSON).body(map).post("https://auth.ref.o2.co.uk/identity/v4/identity");
        response.prettyPrint();
    }
}

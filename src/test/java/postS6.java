import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class postS6
{

    public static void main (String [] args)
    {
        JSONArray mainbody = new JSONArray();
        mainbody.put("platinum");
        Response response =given().contentType(ContentType.JSON).body(mainbody.toString()).log().all().put("https://auth.ref.o2.co.uk/identity/v1/identity/UID/20000000000000189839/flag");
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
}

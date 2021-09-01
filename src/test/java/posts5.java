import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class posts5
{
    public static void main (String [] args)
    {
        JSONObject mainbody = new JSONObject();
        JSONObject addressbody = new JSONObject();
        addressbody.put("Street","asd");
        JSONArray phonelist = new JSONArray();
        phonelist.put("1234");
        phonelist.put("5678");
        addressbody.put("phone",phonelist);
        mainbody.put("address",addressbody);
        mainbody.put("name","test");
        mainbody.put("email","123@test.com");
        Response response = given().contentType(ContentType.JSON).body(mainbody.toString()).log().all().post("https://auth.ref.o2.co.uk/identity/v3/identity");
        response.prettyPrint();
        System.out.println(response.getStatusCode());

    }
}

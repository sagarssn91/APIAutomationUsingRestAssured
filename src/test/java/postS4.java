import io.restassured.http.ContentType;
import io.restassured.response.Response;
import jdk.nashorn.api.scripting.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import static io.restassured.RestAssured.given;

public class postS4
{
    public static void main(String [] args)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("email","test123@test.com");
        jsonobject.put("name","test");

        JSONObject address =new JSONObject();
        address.put("street","asd");

        jsonobject.put("address",address);


        JSONArray listofPhone = new JSONArray();
        listofPhone.put(123);
        listofPhone.put(345);

        jsonobject.put("phone",listofPhone);

        Response response = given().contentType(ContentType.JSON).body(jsonobject.toString()).log().all().post("https://auth.ref.o2.co.uk/identity/v3/identity");
        response.prettyPrint();








    }
}

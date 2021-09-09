import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ConstructingBodyUsingPojo
{
    public static void main(String[]args)
    {
        PojoUser req=new PojoUser("test0809@mailinator.com","xyz","abc");
        Response response = given().body(req).log().all().contentType(ContentType.JSON).post("https://auth.ref.o2.co.uk/identity/v4/identity");
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
}

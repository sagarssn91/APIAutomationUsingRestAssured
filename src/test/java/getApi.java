import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class getApi

{
    public static void main(String [] args)
        {
            Response response = given().auth().basic("smoke","smokeSecret").get("https://auth.ref.o2.co.uk/identity/v1/identity/identity-details?identifier=CAID&identifier_value=8159467121040617422&active=false");
            response.prettyPrint();
        }
}

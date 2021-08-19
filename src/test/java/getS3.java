import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class getS3
{
    public static void main(String [] args)
    {
        Response response = given().header("Authorization","Basic c21va2U6c21va2VTZWNyZXQ=").get("https://api0.ref.o2.co.uk/identity/v1/identity/EMAIL/merge4@mailinator.com/details?active=false");
        response.prettyPrint();
    }
}

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class getS3
{
   /* public static void main(String [] args)
    {
        Response response = given().header("Authorization","Basic c21va2U6c21va2VTZWNyZXQ=").get("https://api0.ref.o2.co.uk/identity/v1/identity/EMAIL/merge4@mailinator.com/details?active=false");
        response.prettyPrint();
        System.out.println("Status Code is "+ response.getStatusCode());
    }*/
  public static void main(String [] args)
   {
       Response response = given().auth().basic("smoke","smokeSecret").contentType(ContentType.JSON).formParam("email","id@test.com").post("https://auth.ref.o2.co.uk/identity/v4/identity");
       response.prettyPrint();
       System.out.println("Status Code is " + response.getStatusCode());

   }
   /*public static  void main(String [] args)
   {
       String requestBody = "{\"email\":\"idtest6543@mailinator.com\"}";
       Response response = given().contentType(ContentType.JSON).body(requestBody).post("https://auth.ref.o2.co.uk/identity/v4/identity");
       response.prettyPrint();
       System.out.println(response.statusCode());

   }*/
    /*public static  void main(String [] args)
   {
       HashMap<String,String> map = new HashMap<String,String>();
       map.put("email","wednesday123@mailinator.com");
       map.put("given_name","identity");
       Response response = given().contentType(ContentType.JSON).body(map).post("https://auth.ref.o2.co.uk/identity/v4/identity");
       response.prettyPrint();
       System.out.println(response.statusCode());

   }*/

}

package starter.altashop.order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostOrder {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set the POST api endpoints in order")
    public String POSTApiEndpointsInOrder(){
        return url + "orders";
    }
    @Step("I send HTTP api POST request for order")
    public void piPOSTRequestForOrder(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 13347);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkdpdGEgTGVvbmkgZHdpIGZyaXAiLCJFbWFpbCI6ImdpdGFsZWUyMUBnbWFpbC5jb20ifQ.TGsRtCS1_W5fQoxLxVSMhDknX_uoRVw_0tYCGs1StVE")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(POSTApiEndpointsInOrder());
    }
    @Step("I receive a valid HTTP response code 200 on the order POST")
    public void ValidHTTPResponseCodeOnTheOrderPOST(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for create new order")
    public void ValidDataForCreateNewOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }

}

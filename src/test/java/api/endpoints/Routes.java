package api.endpoints;

/* 
Swagger URI --> https://petstore.swagger.io

Create user(Post) : https://petstore.swagger.io/v2/user
Get user (Get): https://petstore.swagger.io/v2/user/{username}
Update user (Put) : https://petstore.swagger.io/v2/user/{username}
Delete user (Delete) : https://petstore.swagger.io/v2/user/{username}

*/

public class Routes {

	public static String base_url="https://petstore.swagger.io/v2" ;
	
	//User module
	
	public static String post_url=base_url+"/user";
    public static String get_url=base_url+"/user/{username}";
    public static String update_url=base_url+"/user/{username}";
    public static String delete_url=base_url+"/user/{username}";
    
    //Store module
 	
    public static String orderPost_url = base_url + "/store/order";
    public static String orderGet_url = base_url + "/store/order/{orderId}";
    public static String orderDelete_url = base_url + "/store/order/{orderId}";
    public static String inventory_url = base_url + "/store/inventory";
    //Pet module
    
    
    public static String petPost_url = base_url + "/pet";
    public static String petGet_url = base_url + "/pet/{petId}";
    public static String petUpdate_url = base_url + "";
    public static String petDelete_url = base_url+"/pet/{petId}";

    
    
}

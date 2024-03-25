# LoginApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**userCredentials**](LoginApi.md#userCredentials) | **POST** /{companyDomain}/v1/login | User Login |


<a name="userCredentials"></a>
# **userCredentials**
> userCredentials(companyDomain, login).applicationKey(applicationKey).user(user).password(password).execute();

User Login

User Login

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LoginApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.bamboohr.com/api/gateway.php";
    
    // Configure OAuth2 access token for authorization: auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    BambooHr client = new BambooHr(configuration);
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    String applicationKey = "applicationKey_example"; // 
    String user = "user_example"; // 
    String password = "password_example"; // 
    try {
      client
              .login
              .userCredentials(companyDomain)
              .applicationKey(applicationKey)
              .user(user)
              .password(password)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginApi#userCredentials");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .login
              .userCredentials(companyDomain)
              .applicationKey(applicationKey)
              .user(user)
              .password(password)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginApi#userCredentials");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyDomain** | **String**| The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \&quot;mycompany\&quot; | |
| **login** | [**Login**](Login.md)|  | |
| **applicationKey** | **String**|  | [optional] |
| **user** | **String**|  | [optional] |
| **password** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


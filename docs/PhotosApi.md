# PhotosApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEmployeePhoto**](PhotosApi.md#getEmployeePhoto) | **GET** /{companyDomain}/v1/employees/{employeeId}/photo/{size} | Get an employee photo |
| [**storeNewEmployeePhoto**](PhotosApi.md#storeNewEmployeePhoto) | **POST** /{companyDomain}/v1/employees/{employeeId}/photo | Store a new employee photo |


<a name="getEmployeePhoto"></a>
# **getEmployeePhoto**
> getEmployeePhoto(companyDomain, employeeId, size).execute();

Get an employee photo

Get an employee photo

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PhotosApi;
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
    String employeeId = "employeeId_example"; // The ID for the employee you are getting the photo for.
    String size = "original"; // Photo size
    try {
      client
              .photos
              .getEmployeePhoto(companyDomain, employeeId, size)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhotosApi#getEmployeePhoto");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .photos
              .getEmployeePhoto(companyDomain, employeeId, size)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhotosApi#getEmployeePhoto");
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
| **employeeId** | **String**| The ID for the employee you are getting the photo for. | |
| **size** | **String**| Photo size | [enum: original, large, medium, xs, tiny] |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="storeNewEmployeePhoto"></a>
# **storeNewEmployeePhoto**
> storeNewEmployeePhoto(companyDomain, employeeId).execute();

Store a new employee photo

Store a new employee photo

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PhotosApi;
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
    String employeeId = "employeeId_example"; // The ID for the employee you are setting the photo for.
    try {
      client
              .photos
              .storeNewEmployeePhoto(companyDomain, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhotosApi#storeNewEmployeePhoto");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .photos
              .storeNewEmployeePhoto(companyDomain, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhotosApi#storeNewEmployeePhoto");
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
| **employeeId** | **String**| The ID for the employee you are setting the photo for. | |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The file was successfully uploaded |  -  |
| **404** | if the employee doesn&#39;t exist |  -  |
| **413** | if the file is too big. |  -  |
| **415** | if the file is not in a supported file format or if the width doesn&#39;t match the height. |  -  |


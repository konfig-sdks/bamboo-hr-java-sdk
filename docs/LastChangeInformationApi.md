# LastChangeInformationApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getChangedEmployeeIds**](LastChangeInformationApi.md#getChangedEmployeeIds) | **GET** /{companyDomain}/v1/employees/changed | Gets all updated employee IDs |


<a name="getChangedEmployeeIds"></a>
# **getChangedEmployeeIds**
> getChangedEmployeeIds(companyDomain, since).type(type).execute();

Gets all updated employee IDs

This API allows for efficient syncing of employee data. When you use this API you will provide a timestamp and the results will be limited to just the employees that have changed since the time you provided. This API operates on an employee-last-changed-timestamp, which means that a change in ANY individual field in the employee record, as well as any change to the employment status, job info, or compensation tables, will cause that employee to be returned via this API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LastChangeInformationApi;
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
    String since = "since_example"; // URL encoded iso8601 timestamp
    String type = "type_example"; // Use one of these in the {type} variable in the URL: \"inserted\", \"updated\", \"deleted\"
    try {
      client
              .lastChangeInformation
              .getChangedEmployeeIds(companyDomain, since)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LastChangeInformationApi#getChangedEmployeeIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lastChangeInformation
              .getChangedEmployeeIds(companyDomain, since)
              .type(type)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LastChangeInformationApi#getChangedEmployeeIds");
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
| **since** | **String**| URL encoded iso8601 timestamp | |
| **type** | **String**| Use one of these in the {type} variable in the URL: \&quot;inserted\&quot;, \&quot;updated\&quot;, \&quot;deleted\&quot; | [optional] |

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


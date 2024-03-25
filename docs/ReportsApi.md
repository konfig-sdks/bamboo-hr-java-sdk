# ReportsApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**companyReport**](ReportsApi.md#companyReport) | **GET** /{companyDomain}/v1/reports/{id} | Get company report |
| [**requestCustomReport**](ReportsApi.md#requestCustomReport) | **POST** /{companyDomain}/v1/reports/custom | Request a custom report |


<a name="companyReport"></a>
# **companyReport**
> companyReport(companyDomain, id, format).fd(fd).onlyCurrent(onlyCurrent).execute();

Get company report

Use this resource to request one of your existing custom company reports from the My Reports or Manage Reports sections in the Reports tab. You can get the report number by hovering over the report name and noting the ID from the URL. At present, only reports from the My Reports or Manage Reports sections are supported. In the future we may implement reports from the Standard Reports section if there is enough demand for it. The report numbers used in this request are different in each company.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
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
    String id = "id_example"; // {id} is a report ID.
    String format = "format_example"; // The output format for the report. Supported formats: CSV, PDF, XLS, XML, JSON
    String fd = "fd_example"; // yes=apply standard duplicate field filtering, no=return the raw results with no duplicate filtering. Default value is \"yes\"
    Boolean onlyCurrent = true; // Setting to false will return future dated values from history table fields.
    try {
      client
              .reports
              .companyReport(companyDomain, id, format)
              .fd(fd)
              .onlyCurrent(onlyCurrent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#companyReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reports
              .companyReport(companyDomain, id, format)
              .fd(fd)
              .onlyCurrent(onlyCurrent)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#companyReport");
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
| **id** | **String**| {id} is a report ID. | |
| **format** | **String**| The output format for the report. Supported formats: CSV, PDF, XLS, XML, JSON | |
| **fd** | **String**| yes&#x3D;apply standard duplicate field filtering, no&#x3D;return the raw results with no duplicate filtering. Default value is \&quot;yes\&quot; | [optional] |
| **onlyCurrent** | **Boolean**| Setting to false will return future dated values from history table fields. | [optional] [default to true] |

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
| **200** | All fields available in BambooHR. |  -  |
| **404** | if you request a nonexistent report number. |  -  |

<a name="requestCustomReport"></a>
# **requestCustomReport**
> requestCustomReport(companyDomain, format, requestCustomReport).onlyCurrent(onlyCurrent).execute();

Request a custom report

Use this resource to request BambooHR generate a report. You must specify a type of either \&quot;PDF\&quot;, \&quot;XLS\&quot;, \&quot;CSV\&quot;, \&quot;JSON\&quot;, or \&quot;XML\&quot;. You must specify a list of fields to show on the report. The list of fields is available here. The custom report will return employees regardless of their status, \&quot;Active\&quot; or \&quot;Inactive\&quot;. This differs from the UI, which by default applies a quick filter to display only \&quot;Active\&quot; employees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
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
    String format = "format_example"; // The output format for the report. Supported formats: CSV, PDF, XLS, XML, JSON
    String title = "title_example"; // 
    RequestCustomReportFilters filters = new RequestCustomReportFilters();
    List<String> fields = Arrays.asList(); // 
    Boolean onlyCurrent = true; // Limits the report to only current employees. Setting to false will include future-dated employees in the report.
    try {
      client
              .reports
              .requestCustomReport(companyDomain, format)
              .title(title)
              .filters(filters)
              .fields(fields)
              .onlyCurrent(onlyCurrent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#requestCustomReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .reports
              .requestCustomReport(companyDomain, format)
              .title(title)
              .filters(filters)
              .fields(fields)
              .onlyCurrent(onlyCurrent)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#requestCustomReport");
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
| **format** | **String**| The output format for the report. Supported formats: CSV, PDF, XLS, XML, JSON | |
| **requestCustomReport** | [**RequestCustomReport**](RequestCustomReport.md)|  | |
| **onlyCurrent** | **Boolean**| Limits the report to only current employees. Setting to false will include future-dated employees in the report. | [optional] [default to true] |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Custom report successfully requested |  -  |


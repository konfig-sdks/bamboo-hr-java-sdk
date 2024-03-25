# HoursApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkRecordEdit**](HoursApi.md#bulkRecordEdit) | **POST** /{companyDomain}/v1/timetracking/record | Bulk add/edit hour records |
| [**deleteHourRecord**](HoursApi.md#deleteHourRecord) | **DELETE** /{companyDomain}/v1/timetracking/delete/{id} | Delete an hour record |
| [**editHourRecord**](HoursApi.md#editHourRecord) | **PUT** /{companyDomain}/v1/timetracking/adjust | Edit an hour record |
| [**getHourRecord**](HoursApi.md#getHourRecord) | **GET** /{companyDomain}/v1/timetracking/record/{id} | Get an hour record |
| [**recordAddition**](HoursApi.md#recordAddition) | **POST** /{companyDomain}/v1/timetracking/add | Add an hour record |


<a name="bulkRecordEdit"></a>
# **bulkRecordEdit**
> bulkRecordEdit(companyDomain, timeTrackingRecord).execute();

Bulk add/edit hour records

Bulk add/edit hour records

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HoursApi;
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
    try {
      client
              .hours
              .bulkRecordEdit(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursApi#bulkRecordEdit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hours
              .bulkRecordEdit(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursApi#bulkRecordEdit");
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
| **timeTrackingRecord** | [**List&lt;TimeTrackingRecord&gt;**](TimeTrackingRecord.md)|  | |

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
| **201** | An array of objects with success as true or false depending on the success of each time tracking object in the request along with the successful IDs or the reason of the error. |  -  |

<a name="deleteHourRecord"></a>
# **deleteHourRecord**
> deleteHourRecord(companyDomain, id).execute();

Delete an hour record

Delete an hour record

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HoursApi;
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
    String id = "id_example"; // The time tracking id is the id that was used to track the record up to 36 characters in length. (i.e. UUID).
    try {
      client
              .hours
              .deleteHourRecord(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursApi#deleteHourRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hours
              .deleteHourRecord(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursApi#deleteHourRecord");
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
| **id** | **String**| The time tracking id is the id that was used to track the record up to 36 characters in length. (i.e. UUID). | |

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
| **201** | Record removed. |  -  |
| **400** | If the time tracking ID cannot be found. |  -  |

<a name="editHourRecord"></a>
# **editHourRecord**
> editHourRecord(companyDomain, hoursEditHourRecordRequest).execute();

Edit an hour record

Edit an hour record

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HoursApi;
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
    String timeTrackingId = "timeTrackingId_example"; // The time tracking id is the id that was used to track the record up to 36 characters in length. (i.e. UUID).
    Float hoursWorked = 3.4F; // The updated number of hours worked. e.g. if Employee A worked 8.0 hours originally and decided they only worked 6.0, please send 6.0 here not -2.0.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    try {
      client
              .hours
              .editHourRecord(timeTrackingId, hoursWorked, companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursApi#editHourRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hours
              .editHourRecord(timeTrackingId, hoursWorked, companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursApi#editHourRecord");
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
| **hoursEditHourRecordRequest** | [**HoursEditHourRecordRequest**](HoursEditHourRecordRequest.md)|  | |

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
| **201** | The time tracking ID will be returned in JSON. |  -  |
| **400** | if any required field is missing, any of the IDs are invalid, or the posted JSON is not valid |  -  |

<a name="getHourRecord"></a>
# **getHourRecord**
> getHourRecord(companyDomain, id).execute();

Get an hour record

Get an hour record

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HoursApi;
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
    String id = "id_example"; // {id} is the time tracking ID used to originally create the record.
    try {
      client
              .hours
              .getHourRecord(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursApi#getHourRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hours
              .getHourRecord(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursApi#getHourRecord");
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
| **id** | **String**| {id} is the time tracking ID used to originally create the record. | |

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
| **200** | The response content will be a JSON document with the requested information. |  -  |
| **400** | Invalid or missing argument. |  -  |
| **500** | Server error. |  -  |

<a name="recordAddition"></a>
# **recordAddition**
> recordAddition(companyDomain, timeTrackingRecord).execute();

Add an hour record

Add an hour record

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HoursApi;
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
    String timeTrackingId = "timeTrackingId_example"; // A unique identifier for the record. Use this ID to adjust or delete these hours. It can be any ID you use to track the record up to 36 characters in length. (i.e. UUID).
    Integer employeeId = 56; // The ID of the employee.
    String dateHoursWorked = "dateHoursWorked_example"; // The date the hours were worked. Please use the ISO-8601 date format YYYY-MM-DD.
    String rateType = "rateType_example"; // The type of hours - regular or overtime. Please use either \\\"REG\\\" or \\\"OT\\\" here.
    Float hoursWorked = 3.4F; // The number of hours worked.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    Integer divisionId = 56; // [Optional] The ID of the division for the employee.
    Integer departmentId = 56; // [Optional] The ID of the department for the employee.
    Integer jobTitleId = 56; // [Optional] The ID of the job title for the employee.
    String payCode = "payCode_example"; // [Optional] Only necessary if the payroll provider requires a pay code
    Float payRate = 3.4F; // [Optional] The rate of pay. e.g. $15.00/hour should use 15.00 here. Only necessary if the payroll provider requires a pay rate.
    Integer jobCode = 56; // [Optional] A job code.
    String jobData = "jobData_example"; // [Optional] A list of up to four 20 characters max job numbers in comma delimited format with no spaces.
    try {
      client
              .hours
              .recordAddition(timeTrackingId, employeeId, dateHoursWorked, rateType, hoursWorked, companyDomain)
              .divisionId(divisionId)
              .departmentId(departmentId)
              .jobTitleId(jobTitleId)
              .payCode(payCode)
              .payRate(payRate)
              .jobCode(jobCode)
              .jobData(jobData)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursApi#recordAddition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hours
              .recordAddition(timeTrackingId, employeeId, dateHoursWorked, rateType, hoursWorked, companyDomain)
              .divisionId(divisionId)
              .departmentId(departmentId)
              .jobTitleId(jobTitleId)
              .payCode(payCode)
              .payRate(payRate)
              .jobCode(jobCode)
              .jobData(jobData)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursApi#recordAddition");
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
| **timeTrackingRecord** | [**TimeTrackingRecord**](TimeTrackingRecord.md)|  | |

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
| **201** | The time tracking ID will be returned in JSON. |  -  |
| **400** | If any required field is missing, any of the IDs are invalid, or the posted JSON is not valid. |  -  |


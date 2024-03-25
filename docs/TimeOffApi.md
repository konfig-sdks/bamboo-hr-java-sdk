# TimeOffApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTimeOffHistoryItem**](TimeOffApi.md#addTimeOffHistoryItem) | **PUT** /{companyDomain}/v1/employees/{employeeId}/time_off/history | Add a Time Off History Item For Time Off Request |
| [**assignEmployeePolicies**](TimeOffApi.md#assignEmployeePolicies) | **PUT** /{companyDomain}/v1/employees/{employeeId}/time_off/policies | Assign Time Off Policies for an Employee |
| [**assignEmployeePoliciesV11**](TimeOffApi.md#assignEmployeePoliciesV11) | **PUT** /{companyDomain}/v1_1/employees/{employeeId}/time_off/policies | Assign Time Off Policies for an Employee, Version 1.1 |
| [**balanceAdjustmentPut**](TimeOffApi.md#balanceAdjustmentPut) | **PUT** /{companyDomain}/v1/employees/{employeeId}/time_off/balance_adjustment | Adjust Time Off Balance |
| [**changeRequestStatus**](TimeOffApi.md#changeRequestStatus) | **PUT** /{companyDomain}/v1/time_off/requests/{requestId}/status | Change a Request Status |
| [**estimateFutureTimeOffBalances**](TimeOffApi.md#estimateFutureTimeOffBalances) | **GET** /{companyDomain}/v1/employees/{employeeId}/time_off/calculator | Estimate Future Time Off Balances |
| [**getPolicies**](TimeOffApi.md#getPolicies) | **GET** /{companyDomain}/v1/meta/time_off/policies | Get Time Off Policies |
| [**getTimeOffRequests**](TimeOffApi.md#getTimeOffRequests) | **GET** /{companyDomain}/v1/time_off/requests | Get Time Off Requests |
| [**getTimeOffTypes**](TimeOffApi.md#getTimeOffTypes) | **GET** /{companyDomain}/v1/meta/time_off/types | Get Time Off Types |
| [**getWhosOutList**](TimeOffApi.md#getWhosOutList) | **GET** /{companyDomain}/v1/time_off/whos_out | Get a list of Who&#39;s Out |
| [**listEmployeePolicies**](TimeOffApi.md#listEmployeePolicies) | **GET** /{companyDomain}/v1_1/employees/{employeeId}/time_off/policies | List Time Off Policies for Employee, Version 1.1 |
| [**listEmployeeTimeOffPolicies**](TimeOffApi.md#listEmployeeTimeOffPolicies) | **GET** /{companyDomain}/v1/employees/{employeeId}/time_off/policies | List Time Off Policies for Employee |
| [**requestCreation**](TimeOffApi.md#requestCreation) | **PUT** /{companyDomain}/v1/employees/{employeeId}/time_off/request | Add a Time Off Request |


<a name="addTimeOffHistoryItem"></a>
# **addTimeOffHistoryItem**
> addTimeOffHistoryItem(companyDomain, employeeId, timeOffHistory).execute();

Add a Time Off History Item For Time Off Request

To use this API make an HTTP PUT where the body of the request is the JSON documented below. A new time off history item will be inserted into the database. On success, a 201 Created code is returned and the \&quot;Location\&quot; header of the response will contain a URL that identifies the new history item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String date = "date_example"; // The date the request should be added in history. This will usually be the first date of the request. Should be in ISO8601 date format (YYYY-MM-DD).
    Integer timeOffRequestId = 56; // The ID of the time off request.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    Integer employeeId = 56; // The ID of the employee.
    String note = "note_example"; // This is an optional note to show in history.
    try {
      client
              .timeOff
              .addTimeOffHistoryItem(date, timeOffRequestId, companyDomain, employeeId)
              .note(note)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#addTimeOffHistoryItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .addTimeOffHistoryItem(date, timeOffRequestId, companyDomain, employeeId)
              .note(note)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#addTimeOffHistoryItem");
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
| **employeeId** | **Integer**| The ID of the employee. | |
| **timeOffHistory** | [**TimeOffHistory**](TimeOffHistory.md)|  | |

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
| **201** | The history item has been created. |  -  |
| **400** | For empty or malformed JSON, an invalid date format, or an invalid time off request. |  -  |
| **403** | Invalid permissions to perform this action. |  -  |
| **409** | If the time off request already has a history item. |  -  |

<a name="assignEmployeePolicies"></a>
# **assignEmployeePolicies**
> assignEmployeePolicies(companyDomain, employeeId, timeOffPoliciesInner).execute();

Assign Time Off Policies for an Employee

To use this API make an HTTP PUT where the body of the request is the JSON documented below. A time off policy will be assigned to the employee with accruals starting on the date specified. A null start date will remove the assignment. On success, a 200 Success code is returned and the content of the response will be the same as the List Time off Policies API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String employeeId = "employeeId_example"; // 
    try {
      client
              .timeOff
              .assignEmployeePolicies(companyDomain, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#assignEmployeePolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .assignEmployeePolicies(companyDomain, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#assignEmployeePolicies");
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
| **employeeId** | **String**|  | |
| **timeOffPoliciesInner** | [**List&lt;TimeOffPoliciesInner&gt;**](TimeOffPoliciesInner.md)|  | |

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
| **200** |  |  -  |

<a name="assignEmployeePoliciesV11"></a>
# **assignEmployeePoliciesV11**
> assignEmployeePoliciesV11(companyDomain, employeeId, timeOffPoliciesInner).execute();

Assign Time Off Policies for an Employee, Version 1.1

To use this API make an HTTP PUT where the body of the request is the JSON documented below. A time off policy will be assigned to the employee with accruals starting on the date specified. On success, a 200 Success code is returned and the content of the response will be the same as the List Time off Policies API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String employeeId = "employeeId_example"; // 
    try {
      client
              .timeOff
              .assignEmployeePoliciesV11(companyDomain, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#assignEmployeePoliciesV11");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .assignEmployeePoliciesV11(companyDomain, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#assignEmployeePoliciesV11");
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
| **employeeId** | **String**|  | |
| **timeOffPoliciesInner** | [**List&lt;TimeOffPoliciesInner&gt;**](TimeOffPoliciesInner.md)|  | |

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
| **200** |  |  -  |

<a name="balanceAdjustmentPut"></a>
# **balanceAdjustmentPut**
> balanceAdjustmentPut(companyDomain, employeeId, adjustTimeOffBalance).execute();

Adjust Time Off Balance

To use this API make an HTTP PUT where the body of the request is the JSON documented below. A time off balance adjustment will be inserted into the database. On success, a 201 Created code is returned and the \&quot;Location\&quot; header of the response will contain a URL that identifies the new history item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String date = "date_example"; // The date the adjustment should be added in history. Should be in ISO8601 date format (YYYY-MM-DD).
    Integer timeOffTypeId = 56; // The ID of the time off type to add a balance adjustment for.
    Float amount = 3.4F; // The number of hours/days to adjust the balance by.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    Integer employeeId = 56; // The ID of the employee.
    String note = "note_example"; // This is an optional note to show in history.
    try {
      client
              .timeOff
              .balanceAdjustmentPut(date, timeOffTypeId, amount, companyDomain, employeeId)
              .note(note)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#balanceAdjustmentPut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .balanceAdjustmentPut(date, timeOffTypeId, amount, companyDomain, employeeId)
              .note(note)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#balanceAdjustmentPut");
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
| **employeeId** | **Integer**| The ID of the employee. | |
| **adjustTimeOffBalance** | [**AdjustTimeOffBalance**](AdjustTimeOffBalance.md)|  | |

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
| **201** | The balance adjustment has been created. |  -  |
| **400** | For empty or malformed JSON, an invalid date format, or an invalid time off type. |  -  |
| **403** | Invalid permissions to perform this action. |  -  |

<a name="changeRequestStatus"></a>
# **changeRequestStatus**
> changeRequestStatus(companyDomain, requestId, request).execute();

Change a Request Status

This endpoint allows you to change the status of a request in the system. You can use this to approve, deny, or cancel a time off request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String requestId = "requestId_example"; // 
    String status = "status_example"; // One of approved, cancelled, denied
    String note = "note_example"; // A note to attach to the change in status
    try {
      client
              .timeOff
              .changeRequestStatus(companyDomain, requestId)
              .status(status)
              .note(note)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#changeRequestStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .changeRequestStatus(companyDomain, requestId)
              .status(status)
              .note(note)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#changeRequestStatus");
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
| **requestId** | **String**|  | |
| **request** | [**Request**](Request.md)|  | |

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
| **200** | The status has been updated. |  -  |
| **400** | If the posted XML is invalid or the status is not \&quot;approved\&quot;, \&quot;denied\&quot;, \&quot;canceled\&quot;, or \&quot;declined\&quot;. |  -  |
| **403** | If the current user doesn&#39;t have access to change the status in this way. |  -  |
| **404** | If the time off request ID doesn&#39;t exist. |  -  |

<a name="estimateFutureTimeOffBalances"></a>
# **estimateFutureTimeOffBalances**
> estimateFutureTimeOffBalances(companyDomain, end, employeeId).execute();

Estimate Future Time Off Balances

This endpoint will sum future time off accruals, scheduled time off, and carry-over events to produce estimates for the anticipated time off balance on a given date in the future.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    OffsetDateTime end = OffsetDateTime.now(); // 
    String employeeId = "employeeId_example"; // 
    try {
      client
              .timeOff
              .estimateFutureTimeOffBalances(companyDomain, end, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#estimateFutureTimeOffBalances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .estimateFutureTimeOffBalances(companyDomain, end, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#estimateFutureTimeOffBalances");
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
| **end** | **OffsetDateTime**|  | |
| **employeeId** | **String**|  | |

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

<a name="getPolicies"></a>
# **getPolicies**
> getPolicies(companyDomain).execute();

Get Time Off Policies

This endpoint gets a list of time off policies.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
              .timeOff
              .getPolicies(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getPolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .getPolicies(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getPolicies");
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

<a name="getTimeOffRequests"></a>
# **getTimeOffRequests**
> getTimeOffRequests(companyDomain, start, end).id(id).action(action).employeeId(employeeId).type(type).status(status).execute();

Get Time Off Requests



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String start = "start_example"; // YYYY-MM-DD. Only show time off that occurs on/after the specified start date.
    String end = "end_example"; // YYYY-MM-DD. Only show time off that occurs on/before the specified end date.
    Integer id = 56; // A particular request ID to limit the response to.
    String action = "action_example"; // Limit to requests that the user has a particular level of access to. Legal values are: \"view\" or \"approve\". Defaults to view.
    String employeeId = "employeeId_example"; // A particular employee ID to limit the response to.
    String type = "type_example"; // A comma separated list of time off types IDs to include limit the response to. If omitted, requests of all types are included.
    String status = "status_example"; // A comma separated list of request status values to include. If omitted, requests of all status values are included. Legal values are \"approved\", \"denied\", \"superceded\", \"requested\", \"canceled\".
    try {
      client
              .timeOff
              .getTimeOffRequests(companyDomain, start, end)
              .id(id)
              .action(action)
              .employeeId(employeeId)
              .type(type)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getTimeOffRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .getTimeOffRequests(companyDomain, start, end)
              .id(id)
              .action(action)
              .employeeId(employeeId)
              .type(type)
              .status(status)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getTimeOffRequests");
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
| **start** | **String**| YYYY-MM-DD. Only show time off that occurs on/after the specified start date. | |
| **end** | **String**| YYYY-MM-DD. Only show time off that occurs on/before the specified end date. | |
| **id** | **Integer**| A particular request ID to limit the response to. | [optional] |
| **action** | **String**| Limit to requests that the user has a particular level of access to. Legal values are: \&quot;view\&quot; or \&quot;approve\&quot;. Defaults to view. | [optional] |
| **employeeId** | **String**| A particular employee ID to limit the response to. | [optional] |
| **type** | **String**| A comma separated list of time off types IDs to include limit the response to. If omitted, requests of all types are included. | [optional] |
| **status** | **String**| A comma separated list of request status values to include. If omitted, requests of all status values are included. Legal values are \&quot;approved\&quot;, \&quot;denied\&quot;, \&quot;superceded\&quot;, \&quot;requested\&quot;, \&quot;canceled\&quot;. | [optional] |

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
| **400** | Malformed request |  -  |

<a name="getTimeOffTypes"></a>
# **getTimeOffTypes**
> getTimeOffTypes(companyDomain).mode(mode).execute();

Get Time Off Types

This endpoint gets a list of time off types.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String mode = "mode_example"; // set to 'request' to get a list of all time off types with which this user can create a time off request. The default is to return the list of time off types the user has permissions on. This distinction is important, as employees can request time off for types that they don't have permission to view balances and requests for.
    try {
      client
              .timeOff
              .getTimeOffTypes(companyDomain)
              .mode(mode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getTimeOffTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .getTimeOffTypes(companyDomain)
              .mode(mode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getTimeOffTypes");
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
| **mode** | **String**| set to &#39;request&#39; to get a list of all time off types with which this user can create a time off request. The default is to return the list of time off types the user has permissions on. This distinction is important, as employees can request time off for types that they don&#39;t have permission to view balances and requests for. | [optional] |

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
| **200** | Time off types |  -  |

<a name="getWhosOutList"></a>
# **getWhosOutList**
> getWhosOutList(companyDomain).start(start).end(end).execute();

Get a list of Who&#39;s Out

This endpoint will return a list, sorted by date, of employees who will be out, and company holidays, for a period of time.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String start = "start_example"; // A date in the form YYYY-MM-DD - defaults to the current date.
    String end = "end_example"; // A date in the form YYYY-MM-DD - defaults to 14 days from the start date.
    try {
      client
              .timeOff
              .getWhosOutList(companyDomain)
              .start(start)
              .end(end)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getWhosOutList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .getWhosOutList(companyDomain)
              .start(start)
              .end(end)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getWhosOutList");
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
| **start** | **String**| A date in the form YYYY-MM-DD - defaults to the current date. | [optional] |
| **end** | **String**| A date in the form YYYY-MM-DD - defaults to 14 days from the start date. | [optional] |

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

<a name="listEmployeePolicies"></a>
# **listEmployeePolicies**
> listEmployeePolicies(companyDomain, employeeId).execute();

List Time Off Policies for Employee, Version 1.1



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String employeeId = "employeeId_example"; // 
    try {
      client
              .timeOff
              .listEmployeePolicies(companyDomain, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listEmployeePolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .listEmployeePolicies(companyDomain, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listEmployeePolicies");
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
| **employeeId** | **String**|  | |

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

<a name="listEmployeeTimeOffPolicies"></a>
# **listEmployeeTimeOffPolicies**
> listEmployeeTimeOffPolicies(companyDomain, employeeId).execute();

List Time Off Policies for Employee



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String employeeId = "employeeId_example"; // 
    try {
      client
              .timeOff
              .listEmployeeTimeOffPolicies(companyDomain, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listEmployeeTimeOffPolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .listEmployeeTimeOffPolicies(companyDomain, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listEmployeeTimeOffPolicies");
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
| **employeeId** | **String**|  | |

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

<a name="requestCreation"></a>
# **requestCreation**
> requestCreation(companyDomain, employeeId, timeOffRequest).execute();

Add a Time Off Request

A time off request is an entity that describes the decision making process for approving time off. Once a request has been created, a history entry can be created documenting the actual use of time off.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String employeeId = "employeeId_example"; // 
    String status = "status_example"; // 
    String start = "start_example"; // 
    String end = "end_example"; // 
    Integer timeOffTypeId = 56; // 
    Integer amount = 56; // 
    List<TimeOffRequestNotesInner> notes = Arrays.asList(); // 
    List<TimeOffRequestDatesInner> dates = Arrays.asList(); // 
    Integer previousRequest = 56; // 
    try {
      client
              .timeOff
              .requestCreation(companyDomain, employeeId)
              .status(status)
              .start(start)
              .end(end)
              .timeOffTypeId(timeOffTypeId)
              .amount(amount)
              .notes(notes)
              .dates(dates)
              .previousRequest(previousRequest)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#requestCreation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeOff
              .requestCreation(companyDomain, employeeId)
              .status(status)
              .start(start)
              .end(end)
              .timeOffTypeId(timeOffTypeId)
              .amount(amount)
              .notes(notes)
              .dates(dates)
              .previousRequest(previousRequest)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#requestCreation");
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
| **employeeId** | **String**|  | |
| **timeOffRequest** | [**TimeOffRequest**](TimeOffRequest.md)|  | |

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
| **201** | Request created. |  -  |
| **400** | Malformed request. |  -  |
| **403** | Forbidden. Cannot change past approved requests. |  -  |
| **404** | Employee not found |  -  |


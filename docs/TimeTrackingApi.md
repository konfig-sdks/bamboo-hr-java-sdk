# TimeTrackingApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveEmployeeTimesheets**](TimeTrackingApi.md#approveEmployeeTimesheets) | **POST** /{companyDomain}/v1/time_tracking/timesheets/approve | Approve employee timesheets |
| [**approveEmployeeTimesheets_0**](TimeTrackingApi.md#approveEmployeeTimesheets_0) | **POST** /{companyDomain}/v1/time_tracking/timesheets/clock_out_and_approve | Approve timesheets for employees that are currently clocked in |
| [**clockInEmployee**](TimeTrackingApi.md#clockInEmployee) | **POST** /{companyDomain}/v1/time_tracking/clock_in/{employeeId} | Clock in (employee id optional) |
| [**clockOutEmployee**](TimeTrackingApi.md#clockOutEmployee) | **POST** /{companyDomain}/v1/time_tracking/clock_out/{employeeId} | Clock out (employee id optional) |
| [**clockOutEmployeeAtSpecificTime**](TimeTrackingApi.md#clockOutEmployeeAtSpecificTime) | **POST** /{companyDomain}/v1/time_tracking/employee/{employeeId}/clock_out/datetime | Clock out an employee at a specific time |
| [**deleteClockEntries**](TimeTrackingApi.md#deleteClockEntries) | **DELETE** /{companyDomain}/v1/time_tracking/clock_entries | Delete clock entries |
| [**editClockedInEntryData**](TimeTrackingApi.md#editClockedInEntryData) | **POST** /{companyDomain}/v1/time_tracking/employee/{employeeId}/clock_in/data | Edit information on the currently clocked in entry |
| [**employeeClockedIn**](TimeTrackingApi.md#employeeClockedIn) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/is_clocked_in | Is employee clocked in? |
| [**employeeTimesheetGet**](TimeTrackingApi.md#employeeTimesheetGet) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/timesheet/{timesheetId} | Get a timesheet for an employee |
| [**getClockEntry**](TimeTrackingApi.md#getClockEntry) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/clock_entries/{id} | Get a clock entry |
| [**getDailyEntry**](TimeTrackingApi.md#getDailyEntry) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/daily_entries/{id} | Get a daily entry |
| [**getProjectTasks**](TimeTrackingApi.md#getProjectTasks) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/projects/{projectId}/tasks | Get tasks for a project |
| [**getTimesheetsByIds**](TimeTrackingApi.md#getTimesheetsByIds) | **GET** /{companyDomain}/v1/time_tracking/timesheets | Get timesheets by ids |
| [**listEmployeeProjects**](TimeTrackingApi.md#listEmployeeProjects) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/projects | Get projects an employee can log time to |
| [**storeClockEntries**](TimeTrackingApi.md#storeClockEntries) | **POST** /{companyDomain}/v1/time_tracking/clock_entries | Store clock entries |
| [**storeDailyEntries**](TimeTrackingApi.md#storeDailyEntries) | **POST** /{companyDomain}/v1/time_tracking/daily_entries | Store daily entries |


<a name="approveEmployeeTimesheets"></a>
# **approveEmployeeTimesheets**
> approveEmployeeTimesheets(companyDomain, timeTrackingApproveEmployeeTimesheetsRequest).execute();

Approve employee timesheets

Approve employee timesheets

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    Integer lastChanged = 56; // UNIX timestamp for last change to timesheet
    List<TimeTrackingApproveEmployeeTimesheetsRequestTimesheetsInner> timesheets = Arrays.asList(); // Array of timesheet objects that contain the timesheet id
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    try {
      client
              .timeTracking
              .approveEmployeeTimesheets(lastChanged, timesheets, companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#approveEmployeeTimesheets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .approveEmployeeTimesheets(lastChanged, timesheets, companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#approveEmployeeTimesheets");
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
| **timeTrackingApproveEmployeeTimesheetsRequest** | [**TimeTrackingApproveEmployeeTimesheetsRequest**](TimeTrackingApproveEmployeeTimesheetsRequest.md)|  | |

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
| **204** | Successful approval will return a 204 - No content response. |  -  |
| **403** | Missing time tracking tool or permissions to approve. |  -  |
| **404** | Invalid timesheet id. |  -  |
| **409** | Stale data or employee clocked in. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |

<a name="approveEmployeeTimesheets_0"></a>
# **approveEmployeeTimesheets_0**
> approveEmployeeTimesheets_0(companyDomain, timeTrackingApproveEmployeeTimesheetsRequest1).execute();

Approve timesheets for employees that are currently clocked in

Approve timesheets for employees that are currently clocked in

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    List<TimeTrackingApproveEmployeeTimesheetsRequest1ClockOutsInner> clockOuts = Arrays.asList(); // Array of clock out information
    try {
      client
              .timeTracking
              .approveEmployeeTimesheets_0(companyDomain)
              .clockOuts(clockOuts)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#approveEmployeeTimesheets_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .approveEmployeeTimesheets_0(companyDomain)
              .clockOuts(clockOuts)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#approveEmployeeTimesheets_0");
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
| **timeTrackingApproveEmployeeTimesheetsRequest1** | [**TimeTrackingApproveEmployeeTimesheetsRequest1**](TimeTrackingApproveEmployeeTimesheetsRequest1.md)|  | |

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
| **204** | Successful approval will return a 204 - No content response. |  -  |
| **400** | Invalid or missing argument |  -  |
| **403** | Missing time tracking tool or permissions to approve. |  -  |
| **404** | Invalid timesheet id. |  -  |
| **409** | Stale data or employee clocked in. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |

<a name="clockInEmployee"></a>
# **clockInEmployee**
> clockInEmployee(companyDomain, employeeId).timeTrackingClockInEmployeeRequest(timeTrackingClockInEmployeeRequest).execute();

Clock in (employee id optional)

Clock in (employee id optional)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String employeeId = "employeeId_example"; // {employeeId} is id of the employee clocking out
    String start = "start_example"; // The start time for the clock in. In 24 hour format HH:MM
    String timezone = "timezone_example"; // The timezone associated with the clock in.
    String note = "note_example"; // The note associated with the clock in
    Integer projectId = 56; // The id of the project associated with the clock in
    Integer taskId = 56; // The id of the task associated with the clock in
    TimeTrackingClockInEmployeeRequestClockInLocation clockInLocation = new TimeTrackingClockInEmployeeRequestClockInLocation();
    try {
      client
              .timeTracking
              .clockInEmployee(companyDomain, employeeId)
              .start(start)
              .timezone(timezone)
              .note(note)
              .projectId(projectId)
              .taskId(taskId)
              .clockInLocation(clockInLocation)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#clockInEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .clockInEmployee(companyDomain, employeeId)
              .start(start)
              .timezone(timezone)
              .note(note)
              .projectId(projectId)
              .taskId(taskId)
              .clockInLocation(clockInLocation)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#clockInEmployee");
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
| **employeeId** | **String**| {employeeId} is id of the employee clocking out | |
| **timeTrackingClockInEmployeeRequest** | [**TimeTrackingClockInEmployeeRequest**](TimeTrackingClockInEmployeeRequest.md)|  | [optional] |

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
| **200** | The response content will be JSON with the clock in information. |  -  |
| **400** | Invalid information passed in. |  -  |
| **403** | Most likely because of missing permissions to clock in. |  -  |
| **404** | Id not found. |  -  |
| **409** | Employee already clocked in or invalid timesheet type. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |

<a name="clockOutEmployee"></a>
# **clockOutEmployee**
> clockOutEmployee(companyDomain, employeeId).timeTrackingClockOutEmployeeRequest(timeTrackingClockOutEmployeeRequest).execute();

Clock out (employee id optional)

Clock out (employee id optional)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String employeeId = "employeeId_example"; // {employeeId} is id of the employee clocking out
    TimeTrackingClockOutEmployeeRequestClockOutLocation clockOutLocation = new TimeTrackingClockOutEmployeeRequestClockOutLocation();
    try {
      client
              .timeTracking
              .clockOutEmployee(companyDomain, employeeId)
              .clockOutLocation(clockOutLocation)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#clockOutEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .clockOutEmployee(companyDomain, employeeId)
              .clockOutLocation(clockOutLocation)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#clockOutEmployee");
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
| **employeeId** | **String**| {employeeId} is id of the employee clocking out | |
| **timeTrackingClockOutEmployeeRequest** | [**TimeTrackingClockOutEmployeeRequest**](TimeTrackingClockOutEmployeeRequest.md)|  | [optional] |

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
| **200** | The response content will be JSON with the clock out information. |  -  |
| **400** | Invalid information passed in. |  -  |
| **403** | Most likely because of missing permissions to clock out. |  -  |
| **404** | Id not found. |  -  |
| **409** | Employee already clocked in or invalid timesheet type. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |

<a name="clockOutEmployeeAtSpecificTime"></a>
# **clockOutEmployeeAtSpecificTime**
> clockOutEmployeeAtSpecificTime(companyDomain, employeeId).timeTrackingClockOutEmployeeAtSpecificTimeRequest(timeTrackingClockOutEmployeeAtSpecificTimeRequest).execute();

Clock out an employee at a specific time

Clock out an employee at a specific time

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String employeeId = "employeeId_example"; // id of the employee to whom the projects belong.
    String datetime = "datetime_example"; // Date time for clock out in atom format. 
    String timezone = "timezone_example"; // Timezone of the time entry
    Integer employeeId = 56; // The employeeId for the time entry.
    try {
      client
              .timeTracking
              .clockOutEmployeeAtSpecificTime(companyDomain, employeeId)
              .datetime(datetime)
              .timezone(timezone)
              .employeeId(employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#clockOutEmployeeAtSpecificTime");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .clockOutEmployeeAtSpecificTime(companyDomain, employeeId)
              .datetime(datetime)
              .timezone(timezone)
              .employeeId(employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#clockOutEmployeeAtSpecificTime");
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
| **employeeId** | **String**| id of the employee to whom the projects belong. | |
| **timeTrackingClockOutEmployeeAtSpecificTimeRequest** | [**TimeTrackingClockOutEmployeeAtSpecificTimeRequest**](TimeTrackingClockOutEmployeeAtSpecificTimeRequest.md)|  | [optional] |

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
| **200** | The response content will be JSON with the daily entry information. |  -  |
| **400** | Invalid information passed in. |  -  |
| **403** | Missing permissions. |  -  |
| **404** | Id not found. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |

<a name="deleteClockEntries"></a>
# **deleteClockEntries**
> deleteClockEntries(companyDomain, timeTrackingDeleteClockEntriesRequest).execute();

Delete clock entries

Delete clock entries

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    List<Integer> clockEntryIds = Arrays.asList();
    try {
      client
              .timeTracking
              .deleteClockEntries(companyDomain)
              .clockEntryIds(clockEntryIds)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#deleteClockEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .deleteClockEntries(companyDomain)
              .clockEntryIds(clockEntryIds)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#deleteClockEntries");
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
| **timeTrackingDeleteClockEntriesRequest** | [**TimeTrackingDeleteClockEntriesRequest**](TimeTrackingDeleteClockEntriesRequest.md)|  | |

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
| **204** | Successful deletion will return a 204 - No content response. |  -  |
| **400** | Invalid information passed in. |  -  |
| **403** | Missing permissions or timesheet already approved. |  -  |
| **404** | Id not found. |  -  |
| **409** | If clock timesheet, may still be clocked in. Have to clock out first. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |

<a name="editClockedInEntryData"></a>
# **editClockedInEntryData**
> editClockedInEntryData(companyDomain, employeeId).timeTrackingEditClockedInEntryDataRequest(timeTrackingEditClockedInEntryDataRequest).execute();

Edit information on the currently clocked in entry

Edit information on the currently clocked in entry

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String employeeId = "employeeId_example"; // id of the employee to whom the projects belong.
    String start = "start_example"; // The start time for the clock in. In 24 hour format HH:MM
    String timezone = "timezone_example"; // The timezone associated with the clock in.
    String note = "note_example"; // The note associated with the clock in
    Integer projectId = 56; // The id of the project associated with the clock in
    Integer taskId = 56; // The id of the task associated with the clock in
    TimeTrackingEditClockedInEntryDataRequestClockInLocation clockInLocation = new TimeTrackingEditClockedInEntryDataRequestClockInLocation();
    TimeTrackingEditClockedInEntryDataRequestClockOutLocation clockOutLocation = new TimeTrackingEditClockedInEntryDataRequestClockOutLocation();
    try {
      client
              .timeTracking
              .editClockedInEntryData(companyDomain, employeeId)
              .start(start)
              .timezone(timezone)
              .note(note)
              .projectId(projectId)
              .taskId(taskId)
              .clockInLocation(clockInLocation)
              .clockOutLocation(clockOutLocation)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#editClockedInEntryData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .editClockedInEntryData(companyDomain, employeeId)
              .start(start)
              .timezone(timezone)
              .note(note)
              .projectId(projectId)
              .taskId(taskId)
              .clockInLocation(clockInLocation)
              .clockOutLocation(clockOutLocation)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#editClockedInEntryData");
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
| **employeeId** | **String**| id of the employee to whom the projects belong. | |
| **timeTrackingEditClockedInEntryDataRequest** | [**TimeTrackingEditClockedInEntryDataRequest**](TimeTrackingEditClockedInEntryDataRequest.md)|  | [optional] |

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
| **200** | The response content will be JSON with the daily entry information. |  -  |
| **400** | Invalid or missing argument. |  -  |
| **403** | Invalid permissions. |  -  |
| **404** | Not found. |  -  |
| **409** | Conflict found. |  -  |
| **412** | Precondition failed. |  -  |
| **500** | Server error. |  -  |

<a name="employeeClockedIn"></a>
# **employeeClockedIn**
> employeeClockedIn(companyDomain, employeeId).execute();

Is employee clocked in?

Is employee clocked in?

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String employeeId = "employeeId_example"; // id of employee to whom the clock entry belongs.
    try {
      client
              .timeTracking
              .employeeClockedIn(companyDomain, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#employeeClockedIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .employeeClockedIn(companyDomain, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#employeeClockedIn");
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
| **employeeId** | **String**| id of employee to whom the clock entry belongs. | |

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
| **200** | The response content will be JSON with the daily entry information. |  -  |
| **403** | Missing permissions. |  -  |
| **500** | Server error. |  -  |

<a name="employeeTimesheetGet"></a>
# **employeeTimesheetGet**
> employeeTimesheetGet(companyDomain, employeeId, timesheetId).execute();

Get a timesheet for an employee

Get a timesheet for an employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String employeeId = "employeeId_example"; // id of employee to whom the timesheet belongs.
    String timesheetId = "timesheetId_example"; // timesheetId is the id to whom the timesheet belongs.
    try {
      client
              .timeTracking
              .employeeTimesheetGet(companyDomain, employeeId, timesheetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#employeeTimesheetGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .employeeTimesheetGet(companyDomain, employeeId, timesheetId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#employeeTimesheetGet");
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
| **employeeId** | **String**| id of employee to whom the timesheet belongs. | |
| **timesheetId** | **String**| timesheetId is the id to whom the timesheet belongs. | |

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
| **200** | The response content will be JSON with the timesheet information. |  -  |
| **400** | Invalid information passed in. |  -  |
| **403** | Missing permissions. |  -  |
| **404** | Id not found. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |

<a name="getClockEntry"></a>
# **getClockEntry**
> getClockEntry(companyDomain, employeeId, id).execute();

Get a clock entry

Get a clock entry

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String employeeId = "employeeId_example"; // id of employee to whom the clock entry belongs.
    String id = "id_example"; // the id to whom the clock entry belongs.
    try {
      client
              .timeTracking
              .getClockEntry(companyDomain, employeeId, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getClockEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .getClockEntry(companyDomain, employeeId, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getClockEntry");
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
| **employeeId** | **String**| id of employee to whom the clock entry belongs. | |
| **id** | **String**| the id to whom the clock entry belongs. | |

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
| **200** | The response content will be JSON with the daily entry information. |  -  |
| **403** | Missing permissions. |  -  |
| **404** | Id not found. |  -  |
| **500** | Server error. |  -  |

<a name="getDailyEntry"></a>
# **getDailyEntry**
> getDailyEntry(companyDomain, employeeId, id).execute();

Get a daily entry

Get a daily entry

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String employeeId = "employeeId_example"; // id of employee to whom the daily entry belongs.
    String id = "id_example"; // the id to whom the daily entry belongs.
    try {
      client
              .timeTracking
              .getDailyEntry(companyDomain, employeeId, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getDailyEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .getDailyEntry(companyDomain, employeeId, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getDailyEntry");
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
| **employeeId** | **String**| id of employee to whom the daily entry belongs. | |
| **id** | **String**| the id to whom the daily entry belongs. | |

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
| **200** | The response content will be JSON with the daily entry information. |  -  |
| **400** | Invalid information passed in. |  -  |
| **403** | Missing permissions. |  -  |
| **404** | Id not found. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |

<a name="getProjectTasks"></a>
# **getProjectTasks**
> getProjectTasks(companyDomain, employeeId, projectId).execute();

Get tasks for a project

Get tasks for a project

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String employeeId = "employeeId_example"; // id of the employee to whom the projects belong.
    String projectId = "projectId_example"; // id of the project to which the tasks belong.
    try {
      client
              .timeTracking
              .getProjectTasks(companyDomain, employeeId, projectId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getProjectTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .getProjectTasks(companyDomain, employeeId, projectId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getProjectTasks");
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
| **employeeId** | **String**| id of the employee to whom the projects belong. | |
| **projectId** | **String**| id of the project to which the tasks belong. | |

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
| **200** | The response content will be JSON with the task information. |  -  |
| **403** | Invalid permissions. |  -  |
| **500** | Server error. |  -  |

<a name="getTimesheetsByIds"></a>
# **getTimesheetsByIds**
> getTimesheetsByIds(companyDomain, timeTrackingGetTimesheetsByIdsRequest).execute();

Get timesheets by ids

Get timesheets by ids

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String timesheets = "timesheets_example"; // Comma separated list of timesheet ids
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    try {
      client
              .timeTracking
              .getTimesheetsByIds(timesheets, companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getTimesheetsByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .getTimesheetsByIds(timesheets, companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#getTimesheetsByIds");
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
| **timeTrackingGetTimesheetsByIdsRequest** | [**TimeTrackingGetTimesheetsByIdsRequest**](TimeTrackingGetTimesheetsByIdsRequest.md)|  | |

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
| **200** | The response content will be JSON with the requested information. |  -  |
| **400** | No timesheet ids given. |  -  |
| **403** | Missing permissions to view all or some of the timesheets. |  -  |
| **404** | Timesheet not found. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |

<a name="listEmployeeProjects"></a>
# **listEmployeeProjects**
> listEmployeeProjects(companyDomain, employeeId).execute();

Get projects an employee can log time to

Get projects an employee can log time to

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    String employeeId = "employeeId_example"; // id of the employee to whom the projects belong.
    try {
      client
              .timeTracking
              .listEmployeeProjects(companyDomain, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#listEmployeeProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .listEmployeeProjects(companyDomain, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#listEmployeeProjects");
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
| **employeeId** | **String**| id of the employee to whom the projects belong. | |

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
| **200** | The response content will be JSON with the daily entry information. |  -  |
| **500** | Server error. |  -  |

<a name="storeClockEntries"></a>
# **storeClockEntries**
> storeClockEntries(companyDomain).timeTrackingStoreClockEntriesRequest(timeTrackingStoreClockEntriesRequest).execute();

Store clock entries

Store clock entries

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    List<TimeTrackingStoreClockEntriesRequestEntriesInner> entries = Arrays.asList();
    try {
      client
              .timeTracking
              .storeClockEntries(companyDomain)
              .entries(entries)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#storeClockEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .storeClockEntries(companyDomain)
              .entries(entries)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#storeClockEntries");
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
| **timeTrackingStoreClockEntriesRequest** | [**TimeTrackingStoreClockEntriesRequest**](TimeTrackingStoreClockEntriesRequest.md)|  | [optional] |

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
| **200** | The response content will be JSON with the daily entry information. |  -  |
| **400** | Invalid information passed in. |  -  |
| **403** | Missing permissions. |  -  |
| **404** | Id not found. |  -  |
| **409** | Invalid timesheet type or overlapping time entries. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |

<a name="storeDailyEntries"></a>
# **storeDailyEntries**
> storeDailyEntries(companyDomain).timeTrackingStoreDailyEntriesRequest(timeTrackingStoreDailyEntriesRequest).execute();

Store daily entries

Store daily entries

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingApi;
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
    List<TimeTrackingStoreDailyEntriesRequestEntriesInner> entries = Arrays.asList();
    try {
      client
              .timeTracking
              .storeDailyEntries(companyDomain)
              .entries(entries)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#storeDailyEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTracking
              .storeDailyEntries(companyDomain)
              .entries(entries)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingApi#storeDailyEntries");
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
| **timeTrackingStoreDailyEntriesRequest** | [**TimeTrackingStoreDailyEntriesRequest**](TimeTrackingStoreDailyEntriesRequest.md)|  | [optional] |

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
| **200** | The response content will be JSON with the daily entry information. |  -  |
| **400** | Invalid information passed in. |  -  |
| **403** | Missing permissions. |  -  |
| **404** | Id not found. |  -  |
| **409** | Invalid timesheet type. |  -  |
| **412** | Invalid company configuration or timezone. |  -  |
| **500** | Server error. |  -  |


# TimeTrackingPrivateBetaApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addClockOut**](TimeTrackingPrivateBetaApi.md#addClockOut) | **POST** /{companyDomain}/v1/time_tracking/employees/{employeeId}/clock_out | Add Timesheet Clock-Out Entry |
| [**addEditClockEntries**](TimeTrackingPrivateBetaApi.md#addEditClockEntries) | **POST** /{companyDomain}/v1/time_tracking/clock_entries/store | Add/Edit Timesheet Clock Entries |
| [**addEditHourEntries**](TimeTrackingPrivateBetaApi.md#addEditHourEntries) | **POST** /{companyDomain}/v1/time_tracking/hour_entries/store | Add/Edit Timesheet Hour Entries |
| [**addTimesheetClockIn**](TimeTrackingPrivateBetaApi.md#addTimesheetClockIn) | **POST** /{companyDomain}/v1/time_tracking/employees/{employeeId}/clock_in | Add Timesheet Clock-In Entry |
| [**createProjectTask**](TimeTrackingPrivateBetaApi.md#createProjectTask) | **POST** /{companyDomain}/v1/time_tracking/projects | Create a Time Tracking Project |
| [**deleteHourEntries**](TimeTrackingPrivateBetaApi.md#deleteHourEntries) | **POST** /{companyDomain}/v1/time_tracking/hour_entries/delete | Delete Timesheet Hour Entries |
| [**deleteTimeSheetEntries**](TimeTrackingPrivateBetaApi.md#deleteTimeSheetEntries) | **POST** /{companyDomain}/v1/time_tracking/clock_entries/delete | Delete Timesheet Clock Entries |
| [**listEmployeeProjects**](TimeTrackingPrivateBetaApi.md#listEmployeeProjects) | **GET** /{companyDomain}/v1/time_tracking/employees/{employeeId}/projects | Get Employee Projects |
| [**listTimesheetEntries**](TimeTrackingPrivateBetaApi.md#listTimesheetEntries) | **GET** /{companyDomain}/v1/time_tracking/timesheet_entries | Get Timesheet Entries |


<a name="addClockOut"></a>
# **addClockOut**
> TimesheetEntry addClockOut(companyDomain, employeeId).execute();

Add Timesheet Clock-Out Entry

Clock out an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingPrivateBetaApi;
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
    String employeeId = "employeeId_example"; // id of the employee to clock out.
    try {
      TimesheetEntry result = client
              .timeTrackingPrivateBeta
              .addClockOut(companyDomain, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getType());
      System.out.println(result.getStart());
      System.out.println(result.getEnd());
      System.out.println(result.getTimezone());
      System.out.println(result.getHours());
      System.out.println(result.getNote());
      System.out.println(result.getProjectInfo());
      System.out.println(result.getApproved());
      System.out.println(result.getApprovedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#addClockOut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetEntry> response = client
              .timeTrackingPrivateBeta
              .addClockOut(companyDomain, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#addClockOut");
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
| **employeeId** | **String**| id of the employee to clock out. | |

### Return type

[**TimesheetEntry**](TimesheetEntry.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Forbidden. Insufficient user permissions or API access is not turned on. |  -  |
| **406** | Request not acceptable. |  -  |
| **409** | There was a conflict with the request. |  -  |

<a name="addEditClockEntries"></a>
# **addEditClockEntries**
> List&lt;TimesheetEntry&gt; addEditClockEntries(companyDomain).timeTrackingPrivateBetaAddEditClockEntriesRequest(timeTrackingPrivateBetaAddEditClockEntriesRequest).execute();

Add/Edit Timesheet Clock Entries

Add or edit timesheet clock entries.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingPrivateBetaApi;
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
    List<TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner> entries = Arrays.asList();
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    try {
      List<TimesheetEntry> result = client
              .timeTrackingPrivateBeta
              .addEditClockEntries(entries, companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#addEditClockEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TimesheetEntry>> response = client
              .timeTrackingPrivateBeta
              .addEditClockEntries(entries, companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#addEditClockEntries");
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
| **timeTrackingPrivateBetaAddEditClockEntriesRequest** | [**TimeTrackingPrivateBetaAddEditClockEntriesRequest**](TimeTrackingPrivateBetaAddEditClockEntriesRequest.md)|  | [optional] |

### Return type

[**List&lt;TimesheetEntry&gt;**](TimesheetEntry.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Forbidden. Insufficient user permissions or API access is not turned on. |  -  |
| **406** | Request not acceptable. |  -  |
| **409** | There was a conflict with the request. |  -  |
| **500** | Internal server error. |  -  |

<a name="addEditHourEntries"></a>
# **addEditHourEntries**
> List&lt;TimesheetEntry&gt; addEditHourEntries(companyDomain).timeTrackingPrivateBetaAddEditHourEntriesRequest(timeTrackingPrivateBetaAddEditHourEntriesRequest).execute();

Add/Edit Timesheet Hour Entries

Add or edit timesheet hour entries.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingPrivateBetaApi;
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
    List<TimeTrackingPrivateBetaAddEditHourEntriesRequestHoursInner> hours = Arrays.asList();
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    try {
      List<TimesheetEntry> result = client
              .timeTrackingPrivateBeta
              .addEditHourEntries(hours, companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#addEditHourEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TimesheetEntry>> response = client
              .timeTrackingPrivateBeta
              .addEditHourEntries(hours, companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#addEditHourEntries");
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
| **timeTrackingPrivateBetaAddEditHourEntriesRequest** | [**TimeTrackingPrivateBetaAddEditHourEntriesRequest**](TimeTrackingPrivateBetaAddEditHourEntriesRequest.md)|  | [optional] |

### Return type

[**List&lt;TimesheetEntry&gt;**](TimesheetEntry.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Forbidden. Insufficient user permissions or API access is not turned on. |  -  |
| **406** | Request not acceptable. |  -  |
| **409** | There was a conflict with the request. |  -  |
| **500** | Internal server error. |  -  |

<a name="addTimesheetClockIn"></a>
# **addTimesheetClockIn**
> TimesheetEntry addTimesheetClockIn(companyDomain, employeeId).timeTrackingPrivateBetaAddTimesheetClockInRequest(timeTrackingPrivateBetaAddTimesheetClockInRequest).execute();

Add Timesheet Clock-In Entry

Clock in an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingPrivateBetaApi;
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
    String employeeId = "employeeId_example"; // id of the employee to clock in.
    Integer projectId = 56; // id of the time tracking project that should be associated with the timesheet entry. Required if taskId is specified.
    Integer taskId = 56; // id of the time tracking task that should be associated with the timesheet entry.
    String note = "note_example"; // The note that should be associated with the timesheet entry
    try {
      TimesheetEntry result = client
              .timeTrackingPrivateBeta
              .addTimesheetClockIn(companyDomain, employeeId)
              .projectId(projectId)
              .taskId(taskId)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getType());
      System.out.println(result.getStart());
      System.out.println(result.getEnd());
      System.out.println(result.getTimezone());
      System.out.println(result.getHours());
      System.out.println(result.getNote());
      System.out.println(result.getProjectInfo());
      System.out.println(result.getApproved());
      System.out.println(result.getApprovedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#addTimesheetClockIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetEntry> response = client
              .timeTrackingPrivateBeta
              .addTimesheetClockIn(companyDomain, employeeId)
              .projectId(projectId)
              .taskId(taskId)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#addTimesheetClockIn");
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
| **employeeId** | **String**| id of the employee to clock in. | |
| **timeTrackingPrivateBetaAddTimesheetClockInRequest** | [**TimeTrackingPrivateBetaAddTimesheetClockInRequest**](TimeTrackingPrivateBetaAddTimesheetClockInRequest.md)|  | [optional] |

### Return type

[**TimesheetEntry**](TimesheetEntry.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Forbidden. Insufficient user permissions or API access is not turned on. |  -  |
| **406** | Request not acceptable. |  -  |
| **409** | There was a conflict with the request. |  -  |

<a name="createProjectTask"></a>
# **createProjectTask**
> TimeTrackingProjectWithTasksAndEmployeeIds createProjectTask(companyDomain).timeTrackingPrivateBetaCreateProjectTaskRequest(timeTrackingPrivateBetaCreateProjectTaskRequest).execute();

Create a Time Tracking Project

Create a time tracking project with optional tasks.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingPrivateBetaApi;
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
    String name = "name_example"; // Name of the project.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    Boolean billable = true; // Indicates if the project is billable. Defaults to true if not provided.
    Boolean allowAllEmployees = true; // Indicates if all employees can log time for this project. Defaults to true if not provided.
    List<Integer> employeeIds = Arrays.asList(); // A list of employee IDs that can log time for this project.
    Boolean hasTasks = true; // Indicates if the project has tasks. Defaults to false if not provided.
    List<TimeTrackingPrivateBetaCreateProjectTaskRequestTasksInner> tasks = Arrays.asList(); // List of tasks to create and associate with the project.
    try {
      TimeTrackingProjectWithTasksAndEmployeeIds result = client
              .timeTrackingPrivateBeta
              .createProjectTask(name, companyDomain)
              .billable(billable)
              .allowAllEmployees(allowAllEmployees)
              .employeeIds(employeeIds)
              .hasTasks(hasTasks)
              .tasks(tasks)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getTasks());
      System.out.println(result.getEmployeeIds());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#createProjectTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeTrackingProjectWithTasksAndEmployeeIds> response = client
              .timeTrackingPrivateBeta
              .createProjectTask(name, companyDomain)
              .billable(billable)
              .allowAllEmployees(allowAllEmployees)
              .employeeIds(employeeIds)
              .hasTasks(hasTasks)
              .tasks(tasks)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#createProjectTask");
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
| **timeTrackingPrivateBetaCreateProjectTaskRequest** | [**TimeTrackingPrivateBetaCreateProjectTaskRequest**](TimeTrackingPrivateBetaCreateProjectTaskRequest.md)|  | [optional] |

### Return type

[**TimeTrackingProjectWithTasksAndEmployeeIds**](TimeTrackingProjectWithTasksAndEmployeeIds.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success. |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Forbidden. Insufficient user permissions or API access is not turned on. |  -  |
| **406** | Request not acceptable. |  -  |
| **409** | There was a conflict with the request. |  -  |
| **500** | Internal server error. |  -  |

<a name="deleteHourEntries"></a>
# **deleteHourEntries**
> deleteHourEntries(companyDomain).timeTrackingPrivateBetaDeleteHourEntriesRequest(timeTrackingPrivateBetaDeleteHourEntriesRequest).execute();

Delete Timesheet Hour Entries

Delete timesheet hour entries.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingPrivateBetaApi;
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
    List<Integer> hourEntryIds = Arrays.asList();
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    try {
      client
              .timeTrackingPrivateBeta
              .deleteHourEntries(hourEntryIds, companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#deleteHourEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTrackingPrivateBeta
              .deleteHourEntries(hourEntryIds, companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#deleteHourEntries");
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
| **timeTrackingPrivateBetaDeleteHourEntriesRequest** | [**TimeTrackingPrivateBetaDeleteHourEntriesRequest**](TimeTrackingPrivateBetaDeleteHourEntriesRequest.md)|  | [optional] |

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
| **204** | Success. No content returned. |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Forbidden. Insufficient user permissions or API access is not turned on. |  -  |
| **406** | Request not acceptable. |  -  |
| **409** | There was a conflict with the request. |  -  |
| **412** | Invalid time tracking configuration or timezone. |  -  |
| **500** | Internal server error. |  -  |

<a name="deleteTimeSheetEntries"></a>
# **deleteTimeSheetEntries**
> deleteTimeSheetEntries(companyDomain).timeTrackingPrivateBetaDeleteTimeSheetEntriesRequest(timeTrackingPrivateBetaDeleteTimeSheetEntriesRequest).execute();

Delete Timesheet Clock Entries

Delete timesheet clock entries.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingPrivateBetaApi;
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
    List<Integer> clockEntryIds = Arrays.asList();
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    try {
      client
              .timeTrackingPrivateBeta
              .deleteTimeSheetEntries(clockEntryIds, companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#deleteTimeSheetEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .timeTrackingPrivateBeta
              .deleteTimeSheetEntries(clockEntryIds, companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#deleteTimeSheetEntries");
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
| **timeTrackingPrivateBetaDeleteTimeSheetEntriesRequest** | [**TimeTrackingPrivateBetaDeleteTimeSheetEntriesRequest**](TimeTrackingPrivateBetaDeleteTimeSheetEntriesRequest.md)|  | [optional] |

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
| **204** | Success. No content returned. |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Forbidden. Insufficient user permissions or API access is not turned on. |  -  |
| **406** | Request not acceptable. |  -  |
| **409** | There was a conflict with the request. |  -  |
| **412** | Invalid time tracking configuration or timezone. |  -  |
| **500** | Internal server error. |  -  |

<a name="listEmployeeProjects"></a>
# **listEmployeeProjects**
> List&lt;List&lt;TimeTrackingProjectWithTasks&gt;&gt; listEmployeeProjects(companyDomain, employeeId).execute();

Get Employee Projects

Get the projects an employee can track time for.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingPrivateBetaApi;
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
    String employeeId = "employeeId_example"; // id of the employee to retrieve projects for.
    try {
      List<List<TimeTrackingProjectWithTasks>> result = client
              .timeTrackingPrivateBeta
              .listEmployeeProjects(companyDomain, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#listEmployeeProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<List<TimeTrackingProjectWithTasks>>> response = client
              .timeTrackingPrivateBeta
              .listEmployeeProjects(companyDomain, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#listEmployeeProjects");
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
| **employeeId** | **String**| id of the employee to retrieve projects for. | |

### Return type

[**List&lt;List&lt;TimeTrackingProjectWithTasks&gt;&gt;**](List.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |

<a name="listTimesheetEntries"></a>
# **listTimesheetEntries**
> List&lt;TimesheetEntry&gt; listTimesheetEntries(companyDomain, start, end).employeeIds(employeeIds).execute();

Get Timesheet Entries

Get all timesheet entries for a given period of time.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeTrackingPrivateBetaApi;
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
    String start = "start_example"; // YYYY-MM-DD. Only show timesheet entries on/after the specified start date. Must be within the last 365 days.
    String end = "end_example"; // YYYY-MM-DD. Only show timesheet entries on/before the specified end date. Must be within the last 365 days.
    String employeeIds = "employeeIds_example"; // A comma separated list of employee IDs. When specified, only entries that match these employee IDs are returned.
    try {
      List<TimesheetEntry> result = client
              .timeTrackingPrivateBeta
              .listTimesheetEntries(companyDomain, start, end)
              .employeeIds(employeeIds)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#listTimesheetEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TimesheetEntry>> response = client
              .timeTrackingPrivateBeta
              .listTimesheetEntries(companyDomain, start, end)
              .employeeIds(employeeIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeTrackingPrivateBetaApi#listTimesheetEntries");
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
| **start** | **String**| YYYY-MM-DD. Only show timesheet entries on/after the specified start date. Must be within the last 365 days. | |
| **end** | **String**| YYYY-MM-DD. Only show timesheet entries on/before the specified end date. Must be within the last 365 days. | |
| **employeeIds** | **String**| A comma separated list of employee IDs. When specified, only entries that match these employee IDs are returned. | [optional] |

### Return type

[**List&lt;TimesheetEntry&gt;**](TimesheetEntry.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |


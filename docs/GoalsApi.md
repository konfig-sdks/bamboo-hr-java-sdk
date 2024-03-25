# GoalsApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closeGoal**](GoalsApi.md#closeGoal) | **POST** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/close | Close Goal |
| [**countPerStatus**](GoalsApi.md#countPerStatus) | **GET** /{companyDomain}/v1_1/performance/employees/{employeeId}/goals/filters | Get Goal Status Counts, Version 1.1 |
| [**createComment**](GoalsApi.md#createComment) | **POST** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/comments | Create Goal Comment |
| [**createEmployeeGoal**](GoalsApi.md#createEmployeeGoal) | **POST** /{companyDomain}/v1/performance/employees/{employeeId}/goals | Create Goal |
| [**deleteById**](GoalsApi.md#deleteById) | **DELETE** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId} | Delete Goal |
| [**deleteComment**](GoalsApi.md#deleteComment) | **DELETE** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/comments/{commentId} | Delete Goal Comment |
| [**determinePermission**](GoalsApi.md#determinePermission) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/canCreateGoals | Can Create a Goal |
| [**getAlignableOptions**](GoalsApi.md#getAlignableOptions) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/alignmentOptions | Alignable Goal Options |
| [**getAllAggregateInfo**](GoalsApi.md#getAllAggregateInfo) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/aggregate | Get All Aggregate Goal Info |
| [**getAllAggregateInfo_0**](GoalsApi.md#getAllAggregateInfo_0) | **GET** /{companyDomain}/v1_1/performance/employees/{employeeId}/goals/aggregate | Get All Aggregate Goal Info, Version 1.1 |
| [**getAllAggregateInfo_1**](GoalsApi.md#getAllAggregateInfo_1) | **GET** /{companyDomain}/v1_2/performance/employees/{employeeId}/goals/aggregate | Get All Aggregate Goal Info, Version 1.2 |
| [**getComments**](GoalsApi.md#getComments) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/comments | Get Goal Comments |
| [**getEmployeeGoals**](GoalsApi.md#getEmployeeGoals) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals | Get Goals |
| [**getGoalAggregateInfo**](GoalsApi.md#getGoalAggregateInfo) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/aggregate | Get Aggregate Goal Info |
| [**reopenGoal**](GoalsApi.md#reopenGoal) | **POST** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/reopen | Reopen a Goal |
| [**shareOptionsGet**](GoalsApi.md#shareOptionsGet) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/shareOptions | Available Goal Sharing Options |
| [**statusCount**](GoalsApi.md#statusCount) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/filters | Get Goal Status Counts |
| [**updateComment**](GoalsApi.md#updateComment) | **PUT** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/comments/{commentId} | Update Goal Comment |
| [**updateEmployeeGoal**](GoalsApi.md#updateEmployeeGoal) | **PUT** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId} | Update Goal |
| [**updateEmployeeGoalV11**](GoalsApi.md#updateEmployeeGoalV11) | **PUT** /{companyDomain}/v1_1/performance/employees/{employeeId}/goals/{goalId} | Update Goal, V1.1 |
| [**updateGoalSharing**](GoalsApi.md#updateGoalSharing) | **PUT** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/sharedWith | Update Goal Sharing |
| [**updateProgress**](GoalsApi.md#updateProgress) | **PUT** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/progress | Update Goal Progress |


<a name="closeGoal"></a>
# **closeGoal**
> GoalsCloseGoalResponse closeGoal(companyDomain, employeeId, goalId).body(body).execute();

Close Goal

Close a goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the goal ID for the specified employee.
    try {
      GoalsCloseGoalResponse result = client
              .goals
              .closeGoal(companyDomain, employeeId, goalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGoal());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#closeGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsCloseGoalResponse> response = client
              .goals
              .closeGoal(companyDomain, employeeId, goalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#closeGoal");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the goal ID for the specified employee. | |
| **body** | **String**| Comment field is optional. | [optional] |

### Return type

[**GoalsCloseGoalResponse**](GoalsCloseGoalResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful response indicates that all the goal was closed. The content of the response will be the goal response object for the specified goalId. |  -  |
| **400** | The posted JSON is invalid. |  -  |
| **403** | Goal is not editable or insufficient permissions. |  -  |
| **404** | The goal specified by the given goalId was not found. |  -  |

<a name="countPerStatus"></a>
# **countPerStatus**
> GoalsCountPerStatusResponse countPerStatus(companyDomain, employeeId).execute();

Get Goal Status Counts, Version 1.1

Get the number of goals per status for an employee. Difference from Version 1: Returns goals in the closed filter and provides filter actions for each filter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID to whom the goals are assigned.
    try {
      GoalsCountPerStatusResponse result = client
              .goals
              .countPerStatus(companyDomain, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFilters());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#countPerStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsCountPerStatusResponse> response = client
              .goals
              .countPerStatus(companyDomain, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#countPerStatus");
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
| **employeeId** | **String**| employeeId is the employee ID to whom the goals are assigned. | |

### Return type

[**GoalsCountPerStatusResponse**](GoalsCountPerStatusResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response content will be a JSON document with the requested information. |  -  |

<a name="createComment"></a>
# **createComment**
> createComment(companyDomain, employeeId, goalId, body).execute();

Create Goal Comment

Create a new goal comment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the goal ID for the specified employee.
    try {
      client
              .goals
              .createComment(companyDomain, employeeId, goalId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#createComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .goals
              .createComment(companyDomain, employeeId, goalId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#createComment");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the goal ID for the specified employee. | |
| **body** | **String**|  | |

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
| **201** | A goal comment object with the new goal comment ID. |  -  |
| **400** | If the posted XML or JSON is invalid or the minimum fields are not provided. |  -  |
| **403** | If the API user does not have permission to add a comment to the specified goal. |  -  |

<a name="createEmployeeGoal"></a>
# **createEmployeeGoal**
> Object createEmployeeGoal(companyDomain, employeeId, newGoal).execute();

Create Goal

Create a new goal for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String title = "title_example"; // [Required] The goal title.
    List<Integer> sharedWithEmployeeIds = Arrays.asList(); // [Required] Employee IDs of employees with whom the goal is shared. All goal owners are considered \\\"shared with\\\". This must include the employee for whom the goal is created.
    String dueDate = "dueDate_example"; // [Required] The goal due date in YYYY-mm-dd format.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String description = "description_example"; // [Optional] The goal description.
    Integer percentComplete = 56; // [Optional] The goal completion percentage (0 - 100). If completionDate is set, this value must be 100.
    String alignsWithOptionId = "alignsWithOptionId_example"; // [Optional] The option ID that aligns with this goal.
    Float completionDate = 3.4F; // [Optional] The date the goal was completed. If date is set, and no milestones are contained within this goal, percentComplete must be set to 100. If this goal does contain milestones, completion date cannot be set.
    List<Milestone> milestones = Arrays.asList(); // [Optional] Milestones for the goal.
    try {
      Object result = client
              .goals
              .createEmployeeGoal(title, sharedWithEmployeeIds, dueDate, companyDomain, employeeId)
              .description(description)
              .percentComplete(percentComplete)
              .alignsWithOptionId(alignsWithOptionId)
              .completionDate(completionDate)
              .milestones(milestones)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#createEmployeeGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .goals
              .createEmployeeGoal(title, sharedWithEmployeeIds, dueDate, companyDomain, employeeId)
              .description(description)
              .percentComplete(percentComplete)
              .alignsWithOptionId(alignsWithOptionId)
              .completionDate(completionDate)
              .milestones(milestones)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#createEmployeeGoal");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **newGoal** | [**NewGoal**](NewGoal.md)|  | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A goal object that includes the new goal ID. |  -  |
| **400** | If the posted XML or JSON is invalid or the minimum fields are not provided. |  -  |
| **403** | If the API user does not have permission to create a goal for this employee. |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(companyDomain, employeeId, goalId).execute();

Delete Goal

Delete a goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the goal ID for the specified employee.
    try {
      client
              .goals
              .deleteById(companyDomain, employeeId, goalId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .goals
              .deleteById(companyDomain, employeeId, goalId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#deleteById");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the goal ID for the specified employee. | |

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
| **204** | Successful deletion will return a 204 - No content response. |  -  |
| **400** | The posted JSON is invalid. |  -  |
| **403** | Goal is not editable or insufficient permissions. |  -  |
| **404** | The goal specified by the given goalId was not found. |  -  |

<a name="deleteComment"></a>
# **deleteComment**
> deleteComment(companyDomain, employeeId, goalId, commentId).execute();

Delete Goal Comment

Delete a goal comment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the goal ID for the specified employee.
    String commentId = "commentId_example"; // commentId is the ID of a specific comment for the specified goal.
    try {
      client
              .goals
              .deleteComment(companyDomain, employeeId, goalId, commentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#deleteComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .goals
              .deleteComment(companyDomain, employeeId, goalId, commentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#deleteComment");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the goal ID for the specified employee. | |
| **commentId** | **String**| commentId is the ID of a specific comment for the specified goal. | |

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
| **204** | Successful deletion will return a 204 - No content response. |  -  |
| **400** | The posted JSON is invalid. |  -  |
| **403** | Goal is not editable or insufficient permissions. |  -  |
| **404** | The goal specified by the given goalId was not found. |  -  |

<a name="determinePermission"></a>
# **determinePermission**
> determinePermission(companyDomain, employeeId).execute();

Can Create a Goal

Determine if the API user has permission to create a goal for this employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    try {
      client
              .goals
              .determinePermission(companyDomain, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#determinePermission");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .goals
              .determinePermission(companyDomain, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#determinePermission");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |

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

<a name="getAlignableOptions"></a>
# **getAlignableOptions**
> getAlignableOptions(companyDomain, employeeId).body(body).execute();

Alignable Goal Options

Get alignable goal options for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID to get alignable goal options for.
    try {
      client
              .goals
              .getAlignableOptions(companyDomain, employeeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getAlignableOptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .goals
              .getAlignableOptions(companyDomain, employeeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getAlignableOptions");
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
| **employeeId** | **String**| employeeId is the employee ID to get alignable goal options for. | |
| **body** | **String**| Get alignment options including the option currently aligned with this goal (if applicable). If omitted, response will be alignment options belonging to the API user. | [optional] |

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
| **200** | The response content will be a JSON document with a list of goals that are available alignment options. |  -  |

<a name="getAllAggregateInfo"></a>
# **getAllAggregateInfo**
> GoalsGetAllAggregateInfoResponse getAllAggregateInfo(companyDomain, employeeId).execute();

Get All Aggregate Goal Info

Provides a list of all goals, type counts, goal comment counts, and employees shared with goals for the given employee. This version of the endpoint will not return any goals with milestones. Milestone functionality for this endpoint begins in version 1.2.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID used to generate the aggregate information.
    try {
      GoalsGetAllAggregateInfoResponse result = client
              .goals
              .getAllAggregateInfo(companyDomain, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCanAlign());
      System.out.println(result.getCanCreateGoals());
      System.out.println(result.getFilters());
      System.out.println(result.getSelectedFilter());
      System.out.println(result.getGoals());
      System.out.println(result.getPersons());
      System.out.println(result.getComments());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getAllAggregateInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsGetAllAggregateInfoResponse> response = client
              .goals
              .getAllAggregateInfo(companyDomain, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getAllAggregateInfo");
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
| **employeeId** | **String**| employeeId is the employee ID used to generate the aggregate information. | |

### Return type

[**GoalsGetAllAggregateInfoResponse**](GoalsGetAllAggregateInfoResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response content will be an JSON document with the requested information. |  -  |

<a name="getAllAggregateInfo_0"></a>
# **getAllAggregateInfo_0**
> GoalsGetAllAggregateInfo200Response getAllAggregateInfo_0(companyDomain, employeeId).execute();

Get All Aggregate Goal Info, Version 1.1

Provides a list of all goals, type counts, filter actions, goal comment counts, and employees shared with goals for the given employee. Difference from Version 1: Returns goals in the closed filter and provides filter actions for each filter. This version of the endpoint will not return any goals with milestones. Milestone functionality for this endpoint begins in version 1.2.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID used to generate the aggregate information.
    try {
      GoalsGetAllAggregateInfo200Response result = client
              .goals
              .getAllAggregateInfo_0(companyDomain, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCanAlign());
      System.out.println(result.getCanCreateGoals());
      System.out.println(result.getFilters());
      System.out.println(result.getSelectedFilter());
      System.out.println(result.getGoals());
      System.out.println(result.getPersons());
      System.out.println(result.getComments());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getAllAggregateInfo_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsGetAllAggregateInfo200Response> response = client
              .goals
              .getAllAggregateInfo_0(companyDomain, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getAllAggregateInfo_0");
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
| **employeeId** | **String**| employeeId is the employee ID used to generate the aggregate information. | |

### Return type

[**GoalsGetAllAggregateInfo200Response**](GoalsGetAllAggregateInfo200Response.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response content will be an JSON document with the requested information. |  -  |

<a name="getAllAggregateInfo_1"></a>
# **getAllAggregateInfo_1**
> GoalsGetAllAggregateInfo200Response1 getAllAggregateInfo_1(companyDomain, employeeId).execute();

Get All Aggregate Goal Info, Version 1.2

Provides a list of all goals, type counts, filter actions, goal comment counts, and employees shared with goals for the given employee. Difference from Version 1.1: Returns all goals, including goals that contain milestones.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID used to generate the aggregate information.
    try {
      GoalsGetAllAggregateInfo200Response1 result = client
              .goals
              .getAllAggregateInfo_1(companyDomain, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCanAlign());
      System.out.println(result.getCanCreateGoals());
      System.out.println(result.getFilters());
      System.out.println(result.getSelectedFilter());
      System.out.println(result.getGoals());
      System.out.println(result.getPersons());
      System.out.println(result.getComments());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getAllAggregateInfo_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsGetAllAggregateInfo200Response1> response = client
              .goals
              .getAllAggregateInfo_1(companyDomain, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getAllAggregateInfo_1");
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
| **employeeId** | **String**| employeeId is the employee ID used to generate the aggregate information. | |

### Return type

[**GoalsGetAllAggregateInfo200Response1**](GoalsGetAllAggregateInfo200Response1.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response content will be an JSON document with the requested information. |  -  |

<a name="getComments"></a>
# **getComments**
> getComments(companyDomain, employeeId, goalId).execute();

Get Goal Comments

Get comments for a goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the goal ID for the specified employee.
    try {
      client
              .goals
              .getComments(companyDomain, employeeId, goalId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getComments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .goals
              .getComments(companyDomain, employeeId, goalId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getComments");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the goal ID for the specified employee. | |

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
| **200** | The response content will be a JSON document with a list of comments for the specified goal. |  -  |

<a name="getEmployeeGoals"></a>
# **getEmployeeGoals**
> GoalsGetEmployeeGoalsResponse getEmployeeGoals(companyDomain, employeeId).filter(filter).execute();

Get Goals

Get goals for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID to whom the goals are assigned.
    String filter = "filter_example"; // A filter that can be applied to only show the goals that are in a certain state.
    try {
      GoalsGetEmployeeGoalsResponse result = client
              .goals
              .getEmployeeGoals(companyDomain, employeeId)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getGoals());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getEmployeeGoals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsGetEmployeeGoalsResponse> response = client
              .goals
              .getEmployeeGoals(companyDomain, employeeId)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getEmployeeGoals");
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
| **employeeId** | **String**| employeeId is the employee ID to whom the goals are assigned. | |
| **filter** | **String**| A filter that can be applied to only show the goals that are in a certain state. | [optional] |

### Return type

[**GoalsGetEmployeeGoalsResponse**](GoalsGetEmployeeGoalsResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response content will be a JSON document with the requested information. |  -  |

<a name="getGoalAggregateInfo"></a>
# **getGoalAggregateInfo**
> GoalsGetGoalAggregateInfoResponse getGoalAggregateInfo(companyDomain, employeeId, goalId).execute();

Get Aggregate Goal Info

Provides goal information, goal comments, and employees shared with goals or who have commented on the given goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the Goal ID used to generate the aggregate information.
    try {
      GoalsGetGoalAggregateInfoResponse result = client
              .goals
              .getGoalAggregateInfo(companyDomain, employeeId, goalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGoal());
      System.out.println(result.getCanAlign());
      System.out.println(result.getCanCreateGoals());
      System.out.println(result.getAlignsWithOptions());
      System.out.println(result.getComments());
      System.out.println(result.getPersons());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getGoalAggregateInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsGetGoalAggregateInfoResponse> response = client
              .goals
              .getGoalAggregateInfo(companyDomain, employeeId, goalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#getGoalAggregateInfo");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the Goal ID used to generate the aggregate information. | |

### Return type

[**GoalsGetGoalAggregateInfoResponse**](GoalsGetGoalAggregateInfoResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response content will be an JSON document with the requested information. |  -  |

<a name="reopenGoal"></a>
# **reopenGoal**
> Object reopenGoal(companyDomain, employeeId, goalId).execute();

Reopen a Goal

Reopen a goal.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the goal ID for the specified employee.
    try {
      Object result = client
              .goals
              .reopenGoal(companyDomain, employeeId, goalId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#reopenGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .goals
              .reopenGoal(companyDomain, employeeId, goalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#reopenGoal");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the goal ID for the specified employee. | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A successful response indicates that all the goal was reopened. The content of the response will be the goal response object for the specified goalId. |  -  |
| **400** | The posted JSON is invalid. |  -  |
| **403** | Goal is not editable or insufficient permissions. |  -  |
| **404** | The goal specified by the given goalId was not found. |  -  |

<a name="shareOptionsGet"></a>
# **shareOptionsGet**
> shareOptionsGet(companyDomain, employeeId).search(search).limit(limit).execute();

Available Goal Sharing Options

Provides a list of employees with whom the specified employee&#39;s goals may be shared.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID to get sharing options for.
    String search = "search_example"; // The search term used to filter employees returned. Will search name, employee ID and email.
    String limit = "limit_example"; // Limit will restrict results to specified number.
    try {
      client
              .goals
              .shareOptionsGet(companyDomain, employeeId)
              .search(search)
              .limit(limit)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#shareOptionsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .goals
              .shareOptionsGet(companyDomain, employeeId)
              .search(search)
              .limit(limit)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#shareOptionsGet");
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
| **employeeId** | **String**| employeeId is the employee ID to get sharing options for. | |
| **search** | **String**| The search term used to filter employees returned. Will search name, employee ID and email. | [optional] |
| **limit** | **String**| Limit will restrict results to specified number. | [optional] |

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
| **200** | The response content will be a JSON document with a list of available employees with whom the goals can be shared. |  -  |

<a name="statusCount"></a>
# **statusCount**
> GoalsStatusCountResponse statusCount(companyDomain, employeeId).execute();

Get Goal Status Counts

Get the number of goals per status for an employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID to whom the goals are assigned.
    try {
      GoalsStatusCountResponse result = client
              .goals
              .statusCount(companyDomain, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFilters());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#statusCount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsStatusCountResponse> response = client
              .goals
              .statusCount(companyDomain, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#statusCount");
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
| **employeeId** | **String**| employeeId is the employee ID to whom the goals are assigned. | |

### Return type

[**GoalsStatusCountResponse**](GoalsStatusCountResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response content will be a JSON document with the requested information. |  -  |

<a name="updateComment"></a>
# **updateComment**
> updateComment(companyDomain, employeeId, goalId, commentId, body).execute();

Update Goal Comment

Update a goal comment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the goal ID for the specified employee.
    String commentId = "commentId_example"; // commentId is the comment ID for the specified goal.
    try {
      client
              .goals
              .updateComment(companyDomain, employeeId, goalId, commentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .goals
              .updateComment(companyDomain, employeeId, goalId, commentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateComment");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the goal ID for the specified employee. | |
| **commentId** | **String**| commentId is the comment ID for the specified goal. | |
| **body** | **String**|  | |

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
| **200** | A successful response indicates that all the requested changes were made. The content of the response will be the goal comment response object for the specified commentId. |  -  |
| **400** | The posted JSON is invalid. |  -  |
| **403** | Goal is not editable or insufficient permissions. |  -  |
| **404** | The goal specified by the given goalId was not found. |  -  |

<a name="updateEmployeeGoal"></a>
# **updateEmployeeGoal**
> Object updateEmployeeGoal(companyDomain, employeeId, goalId, goal).execute();

Update Goal

Update a goal. This version will not update a goal to contain milestones, that functionality is added in version 1.1

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String title = "title_example"; // The goal title.
    Integer id = 56; // A unique identifier for the record. Use this ID to reference this goal.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the goal ID for the specified employee.
    String description = "description_example"; // The goal description.
    Integer percentComplete = 56; // The goal completion percentage (0 - 100).
    String alignsWithOptionId = "alignsWithOptionId_example"; // The option ID that aligns with this goal.
    List<Integer> sharedWithEmployeeIds = Arrays.asList(); // Employee IDs of employees with whom the goal is shared. All goal owners are considered \\\"shared with\\\".
    String dueDate = "dueDate_example"; // The goal due date in YYYY-mm-dd format.
    Float completionDate = 3.4F; // The date the goal was completed.
    try {
      Object result = client
              .goals
              .updateEmployeeGoal(title, id, companyDomain, employeeId, goalId)
              .description(description)
              .percentComplete(percentComplete)
              .alignsWithOptionId(alignsWithOptionId)
              .sharedWithEmployeeIds(sharedWithEmployeeIds)
              .dueDate(dueDate)
              .completionDate(completionDate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateEmployeeGoal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .goals
              .updateEmployeeGoal(title, id, companyDomain, employeeId, goalId)
              .description(description)
              .percentComplete(percentComplete)
              .alignsWithOptionId(alignsWithOptionId)
              .sharedWithEmployeeIds(sharedWithEmployeeIds)
              .dueDate(dueDate)
              .completionDate(completionDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateEmployeeGoal");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the goal ID for the specified employee. | |
| **goal** | [**Goal**](Goal.md)| Required fields: title, sharedWithEmployeeIds, dueDate. Any non-required field not provided will overwrite existing data with a NULL value. | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response indicates that all the requested changes were made. The content of the response will be the goal response object for the specified goalId. |  -  |
| **400** | The posted JSON is invalid. |  -  |
| **403** | Goal is not editable or insufficient permissions. |  -  |
| **404** | The goal specified by the given goalId was not found. |  -  |

<a name="updateEmployeeGoalV11"></a>
# **updateEmployeeGoalV11**
> Object updateEmployeeGoalV11(companyDomain, employeeId, goalId, updateGoalV11).execute();

Update Goal, V1.1

Update a goal. Version 1.1 allows the updating of the milestones contained within the goal, unlike Version 1.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String title = "title_example"; // [Required] The goal title.
    List<Integer> sharedWithEmployeeIds = Arrays.asList(); // [Required] Employee IDs of employees with whom the goal is shared. All goal owners are considered \\\"shared with\\\". This must include the employee for whom the goal is created.
    String dueDate = "dueDate_example"; // [Required] The goal due date in YYYY-mm-dd format.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the goal ID for the specified employee.
    String description = "description_example"; // [Optional] The goal description.
    String alignsWithOptionId = "alignsWithOptionId_example"; // [Optional] The option ID that aligns with this goal.
    Boolean milestonesEnabled = true; // [Optional] A flag indicating whether or not milestones are enabled for this goal. Setting this flag to false will delete all existing milestones for this goal.
    List<Integer> deletedMilestoneIds = Arrays.asList(); // [Optional] Ids of all the milestones to be deleted with the update.
    List<Milestone> milestones = Arrays.asList(); // [Optional] All milestones to be added to the goal with this update.
    try {
      Object result = client
              .goals
              .updateEmployeeGoalV11(title, sharedWithEmployeeIds, dueDate, companyDomain, employeeId, goalId)
              .description(description)
              .alignsWithOptionId(alignsWithOptionId)
              .milestonesEnabled(milestonesEnabled)
              .deletedMilestoneIds(deletedMilestoneIds)
              .milestones(milestones)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateEmployeeGoalV11");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .goals
              .updateEmployeeGoalV11(title, sharedWithEmployeeIds, dueDate, companyDomain, employeeId, goalId)
              .description(description)
              .alignsWithOptionId(alignsWithOptionId)
              .milestonesEnabled(milestonesEnabled)
              .deletedMilestoneIds(deletedMilestoneIds)
              .milestones(milestones)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateEmployeeGoalV11");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the goal ID for the specified employee. | |
| **updateGoalV11** | [**UpdateGoalV11**](UpdateGoalV11.md)| Required fields: title, sharedWithEmployeeIds, dueDate. Any non-required field not provided will overwrite existing data with a NULL value. | |

### Return type

**Object**

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response indicates that all the requested changes were made. The content of the response will be the goal response object for the specified goalId. |  -  |
| **400** | The posted JSON is invalid. |  -  |
| **403** | Goal is not editable or insufficient permissions. |  -  |
| **404** | The goal specified by the given goalId was not found. |  -  |

<a name="updateGoalSharing"></a>
# **updateGoalSharing**
> GoalsUpdateGoalSharingResponse updateGoalSharing(companyDomain, employeeId, goalId, goalsUpdateGoalSharingRequest).execute();

Update Goal Sharing

Updates which employees this goal is shared with.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    String employeeId = "employeeId_example"; // employeeId is the employee ID with whom the goal is associated.
    String goalId = "goalId_example"; // goalId is the goal ID for the specified employee.
    List<Integer> sharedWithEmployeeIds = Arrays.asList();
    try {
      GoalsUpdateGoalSharingResponse result = client
              .goals
              .updateGoalSharing(companyDomain, employeeId, goalId)
              .sharedWithEmployeeIds(sharedWithEmployeeIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getGoal());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateGoalSharing");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsUpdateGoalSharingResponse> response = client
              .goals
              .updateGoalSharing(companyDomain, employeeId, goalId)
              .sharedWithEmployeeIds(sharedWithEmployeeIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateGoalSharing");
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
| **employeeId** | **String**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **String**| goalId is the goal ID for the specified employee. | |
| **goalsUpdateGoalSharingRequest** | [**GoalsUpdateGoalSharingRequest**](GoalsUpdateGoalSharingRequest.md)| Employee IDs of employees with whom the goal is shared. All goal owners are considered \&quot;shared with\&quot;. | |

### Return type

[**GoalsUpdateGoalSharingResponse**](GoalsUpdateGoalSharingResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response indicates that all the requested changes were made. The content of the response will be the goal response object for the specified goalId. |  -  |
| **400** | The posted JSON is invalid. |  -  |
| **403** | Goal is not editable or insufficient permissions. |  -  |
| **404** | No goal found for the given goalId. |  -  |

<a name="updateProgress"></a>
# **updateProgress**
> GoalsUpdateProgressResponse updateProgress(companyDomain, employeeId, goalId, body).execute();

Update Goal Progress

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GoalsApi;
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
    Integer employeeId = 56; // employeeId is the employee ID with whom the goal is associated.
    Integer goalId = 56; // goalId is the goal ID for the specified employee.
    try {
      GoalsUpdateProgressResponse result = client
              .goals
              .updateProgress(companyDomain, employeeId, goalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getGoal());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateProgress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GoalsUpdateProgressResponse> response = client
              .goals
              .updateProgress(companyDomain, employeeId, goalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#updateProgress");
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
| **employeeId** | **Integer**| employeeId is the employee ID with whom the goal is associated. | |
| **goalId** | **Integer**| goalId is the goal ID for the specified employee. | |
| **body** | **Integer**| Employee IDs of employees with whom the goal is shared. All goal owners are considered \&quot;shared with\&quot;. | |

### Return type

[**GoalsUpdateProgressResponse**](GoalsUpdateProgressResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response indicates that all the requested changes were made. The content of the response will be the goal response object for the specified goalId. |  -  |
| **400** | The posted JSON is invalid. |  -  |
| **403** | Goal is not editable or insufficient permissions. |  -  |
| **404** | No goal found for the given goalId. |  -  |


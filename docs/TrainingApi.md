# TrainingApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCategory**](TrainingApi.md#addCategory) | **POST** /{companyDomain}/v1/training/category | Add Training Category |
| [**addEmployeeTrainingRecord**](TrainingApi.md#addEmployeeTrainingRecord) | **POST** /{companyDomain}/v1/training/record/employee/{employeeId} | Add New Employee Training Record |
| [**categoryList**](TrainingApi.md#categoryList) | **GET** /{companyDomain}/v1/training/category | List Training Categories |
| [**deleteCategory**](TrainingApi.md#deleteCategory) | **DELETE** /{companyDomain}/v1/training/category/{trainingCategoryId} | Delete Training Category |
| [**deleteEmployeeRecord**](TrainingApi.md#deleteEmployeeRecord) | **DELETE** /{companyDomain}/v1/training/record/{employeeTrainingRecordId} | Delete Employee Training Record |
| [**getTypes**](TrainingApi.md#getTypes) | **GET** /{companyDomain}/v1/training/type | List Training Types |
| [**listEmployeeTrainings**](TrainingApi.md#listEmployeeTrainings) | **GET** /{companyDomain}/v1/training/record/employee/{employeeId} | List Employee Trainings |
| [**removeType**](TrainingApi.md#removeType) | **DELETE** /{companyDomain}/v1/training/type/{trainingTypeId} | Delete Training Type |
| [**typeAddition**](TrainingApi.md#typeAddition) | **POST** /{companyDomain}/v1/training/type | Add Training Type |
| [**updateCategory**](TrainingApi.md#updateCategory) | **PUT** /{companyDomain}/v1/training/category/{trainingCategoryId} | Update Training Category |
| [**updateEmployeeTrainingRecord**](TrainingApi.md#updateEmployeeTrainingRecord) | **PUT** /{companyDomain}/v1/training/record/{employeeTrainingRecordId} | Update Employee Training Record |
| [**updateType**](TrainingApi.md#updateType) | **PUT** /{companyDomain}/v1/training/type/{trainingTypeId} | Update Training Type |


<a name="addCategory"></a>
# **addCategory**
> TrainingCategory addCategory(companyDomain, trainingAddCategoryRequest).execute();

Add Training Category

Add a training category. The owner of the API key used must have access to training settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
    String name = "name_example"; // Name of the new training category.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    try {
      TrainingCategory result = client
              .training
              .addCategory(name, companyDomain)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#addCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrainingCategory> response = client
              .training
              .addCategory(name, companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#addCategory");
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
| **trainingAddCategoryRequest** | [**TrainingAddCategoryRequest**](TrainingAddCategoryRequest.md)| Training category to post | |

### Return type

[**TrainingCategory**](TrainingCategory.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="addEmployeeTrainingRecord"></a>
# **addEmployeeTrainingRecord**
> TrainingRecord addEmployeeTrainingRecord(companyDomain, employeeId, trainingAddEmployeeTrainingRecordRequest).execute();

Add New Employee Training Record

Add a new employee training record. The owner of the API key used must have permission to add trainings for the selected employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
    LocalDate completed = LocalDate.now(); // Completed is a required field and must be in yyyy-mm-dd format.
    Integer type = 0; // This must be an existing training type id.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    Integer employeeId = 0; // The ID of the employee to add a training record to.
    TrainingAddEmployeeTrainingRecordRequestCost cost = new TrainingAddEmployeeTrainingRecordRequestCost();
    String instructor = "instructor_example";
    Double hours = 3.4D;
    Double credits = 3.4D;
    String notes = "notes_example";
    try {
      TrainingRecord result = client
              .training
              .addEmployeeTrainingRecord(completed, type, companyDomain, employeeId)
              .cost(cost)
              .instructor(instructor)
              .hours(hours)
              .credits(credits)
              .notes(notes)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getCompleted());
      System.out.println(result.getNotes());
      System.out.println(result.getInstructor());
      System.out.println(result.getCredits());
      System.out.println(result.getHours());
      System.out.println(result.getCost());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#addEmployeeTrainingRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrainingRecord> response = client
              .training
              .addEmployeeTrainingRecord(completed, type, companyDomain, employeeId)
              .cost(cost)
              .instructor(instructor)
              .hours(hours)
              .credits(credits)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#addEmployeeTrainingRecord");
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
| **employeeId** | **Integer**| The ID of the employee to add a training record to. | [default to 0] |
| **trainingAddEmployeeTrainingRecordRequest** | [**TrainingAddEmployeeTrainingRecordRequest**](TrainingAddEmployeeTrainingRecordRequest.md)| Training object to post | |

### Return type

[**TrainingRecord**](TrainingRecord.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="categoryList"></a>
# **categoryList**
> List&lt;TrainingCategoryListResponseInner&gt; categoryList(companyDomain).execute();

List Training Categories

Get a list of training categories. The owner of the API key used must have access to training settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
      List<TrainingCategoryListResponseInner> result = client
              .training
              .categoryList(companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#categoryList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TrainingCategoryListResponseInner>> response = client
              .training
              .categoryList(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#categoryList");
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

[**List&lt;TrainingCategoryListResponseInner&gt;**](TrainingCategoryListResponseInner.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(companyDomain, trainingCategoryId).execute();

Delete Training Category

Delete an existing training category. The owner of the API key used must have access to training settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
    Integer trainingCategoryId = 0; // The ID of the training category to delete.
    try {
      client
              .training
              .deleteCategory(companyDomain, trainingCategoryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#deleteCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .training
              .deleteCategory(companyDomain, trainingCategoryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#deleteCategory");
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
| **trainingCategoryId** | **Integer**| The ID of the training category to delete. | [default to 0] |

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
| **200** | Success |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url or training category does not exist. |  -  |
| **500** | Internal server error |  -  |

<a name="deleteEmployeeRecord"></a>
# **deleteEmployeeRecord**
> deleteEmployeeRecord(companyDomain, employeeTrainingRecordId).execute();

Delete Employee Training Record

Delete an existing employee training record. The owner of the API key used must have permission to view and edit the employee and training type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
    Integer employeeTrainingRecordId = 0; // The ID of the training record to delete.
    try {
      client
              .training
              .deleteEmployeeRecord(companyDomain, employeeTrainingRecordId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#deleteEmployeeRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .training
              .deleteEmployeeRecord(companyDomain, employeeTrainingRecordId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#deleteEmployeeRecord");
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
| **employeeTrainingRecordId** | **Integer**| The ID of the training record to delete. | [default to 0] |

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
| **200** | Success |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url or training record does not exist. |  -  |
| **405** | Unable to delete training record. |  -  |

<a name="getTypes"></a>
# **getTypes**
> List&lt;TrainingGetTypesResponseInner&gt; getTypes(companyDomain).execute();

List Training Types

Get a list of training types. The owner of the API key used must have access to training settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
      List<TrainingGetTypesResponseInner> result = client
              .training
              .getTypes(companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#getTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TrainingGetTypesResponseInner>> response = client
              .training
              .getTypes(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#getTypes");
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

[**List&lt;TrainingGetTypesResponseInner&gt;**](TrainingGetTypesResponseInner.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="listEmployeeTrainings"></a>
# **listEmployeeTrainings**
> List&lt;TrainingListEmployeeTrainingsResponseInner&gt; listEmployeeTrainings(companyDomain, employeeId).trainingTypeId(trainingTypeId).execute();

List Employee Trainings

Get all employee training records. The owner of the API key used must have access to view the employee. The API will only return trainings for the employee that the owner of the API key has permission to see. Included with each employee training is the training information that has been selected for tracking in settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
    Integer employeeId = 0; // The ID of the employee to get a list of trainings for.
    Integer trainingTypeId = 0; // The training type id is optional. Not supplying a training type id will return the collection of all training records for the employee.
    try {
      List<TrainingListEmployeeTrainingsResponseInner> result = client
              .training
              .listEmployeeTrainings(companyDomain, employeeId)
              .trainingTypeId(trainingTypeId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#listEmployeeTrainings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TrainingListEmployeeTrainingsResponseInner>> response = client
              .training
              .listEmployeeTrainings(companyDomain, employeeId)
              .trainingTypeId(trainingTypeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#listEmployeeTrainings");
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
| **employeeId** | **Integer**| The ID of the employee to get a list of trainings for. | [default to 0] |
| **trainingTypeId** | **Integer**| The training type id is optional. Not supplying a training type id will return the collection of all training records for the employee. | [optional] [default to 0] |

### Return type

[**List&lt;TrainingListEmployeeTrainingsResponseInner&gt;**](TrainingListEmployeeTrainingsResponseInner.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="removeType"></a>
# **removeType**
> removeType(companyDomain, trainingTypeId).execute();

Delete Training Type

Delete an existing training type. The owner of the API key used must have access to training settings. Deleting a training type will only be successful if all employee trainings for this type have been removed prior to this request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
    Integer trainingTypeId = 0; // The ID of the training type to delete.
    try {
      client
              .training
              .removeType(companyDomain, trainingTypeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#removeType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .training
              .removeType(companyDomain, trainingTypeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#removeType");
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
| **trainingTypeId** | **Integer**| The ID of the training type to delete. | [default to 0] |

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
| **200** | Success |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url or training type does not exist. |  -  |
| **405** | Training type was unable to be deleted. |  -  |

<a name="typeAddition"></a>
# **typeAddition**
> TrainingType typeAddition(companyDomain, trainingTypeAdditionRequest).execute();

Add Training Type

Add a training type. The owner of the API key used must have access to training settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
    String name = "name_example"; // Name of the new training type.
    Boolean required = true; // Is this a required training?
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    String description = "description_example"; // Description for the training.
    Integer frequency = 56; // The frequency is the (optional) amount of months between renewing trainings. Not valid if training are not renewable.
    Boolean renewable = true; // Renewable is optional but if you are setting it to true you must pass a frequency which is the months between renewals.
    TrainingTypeAdditionRequestCategory category = new TrainingTypeAdditionRequestCategory();
    Integer dueFromHireDate = 56; // Number of days before the training is due for new hires. Not valid unless training is required.
    String linkUrl = "linkUrl_example"; // Optional URL that can be included with a training.
    Boolean allowEmployeesToMarkComplete = false; // Allows all employees who can view the training to be able to mark it complete.
    try {
      TrainingType result = client
              .training
              .typeAddition(name, required, companyDomain)
              .description(description)
              .frequency(frequency)
              .renewable(renewable)
              .category(category)
              .dueFromHireDate(dueFromHireDate)
              .linkUrl(linkUrl)
              .allowEmployeesToMarkComplete(allowEmployeesToMarkComplete)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRenewable());
      System.out.println(result.getFrequency());
      System.out.println(result.getDueFromHireDate());
      System.out.println(result.getRequired());
      System.out.println(result.getCategory());
      System.out.println(result.getLinkUrl());
      System.out.println(result.getAllowEmployeesToMarkComplete());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#typeAddition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrainingType> response = client
              .training
              .typeAddition(name, required, companyDomain)
              .description(description)
              .frequency(frequency)
              .renewable(renewable)
              .category(category)
              .dueFromHireDate(dueFromHireDate)
              .linkUrl(linkUrl)
              .allowEmployeesToMarkComplete(allowEmployeesToMarkComplete)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#typeAddition");
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
| **trainingTypeAdditionRequest** | [**TrainingTypeAdditionRequest**](TrainingTypeAdditionRequest.md)| Training object to post | |

### Return type

[**TrainingType**](TrainingType.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="updateCategory"></a>
# **updateCategory**
> TrainingCategory updateCategory(companyDomain, trainingCategoryId, trainingUpdateCategoryRequest).execute();

Update Training Category

Update an existing training category. The owner of the API key used must have access to training settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
    String name = "name_example"; // Name of the training category.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    Integer trainingCategoryId = 0; // The ID of the training category to update.
    try {
      TrainingCategory result = client
              .training
              .updateCategory(name, companyDomain, trainingCategoryId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#updateCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrainingCategory> response = client
              .training
              .updateCategory(name, companyDomain, trainingCategoryId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#updateCategory");
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
| **trainingCategoryId** | **Integer**| The ID of the training category to update. | [default to 0] |
| **trainingUpdateCategoryRequest** | [**TrainingUpdateCategoryRequest**](TrainingUpdateCategoryRequest.md)| Training category to update | |

### Return type

[**TrainingCategory**](TrainingCategory.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="updateEmployeeTrainingRecord"></a>
# **updateEmployeeTrainingRecord**
> TrainingRecord updateEmployeeTrainingRecord(companyDomain, employeeTrainingRecordId, trainingUpdateEmployeeTrainingRecordRequest).execute();

Update Employee Training Record

Update an existing exmployee training record. The owner of the API key used must have permission to add trainings for the selected employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
    String completed = "completed_example"; // Completed is the only required field and must be in yyyy-mm-dd format. The other parameters are optional.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    Integer employeeTrainingRecordId = 0; // The ID of the training record to update.
    TrainingAddEmployeeTrainingRecordRequestCost cost = new TrainingAddEmployeeTrainingRecordRequestCost();
    String instructor = "instructor_example";
    Double hours = 3.4D;
    Double credits = 3.4D;
    Double notes = 3.4D;
    try {
      TrainingRecord result = client
              .training
              .updateEmployeeTrainingRecord(completed, companyDomain, employeeTrainingRecordId)
              .cost(cost)
              .instructor(instructor)
              .hours(hours)
              .credits(credits)
              .notes(notes)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getCompleted());
      System.out.println(result.getNotes());
      System.out.println(result.getInstructor());
      System.out.println(result.getCredits());
      System.out.println(result.getHours());
      System.out.println(result.getCost());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#updateEmployeeTrainingRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrainingRecord> response = client
              .training
              .updateEmployeeTrainingRecord(completed, companyDomain, employeeTrainingRecordId)
              .cost(cost)
              .instructor(instructor)
              .hours(hours)
              .credits(credits)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#updateEmployeeTrainingRecord");
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
| **employeeTrainingRecordId** | **Integer**| The ID of the training record to update. | [default to 0] |
| **trainingUpdateEmployeeTrainingRecordRequest** | [**TrainingUpdateEmployeeTrainingRecordRequest**](TrainingUpdateEmployeeTrainingRecordRequest.md)| Training object to update | |

### Return type

[**TrainingRecord**](TrainingRecord.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="updateType"></a>
# **updateType**
> TrainingType updateType(companyDomain, trainingTypeId, trainingUpdateTypeRequest).execute();

Update Training Type

Update an existing training type. The owner of the API key used must have access to training settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingApi;
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
    String name = "name_example"; // Name of the training type.
    Boolean required = true; // Is this a required training?
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    Integer trainingTypeId = 0; // The ID of the training type to update.
    String description = "description_example"; // Description for the training.
    Integer frequency = 56; // The frequency is the (optional) amount of months between renewing trainings. Not valid if training are not renewable.
    Boolean renewable = true; // Renewable is optional but if you are setting it to true you must pass a frequency.
    TrainingUpdateTypeRequestCategory category = new TrainingUpdateTypeRequestCategory();
    Integer dueFromHireDate = 56; // Number of days before the training is due for new hires. Not valid unless training is required.
    String linkUrl = "linkUrl_example"; // Optional URL that can be included with a training.
    Boolean allowEmployeesToMarkComplete = false; // Allows all employees who can view the training to be able to mark it complete.
    try {
      TrainingType result = client
              .training
              .updateType(name, required, companyDomain, trainingTypeId)
              .description(description)
              .frequency(frequency)
              .renewable(renewable)
              .category(category)
              .dueFromHireDate(dueFromHireDate)
              .linkUrl(linkUrl)
              .allowEmployeesToMarkComplete(allowEmployeesToMarkComplete)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRenewable());
      System.out.println(result.getFrequency());
      System.out.println(result.getDueFromHireDate());
      System.out.println(result.getRequired());
      System.out.println(result.getCategory());
      System.out.println(result.getLinkUrl());
      System.out.println(result.getAllowEmployeesToMarkComplete());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#updateType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrainingType> response = client
              .training
              .updateType(name, required, companyDomain, trainingTypeId)
              .description(description)
              .frequency(frequency)
              .renewable(renewable)
              .category(category)
              .dueFromHireDate(dueFromHireDate)
              .linkUrl(linkUrl)
              .allowEmployeesToMarkComplete(allowEmployeesToMarkComplete)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingApi#updateType");
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
| **trainingTypeId** | **Integer**| The ID of the training type to update. | [default to 0] |
| **trainingUpdateTypeRequest** | [**TrainingUpdateTypeRequest**](TrainingUpdateTypeRequest.md)| Training type object to update to | |

### Return type

[**TrainingType**](TrainingType.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |


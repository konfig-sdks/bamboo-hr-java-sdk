# EmployeeFilesApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCategory**](EmployeeFilesApi.md#addCategory) | **POST** /{companyDomain}/v1/employees/files/categories | Add Employee File Category |
| [**getEmployeeFile**](EmployeeFilesApi.md#getEmployeeFile) | **GET** /{companyDomain}/v1/employees/{id}/files/{fileId} | Get an Employee File |
| [**listFilesAndCategories**](EmployeeFilesApi.md#listFilesAndCategories) | **GET** /{companyDomain}/v1/employees/{id}/files/view | List employee files and categories |
| [**removeFile**](EmployeeFilesApi.md#removeFile) | **DELETE** /{companyDomain}/v1/employees/{id}/files/{fileId} | Delete Employee File |
| [**updateEmployeeFile**](EmployeeFilesApi.md#updateEmployeeFile) | **POST** /{companyDomain}/v1/employees/{id}/files/{fileId} | Update Employee File |
| [**uploadFile**](EmployeeFilesApi.md#uploadFile) | **POST** /{companyDomain}/v1/employees/{id}/files | Upload Employee File |


<a name="addCategory"></a>
# **addCategory**
> addCategory(companyDomain, requestBody).execute();

Add Employee File Category

Add an employee file category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeFilesApi;
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
              .employeeFiles
              .addCategory(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#addCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeFiles
              .addCategory(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#addCategory");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

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
| **201** | The category was created |  -  |
| **400** | if the posted XML is invalid or there was no category name given. |  -  |
| **403** | if the API user does not have permission to create employee categories. |  -  |
| **500** | there was an unknown server error. |  -  |

<a name="getEmployeeFile"></a>
# **getEmployeeFile**
> getEmployeeFile(companyDomain, id, fileId).execute();

Get an Employee File

Gets an employee file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeFilesApi;
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
    String id = "0"; // {id} is an employee ID. The special employee ID of zero (0) means to use the employee ID associated with the API key (if any).
    String fileId = "fileId_example"; // {fileId} is the ID of the employee file being retrieved.
    try {
      client
              .employeeFiles
              .getEmployeeFile(companyDomain, id, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#getEmployeeFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeFiles
              .getEmployeeFile(companyDomain, id, fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#getEmployeeFile");
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
| **id** | **String**| {id} is an employee ID. The special employee ID of zero (0) means to use the employee ID associated with the API key (if any). | [default to 0] |
| **fileId** | **String**| {fileId} is the ID of the employee file being retrieved. | |

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
| **200** | Employee file was successfully retrieved |  -  |
| **403** | if the API user does not have permission to see the requested employee or the employee&#39;s files. |  -  |
| **404** | if the employee file was not found. |  -  |

<a name="listFilesAndCategories"></a>
# **listFilesAndCategories**
> listFilesAndCategories(companyDomain, id).execute();

List employee files and categories

Lists employee files and categories

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeFilesApi;
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
    String id = "0"; // {id} is an employee ID. The special employee ID of zero (0) means to use the employee ID associated with the API key (if any).
    try {
      client
              .employeeFiles
              .listFilesAndCategories(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#listFilesAndCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeFiles
              .listFilesAndCategories(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#listFilesAndCategories");
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
| **id** | **String**| {id} is an employee ID. The special employee ID of zero (0) means to use the employee ID associated with the API key (if any). | [default to 0] |

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
| **200** | Employee file and category list |  -  |
| **403** | if the API user does not have permission to see the requested employee or the employee&#39;s files. |  -  |
| **404** | if no files are found for this employee. |  -  |

<a name="removeFile"></a>
# **removeFile**
> removeFile(companyDomain, id, fileId).execute();

Delete Employee File

Delete an employee file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeFilesApi;
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
    String id = "0"; // {id} is an employee ID. The special employee ID of zero (0) means to use the employee ID associated with the API key (if any).
    String fileId = "fileId_example"; // {fileId} is the ID of the employee file being deleted.
    try {
      client
              .employeeFiles
              .removeFile(companyDomain, id, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#removeFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeFiles
              .removeFile(companyDomain, id, fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#removeFile");
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
| **id** | **String**| {id} is an employee ID. The special employee ID of zero (0) means to use the employee ID associated with the API key (if any). | [default to 0] |
| **fileId** | **String**| {fileId} is the ID of the employee file being deleted. | |

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
| **200** | Employee file was deleted |  -  |
| **403** | if the API user does not have permission to see the requested employee or the employee&#39;s files. |  -  |
| **404** | if the employee file was not found. |  -  |

<a name="updateEmployeeFile"></a>
# **updateEmployeeFile**
> updateEmployeeFile(companyDomain, id, fileId, employeeFileUpdate).execute();

Update Employee File

Update an employee file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeFilesApi;
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
    String id = "0"; // {id} is an employee ID. The special employee ID of zero (0) means to use the employee ID associated with the API key (if any).
    String fileId = "fileId_example"; // {fileId} is the ID of the employee file being updated.
    String name = "name_example"; // 
    String categoryId = "categoryId_example"; // 
    String shareWithEmployee = "shareWithEmployee_example"; // 
    try {
      client
              .employeeFiles
              .updateEmployeeFile(companyDomain, id, fileId)
              .name(name)
              .categoryId(categoryId)
              .shareWithEmployee(shareWithEmployee)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#updateEmployeeFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeFiles
              .updateEmployeeFile(companyDomain, id, fileId)
              .name(name)
              .categoryId(categoryId)
              .shareWithEmployee(shareWithEmployee)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#updateEmployeeFile");
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
| **id** | **String**| {id} is an employee ID. The special employee ID of zero (0) means to use the employee ID associated with the API key (if any). | [default to 0] |
| **fileId** | **String**| {fileId} is the ID of the employee file being updated. | |
| **employeeFileUpdate** | [**EmployeeFileUpdate**](EmployeeFileUpdate.md)|  | |

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
| **200** | The employee file was updated |  -  |
| **400** | Invalid JSON |  -  |
| **403** | if the API user does not have permission to see the requested employee or the employee&#39;s files. |  -  |
| **404** | if the employee file or category was not found. |  -  |

<a name="uploadFile"></a>
# **uploadFile**
> uploadFile(companyDomain, id).execute();

Upload Employee File

Upload an employee file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeFilesApi;
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
    String id = "0"; // {id} is an employee ID. The special employee ID of zero (0) means to use the employee ID associated with the API key (if any).
    try {
      client
              .employeeFiles
              .uploadFile(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#uploadFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeFiles
              .uploadFile(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeFilesApi#uploadFile");
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
| **id** | **String**| {id} is an employee ID. The special employee ID of zero (0) means to use the employee ID associated with the API key (if any). | [default to 0] |

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
| **201** | The employee file was successfully uploaded |  -  |
| **403** | if the API user does not have permission to see the requested employee or the employee&#39;s files. |  -  |
| **404** | if the category ID was not found. |  -  |
| **413** | if the file size exceeds 20MB or the storage limit for the company. |  -  |


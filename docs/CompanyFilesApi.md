# CompanyFilesApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCategory**](CompanyFilesApi.md#createCategory) | **POST** /{companyDomain}/v1/files/categories | Add Company File Category |
| [**getFile**](CompanyFilesApi.md#getFile) | **GET** /{companyDomain}/v1/files/{fileId} | Get an Company File |
| [**listFilesAndCategories**](CompanyFilesApi.md#listFilesAndCategories) | **GET** /{companyDomain}/v1/files/view | List company files and categories |
| [**removeFile**](CompanyFilesApi.md#removeFile) | **DELETE** /{companyDomain}/v1/files/{fileId} | Delete Company File |
| [**updateFile**](CompanyFilesApi.md#updateFile) | **POST** /{companyDomain}/v1/files/{fileId} | Update Company File |
| [**uploadFile**](CompanyFilesApi.md#uploadFile) | **POST** /{companyDomain}/v1/files | Upload Company File |


<a name="createCategory"></a>
# **createCategory**
> createCategory(companyDomain, requestBody).execute();

Add Company File Category

Add a company file category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyFilesApi;
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
              .companyFiles
              .createCategory(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#createCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .companyFiles
              .createCategory(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#createCategory");
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
| **400** | if the posted JSON is invalid or there was no category name given. |  -  |
| **403** | if the API user does not have permission to see the company files. |  -  |
| **500** | there was an unknown server error. |  -  |

<a name="getFile"></a>
# **getFile**
> getFile(companyDomain, fileId).execute();

Get an Company File

Gets an company file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyFilesApi;
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
    String fileId = "fileId_example"; // {fileId} is the ID of the company file being retrieved.
    try {
      client
              .companyFiles
              .getFile(companyDomain, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#getFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .companyFiles
              .getFile(companyDomain, fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#getFile");
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
| **fileId** | **String**| {fileId} is the ID of the company file being retrieved. | |

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
| **200** | Company file was successfully retrieved |  -  |
| **403** | if the API user does not have permission to see the company files. |  -  |
| **404** | if the file was not found. |  -  |

<a name="listFilesAndCategories"></a>
# **listFilesAndCategories**
> listFilesAndCategories(companyDomain).execute();

List company files and categories

Lists company files and categories

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyFilesApi;
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
              .companyFiles
              .listFilesAndCategories(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#listFilesAndCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .companyFiles
              .listFilesAndCategories(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#listFilesAndCategories");
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
| **200** | Company files and category list |  -  |
| **403** | if the API user does not have permission to see the company files. |  -  |
| **404** | if no files or categories are found. |  -  |

<a name="removeFile"></a>
# **removeFile**
> removeFile(companyDomain, fileId).execute();

Delete Company File

Delete a company file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyFilesApi;
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
    String fileId = "fileId_example"; // {fileId} is the ID of the company file being deleted.
    try {
      client
              .companyFiles
              .removeFile(companyDomain, fileId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#removeFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .companyFiles
              .removeFile(companyDomain, fileId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#removeFile");
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
| **fileId** | **String**| {fileId} is the ID of the company file being deleted. | |

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
| **200** | Company file was deleted |  -  |
| **403** | if the API user does not have permission to see the requested file. |  -  |
| **404** | if the file was not found. |  -  |

<a name="updateFile"></a>
# **updateFile**
> updateFile(companyDomain, fileId, companyFileUpdate).execute();

Update Company File

Update a company file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyFilesApi;
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
    String fileId = "fileId_example"; // {fileId} is the ID of the employee file being updated.
    String name = "name_example"; // 
    String categoryId = "categoryId_example"; // 
    String shareWithEmployee = "shareWithEmployee_example"; // 
    try {
      client
              .companyFiles
              .updateFile(companyDomain, fileId)
              .name(name)
              .categoryId(categoryId)
              .shareWithEmployee(shareWithEmployee)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#updateFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .companyFiles
              .updateFile(companyDomain, fileId)
              .name(name)
              .categoryId(categoryId)
              .shareWithEmployee(shareWithEmployee)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#updateFile");
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
| **fileId** | **String**| {fileId} is the ID of the employee file being updated. | |
| **companyFileUpdate** | [**CompanyFileUpdate**](CompanyFileUpdate.md)|  | |

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
| **400** | if the posted JSON is invalid. |  -  |
| **403** | if the API user does not have permission to see the company files. |  -  |
| **404** | if the file or category was not found. |  -  |

<a name="uploadFile"></a>
# **uploadFile**
> uploadFile(companyDomain).execute();

Upload Company File

Upload a company file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyFilesApi;
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
              .companyFiles
              .uploadFile(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#uploadFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .companyFiles
              .uploadFile(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyFilesApi#uploadFile");
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
| **201** | The company file was successfully uploaded |  -  |
| **403** | if the API user does not have permission to see the company files. |  -  |
| **404** | if the category ID was not found. |  -  |
| **413** | if the file size exceeds 20MB or the storage limit for the company. |  -  |


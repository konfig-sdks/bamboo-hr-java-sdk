# WebhooksApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewWebhook**](WebhooksApi.md#addNewWebhook) | **POST** /{companyDomain}/v1/webhooks | Add Webhook |
| [**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /{companyDomain}/v1/webhooks/{id} | Delete Webhook |
| [**getUserList**](WebhooksApi.md#getUserList) | **GET** /{companyDomain}/v1/webhooks | Gets as list of webhooks for the user API key. |
| [**getUserWebhook**](WebhooksApi.md#getUserWebhook) | **GET** /{companyDomain}/v1/webhooks/{id} | Get Webhook |
| [**getWebhookLogs**](WebhooksApi.md#getWebhookLogs) | **GET** /{companyDomain}/v1/webhooks/{id}/log | Get Webhook Logs |
| [**listMonitorFields**](WebhooksApi.md#listMonitorFields) | **GET** /{companyDomain}/v1/webhooks/monitor_fields | Get monitor fields |
| [**updateWebhookById**](WebhooksApi.md#updateWebhookById) | **PUT** /{companyDomain}/v1/webhooks/{id} | Update Webhook |


<a name="addNewWebhook"></a>
# **addNewWebhook**
> WebhooksAddNewWebhookResponse addNewWebhook(companyDomain, newWebHook).execute();

Add Webhook

Add a new Webhook. For more details or instructions you can refer to the [webhooks API tutorial](https://documentation.bamboohr.com/docs/webhooks-api-permission-based).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    String name = "name_example"; // The name of the webhook.
    List<String> monitorFields = Arrays.asList(); // A list of fields to monitor.
    Map<String, String> postFields = new HashMap(); // A list of fields to post to the webhook url. Field ID or alias: external name
    String url = "url_example"; // The url the webhook should send data to (must begin with https://).
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    String format = "json"; // The format the webhook should use (json - default, form-encoded).
    NewWebHookFrequency frequency = new NewWebHookFrequency();
    NewWebHookLimit limit = new NewWebHookLimit();
    Boolean includeCompanyDomain = true; // If set to true, the company domain will be added to the header.
    try {
      WebhooksAddNewWebhookResponse result = client
              .webhooks
              .addNewWebhook(name, monitorFields, postFields, url, companyDomain)
              .format(format)
              .frequency(frequency)
              .limit(limit)
              .includeCompanyDomain(includeCompanyDomain)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreated());
      System.out.println(result.getLastSent());
      System.out.println(result.getMonitorFields());
      System.out.println(result.getPostFields());
      System.out.println(result.getUrl());
      System.out.println(result.getFormat());
      System.out.println(result.getFrequency());
      System.out.println(result.getLimit());
      System.out.println(result.getPrivateKey());
      System.out.println(result.getIncludeCompanyDomain());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#addNewWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksAddNewWebhookResponse> response = client
              .webhooks
              .addNewWebhook(name, monitorFields, postFields, url, companyDomain)
              .format(format)
              .frequency(frequency)
              .limit(limit)
              .includeCompanyDomain(includeCompanyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#addNewWebhook");
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
| **newWebHook** | [**NewWebHook**](NewWebHook.md)|  | |

### Return type

[**WebhooksAddNewWebhookResponse**](WebhooksAddNewWebhookResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Webhook created, JSON output of webhook follows. Private key is included in the create webhook only! |  -  |
| **401** | The user API key is invalid. |  -  |

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(companyDomain, id).execute();

Delete Webhook

Delete a webhook that is tied to a specific user API Key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    String id = "id_example"; // {id} is an webhook ID that is associated with the User API key.
    try {
      client
              .webhooks
              .deleteWebhook(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhooks
              .deleteWebhook(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteWebhook");
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
| **id** | **String**| {id} is an webhook ID that is associated with the User API key. | |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook was deleted |  -  |
| **401** | The user API key is invalid. |  -  |

<a name="getUserList"></a>
# **getUserList**
> WebhooksGetUserListResponse getUserList(companyDomain).execute();

Gets as list of webhooks for the user API key.

Gets as list of webhooks for the user API key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
      WebhooksGetUserListResponse result = client
              .webhooks
              .getUserList(companyDomain)
              .execute();
      System.out.println(result);
      System.out.println(result.getWebhooks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getUserList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksGetUserListResponse> response = client
              .webhooks
              .getUserList(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getUserList");
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

[**WebhooksGetUserListResponse**](WebhooksGetUserListResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of webhooks |  -  |
| **401** | The user API key is invalid. |  -  |

<a name="getUserWebhook"></a>
# **getUserWebhook**
> WebHookResponse getUserWebhook(companyDomain, id).execute();

Get Webhook

Get webhook data that is tied to a specific user API Key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    String id = "id_example"; // The webhook ID to display details about.
    try {
      WebHookResponse result = client
              .webhooks
              .getUserWebhook(companyDomain, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreated());
      System.out.println(result.getLastSent());
      System.out.println(result.getMonitorFields());
      System.out.println(result.getPostFields());
      System.out.println(result.getUrl());
      System.out.println(result.getFormat());
      System.out.println(result.getFrequency());
      System.out.println(result.getLimit());
      System.out.println(result.getIncludeCompanyDomain());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getUserWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebHookResponse> response = client
              .webhooks
              .getUserWebhook(companyDomain, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getUserWebhook");
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
| **id** | **String**| The webhook ID to display details about. | |

### Return type

[**WebHookResponse**](WebHookResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Webhook |  -  |
| **401** | The user API key is invalid. |  -  |

<a name="getWebhookLogs"></a>
# **getWebhookLogs**
> WebHookLogResponse getWebhookLogs(companyDomain, id).execute();

Get Webhook Logs

Get webhook logs for specific webhook id that is associated with the user API Key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    String id = "id_example"; // The webhook ID to get logs about.
    try {
      WebHookLogResponse result = client
              .webhooks
              .getWebhookLogs(companyDomain, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getWebhookId());
      System.out.println(result.getUrl());
      System.out.println(result.getLastAttempted());
      System.out.println(result.getLastSuccess());
      System.out.println(result.getFailureCount());
      System.out.println(result.getStatus());
      System.out.println(result.getEmployeeIds());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhookLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebHookLogResponse> response = client
              .webhooks
              .getWebhookLogs(companyDomain, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhookLogs");
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
| **id** | **String**| The webhook ID to get logs about. | |

### Return type

[**WebHookLogResponse**](WebHookLogResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Webhook |  -  |

<a name="listMonitorFields"></a>
# **listMonitorFields**
> WebhooksListMonitorFieldsResponse listMonitorFields(companyDomain).execute();

Get monitor fields

Get a list fields webhooks can monitor monitor

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
      WebhooksListMonitorFieldsResponse result = client
              .webhooks
              .listMonitorFields(companyDomain)
              .execute();
      System.out.println(result);
      System.out.println(result.getFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#listMonitorFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksListMonitorFieldsResponse> response = client
              .webhooks
              .listMonitorFields(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#listMonitorFields");
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

[**WebhooksListMonitorFieldsResponse**](WebhooksListMonitorFieldsResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of logs |  -  |
| **401** | The user API key is invalid. |  -  |

<a name="updateWebhookById"></a>
# **updateWebhookById**
> WebHookResponse updateWebhookById(companyDomain, id, newWebHook).execute();

Update Webhook

Update a webhook, based on webhook ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
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
    String name = "name_example"; // The name of the webhook.
    List<String> monitorFields = Arrays.asList(); // A list of fields to monitor.
    Map<String, String> postFields = new HashMap(); // A list of fields to post to the webhook url. Field ID or alias: external name
    String url = "url_example"; // The url the webhook should send data to (must begin with https://).
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    String id = "id_example"; // {id} is a webhook ID.
    String format = "json"; // The format the webhook should use (json - default, form-encoded).
    NewWebHookFrequency frequency = new NewWebHookFrequency();
    NewWebHookLimit limit = new NewWebHookLimit();
    Boolean includeCompanyDomain = true; // If set to true, the company domain will be added to the header.
    try {
      WebHookResponse result = client
              .webhooks
              .updateWebhookById(name, monitorFields, postFields, url, companyDomain, id)
              .format(format)
              .frequency(frequency)
              .limit(limit)
              .includeCompanyDomain(includeCompanyDomain)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreated());
      System.out.println(result.getLastSent());
      System.out.println(result.getMonitorFields());
      System.out.println(result.getPostFields());
      System.out.println(result.getUrl());
      System.out.println(result.getFormat());
      System.out.println(result.getFrequency());
      System.out.println(result.getLimit());
      System.out.println(result.getIncludeCompanyDomain());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateWebhookById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebHookResponse> response = client
              .webhooks
              .updateWebhookById(name, monitorFields, postFields, url, companyDomain, id)
              .format(format)
              .frequency(frequency)
              .limit(limit)
              .includeCompanyDomain(includeCompanyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateWebhookById");
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
| **id** | **String**| {id} is a webhook ID. | |
| **newWebHook** | [**NewWebHook**](NewWebHook.md)|  | |

### Return type

[**WebHookResponse**](WebHookResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook updated successfully. |  -  |
| **401** | The user API key is invalid. |  -  |


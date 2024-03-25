# TabularDataApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addRow**](TabularDataApi.md#addRow) | **POST** /{companyDomain}/v1_1/employees/{id}/tables/{table} | Adds a table row |
| [**addTableRow**](TabularDataApi.md#addTableRow) | **POST** /{companyDomain}/v1/employees/{id}/tables/{table} | Adds a table row |
| [**deleteRow**](TabularDataApi.md#deleteRow) | **DELETE** /{companyDomain}/v1/employees/{id}/tables/{table}/{rowId} | Deletes a table row |
| [**getChangedTableRows**](TabularDataApi.md#getChangedTableRows) | **GET** /{companyDomain}/v1/employees/changed/tables/{table} | Gets all updated employee table data |
| [**getEmployeeTableRows**](TabularDataApi.md#getEmployeeTableRows) | **GET** /{companyDomain}/v1/employees/{id}/tables/{table} | Gets table rows for a given employee and table combination |
| [**updateRow**](TabularDataApi.md#updateRow) | **POST** /{companyDomain}/v1/employees/{id}/tables/{table}/{rowId} | Updates a table row. |
| [**updateRow_0**](TabularDataApi.md#updateRow_0) | **POST** /{companyDomain}/v1_1/employees/{id}/tables/{table}/{rowId} | Updates a table row. |


<a name="addRow"></a>
# **addRow**
> addRow(companyDomain, id, table, tableRowUpdate).execute();

Adds a table row

Adds a table row. Fundamentally the same as version 1 so choose a version and stay with it unless other changes occur. Changes from version 1 are now minor with a few variations limited to ACA, payroll, terminated rehire, gusto, benetrac, and final pay date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TabularDataApi;
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
    String id = "id_example"; // {id} is the employee ID.
    String table = "table_example"; // Table name
    String date = "date_example"; // 
    String location = "location_example"; // 
    String division = "division_example"; // 
    String department = "department_example"; // 
    String jobTitle = "jobTitle_example"; // 
    String reportsTo = "reportsTo_example"; // 
    try {
      client
              .tabularData
              .addRow(companyDomain, id, table)
              .date(date)
              .location(location)
              .division(division)
              .department(department)
              .jobTitle(jobTitle)
              .reportsTo(reportsTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#addRow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tabularData
              .addRow(companyDomain, id, table)
              .date(date)
              .location(location)
              .division(division)
              .department(department)
              .jobTitle(jobTitle)
              .reportsTo(reportsTo)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#addRow");
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
| **id** | **String**| {id} is the employee ID. | |
| **table** | **String**| Table name | |
| **tableRowUpdate** | [**TableRowUpdate**](TableRowUpdate.md)|  | |

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

<a name="addTableRow"></a>
# **addTableRow**
> addTableRow(companyDomain, id, table, tableRowUpdate).execute();

Adds a table row

Adds a table row. If employee is currently on a pay schedule syncing with Trax Payroll, or being added to one, the row cannot be added if they are missing any required fields for that table. If the API user is adding a row on the compensation table, the row cannot be added if they are missing any of the required employee fields (including fields not on that table).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TabularDataApi;
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
    String id = "id_example"; // {id} is the employee ID.
    String table = "table_example"; // Table name
    String date = "date_example"; // 
    String location = "location_example"; // 
    String division = "division_example"; // 
    String department = "department_example"; // 
    String jobTitle = "jobTitle_example"; // 
    String reportsTo = "reportsTo_example"; // 
    try {
      client
              .tabularData
              .addTableRow(companyDomain, id, table)
              .date(date)
              .location(location)
              .division(division)
              .department(department)
              .jobTitle(jobTitle)
              .reportsTo(reportsTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#addTableRow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tabularData
              .addTableRow(companyDomain, id, table)
              .date(date)
              .location(location)
              .division(division)
              .department(department)
              .jobTitle(jobTitle)
              .reportsTo(reportsTo)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#addTableRow");
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
| **id** | **String**| {id} is the employee ID. | |
| **table** | **String**| Table name | |
| **tableRowUpdate** | [**TableRowUpdate**](TableRowUpdate.md)|  | |

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
| **200** | Row added successfully. |  -  |
| **400** | Invalid or missing required fields. |  -  |
| **403** | Permission denied. |  -  |
| **406** | An error with one or more of the fields. |  -  |

<a name="deleteRow"></a>
# **deleteRow**
> TabularDataDeleteRowResponse deleteRow(companyDomain, id, table, rowId).execute();

Deletes a table row

Deletes a table row

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TabularDataApi;
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
    String id = "id_example"; // {id} is the employee ID.
    String table = "table_example"; // Table name
    String rowId = "rowId_example"; // Row ID
    try {
      TabularDataDeleteRowResponse result = client
              .tabularData
              .deleteRow(companyDomain, id, table, rowId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSucess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#deleteRow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TabularDataDeleteRowResponse> response = client
              .tabularData
              .deleteRow(companyDomain, id, table, rowId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#deleteRow");
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
| **id** | **String**| {id} is the employee ID. | |
| **table** | **String**| Table name | |
| **rowId** | **String**| Row ID | |

### Return type

[**TabularDataDeleteRowResponse**](TabularDataDeleteRowResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Respond true if the row was deleted, false if the row was not found. |  -  |
| **400** | Bad request. Invalid employee ID or table name. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Permission denied. |  -  |

<a name="getChangedTableRows"></a>
# **getChangedTableRows**
> getChangedTableRows(companyDomain, table, since).execute();

Gets all updated employee table data

This API is merely an optimization to avoid downloading all table data for all employees. When you use this API you will provide a timestamp and the results will be limited to just the employees that have changed since the time you provided. This API operates on an employee-last-changed-timestamp, which means that a change in ANY field in the employee record will cause ALL of that employees table rows to show up via this API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TabularDataApi;
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
    String table = "table_example"; // Table name
    String since = "since_example"; // URL encoded iso8601 timestamp
    try {
      client
              .tabularData
              .getChangedTableRows(companyDomain, table, since)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#getChangedTableRows");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tabularData
              .getChangedTableRows(companyDomain, table, since)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#getChangedTableRows");
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
| **table** | **String**| Table name | |
| **since** | **String**| URL encoded iso8601 timestamp | |

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

<a name="getEmployeeTableRows"></a>
# **getEmployeeTableRows**
> getEmployeeTableRows(companyDomain, id, table).execute();

Gets table rows for a given employee and table combination

Returns a data structure representing all the table rows for a given employee and table combination. The result is not sorted in any particular order.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TabularDataApi;
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
    String id = "id_example"; // {id} is the employee ID.
    String table = "table_example"; // Table name
    try {
      client
              .tabularData
              .getEmployeeTableRows(companyDomain, id, table)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#getEmployeeTableRows");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tabularData
              .getEmployeeTableRows(companyDomain, id, table)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#getEmployeeTableRows");
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
| **id** | **String**| {id} is the employee ID. | |
| **table** | **String**| Table name | |

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

<a name="updateRow"></a>
# **updateRow**
> updateRow(companyDomain, id, table, rowId, tableRowUpdate).execute();

Updates a table row.

Updates a table row. If employee is currently on a pay schedule syncing with Trax Payroll, or being added to one, the row cannot be added if they are missing any required fields for that table. If the API user is updating a row on the compensation table, the row cannot be updated if they are missing any of the required employee fields (including fields not on that table).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TabularDataApi;
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
    String id = "id_example"; // {id} is the employee ID.
    String table = "table_example"; // Table name
    String rowId = "rowId_example"; // Row ID
    String date = "date_example"; // 
    String location = "location_example"; // 
    String division = "division_example"; // 
    String department = "department_example"; // 
    String jobTitle = "jobTitle_example"; // 
    String reportsTo = "reportsTo_example"; // 
    try {
      client
              .tabularData
              .updateRow(companyDomain, id, table, rowId)
              .date(date)
              .location(location)
              .division(division)
              .department(department)
              .jobTitle(jobTitle)
              .reportsTo(reportsTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#updateRow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tabularData
              .updateRow(companyDomain, id, table, rowId)
              .date(date)
              .location(location)
              .division(division)
              .department(department)
              .jobTitle(jobTitle)
              .reportsTo(reportsTo)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#updateRow");
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
| **id** | **String**| {id} is the employee ID. | |
| **table** | **String**| Table name | |
| **rowId** | **String**| Row ID | |
| **tableRowUpdate** | [**TableRowUpdate**](TableRowUpdate.md)|  | |

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
| **200** | A successful response is possible even if one or more updates were dis-allowed because of permissions. As long as a single field is updated a 200 response will be returned. |  -  |
| **400** | Invalid or missing required fields. |  -  |
| **403** | Permission denied. |  -  |
| **406** | An error with one or more of the fields. |  -  |

<a name="updateRow_0"></a>
# **updateRow_0**
> updateRow_0(companyDomain, id, table, rowId, tableRowUpdate).execute();

Updates a table row.

Updates a table row. Fundamentally the same as version 1 so choose a version and stay with it unless other changes occur. Changes from version 1 are now minor with a few variations limited to ACA, payroll, terminated rehire, gusto, benetrac, and final pay date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TabularDataApi;
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
    String id = "id_example"; // {id} is the employee ID.
    String table = "table_example"; // Table name
    String rowId = "rowId_example"; // Row ID
    String date = "date_example"; // 
    String location = "location_example"; // 
    String division = "division_example"; // 
    String department = "department_example"; // 
    String jobTitle = "jobTitle_example"; // 
    String reportsTo = "reportsTo_example"; // 
    try {
      client
              .tabularData
              .updateRow_0(companyDomain, id, table, rowId)
              .date(date)
              .location(location)
              .division(division)
              .department(department)
              .jobTitle(jobTitle)
              .reportsTo(reportsTo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#updateRow_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tabularData
              .updateRow_0(companyDomain, id, table, rowId)
              .date(date)
              .location(location)
              .division(division)
              .department(department)
              .jobTitle(jobTitle)
              .reportsTo(reportsTo)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TabularDataApi#updateRow_0");
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
| **id** | **String**| {id} is the employee ID. | |
| **table** | **String**| Table name | |
| **rowId** | **String**| Row ID | |
| **tableRowUpdate** | [**TableRowUpdate**](TableRowUpdate.md)|  | |

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
| **200** | A successful response is possible even if one or more updates were dis-allowed because of permissions. As long as a single field is updated a 200 response will be returned. |  -  |
| **400** | Invalid or missing required fields. |  -  |
| **403** | Permission denied. |  -  |
| **406** | An error with one or more of the fields. |  -  |


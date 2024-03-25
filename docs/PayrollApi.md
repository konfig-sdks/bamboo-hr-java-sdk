# PayrollApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEmployeeDirectDepositInfo**](PayrollApi.md#addEmployeeDirectDepositInfo) | **POST** /{companyDomain}/v1/employee_direct_deposit_accounts/{id} | Add an employee&#39;s direct deposit information |
| [**addEmployeePaystub**](PayrollApi.md#addEmployeePaystub) | **POST** /{companyDomain}/v1/employee_pay_stub | Add an employee&#39;s paystub |
| [**addEmployeeUnpaidPaystubs**](PayrollApi.md#addEmployeeUnpaidPaystubs) | **POST** /{companyDomain}/v1/employee_unpaid_pay_stubs | Add an employee&#39;s unpaid paystubs |
| [**addEmployeeWithholdings**](PayrollApi.md#addEmployeeWithholdings) | **POST** /{companyDomain}/v1/employee_withholding/{id} | Add an employee&#39;s default withholdings |
| [**clearEmployeeDirectDeposit**](PayrollApi.md#clearEmployeeDirectDeposit) | **DELETE** /{companyDomain}/v1/employee_direct_deposit_accounts/{id} | Clear an employee&#39;s direct deposit information |
| [**clearEmployeeUnpaidPaystubs**](PayrollApi.md#clearEmployeeUnpaidPaystubs) | **DELETE** /{companyDomain}/v1/employee_unpaid_pay_stubs/{id} | Clear an employee&#39;s unpaid paystubs |
| [**clearEmployeeWithholdings**](PayrollApi.md#clearEmployeeWithholdings) | **DELETE** /{companyDomain}/v1/employee_withholding/{id} | Clear an employee&#39;s default withholdings |
| [**deleteEmployeePaystub**](PayrollApi.md#deleteEmployeePaystub) | **DELETE** /{companyDomain}/v1/employee_pay_stub/{id} | Delete an employee&#39;s paystub |
| [**employeeDirectDepositInfo**](PayrollApi.md#employeeDirectDepositInfo) | **GET** /{companyDomain}/v1/employee_direct_deposit_accounts/{id} | Get an employee&#39;s direct deposit information |
| [**getDefaultWithholdings**](PayrollApi.md#getDefaultWithholdings) | **GET** /{companyDomain}/v1/employee_withholding/{id} | Get an employee&#39;s default withholdings |
| [**getPaystub**](PayrollApi.md#getPaystub) | **GET** /{companyDomain}/v1/employee_pay_stub/{id} | Get an employee&#39;s paystub |
| [**getUnpaidPaystubs**](PayrollApi.md#getUnpaidPaystubs) | **GET** /{companyDomain}/v1/employee_unpaid_pay_stubs/{id} | Get an employee&#39;s unpaid paystubs |


<a name="addEmployeeDirectDepositInfo"></a>
# **addEmployeeDirectDepositInfo**
> addEmployeeDirectDepositInfo(companyDomain, id, employeeDeposit).execute();

Add an employee&#39;s direct deposit information

Add an employee&#39;s direct deposit information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String id = "id_example"; // {id} is the employee id.
    List<EmployeeDepositAccountsInner> accounts = Arrays.asList(); // 
    try {
      client
              .payroll
              .addEmployeeDirectDepositInfo(companyDomain, id)
              .accounts(accounts)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addEmployeeDirectDepositInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .addEmployeeDirectDepositInfo(companyDomain, id)
              .accounts(accounts)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addEmployeeDirectDepositInfo");
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
| **id** | **String**| {id} is the employee id. | |
| **employeeDeposit** | [**EmployeeDeposit**](EmployeeDeposit.md)|  | |

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
| **200** | The saved values for the employee&#39;s direct deposit declarations will be returned in JSON. |  -  |
| **400** | if an invalid employee ID is provided, or the posted JSON is not valid. |  -  |
| **403** | if the current user doesn&#39;t have access to update the employee&#39;s direct deposit declarations. |  -  |

<a name="addEmployeePaystub"></a>
# **addEmployeePaystub**
> addEmployeePaystub(companyDomain, employeePaystub).execute();

Add an employee&#39;s paystub

Add an employee&#39;s paystub

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String externalRecordId = "externalRecordId_example"; // 
    String payPeriodFrom = "payPeriodFrom_example"; // 
    String payPeriodTo = "payPeriodTo_example"; // 
    String payDate = "payDate_example"; // 
    String payorName = "payorName_example"; // 
    String payorAdd1 = "payorAdd1_example"; // 
    String payorAdd2 = "payorAdd2_example"; // 
    String payorCity = "payorCity_example"; // 
    String payorState = "payorState_example"; // 
    String payorZip = "payorZip_example"; // 
    String payeeName = "payeeName_example"; // 
    String currencyCode = "currencyCode_example"; // 
    String net = "net_example"; // 
    String gross = "gross_example"; // 
    String totalTaxes = "totalTaxes_example"; // 
    String totalDeductions = "totalDeductions_example"; // 
    String ytdNet = "ytdNet_example"; // 
    String ytdGross = "ytdGross_example"; // 
    String ytdTaxes = "ytdTaxes_example"; // 
    String ytdDeductions = "ytdDeductions_example"; // 
    String fedWitholding = "fedWitholding_example"; // 
    String federalType = "2020_w4"; // must be 2020_w4, pre_2020_w4, or null
    String twoJobs = "twoJobs_example"; // boolean value
    String dependentsAmount = "dependentsAmount_example"; // float value
    String otherIncome = "otherIncome_example"; // float value
    String deductionsAmount = "deductionsAmount_example"; // float value
    String stateWithholding = "stateWithholding_example"; // 
    String localWithholding = "localWithholding_example"; // 
    String additionalFed = "additionalFed_example"; // 
    String additionalState = "additionalState_example"; // 
    String additionalLocal = "additionalLocal_example"; // 
    String taxState = "taxState_example"; // 
    String taxLocal = "taxLocal_example"; // 
    List<EmployeePaystubWagesInner> wages = Arrays.asList(); // 
    List<EmployeePaystubTaxesInner> taxes = Arrays.asList(); // 
    List<EmployeePaystubDeductionsInner> deductions = Arrays.asList(); // 
    List<EmployeePaystubDepositsInner> deposits = Arrays.asList(); // 
    try {
      client
              .payroll
              .addEmployeePaystub(companyDomain)
              .employeeId(employeeId)
              .externalRecordId(externalRecordId)
              .payPeriodFrom(payPeriodFrom)
              .payPeriodTo(payPeriodTo)
              .payDate(payDate)
              .payorName(payorName)
              .payorAdd1(payorAdd1)
              .payorAdd2(payorAdd2)
              .payorCity(payorCity)
              .payorState(payorState)
              .payorZip(payorZip)
              .payeeName(payeeName)
              .currencyCode(currencyCode)
              .net(net)
              .gross(gross)
              .totalTaxes(totalTaxes)
              .totalDeductions(totalDeductions)
              .ytdNet(ytdNet)
              .ytdGross(ytdGross)
              .ytdTaxes(ytdTaxes)
              .ytdDeductions(ytdDeductions)
              .fedWitholding(fedWitholding)
              .federalType(federalType)
              .twoJobs(twoJobs)
              .dependentsAmount(dependentsAmount)
              .otherIncome(otherIncome)
              .deductionsAmount(deductionsAmount)
              .stateWithholding(stateWithholding)
              .localWithholding(localWithholding)
              .additionalFed(additionalFed)
              .additionalState(additionalState)
              .additionalLocal(additionalLocal)
              .taxState(taxState)
              .taxLocal(taxLocal)
              .wages(wages)
              .taxes(taxes)
              .deductions(deductions)
              .deposits(deposits)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addEmployeePaystub");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .addEmployeePaystub(companyDomain)
              .employeeId(employeeId)
              .externalRecordId(externalRecordId)
              .payPeriodFrom(payPeriodFrom)
              .payPeriodTo(payPeriodTo)
              .payDate(payDate)
              .payorName(payorName)
              .payorAdd1(payorAdd1)
              .payorAdd2(payorAdd2)
              .payorCity(payorCity)
              .payorState(payorState)
              .payorZip(payorZip)
              .payeeName(payeeName)
              .currencyCode(currencyCode)
              .net(net)
              .gross(gross)
              .totalTaxes(totalTaxes)
              .totalDeductions(totalDeductions)
              .ytdNet(ytdNet)
              .ytdGross(ytdGross)
              .ytdTaxes(ytdTaxes)
              .ytdDeductions(ytdDeductions)
              .fedWitholding(fedWitholding)
              .federalType(federalType)
              .twoJobs(twoJobs)
              .dependentsAmount(dependentsAmount)
              .otherIncome(otherIncome)
              .deductionsAmount(deductionsAmount)
              .stateWithholding(stateWithholding)
              .localWithholding(localWithholding)
              .additionalFed(additionalFed)
              .additionalState(additionalState)
              .additionalLocal(additionalLocal)
              .taxState(taxState)
              .taxLocal(taxLocal)
              .wages(wages)
              .taxes(taxes)
              .deductions(deductions)
              .deposits(deposits)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addEmployeePaystub");
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
| **employeePaystub** | [**EmployeePaystub**](EmployeePaystub.md)|  | |

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
| **200** | Additionally, the saved values for the employee&#39;s paystub record will be returned in JSON along with its record ID. |  -  |
| **400** | if an invalid employee ID is provided, or the posted JSON is not valid. |  -  |
| **403** | if the current user doesn&#39;t have access to add an employee pay stub. |  -  |

<a name="addEmployeeUnpaidPaystubs"></a>
# **addEmployeeUnpaidPaystubs**
> addEmployeeUnpaidPaystubs(companyDomain, employeeUnpaidPaystub).execute();

Add an employee&#39;s unpaid paystubs

Add an employee&#39;s unpaid paystubs

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    List<EmployeeUnpaidPaystubUnpaidPeriodsInner> unpaidPeriods = Arrays.asList(); // 
    try {
      client
              .payroll
              .addEmployeeUnpaidPaystubs(companyDomain)
              .employeeId(employeeId)
              .unpaidPeriods(unpaidPeriods)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addEmployeeUnpaidPaystubs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .addEmployeeUnpaidPaystubs(companyDomain)
              .employeeId(employeeId)
              .unpaidPeriods(unpaidPeriods)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addEmployeeUnpaidPaystubs");
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
| **employeeUnpaidPaystub** | [**EmployeeUnpaidPaystub**](EmployeeUnpaidPaystub.md)|  | |

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
| **200** | Additionally, the saved values for the employee&#39;s unpaid pay stubs will be returned in JSON. |  -  |
| **400** | if an invalid employee ID is provided, or the posted JSON is not valid. |  -  |
| **403** | if the current user doesn&#39;t have access to add employee unpaid pay stub information. |  -  |

<a name="addEmployeeWithholdings"></a>
# **addEmployeeWithholdings**
> addEmployeeWithholdings(companyDomain, id, employeeWithholding).execute();

Add an employee&#39;s default withholdings

Add an employee&#39;s default withholdings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String id = "id_example"; // {id} is the employee id.
    String fedWithholding = "fedWithholding_example"; // 
    String stateWithholding = "stateWithholding_example"; // 
    String localWithholding = "localWithholding_example"; // 
    String additionalFed = "additionalFed_example"; // 
    String additionalState = "additionalState_example"; // 
    String additionalLocal = "additionalLocal_example"; // 
    String taxState = "taxState_example"; // 
    String taxLocal = "taxLocal_example"; // 
    try {
      client
              .payroll
              .addEmployeeWithholdings(companyDomain, id)
              .fedWithholding(fedWithholding)
              .stateWithholding(stateWithholding)
              .localWithholding(localWithholding)
              .additionalFed(additionalFed)
              .additionalState(additionalState)
              .additionalLocal(additionalLocal)
              .taxState(taxState)
              .taxLocal(taxLocal)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addEmployeeWithholdings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .addEmployeeWithholdings(companyDomain, id)
              .fedWithholding(fedWithholding)
              .stateWithholding(stateWithholding)
              .localWithholding(localWithholding)
              .additionalFed(additionalFed)
              .additionalState(additionalState)
              .additionalLocal(additionalLocal)
              .taxState(taxState)
              .taxLocal(taxLocal)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#addEmployeeWithholdings");
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
| **id** | **String**| {id} is the employee id. | |
| **employeeWithholding** | [**EmployeeWithholding**](EmployeeWithholding.md)|  | |

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
| **200** | Withholding added |  -  |
| **400** | if an invalid employee ID is provided, or the posted JSON is not valid. |  -  |
| **403** | if the current user doesn&#39;t have access to add employee withholdings information. |  -  |

<a name="clearEmployeeDirectDeposit"></a>
# **clearEmployeeDirectDeposit**
> clearEmployeeDirectDeposit(companyDomain, id).execute();

Clear an employee&#39;s direct deposit information

Clear an employee&#39;s direct deposit information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    try {
      client
              .payroll
              .clearEmployeeDirectDeposit(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#clearEmployeeDirectDeposit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .clearEmployeeDirectDeposit(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#clearEmployeeDirectDeposit");
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
| **200** | The response content will be a JSON success document. |  -  |
| **400** | Invalid employee ID is provided |  -  |
| **403** | if the API user doesn&#39;t have access to edit the employee&#39;s direct deposit declarations. |  -  |

<a name="clearEmployeeUnpaidPaystubs"></a>
# **clearEmployeeUnpaidPaystubs**
> clearEmployeeUnpaidPaystubs(companyDomain, id).execute();

Clear an employee&#39;s unpaid paystubs

Clear an employee&#39;s unpaid paystubs

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String id = "id_example"; // {id} is the employee id.
    try {
      client
              .payroll
              .clearEmployeeUnpaidPaystubs(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#clearEmployeeUnpaidPaystubs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .clearEmployeeUnpaidPaystubs(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#clearEmployeeUnpaidPaystubs");
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
| **id** | **String**| {id} is the employee id. | |

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
| **200** | Unpaid paystub cleared |  -  |
| **400** | Unauthorized |  * X-BambooHR-Message - Human readable error to help when debugging, suitable for logging <br>  |
| **403** | Forbidden |  * X-BambooHR-Message - Human readable error to help when debugging, suitable for logging <br>  |

<a name="clearEmployeeWithholdings"></a>
# **clearEmployeeWithholdings**
> clearEmployeeWithholdings(companyDomain, id).execute();

Clear an employee&#39;s default withholdings

Clear an employee&#39;s default withholdings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String id = "id_example"; // {id} is the employee id.
    try {
      client
              .payroll
              .clearEmployeeWithholdings(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#clearEmployeeWithholdings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .clearEmployeeWithholdings(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#clearEmployeeWithholdings");
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
| **id** | **String**| {id} is the employee id. | |

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
| **200** | The response content will be a JSON success document. |  -  |
| **400** | Invalid employee ID is provided |  -  |
| **403** | if the API user doesn&#39;t have access to edit the employee withholdings information. |  -  |

<a name="deleteEmployeePaystub"></a>
# **deleteEmployeePaystub**
> deleteEmployeePaystub(companyDomain, id).execute();

Delete an employee&#39;s paystub

Delete an employee&#39;s paystub

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String id = "id_example"; // {id} is the paystub (record) ID.
    try {
      client
              .payroll
              .deleteEmployeePaystub(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteEmployeePaystub");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .deleteEmployeePaystub(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#deleteEmployeePaystub");
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
| **id** | **String**| {id} is the paystub (record) ID. | |

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
| **200** | The response content will be a JSON success document. |  -  |
| **400** | Invalid employee ID is provided |  -  |
| **403** | if the API user doesn&#39;t have access to edit the employee unpaid paystub information. |  -  |

<a name="employeeDirectDepositInfo"></a>
# **employeeDirectDepositInfo**
> employeeDirectDepositInfo(companyDomain, id).execute();

Get an employee&#39;s direct deposit information

Get an employee&#39;s direct deposit information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String id = "id_example"; // {id} is the employee.
    try {
      client
              .payroll
              .employeeDirectDepositInfo(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#employeeDirectDepositInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .employeeDirectDepositInfo(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#employeeDirectDepositInfo");
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
| **id** | **String**| {id} is the employee. | |

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
| **400** | Invalid employee ID is provided |  -  |

<a name="getDefaultWithholdings"></a>
# **getDefaultWithholdings**
> getDefaultWithholdings(companyDomain, id).execute();

Get an employee&#39;s default withholdings

Get an employee&#39;s default withholdings

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String id = "id_example"; // {id} is the employee.
    try {
      client
              .payroll
              .getDefaultWithholdings(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getDefaultWithholdings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .getDefaultWithholdings(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getDefaultWithholdings");
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
| **id** | **String**| {id} is the employee. | |

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
| **400** | Invalid employee ID is provided |  -  |

<a name="getPaystub"></a>
# **getPaystub**
> getPaystub(companyDomain, id).execute();

Get an employee&#39;s paystub

Get an employee&#39;s paystub

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String id = "id_example"; // {id} is the paystub (record) ID.
    try {
      client
              .payroll
              .getPaystub(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getPaystub");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .getPaystub(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getPaystub");
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
| **id** | **String**| {id} is the paystub (record) ID. | |

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
| **400** | Invalid employee ID is provided |  -  |

<a name="getUnpaidPaystubs"></a>
# **getUnpaidPaystubs**
> getUnpaidPaystubs(companyDomain, id).execute();

Get an employee&#39;s unpaid paystubs

Get an employee&#39;s unpaid paystubs

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayrollApi;
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
    String id = "id_example"; // {id} is the employee.
    try {
      client
              .payroll
              .getUnpaidPaystubs(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getUnpaidPaystubs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payroll
              .getUnpaidPaystubs(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayrollApi#getUnpaidPaystubs");
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
| **id** | **String**| {id} is the employee. | |

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


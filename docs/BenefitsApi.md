# BenefitsApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBenefitGroupEmployee**](BenefitsApi.md#addBenefitGroupEmployee) | **POST** /{companyDomain}/v1/benefitgroupemployees | Add a benefit group employee |
| [**addEmployeeBenefit**](BenefitsApi.md#addEmployeeBenefit) | **POST** /{companyDomain}/v1/benefit/employee_benefit | Add an employee benefit |
| [**addNewCompanyBenefit**](BenefitsApi.md#addNewCompanyBenefit) | **POST** /{companyDomain}/v1/benefit/company_benefit | Add a new company benefit |
| [**createEmployeeDependent**](BenefitsApi.md#createEmployeeDependent) | **POST** /{companyDomain}/v1/employeedependents | Add an employee dependent |
| [**deleteCompanyBenefit**](BenefitsApi.md#deleteCompanyBenefit) | **DELETE** /{companyDomain}/v1/benefit/company_benefit/{id} | Delete a company benefit |
| [**getBenefitGroupEmployees**](BenefitsApi.md#getBenefitGroupEmployees) | **GET** /{companyDomain}/v1/benefitgroupemployees | Get benefit group employees |
| [**getBenefitGroups**](BenefitsApi.md#getBenefitGroups) | **GET** /{companyDomain}/v1/benefitgroups | Get benefit groups |
| [**getBenefitPlanDeductionsByEmployee**](BenefitsApi.md#getBenefitPlanDeductionsByEmployee) | **GET** /{companyDomain}/v1/employee/plans/{id} | Get benefit plan deductions by employee |
| [**getBenefitPlans**](BenefitsApi.md#getBenefitPlans) | **GET** /{companyDomain}/v1/benefitplans | Get benefit plans |
| [**getCompanyBenefit**](BenefitsApi.md#getCompanyBenefit) | **GET** /{companyDomain}/v1/benefit/company_benefit/{id} | Get a company benefit |
| [**getCoverages**](BenefitsApi.md#getCoverages) | **GET** /{companyDomain}/v1/benefitcoverages | Get benefit coverages |
| [**getDeductionTypesAll**](BenefitsApi.md#getDeductionTypesAll) | **GET** /{companyDomain}/v1/benefits/settings/deduction_types/all | Get benefit deduction types |
| [**getDeductionsByPlan**](BenefitsApi.md#getDeductionsByPlan) | **GET** /{companyDomain}/v1/employee/deductions/{id} | Get employee deductions by benefit plan |
| [**getEmployeeBenefitDeductions**](BenefitsApi.md#getEmployeeBenefitDeductions) | **GET** /{companyDomain}/v1/payroll/deductions/{id} | Get benefit deductions for employee |
| [**getEmployeeDependent**](BenefitsApi.md#getEmployeeDependent) | **GET** /{companyDomain}/v1/employeedependents/{id} | Get employee dependent |
| [**getGroupPlanCosts**](BenefitsApi.md#getGroupPlanCosts) | **GET** /{companyDomain}/v1/benefitgroupplancosts | Get benefit group plan costs |
| [**getGroupPlans**](BenefitsApi.md#getGroupPlans) | **GET** /{companyDomain}/v1/benefitgroupplans | Get benefit group plans |
| [**listBenefitPlanCoverages**](BenefitsApi.md#listBenefitPlanCoverages) | **GET** /{companyDomain}/v1/benefitplancoverages | Get benefit plan coverages |
| [**listCompanyBenefitTypes**](BenefitsApi.md#listCompanyBenefitTypes) | **GET** /{companyDomain}/v1/benefit/company_benefit/type | Get a list of company benefit types |
| [**listCompanyBenefits**](BenefitsApi.md#listCompanyBenefits) | **GET** /{companyDomain}/v1/benefit/company_benefit | Get a list of company benefits |
| [**listEmployeeBenefits**](BenefitsApi.md#listEmployeeBenefits) | **GET** /{companyDomain}/v1/benefit/employee_benefit | Get a list of employee benefits |
| [**listEmployeeDependents**](BenefitsApi.md#listEmployeeDependents) | **GET** /{companyDomain}/v1/employeedependents | Get all employee dependents |
| [**updateCompanyBenefit**](BenefitsApi.md#updateCompanyBenefit) | **PUT** /{companyDomain}/v1/benefit/company_benefit/{id} | Update a company benefit |
| [**updateDependentInformation**](BenefitsApi.md#updateDependentInformation) | **PUT** /{companyDomain}/v1/employeedependents/{id} | Update an employee dependent |


<a name="addBenefitGroupEmployee"></a>
# **addBenefitGroupEmployee**
> addBenefitGroupEmployee(companyDomain, benefitGroupEmployee).execute();

Add a benefit group employee

Add a benefit group employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    String benefitGroupId = "benefitGroupId_example"; // 
    String employeeId = "employeeId_example"; // 
    String startDate = "startDate_example"; // 
    String endDate = "endDate_example"; // 
    try {
      client
              .benefits
              .addBenefitGroupEmployee(companyDomain)
              .benefitGroupId(benefitGroupId)
              .employeeId(employeeId)
              .startDate(startDate)
              .endDate(endDate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#addBenefitGroupEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .addBenefitGroupEmployee(companyDomain)
              .benefitGroupId(benefitGroupId)
              .employeeId(employeeId)
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#addBenefitGroupEmployee");
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
| **benefitGroupEmployee** | [**BenefitGroupEmployee**](BenefitGroupEmployee.md)|  | |

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
| **200** | Benefit group employee added |  -  |
| **400** | if the posted JSON is invalid |  -  |
| **403** | if the current user doesn&#39;t have access to add the benefit group employee. |  -  |
| **500** | Server error. |  -  |

<a name="addEmployeeBenefit"></a>
# **addEmployeeBenefit**
> addEmployeeBenefit(companyDomain, benefitsAddEmployeeBenefitRequest).execute();

Add an employee benefit

Add an employee benefit

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    Integer employeeId = 56; // Employee ID
    Integer companyBenefitId = 56; // Company benefit ID
    String companyBenefitName = "companyBenefitName_example"; // Company benefit name
    String coverageLevel = "coverageLevel_example"; // Coverage level
    LocalDate deductionEndDate = LocalDate.now(); // Deduction end date
    LocalDate deductionStartDate = LocalDate.now(); // Deduction start date
    String enrollmentStatus = "Eligible"; // Enrollment status
    LocalDate effectiveDate = LocalDate.now(); // Enrollment status effective date
    String currencyCode = "currencyCode_example"; // Currency code
    Double employeeAmount = 3.4D; // Employee amount
    String employeeAmountType = "employeeAmountType_example"; // Employee amount type
    String employeePercentBasedOn = "employeePercentBasedOn_example"; // Employee percent based on
    Double employeeCapAmount = 3.4D; // Employee cap amount
    String employeeCapAmountType = "employeeCapAmountType_example"; // Employee cap amount type
    Double employeeAnnualMax = 3.4D; // Employee annual max
    Double companyAmount = 3.4D; // Company amount
    String companyAmountType = "companyAmountType_example"; // Company amount type
    String companyPercentBasedOn = "companyPercentBasedOn_example"; // Company percent based on
    Double companyCapAmount = 3.4D; // Company cap amount
    String companyCapAmountType = "companyCapAmountType_example"; // Company cap amount type
    Double companyAnnualMax = 3.4D; // Company annual max
    Double benefitPlanCoverageId = 3.4D; // Benefit Plan Coverage ID
    try {
      client
              .benefits
              .addEmployeeBenefit(companyDomain)
              .employeeId(employeeId)
              .companyBenefitId(companyBenefitId)
              .companyBenefitName(companyBenefitName)
              .coverageLevel(coverageLevel)
              .deductionEndDate(deductionEndDate)
              .deductionStartDate(deductionStartDate)
              .enrollmentStatus(enrollmentStatus)
              .effectiveDate(effectiveDate)
              .currencyCode(currencyCode)
              .employeeAmount(employeeAmount)
              .employeeAmountType(employeeAmountType)
              .employeePercentBasedOn(employeePercentBasedOn)
              .employeeCapAmount(employeeCapAmount)
              .employeeCapAmountType(employeeCapAmountType)
              .employeeAnnualMax(employeeAnnualMax)
              .companyAmount(companyAmount)
              .companyAmountType(companyAmountType)
              .companyPercentBasedOn(companyPercentBasedOn)
              .companyCapAmount(companyCapAmount)
              .companyCapAmountType(companyCapAmountType)
              .companyAnnualMax(companyAnnualMax)
              .benefitPlanCoverageId(benefitPlanCoverageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#addEmployeeBenefit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .addEmployeeBenefit(companyDomain)
              .employeeId(employeeId)
              .companyBenefitId(companyBenefitId)
              .companyBenefitName(companyBenefitName)
              .coverageLevel(coverageLevel)
              .deductionEndDate(deductionEndDate)
              .deductionStartDate(deductionStartDate)
              .enrollmentStatus(enrollmentStatus)
              .effectiveDate(effectiveDate)
              .currencyCode(currencyCode)
              .employeeAmount(employeeAmount)
              .employeeAmountType(employeeAmountType)
              .employeePercentBasedOn(employeePercentBasedOn)
              .employeeCapAmount(employeeCapAmount)
              .employeeCapAmountType(employeeCapAmountType)
              .employeeAnnualMax(employeeAnnualMax)
              .companyAmount(companyAmount)
              .companyAmountType(companyAmountType)
              .companyPercentBasedOn(companyPercentBasedOn)
              .companyCapAmount(companyCapAmount)
              .companyCapAmountType(companyCapAmountType)
              .companyAnnualMax(companyAnnualMax)
              .benefitPlanCoverageId(benefitPlanCoverageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#addEmployeeBenefit");
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
| **benefitsAddEmployeeBenefitRequest** | [**BenefitsAddEmployeeBenefitRequest**](BenefitsAddEmployeeBenefitRequest.md)| Employee Benefit | |

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
| **200** | Employee benefit created |  -  |

<a name="addNewCompanyBenefit"></a>
# **addNewCompanyBenefit**
> CompanyBenefitResponse addNewCompanyBenefit(companyDomain, benefitsAddNewCompanyBenefitRequest).description(description).companyBenefitName(companyBenefitName).benefitVendorId(benefitVendorId).benefitType(benefitType).deductionTypeId(deductionTypeId).startDate(startDate).endDate(endDate).planUrl(planUrl).ssoLoginUrl(ssoLoginUrl).ssoLoginUrlLinkText(ssoLoginUrlLinkText).safeHarbor(safeHarbor).meetAcaMin(meetAcaMin).reimbursementAmount(reimbursementAmount).reimbursementFrequency(reimbursementFrequency).reimbursementCurrencyCode(reimbursementCurrencyCode).minEssentialCoverage(minEssentialCoverage).execute();

Add a new company benefit

Add a new company benefit

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    String description = "description_example"; // Description
    String companyBenefitName = "companyBenefitName_example"; // Name
    String benefitVendorId = "benefitVendorId_example"; // Benefit vendor ID
    String benefitType = "health"; // Benefit type
    String deductionTypeId = "deductionTypeId_example"; // Deduction type ID
    LocalDate startDate = LocalDate.now(); // Benefit start date
    LocalDate endDate = LocalDate.now(); // Benefit end date
    String planUrl = "planUrl_example"; // Plan url
    String ssoLoginUrl = "ssoLoginUrl_example"; // SSO login url
    String ssoLoginUrlLinkText = "ssoLoginUrlLinkText_example"; // SSO login link text
    Boolean safeHarbor = true; // Is a safe harbor
    Boolean meetAcaMin = true; // Meets ACA minimum requirements
    Double reimbursementAmount = 3.4D; // Reimbursement amount
    String reimbursementFrequency = "pay period"; // Reimbursement frequency
    String reimbursementCurrencyCode = "reimbursementCurrencyCode_example"; // Reimbursement currency code
    Boolean minEssentialCoverage = true; // Provides minimum essential coverage
    try {
      CompanyBenefitResponse result = client
              .benefits
              .addNewCompanyBenefit(companyDomain)
              .description(description)
              .companyBenefitName(companyBenefitName)
              .benefitVendorId(benefitVendorId)
              .benefitType(benefitType)
              .deductionTypeId(deductionTypeId)
              .startDate(startDate)
              .endDate(endDate)
              .planUrl(planUrl)
              .ssoLoginUrl(ssoLoginUrl)
              .ssoLoginUrlLinkText(ssoLoginUrlLinkText)
              .safeHarbor(safeHarbor)
              .meetAcaMin(meetAcaMin)
              .reimbursementAmount(reimbursementAmount)
              .reimbursementFrequency(reimbursementFrequency)
              .reimbursementCurrencyCode(reimbursementCurrencyCode)
              .minEssentialCoverage(minEssentialCoverage)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getBenefitVendorId());
      System.out.println(result.getBenefitType());
      System.out.println(result.getDeductionTypeId());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getPlanUrl());
      System.out.println(result.getSsoLoginUrl());
      System.out.println(result.getSsoLoginUrlLinkText());
      System.out.println(result.getSafeHarbor());
      System.out.println(result.getMeetAcaMin());
      System.out.println(result.getReimbursementAmount());
      System.out.println(result.getReimbursementFrequency());
      System.out.println(result.getMinEssentialCoverage());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#addNewCompanyBenefit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyBenefitResponse> response = client
              .benefits
              .addNewCompanyBenefit(companyDomain)
              .description(description)
              .companyBenefitName(companyBenefitName)
              .benefitVendorId(benefitVendorId)
              .benefitType(benefitType)
              .deductionTypeId(deductionTypeId)
              .startDate(startDate)
              .endDate(endDate)
              .planUrl(planUrl)
              .ssoLoginUrl(ssoLoginUrl)
              .ssoLoginUrlLinkText(ssoLoginUrlLinkText)
              .safeHarbor(safeHarbor)
              .meetAcaMin(meetAcaMin)
              .reimbursementAmount(reimbursementAmount)
              .reimbursementFrequency(reimbursementFrequency)
              .reimbursementCurrencyCode(reimbursementCurrencyCode)
              .minEssentialCoverage(minEssentialCoverage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#addNewCompanyBenefit");
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
| **benefitsAddNewCompanyBenefitRequest** | [**BenefitsAddNewCompanyBenefitRequest**](BenefitsAddNewCompanyBenefitRequest.md)|  | |
| **description** | **String**| Description | [optional] |
| **companyBenefitName** | **String**| Name | [optional] |
| **benefitVendorId** | **String**| Benefit vendor ID | [optional] |
| **benefitType** | **String**| Benefit type | [optional] [enum: health, dental, vision, retirement, hsa, flex, life, disability, reimbursement, supplemental, other] |
| **deductionTypeId** | **String**| Deduction type ID | [optional] |
| **startDate** | **LocalDate**| Benefit start date | [optional] |
| **endDate** | **LocalDate**| Benefit end date | [optional] |
| **planUrl** | **String**| Plan url | [optional] |
| **ssoLoginUrl** | **String**| SSO login url | [optional] |
| **ssoLoginUrlLinkText** | **String**| SSO login link text | [optional] |
| **safeHarbor** | **Boolean**| Is a safe harbor | [optional] |
| **meetAcaMin** | **Boolean**| Meets ACA minimum requirements | [optional] |
| **reimbursementAmount** | **Double**| Reimbursement amount | [optional] |
| **reimbursementFrequency** | **String**| Reimbursement frequency | [optional] [enum: pay period, month, quarter, year, one time, ] |
| **reimbursementCurrencyCode** | **String**| Reimbursement currency code | [optional] |
| **minEssentialCoverage** | **Boolean**| Provides minimum essential coverage | [optional] |

### Return type

[**CompanyBenefitResponse**](CompanyBenefitResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly created company benefit. |  -  |

<a name="createEmployeeDependent"></a>
# **createEmployeeDependent**
> createEmployeeDependent(companyDomain, employeeDependent).execute();

Add an employee dependent

Adds an employee dependent

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    String firstName = "firstName_example"; // 
    String middleName = "middleName_example"; // 
    String lastName = "lastName_example"; // 
    String relationship = "relationship_example"; // 
    String gender = "gender_example"; // 
    String ssn = "ssn_example"; // 
    String dateOfBirth = "dateOfBirth_example"; // 
    String addressLine1 = "addressLine1_example"; // 
    String addressLine2 = "addressLine2_example"; // 
    String city = "city_example"; // 
    String state = "state_example"; // 
    String zipCode = "zipCode_example"; // 
    String homePhone = "homePhone_example"; // 
    String country = "country_example"; // 
    String isUsCitizen = "isUsCitizen_example"; // 
    String isStudent = "isStudent_example"; // 
    try {
      client
              .benefits
              .createEmployeeDependent(companyDomain)
              .employeeId(employeeId)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .relationship(relationship)
              .gender(gender)
              .ssn(ssn)
              .dateOfBirth(dateOfBirth)
              .addressLine1(addressLine1)
              .addressLine2(addressLine2)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .homePhone(homePhone)
              .country(country)
              .isUsCitizen(isUsCitizen)
              .isStudent(isStudent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#createEmployeeDependent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .createEmployeeDependent(companyDomain)
              .employeeId(employeeId)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .relationship(relationship)
              .gender(gender)
              .ssn(ssn)
              .dateOfBirth(dateOfBirth)
              .addressLine1(addressLine1)
              .addressLine2(addressLine2)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .homePhone(homePhone)
              .country(country)
              .isUsCitizen(isUsCitizen)
              .isStudent(isStudent)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#createEmployeeDependent");
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
| **employeeDependent** | [**EmployeeDependent**](EmployeeDependent.md)|  | |

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
| **200** | Dependent added |  -  |
| **400** | if the posted JSON is invalid |  -  |
| **403** | if the current user doesn&#39;t have access to add the dependent. |  -  |
| **500** | Server error. |  -  |

<a name="deleteCompanyBenefit"></a>
# **deleteCompanyBenefit**
> deleteCompanyBenefit(companyDomain, id).execute();

Delete a company benefit

Delete a company benefit

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    String id = "id_example"; // {id} is the company benefit ID.
    try {
      client
              .benefits
              .deleteCompanyBenefit(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#deleteCompanyBenefit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .deleteCompanyBenefit(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#deleteCompanyBenefit");
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
| **id** | **String**| {id} is the company benefit ID. | |

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
| **204** | Successfully deleted company benefit. |  -  |

<a name="getBenefitGroupEmployees"></a>
# **getBenefitGroupEmployees**
> getBenefitGroupEmployees(companyDomain).execute();

Get benefit group employees

Get benefit group employees

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
              .benefits
              .getBenefitGroupEmployees(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getBenefitGroupEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getBenefitGroupEmployees(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getBenefitGroupEmployees");
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

<a name="getBenefitGroups"></a>
# **getBenefitGroups**
> getBenefitGroups(companyDomain).execute();

Get benefit groups

Get benefit groups

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
              .benefits
              .getBenefitGroups(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getBenefitGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getBenefitGroups(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getBenefitGroups");
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

<a name="getBenefitPlanDeductionsByEmployee"></a>
# **getBenefitPlanDeductionsByEmployee**
> getBenefitPlanDeductionsByEmployee(companyDomain, id).execute();

Get benefit plan deductions by employee

Get benefit plan deductions by employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
              .benefits
              .getBenefitPlanDeductionsByEmployee(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getBenefitPlanDeductionsByEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getBenefitPlanDeductionsByEmployee(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getBenefitPlanDeductionsByEmployee");
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
| **200** |  |  -  |

<a name="getBenefitPlans"></a>
# **getBenefitPlans**
> getBenefitPlans(companyDomain).execute();

Get benefit plans

Get benefit plans

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
              .benefits
              .getBenefitPlans(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getBenefitPlans");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getBenefitPlans(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getBenefitPlans");
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

<a name="getCompanyBenefit"></a>
# **getCompanyBenefit**
> CompanyBenefitResponse getCompanyBenefit(companyDomain, id).execute();

Get a company benefit

Get a company benefit

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    String id = "id_example"; // {id} is the company benefit ID.
    try {
      CompanyBenefitResponse result = client
              .benefits
              .getCompanyBenefit(companyDomain, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getBenefitVendorId());
      System.out.println(result.getBenefitType());
      System.out.println(result.getDeductionTypeId());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getPlanUrl());
      System.out.println(result.getSsoLoginUrl());
      System.out.println(result.getSsoLoginUrlLinkText());
      System.out.println(result.getSafeHarbor());
      System.out.println(result.getMeetAcaMin());
      System.out.println(result.getReimbursementAmount());
      System.out.println(result.getReimbursementFrequency());
      System.out.println(result.getMinEssentialCoverage());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getCompanyBenefit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyBenefitResponse> response = client
              .benefits
              .getCompanyBenefit(companyDomain, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getCompanyBenefit");
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
| **id** | **String**| {id} is the company benefit ID. | |

### Return type

[**CompanyBenefitResponse**](CompanyBenefitResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested company benefit. |  -  |

<a name="getCoverages"></a>
# **getCoverages**
> getCoverages(companyDomain).execute();

Get benefit coverages

Get benefit coverages

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
              .benefits
              .getCoverages(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getCoverages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getCoverages(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getCoverages");
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

<a name="getDeductionTypesAll"></a>
# **getDeductionTypesAll**
> getDeductionTypesAll(companyDomain).execute();

Get benefit deduction types

Get benefit deduction types

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
              .benefits
              .getDeductionTypesAll(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getDeductionTypesAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getDeductionTypesAll(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getDeductionTypesAll");
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

<a name="getDeductionsByPlan"></a>
# **getDeductionsByPlan**
> getDeductionsByPlan(companyDomain, id).execute();

Get employee deductions by benefit plan

Get employee deductions by benefit plan

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    String id = "id_example"; // {id} is the benefit plan ID.
    try {
      client
              .benefits
              .getDeductionsByPlan(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getDeductionsByPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getDeductionsByPlan(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getDeductionsByPlan");
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
| **id** | **String**| {id} is the benefit plan ID. | |

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

<a name="getEmployeeBenefitDeductions"></a>
# **getEmployeeBenefitDeductions**
> getEmployeeBenefitDeductions(companyDomain, id).execute();

Get benefit deductions for employee

Get benefit deductions for employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
              .benefits
              .getEmployeeBenefitDeductions(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getEmployeeBenefitDeductions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getEmployeeBenefitDeductions(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getEmployeeBenefitDeductions");
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
| **200** |  |  -  |

<a name="getEmployeeDependent"></a>
# **getEmployeeDependent**
> getEmployeeDependent(companyDomain, id).execute();

Get employee dependent

Get employee dependent

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    String id = "id_example"; // {id} is the employee dependent ID.
    try {
      client
              .benefits
              .getEmployeeDependent(companyDomain, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getEmployeeDependent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getEmployeeDependent(companyDomain, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getEmployeeDependent");
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
| **id** | **String**| {id} is the employee dependent ID. | |

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

<a name="getGroupPlanCosts"></a>
# **getGroupPlanCosts**
> getGroupPlanCosts(companyDomain).execute();

Get benefit group plan costs

Get benefit group plan costs

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
              .benefits
              .getGroupPlanCosts(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getGroupPlanCosts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getGroupPlanCosts(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getGroupPlanCosts");
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

<a name="getGroupPlans"></a>
# **getGroupPlans**
> getGroupPlans(companyDomain).execute();

Get benefit group plans

Get benefit group plans

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
              .benefits
              .getGroupPlans(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getGroupPlans");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .getGroupPlans(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#getGroupPlans");
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

<a name="listBenefitPlanCoverages"></a>
# **listBenefitPlanCoverages**
> listBenefitPlanCoverages(companyDomain).execute();

Get benefit plan coverages

Get benefit plan coverages

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
              .benefits
              .listBenefitPlanCoverages(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#listBenefitPlanCoverages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .listBenefitPlanCoverages(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#listBenefitPlanCoverages");
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

<a name="listCompanyBenefitTypes"></a>
# **listCompanyBenefitTypes**
> List&lt;CompanyBenefitType&gt; listCompanyBenefitTypes(companyDomain).execute();

Get a list of company benefit types

Get a list of company benefit types

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
      List<CompanyBenefitType> result = client
              .benefits
              .listCompanyBenefitTypes(companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#listCompanyBenefitTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CompanyBenefitType>> response = client
              .benefits
              .listCompanyBenefitTypes(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#listCompanyBenefitTypes");
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

[**List&lt;CompanyBenefitType&gt;**](CompanyBenefitType.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of company benefit types. |  -  |

<a name="listCompanyBenefits"></a>
# **listCompanyBenefits**
> List&lt;CompanyBenefitResponse&gt; listCompanyBenefits(companyDomain).execute();

Get a list of company benefits

Get a list of company benefits

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
      List<CompanyBenefitResponse> result = client
              .benefits
              .listCompanyBenefits(companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#listCompanyBenefits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CompanyBenefitResponse>> response = client
              .benefits
              .listCompanyBenefits(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#listCompanyBenefits");
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

[**List&lt;CompanyBenefitResponse&gt;**](CompanyBenefitResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of company benefits. |  -  |

<a name="listEmployeeBenefits"></a>
# **listEmployeeBenefits**
> List&lt;EmployeeBenefit&gt; listEmployeeBenefits(companyDomain).employeeBenefitFilters(employeeBenefitFilters).execute();

Get a list of employee benefits

Get a list of employee benefits

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    EmployeeBenefitFiltersFilters filters = new EmployeeBenefitFiltersFilters();
    try {
      List<EmployeeBenefit> result = client
              .benefits
              .listEmployeeBenefits(companyDomain)
              .filters(filters)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#listEmployeeBenefits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeBenefit>> response = client
              .benefits
              .listEmployeeBenefits(companyDomain)
              .filters(filters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#listEmployeeBenefits");
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
| **employeeBenefitFilters** | [**EmployeeBenefitFilters**](EmployeeBenefitFilters.md)| Employee Benefit Filters | [optional] |

### Return type

[**List&lt;EmployeeBenefit&gt;**](EmployeeBenefit.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of employee benefits. |  -  |

<a name="listEmployeeDependents"></a>
# **listEmployeeDependents**
> listEmployeeDependents(companyDomain, employeeid).execute();

Get all employee dependents

Get all employee dependents

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    String employeeid = "employeeid_example"; // {employeeid} is the employee ID. Supplying this ID limits the response to the specific employee.
    try {
      client
              .benefits
              .listEmployeeDependents(companyDomain, employeeid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#listEmployeeDependents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .listEmployeeDependents(companyDomain, employeeid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#listEmployeeDependents");
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
| **employeeid** | **String**| {employeeid} is the employee ID. Supplying this ID limits the response to the specific employee. | |

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

<a name="updateCompanyBenefit"></a>
# **updateCompanyBenefit**
> CompanyBenefitResponse updateCompanyBenefit(companyDomain, id, benefitsUpdateCompanyBenefitRequest).execute();

Update a company benefit

Update a company benefit

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    String id = "id_example"; // {id} is the company benefit ID.
    String description = "description_example"; // Description
    String companyBenefitName = "companyBenefitName_example"; // Name
    String benefitVendorId = "benefitVendorId_example"; // Benefit vendor ID
    String benefitType = "health"; // Benefit type
    String deductionTypeId = "deductionTypeId_example"; // Deduction type ID
    LocalDate startDate = LocalDate.now(); // Benefit start date
    LocalDate endDate = LocalDate.now(); // Benefit end date
    String planUrl = "planUrl_example"; // Plan url
    String ssoLoginUrl = "ssoLoginUrl_example"; // SSO login url
    String ssoLoginUrlLinkText = "ssoLoginUrlLinkText_example"; // SSO login link text
    Boolean safeHarbor = true; // Is a safe harbor
    Boolean meetAcaMin = true; // Meets ACA minimum requirements
    Double reimbursementAmount = 3.4D; // Reimbursement amount
    String reimbursementFrequency = "pay period"; // Reimbursement frequency
    String reimbursementCurrencyCode = "reimbursementCurrencyCode_example"; // Reimbursement currency code
    Boolean minEssentialCoverage = true; // Provides minimum essential coverage
    try {
      CompanyBenefitResponse result = client
              .benefits
              .updateCompanyBenefit(companyDomain, id)
              .description(description)
              .companyBenefitName(companyBenefitName)
              .benefitVendorId(benefitVendorId)
              .benefitType(benefitType)
              .deductionTypeId(deductionTypeId)
              .startDate(startDate)
              .endDate(endDate)
              .planUrl(planUrl)
              .ssoLoginUrl(ssoLoginUrl)
              .ssoLoginUrlLinkText(ssoLoginUrlLinkText)
              .safeHarbor(safeHarbor)
              .meetAcaMin(meetAcaMin)
              .reimbursementAmount(reimbursementAmount)
              .reimbursementFrequency(reimbursementFrequency)
              .reimbursementCurrencyCode(reimbursementCurrencyCode)
              .minEssentialCoverage(minEssentialCoverage)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getBenefitVendorId());
      System.out.println(result.getBenefitType());
      System.out.println(result.getDeductionTypeId());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getPlanUrl());
      System.out.println(result.getSsoLoginUrl());
      System.out.println(result.getSsoLoginUrlLinkText());
      System.out.println(result.getSafeHarbor());
      System.out.println(result.getMeetAcaMin());
      System.out.println(result.getReimbursementAmount());
      System.out.println(result.getReimbursementFrequency());
      System.out.println(result.getMinEssentialCoverage());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#updateCompanyBenefit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyBenefitResponse> response = client
              .benefits
              .updateCompanyBenefit(companyDomain, id)
              .description(description)
              .companyBenefitName(companyBenefitName)
              .benefitVendorId(benefitVendorId)
              .benefitType(benefitType)
              .deductionTypeId(deductionTypeId)
              .startDate(startDate)
              .endDate(endDate)
              .planUrl(planUrl)
              .ssoLoginUrl(ssoLoginUrl)
              .ssoLoginUrlLinkText(ssoLoginUrlLinkText)
              .safeHarbor(safeHarbor)
              .meetAcaMin(meetAcaMin)
              .reimbursementAmount(reimbursementAmount)
              .reimbursementFrequency(reimbursementFrequency)
              .reimbursementCurrencyCode(reimbursementCurrencyCode)
              .minEssentialCoverage(minEssentialCoverage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#updateCompanyBenefit");
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
| **id** | **String**| {id} is the company benefit ID. | |
| **benefitsUpdateCompanyBenefitRequest** | [**BenefitsUpdateCompanyBenefitRequest**](BenefitsUpdateCompanyBenefitRequest.md)|  | |

### Return type

[**CompanyBenefitResponse**](CompanyBenefitResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated company benefit. |  -  |

<a name="updateDependentInformation"></a>
# **updateDependentInformation**
> updateDependentInformation(companyDomain, id, employeeDependent).execute();

Update an employee dependent

This API allows you to change the information for a given dependent ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsApi;
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
    String id = "id_example"; // {id} is the employee dependent ID.
    String employeeId = "employeeId_example"; // 
    String firstName = "firstName_example"; // 
    String middleName = "middleName_example"; // 
    String lastName = "lastName_example"; // 
    String relationship = "relationship_example"; // 
    String gender = "gender_example"; // 
    String ssn = "ssn_example"; // 
    String dateOfBirth = "dateOfBirth_example"; // 
    String addressLine1 = "addressLine1_example"; // 
    String addressLine2 = "addressLine2_example"; // 
    String city = "city_example"; // 
    String state = "state_example"; // 
    String zipCode = "zipCode_example"; // 
    String homePhone = "homePhone_example"; // 
    String country = "country_example"; // 
    String isUsCitizen = "isUsCitizen_example"; // 
    String isStudent = "isStudent_example"; // 
    try {
      client
              .benefits
              .updateDependentInformation(companyDomain, id)
              .employeeId(employeeId)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .relationship(relationship)
              .gender(gender)
              .ssn(ssn)
              .dateOfBirth(dateOfBirth)
              .addressLine1(addressLine1)
              .addressLine2(addressLine2)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .homePhone(homePhone)
              .country(country)
              .isUsCitizen(isUsCitizen)
              .isStudent(isStudent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#updateDependentInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .benefits
              .updateDependentInformation(companyDomain, id)
              .employeeId(employeeId)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .relationship(relationship)
              .gender(gender)
              .ssn(ssn)
              .dateOfBirth(dateOfBirth)
              .addressLine1(addressLine1)
              .addressLine2(addressLine2)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .homePhone(homePhone)
              .country(country)
              .isUsCitizen(isUsCitizen)
              .isStudent(isStudent)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsApi#updateDependentInformation");
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
| **id** | **String**| {id} is the employee dependent ID. | |
| **employeeDependent** | [**EmployeeDependent**](EmployeeDependent.md)|  | |

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
| **201** | Dependent updated |  -  |
| **400** | if the posted JSON is invalid |  -  |
| **403** | if the current user doesn&#39;t have access to change the dependent in this way. |  -  |
| **500** | Server error. |  -  |


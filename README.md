<div align="left">

[![Visit Bamboohr](./header.png)](https://bamboohr.com)

# [Bamboohr](https://bamboohr.com)

This is the majority of the API requests including some that are not documented.

http://www.bamboohr.com/api/documentation/

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=BambooHR&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>bamboo-hr-java-sdk</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:bamboo-hr-java-sdk:v1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/bamboo-hr-java-sdk-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountInformationApi;
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
              .accountInformation
              .discoverTableFields(companyDomain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountInformationApi#discoverTableFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accountInformation
              .discoverTableFields(companyDomain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountInformationApi#discoverTableFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountInformationApi* | [**discoverTableFields**](docs/AccountInformationApi.md#discoverTableFields) | **GET** /{companyDomain}/v1/meta/tables | Get a list of tabular fields
*AccountInformationApi* | [**getFieldList**](docs/AccountInformationApi.md#getFieldList) | **GET** /{companyDomain}/v1/meta/fields | Get a list of fields
*AccountInformationApi* | [**getListFields**](docs/AccountInformationApi.md#getListFields) | **GET** /{companyDomain}/v1/meta/lists | Get details for list fields
*AccountInformationApi* | [**getUserList**](docs/AccountInformationApi.md#getUserList) | **GET** /{companyDomain}/v1/meta/users | Get a List of Users
*AccountInformationApi* | [**updateListFieldValues**](docs/AccountInformationApi.md#updateListFieldValues) | **PUT** /{companyDomain}/v1/meta/lists/{listFieldId} | Add or Update Values for List Fields
*ApplicantTrackingApi* | [**addApplicationComment**](docs/ApplicantTrackingApi.md#addApplicationComment) | **POST** /{companyDomain}/v1/applicant_tracking/applications/{applicationId}/comments | Add Application Comment
*ApplicantTrackingApi* | [**changeApplicantStatus**](docs/ApplicantTrackingApi.md#changeApplicantStatus) | **POST** /{companyDomain}/v1/applicant_tracking/applications/{applicationId}/status | Change Applicant&#39;s Status
*ApplicantTrackingApi* | [**createNewApplication**](docs/ApplicantTrackingApi.md#createNewApplication) | **POST** /{companyDomain}/v1/applicant_tracking/application | Add New Candidate
*ApplicantTrackingApi* | [**createNewJobOpening**](docs/ApplicantTrackingApi.md#createNewJobOpening) | **POST** /{companyDomain}/v1/applicant_tracking/job_opening | Add New Job Opening
*ApplicantTrackingApi* | [**getApplicationDetails**](docs/ApplicantTrackingApi.md#getApplicationDetails) | **GET** /{companyDomain}/v1/applicant_tracking/applications/{applicationId} | Get Application Details
*ApplicantTrackingApi* | [**getCompanyLocations**](docs/ApplicantTrackingApi.md#getCompanyLocations) | **GET** /{companyDomain}/v1/applicant_tracking/locations | Get Company Locations
*ApplicantTrackingApi* | [**getHiringLeads**](docs/ApplicantTrackingApi.md#getHiringLeads) | **GET** /{companyDomain}/v1/applicant_tracking/hiring_leads | Get Hiring Leads
*ApplicantTrackingApi* | [**getJobSummaries**](docs/ApplicantTrackingApi.md#getJobSummaries) | **GET** /{companyDomain}/v1/applicant_tracking/jobs | Get Job Summaries
*ApplicantTrackingApi* | [**listApplications**](docs/ApplicantTrackingApi.md#listApplications) | **GET** /{companyDomain}/v1/applicant_tracking/applications | Get Applications
*ApplicantTrackingApi* | [**listStatuses**](docs/ApplicantTrackingApi.md#listStatuses) | **GET** /{companyDomain}/v1/applicant_tracking/statuses | Get Statuses
*BenefitsApi* | [**addBenefitGroupEmployee**](docs/BenefitsApi.md#addBenefitGroupEmployee) | **POST** /{companyDomain}/v1/benefitgroupemployees | Add a benefit group employee
*BenefitsApi* | [**addEmployeeBenefit**](docs/BenefitsApi.md#addEmployeeBenefit) | **POST** /{companyDomain}/v1/benefit/employee_benefit | Add an employee benefit
*BenefitsApi* | [**addNewCompanyBenefit**](docs/BenefitsApi.md#addNewCompanyBenefit) | **POST** /{companyDomain}/v1/benefit/company_benefit | Add a new company benefit
*BenefitsApi* | [**createEmployeeDependent**](docs/BenefitsApi.md#createEmployeeDependent) | **POST** /{companyDomain}/v1/employeedependents | Add an employee dependent
*BenefitsApi* | [**deleteCompanyBenefit**](docs/BenefitsApi.md#deleteCompanyBenefit) | **DELETE** /{companyDomain}/v1/benefit/company_benefit/{id} | Delete a company benefit
*BenefitsApi* | [**getBenefitGroupEmployees**](docs/BenefitsApi.md#getBenefitGroupEmployees) | **GET** /{companyDomain}/v1/benefitgroupemployees | Get benefit group employees
*BenefitsApi* | [**getBenefitGroups**](docs/BenefitsApi.md#getBenefitGroups) | **GET** /{companyDomain}/v1/benefitgroups | Get benefit groups
*BenefitsApi* | [**getBenefitPlanDeductionsByEmployee**](docs/BenefitsApi.md#getBenefitPlanDeductionsByEmployee) | **GET** /{companyDomain}/v1/employee/plans/{id} | Get benefit plan deductions by employee
*BenefitsApi* | [**getBenefitPlans**](docs/BenefitsApi.md#getBenefitPlans) | **GET** /{companyDomain}/v1/benefitplans | Get benefit plans
*BenefitsApi* | [**getCompanyBenefit**](docs/BenefitsApi.md#getCompanyBenefit) | **GET** /{companyDomain}/v1/benefit/company_benefit/{id} | Get a company benefit
*BenefitsApi* | [**getCoverages**](docs/BenefitsApi.md#getCoverages) | **GET** /{companyDomain}/v1/benefitcoverages | Get benefit coverages
*BenefitsApi* | [**getDeductionTypesAll**](docs/BenefitsApi.md#getDeductionTypesAll) | **GET** /{companyDomain}/v1/benefits/settings/deduction_types/all | Get benefit deduction types
*BenefitsApi* | [**getDeductionsByPlan**](docs/BenefitsApi.md#getDeductionsByPlan) | **GET** /{companyDomain}/v1/employee/deductions/{id} | Get employee deductions by benefit plan
*BenefitsApi* | [**getEmployeeBenefitDeductions**](docs/BenefitsApi.md#getEmployeeBenefitDeductions) | **GET** /{companyDomain}/v1/payroll/deductions/{id} | Get benefit deductions for employee
*BenefitsApi* | [**getEmployeeDependent**](docs/BenefitsApi.md#getEmployeeDependent) | **GET** /{companyDomain}/v1/employeedependents/{id} | Get employee dependent
*BenefitsApi* | [**getGroupPlanCosts**](docs/BenefitsApi.md#getGroupPlanCosts) | **GET** /{companyDomain}/v1/benefitgroupplancosts | Get benefit group plan costs
*BenefitsApi* | [**getGroupPlans**](docs/BenefitsApi.md#getGroupPlans) | **GET** /{companyDomain}/v1/benefitgroupplans | Get benefit group plans
*BenefitsApi* | [**listBenefitPlanCoverages**](docs/BenefitsApi.md#listBenefitPlanCoverages) | **GET** /{companyDomain}/v1/benefitplancoverages | Get benefit plan coverages
*BenefitsApi* | [**listCompanyBenefitTypes**](docs/BenefitsApi.md#listCompanyBenefitTypes) | **GET** /{companyDomain}/v1/benefit/company_benefit/type | Get a list of company benefit types
*BenefitsApi* | [**listCompanyBenefits**](docs/BenefitsApi.md#listCompanyBenefits) | **GET** /{companyDomain}/v1/benefit/company_benefit | Get a list of company benefits
*BenefitsApi* | [**listEmployeeBenefits**](docs/BenefitsApi.md#listEmployeeBenefits) | **GET** /{companyDomain}/v1/benefit/employee_benefit | Get a list of employee benefits
*BenefitsApi* | [**listEmployeeDependents**](docs/BenefitsApi.md#listEmployeeDependents) | **GET** /{companyDomain}/v1/employeedependents | Get all employee dependents
*BenefitsApi* | [**updateCompanyBenefit**](docs/BenefitsApi.md#updateCompanyBenefit) | **PUT** /{companyDomain}/v1/benefit/company_benefit/{id} | Update a company benefit
*BenefitsApi* | [**updateDependentInformation**](docs/BenefitsApi.md#updateDependentInformation) | **PUT** /{companyDomain}/v1/employeedependents/{id} | Update an employee dependent
*CompanyFilesApi* | [**createCategory**](docs/CompanyFilesApi.md#createCategory) | **POST** /{companyDomain}/v1/files/categories | Add Company File Category
*CompanyFilesApi* | [**getFile**](docs/CompanyFilesApi.md#getFile) | **GET** /{companyDomain}/v1/files/{fileId} | Get an Company File
*CompanyFilesApi* | [**listFilesAndCategories**](docs/CompanyFilesApi.md#listFilesAndCategories) | **GET** /{companyDomain}/v1/files/view | List company files and categories
*CompanyFilesApi* | [**removeFile**](docs/CompanyFilesApi.md#removeFile) | **DELETE** /{companyDomain}/v1/files/{fileId} | Delete Company File
*CompanyFilesApi* | [**updateFile**](docs/CompanyFilesApi.md#updateFile) | **POST** /{companyDomain}/v1/files/{fileId} | Update Company File
*CompanyFilesApi* | [**uploadFile**](docs/CompanyFilesApi.md#uploadFile) | **POST** /{companyDomain}/v1/files | Upload Company File
*EmployeeFilesApi* | [**addCategory**](docs/EmployeeFilesApi.md#addCategory) | **POST** /{companyDomain}/v1/employees/files/categories | Add Employee File Category
*EmployeeFilesApi* | [**getEmployeeFile**](docs/EmployeeFilesApi.md#getEmployeeFile) | **GET** /{companyDomain}/v1/employees/{id}/files/{fileId} | Get an Employee File
*EmployeeFilesApi* | [**listFilesAndCategories**](docs/EmployeeFilesApi.md#listFilesAndCategories) | **GET** /{companyDomain}/v1/employees/{id}/files/view | List employee files and categories
*EmployeeFilesApi* | [**removeFile**](docs/EmployeeFilesApi.md#removeFile) | **DELETE** /{companyDomain}/v1/employees/{id}/files/{fileId} | Delete Employee File
*EmployeeFilesApi* | [**updateEmployeeFile**](docs/EmployeeFilesApi.md#updateEmployeeFile) | **POST** /{companyDomain}/v1/employees/{id}/files/{fileId} | Update Employee File
*EmployeeFilesApi* | [**uploadFile**](docs/EmployeeFilesApi.md#uploadFile) | **POST** /{companyDomain}/v1/employees/{id}/files | Upload Employee File
*EmployeesApi* | [**createNewEmployee**](docs/EmployeesApi.md#createNewEmployee) | **POST** /{companyDomain}/v1/employees | Add Employee
*EmployeesApi* | [**getDirectory**](docs/EmployeesApi.md#getDirectory) | **GET** /{companyDomain}/v1/employees/directory | Get Employee Directory
*EmployeesApi* | [**getEmployeeData**](docs/EmployeesApi.md#getEmployeeData) | **GET** /{companyDomain}/v1/employees/{id} | Get Employee
*EmployeesApi* | [**updateEmployee**](docs/EmployeesApi.md#updateEmployee) | **POST** /{companyDomain}/v1/employees/{id} | Update Employee
*GoalsApi* | [**closeGoal**](docs/GoalsApi.md#closeGoal) | **POST** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/close | Close Goal
*GoalsApi* | [**countPerStatus**](docs/GoalsApi.md#countPerStatus) | **GET** /{companyDomain}/v1_1/performance/employees/{employeeId}/goals/filters | Get Goal Status Counts, Version 1.1
*GoalsApi* | [**createComment**](docs/GoalsApi.md#createComment) | **POST** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/comments | Create Goal Comment
*GoalsApi* | [**createEmployeeGoal**](docs/GoalsApi.md#createEmployeeGoal) | **POST** /{companyDomain}/v1/performance/employees/{employeeId}/goals | Create Goal
*GoalsApi* | [**deleteById**](docs/GoalsApi.md#deleteById) | **DELETE** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId} | Delete Goal
*GoalsApi* | [**deleteComment**](docs/GoalsApi.md#deleteComment) | **DELETE** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/comments/{commentId} | Delete Goal Comment
*GoalsApi* | [**determinePermission**](docs/GoalsApi.md#determinePermission) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/canCreateGoals | Can Create a Goal
*GoalsApi* | [**getAlignableOptions**](docs/GoalsApi.md#getAlignableOptions) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/alignmentOptions | Alignable Goal Options
*GoalsApi* | [**getAllAggregateInfo**](docs/GoalsApi.md#getAllAggregateInfo) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/aggregate | Get All Aggregate Goal Info
*GoalsApi* | [**getAllAggregateInfo_0**](docs/GoalsApi.md#getAllAggregateInfo_0) | **GET** /{companyDomain}/v1_1/performance/employees/{employeeId}/goals/aggregate | Get All Aggregate Goal Info, Version 1.1
*GoalsApi* | [**getAllAggregateInfo_1**](docs/GoalsApi.md#getAllAggregateInfo_1) | **GET** /{companyDomain}/v1_2/performance/employees/{employeeId}/goals/aggregate | Get All Aggregate Goal Info, Version 1.2
*GoalsApi* | [**getComments**](docs/GoalsApi.md#getComments) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/comments | Get Goal Comments
*GoalsApi* | [**getEmployeeGoals**](docs/GoalsApi.md#getEmployeeGoals) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals | Get Goals
*GoalsApi* | [**getGoalAggregateInfo**](docs/GoalsApi.md#getGoalAggregateInfo) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/aggregate | Get Aggregate Goal Info
*GoalsApi* | [**reopenGoal**](docs/GoalsApi.md#reopenGoal) | **POST** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/reopen | Reopen a Goal
*GoalsApi* | [**shareOptionsGet**](docs/GoalsApi.md#shareOptionsGet) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/shareOptions | Available Goal Sharing Options
*GoalsApi* | [**statusCount**](docs/GoalsApi.md#statusCount) | **GET** /{companyDomain}/v1/performance/employees/{employeeId}/goals/filters | Get Goal Status Counts
*GoalsApi* | [**updateComment**](docs/GoalsApi.md#updateComment) | **PUT** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/comments/{commentId} | Update Goal Comment
*GoalsApi* | [**updateEmployeeGoal**](docs/GoalsApi.md#updateEmployeeGoal) | **PUT** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId} | Update Goal
*GoalsApi* | [**updateEmployeeGoalV11**](docs/GoalsApi.md#updateEmployeeGoalV11) | **PUT** /{companyDomain}/v1_1/performance/employees/{employeeId}/goals/{goalId} | Update Goal, V1.1
*GoalsApi* | [**updateGoalSharing**](docs/GoalsApi.md#updateGoalSharing) | **PUT** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/sharedWith | Update Goal Sharing
*GoalsApi* | [**updateProgress**](docs/GoalsApi.md#updateProgress) | **PUT** /{companyDomain}/v1/performance/employees/{employeeId}/goals/{goalId}/progress | Update Goal Progress
*HoursApi* | [**bulkRecordEdit**](docs/HoursApi.md#bulkRecordEdit) | **POST** /{companyDomain}/v1/timetracking/record | Bulk add/edit hour records
*HoursApi* | [**deleteHourRecord**](docs/HoursApi.md#deleteHourRecord) | **DELETE** /{companyDomain}/v1/timetracking/delete/{id} | Delete an hour record
*HoursApi* | [**editHourRecord**](docs/HoursApi.md#editHourRecord) | **PUT** /{companyDomain}/v1/timetracking/adjust | Edit an hour record
*HoursApi* | [**getHourRecord**](docs/HoursApi.md#getHourRecord) | **GET** /{companyDomain}/v1/timetracking/record/{id} | Get an hour record
*HoursApi* | [**recordAddition**](docs/HoursApi.md#recordAddition) | **POST** /{companyDomain}/v1/timetracking/add | Add an hour record
*LastChangeInformationApi* | [**getChangedEmployeeIds**](docs/LastChangeInformationApi.md#getChangedEmployeeIds) | **GET** /{companyDomain}/v1/employees/changed | Gets all updated employee IDs
*LoginApi* | [**userCredentials**](docs/LoginApi.md#userCredentials) | **POST** /{companyDomain}/v1/login | User Login
*PayrollApi* | [**addEmployeeDirectDepositInfo**](docs/PayrollApi.md#addEmployeeDirectDepositInfo) | **POST** /{companyDomain}/v1/employee_direct_deposit_accounts/{id} | Add an employee&#39;s direct deposit information
*PayrollApi* | [**addEmployeePaystub**](docs/PayrollApi.md#addEmployeePaystub) | **POST** /{companyDomain}/v1/employee_pay_stub | Add an employee&#39;s paystub
*PayrollApi* | [**addEmployeeUnpaidPaystubs**](docs/PayrollApi.md#addEmployeeUnpaidPaystubs) | **POST** /{companyDomain}/v1/employee_unpaid_pay_stubs | Add an employee&#39;s unpaid paystubs
*PayrollApi* | [**addEmployeeWithholdings**](docs/PayrollApi.md#addEmployeeWithholdings) | **POST** /{companyDomain}/v1/employee_withholding/{id} | Add an employee&#39;s default withholdings
*PayrollApi* | [**clearEmployeeDirectDeposit**](docs/PayrollApi.md#clearEmployeeDirectDeposit) | **DELETE** /{companyDomain}/v1/employee_direct_deposit_accounts/{id} | Clear an employee&#39;s direct deposit information
*PayrollApi* | [**clearEmployeeUnpaidPaystubs**](docs/PayrollApi.md#clearEmployeeUnpaidPaystubs) | **DELETE** /{companyDomain}/v1/employee_unpaid_pay_stubs/{id} | Clear an employee&#39;s unpaid paystubs
*PayrollApi* | [**clearEmployeeWithholdings**](docs/PayrollApi.md#clearEmployeeWithholdings) | **DELETE** /{companyDomain}/v1/employee_withholding/{id} | Clear an employee&#39;s default withholdings
*PayrollApi* | [**deleteEmployeePaystub**](docs/PayrollApi.md#deleteEmployeePaystub) | **DELETE** /{companyDomain}/v1/employee_pay_stub/{id} | Delete an employee&#39;s paystub
*PayrollApi* | [**employeeDirectDepositInfo**](docs/PayrollApi.md#employeeDirectDepositInfo) | **GET** /{companyDomain}/v1/employee_direct_deposit_accounts/{id} | Get an employee&#39;s direct deposit information
*PayrollApi* | [**getDefaultWithholdings**](docs/PayrollApi.md#getDefaultWithholdings) | **GET** /{companyDomain}/v1/employee_withholding/{id} | Get an employee&#39;s default withholdings
*PayrollApi* | [**getPaystub**](docs/PayrollApi.md#getPaystub) | **GET** /{companyDomain}/v1/employee_pay_stub/{id} | Get an employee&#39;s paystub
*PayrollApi* | [**getUnpaidPaystubs**](docs/PayrollApi.md#getUnpaidPaystubs) | **GET** /{companyDomain}/v1/employee_unpaid_pay_stubs/{id} | Get an employee&#39;s unpaid paystubs
*PhotosApi* | [**getEmployeePhoto**](docs/PhotosApi.md#getEmployeePhoto) | **GET** /{companyDomain}/v1/employees/{employeeId}/photo/{size} | Get an employee photo
*PhotosApi* | [**storeNewEmployeePhoto**](docs/PhotosApi.md#storeNewEmployeePhoto) | **POST** /{companyDomain}/v1/employees/{employeeId}/photo | Store a new employee photo
*ReportsApi* | [**companyReport**](docs/ReportsApi.md#companyReport) | **GET** /{companyDomain}/v1/reports/{id} | Get company report
*ReportsApi* | [**requestCustomReport**](docs/ReportsApi.md#requestCustomReport) | **POST** /{companyDomain}/v1/reports/custom | Request a custom report
*TabularDataApi* | [**addRow**](docs/TabularDataApi.md#addRow) | **POST** /{companyDomain}/v1_1/employees/{id}/tables/{table} | Adds a table row
*TabularDataApi* | [**addTableRow**](docs/TabularDataApi.md#addTableRow) | **POST** /{companyDomain}/v1/employees/{id}/tables/{table} | Adds a table row
*TabularDataApi* | [**deleteRow**](docs/TabularDataApi.md#deleteRow) | **DELETE** /{companyDomain}/v1/employees/{id}/tables/{table}/{rowId} | Deletes a table row
*TabularDataApi* | [**getChangedTableRows**](docs/TabularDataApi.md#getChangedTableRows) | **GET** /{companyDomain}/v1/employees/changed/tables/{table} | Gets all updated employee table data
*TabularDataApi* | [**getEmployeeTableRows**](docs/TabularDataApi.md#getEmployeeTableRows) | **GET** /{companyDomain}/v1/employees/{id}/tables/{table} | Gets table rows for a given employee and table combination
*TabularDataApi* | [**updateRow**](docs/TabularDataApi.md#updateRow) | **POST** /{companyDomain}/v1/employees/{id}/tables/{table}/{rowId} | Updates a table row.
*TabularDataApi* | [**updateRow_0**](docs/TabularDataApi.md#updateRow_0) | **POST** /{companyDomain}/v1_1/employees/{id}/tables/{table}/{rowId} | Updates a table row.
*TimeOffApi* | [**addTimeOffHistoryItem**](docs/TimeOffApi.md#addTimeOffHistoryItem) | **PUT** /{companyDomain}/v1/employees/{employeeId}/time_off/history | Add a Time Off History Item For Time Off Request
*TimeOffApi* | [**assignEmployeePolicies**](docs/TimeOffApi.md#assignEmployeePolicies) | **PUT** /{companyDomain}/v1/employees/{employeeId}/time_off/policies | Assign Time Off Policies for an Employee
*TimeOffApi* | [**assignEmployeePoliciesV11**](docs/TimeOffApi.md#assignEmployeePoliciesV11) | **PUT** /{companyDomain}/v1_1/employees/{employeeId}/time_off/policies | Assign Time Off Policies for an Employee, Version 1.1
*TimeOffApi* | [**balanceAdjustmentPut**](docs/TimeOffApi.md#balanceAdjustmentPut) | **PUT** /{companyDomain}/v1/employees/{employeeId}/time_off/balance_adjustment | Adjust Time Off Balance
*TimeOffApi* | [**changeRequestStatus**](docs/TimeOffApi.md#changeRequestStatus) | **PUT** /{companyDomain}/v1/time_off/requests/{requestId}/status | Change a Request Status
*TimeOffApi* | [**estimateFutureTimeOffBalances**](docs/TimeOffApi.md#estimateFutureTimeOffBalances) | **GET** /{companyDomain}/v1/employees/{employeeId}/time_off/calculator | Estimate Future Time Off Balances
*TimeOffApi* | [**getPolicies**](docs/TimeOffApi.md#getPolicies) | **GET** /{companyDomain}/v1/meta/time_off/policies | Get Time Off Policies
*TimeOffApi* | [**getTimeOffRequests**](docs/TimeOffApi.md#getTimeOffRequests) | **GET** /{companyDomain}/v1/time_off/requests | Get Time Off Requests
*TimeOffApi* | [**getTimeOffTypes**](docs/TimeOffApi.md#getTimeOffTypes) | **GET** /{companyDomain}/v1/meta/time_off/types | Get Time Off Types
*TimeOffApi* | [**getWhosOutList**](docs/TimeOffApi.md#getWhosOutList) | **GET** /{companyDomain}/v1/time_off/whos_out | Get a list of Who&#39;s Out
*TimeOffApi* | [**listEmployeePolicies**](docs/TimeOffApi.md#listEmployeePolicies) | **GET** /{companyDomain}/v1_1/employees/{employeeId}/time_off/policies | List Time Off Policies for Employee, Version 1.1
*TimeOffApi* | [**listEmployeeTimeOffPolicies**](docs/TimeOffApi.md#listEmployeeTimeOffPolicies) | **GET** /{companyDomain}/v1/employees/{employeeId}/time_off/policies | List Time Off Policies for Employee
*TimeOffApi* | [**requestCreation**](docs/TimeOffApi.md#requestCreation) | **PUT** /{companyDomain}/v1/employees/{employeeId}/time_off/request | Add a Time Off Request
*TimeTrackingApi* | [**approveEmployeeTimesheets**](docs/TimeTrackingApi.md#approveEmployeeTimesheets) | **POST** /{companyDomain}/v1/time_tracking/timesheets/approve | Approve employee timesheets
*TimeTrackingApi* | [**approveEmployeeTimesheets_0**](docs/TimeTrackingApi.md#approveEmployeeTimesheets_0) | **POST** /{companyDomain}/v1/time_tracking/timesheets/clock_out_and_approve | Approve timesheets for employees that are currently clocked in
*TimeTrackingApi* | [**clockInEmployee**](docs/TimeTrackingApi.md#clockInEmployee) | **POST** /{companyDomain}/v1/time_tracking/clock_in/{employeeId} | Clock in (employee id optional)
*TimeTrackingApi* | [**clockOutEmployee**](docs/TimeTrackingApi.md#clockOutEmployee) | **POST** /{companyDomain}/v1/time_tracking/clock_out/{employeeId} | Clock out (employee id optional)
*TimeTrackingApi* | [**clockOutEmployeeAtSpecificTime**](docs/TimeTrackingApi.md#clockOutEmployeeAtSpecificTime) | **POST** /{companyDomain}/v1/time_tracking/employee/{employeeId}/clock_out/datetime | Clock out an employee at a specific time
*TimeTrackingApi* | [**deleteClockEntries**](docs/TimeTrackingApi.md#deleteClockEntries) | **DELETE** /{companyDomain}/v1/time_tracking/clock_entries | Delete clock entries
*TimeTrackingApi* | [**editClockedInEntryData**](docs/TimeTrackingApi.md#editClockedInEntryData) | **POST** /{companyDomain}/v1/time_tracking/employee/{employeeId}/clock_in/data | Edit information on the currently clocked in entry
*TimeTrackingApi* | [**employeeClockedIn**](docs/TimeTrackingApi.md#employeeClockedIn) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/is_clocked_in | Is employee clocked in?
*TimeTrackingApi* | [**employeeTimesheetGet**](docs/TimeTrackingApi.md#employeeTimesheetGet) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/timesheet/{timesheetId} | Get a timesheet for an employee
*TimeTrackingApi* | [**getClockEntry**](docs/TimeTrackingApi.md#getClockEntry) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/clock_entries/{id} | Get a clock entry
*TimeTrackingApi* | [**getDailyEntry**](docs/TimeTrackingApi.md#getDailyEntry) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/daily_entries/{id} | Get a daily entry
*TimeTrackingApi* | [**getProjectTasks**](docs/TimeTrackingApi.md#getProjectTasks) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/projects/{projectId}/tasks | Get tasks for a project
*TimeTrackingApi* | [**getTimesheetsByIds**](docs/TimeTrackingApi.md#getTimesheetsByIds) | **GET** /{companyDomain}/v1/time_tracking/timesheets | Get timesheets by ids
*TimeTrackingApi* | [**listEmployeeProjects**](docs/TimeTrackingApi.md#listEmployeeProjects) | **GET** /{companyDomain}/v1/time_tracking/employee/{employeeId}/projects | Get projects an employee can log time to
*TimeTrackingApi* | [**storeClockEntries**](docs/TimeTrackingApi.md#storeClockEntries) | **POST** /{companyDomain}/v1/time_tracking/clock_entries | Store clock entries
*TimeTrackingApi* | [**storeDailyEntries**](docs/TimeTrackingApi.md#storeDailyEntries) | **POST** /{companyDomain}/v1/time_tracking/daily_entries | Store daily entries
*TimeTrackingPrivateBetaApi* | [**addClockOut**](docs/TimeTrackingPrivateBetaApi.md#addClockOut) | **POST** /{companyDomain}/v1/time_tracking/employees/{employeeId}/clock_out | Add Timesheet Clock-Out Entry
*TimeTrackingPrivateBetaApi* | [**addEditClockEntries**](docs/TimeTrackingPrivateBetaApi.md#addEditClockEntries) | **POST** /{companyDomain}/v1/time_tracking/clock_entries/store | Add/Edit Timesheet Clock Entries
*TimeTrackingPrivateBetaApi* | [**addEditHourEntries**](docs/TimeTrackingPrivateBetaApi.md#addEditHourEntries) | **POST** /{companyDomain}/v1/time_tracking/hour_entries/store | Add/Edit Timesheet Hour Entries
*TimeTrackingPrivateBetaApi* | [**addTimesheetClockIn**](docs/TimeTrackingPrivateBetaApi.md#addTimesheetClockIn) | **POST** /{companyDomain}/v1/time_tracking/employees/{employeeId}/clock_in | Add Timesheet Clock-In Entry
*TimeTrackingPrivateBetaApi* | [**createProjectTask**](docs/TimeTrackingPrivateBetaApi.md#createProjectTask) | **POST** /{companyDomain}/v1/time_tracking/projects | Create a Time Tracking Project
*TimeTrackingPrivateBetaApi* | [**deleteHourEntries**](docs/TimeTrackingPrivateBetaApi.md#deleteHourEntries) | **POST** /{companyDomain}/v1/time_tracking/hour_entries/delete | Delete Timesheet Hour Entries
*TimeTrackingPrivateBetaApi* | [**deleteTimeSheetEntries**](docs/TimeTrackingPrivateBetaApi.md#deleteTimeSheetEntries) | **POST** /{companyDomain}/v1/time_tracking/clock_entries/delete | Delete Timesheet Clock Entries
*TimeTrackingPrivateBetaApi* | [**listEmployeeProjects**](docs/TimeTrackingPrivateBetaApi.md#listEmployeeProjects) | **GET** /{companyDomain}/v1/time_tracking/employees/{employeeId}/projects | Get Employee Projects
*TimeTrackingPrivateBetaApi* | [**listTimesheetEntries**](docs/TimeTrackingPrivateBetaApi.md#listTimesheetEntries) | **GET** /{companyDomain}/v1/time_tracking/timesheet_entries | Get Timesheet Entries
*TrainingApi* | [**addCategory**](docs/TrainingApi.md#addCategory) | **POST** /{companyDomain}/v1/training/category | Add Training Category
*TrainingApi* | [**addEmployeeTrainingRecord**](docs/TrainingApi.md#addEmployeeTrainingRecord) | **POST** /{companyDomain}/v1/training/record/employee/{employeeId} | Add New Employee Training Record
*TrainingApi* | [**categoryList**](docs/TrainingApi.md#categoryList) | **GET** /{companyDomain}/v1/training/category | List Training Categories
*TrainingApi* | [**deleteCategory**](docs/TrainingApi.md#deleteCategory) | **DELETE** /{companyDomain}/v1/training/category/{trainingCategoryId} | Delete Training Category
*TrainingApi* | [**deleteEmployeeRecord**](docs/TrainingApi.md#deleteEmployeeRecord) | **DELETE** /{companyDomain}/v1/training/record/{employeeTrainingRecordId} | Delete Employee Training Record
*TrainingApi* | [**getTypes**](docs/TrainingApi.md#getTypes) | **GET** /{companyDomain}/v1/training/type | List Training Types
*TrainingApi* | [**listEmployeeTrainings**](docs/TrainingApi.md#listEmployeeTrainings) | **GET** /{companyDomain}/v1/training/record/employee/{employeeId} | List Employee Trainings
*TrainingApi* | [**removeType**](docs/TrainingApi.md#removeType) | **DELETE** /{companyDomain}/v1/training/type/{trainingTypeId} | Delete Training Type
*TrainingApi* | [**typeAddition**](docs/TrainingApi.md#typeAddition) | **POST** /{companyDomain}/v1/training/type | Add Training Type
*TrainingApi* | [**updateCategory**](docs/TrainingApi.md#updateCategory) | **PUT** /{companyDomain}/v1/training/category/{trainingCategoryId} | Update Training Category
*TrainingApi* | [**updateEmployeeTrainingRecord**](docs/TrainingApi.md#updateEmployeeTrainingRecord) | **PUT** /{companyDomain}/v1/training/record/{employeeTrainingRecordId} | Update Employee Training Record
*TrainingApi* | [**updateType**](docs/TrainingApi.md#updateType) | **PUT** /{companyDomain}/v1/training/type/{trainingTypeId} | Update Training Type
*WebhooksApi* | [**addNewWebhook**](docs/WebhooksApi.md#addNewWebhook) | **POST** /{companyDomain}/v1/webhooks | Add Webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /{companyDomain}/v1/webhooks/{id} | Delete Webhook
*WebhooksApi* | [**getUserList**](docs/WebhooksApi.md#getUserList) | **GET** /{companyDomain}/v1/webhooks | Gets as list of webhooks for the user API key.
*WebhooksApi* | [**getUserWebhook**](docs/WebhooksApi.md#getUserWebhook) | **GET** /{companyDomain}/v1/webhooks/{id} | Get Webhook
*WebhooksApi* | [**getWebhookLogs**](docs/WebhooksApi.md#getWebhookLogs) | **GET** /{companyDomain}/v1/webhooks/{id}/log | Get Webhook Logs
*WebhooksApi* | [**listMonitorFields**](docs/WebhooksApi.md#listMonitorFields) | **GET** /{companyDomain}/v1/webhooks/monitor_fields | Get monitor fields
*WebhooksApi* | [**updateWebhookById**](docs/WebhooksApi.md#updateWebhookById) | **PUT** /{companyDomain}/v1/webhooks/{id} | Update Webhook


## Documentation for Models

 - [AdjustTimeOffBalance](docs/AdjustTimeOffBalance.md)
 - [ApplicantTrackingAddApplicationCommentRequest](docs/ApplicantTrackingAddApplicationCommentRequest.md)
 - [ApplicantTrackingChangeApplicantStatusRequest](docs/ApplicantTrackingChangeApplicantStatusRequest.md)
 - [ApplicantTrackingCreateNewApplicationRequest](docs/ApplicantTrackingCreateNewApplicationRequest.md)
 - [ApplicantTrackingCreateNewApplicationResponseInner](docs/ApplicantTrackingCreateNewApplicationResponseInner.md)
 - [ApplicantTrackingCreateNewJobOpeningRequest](docs/ApplicantTrackingCreateNewJobOpeningRequest.md)
 - [ApplicantTrackingCreateNewJobOpeningResponseInner](docs/ApplicantTrackingCreateNewJobOpeningResponseInner.md)
 - [ApplicantTrackingGetApplicationDetailsResponse](docs/ApplicantTrackingGetApplicationDetailsResponse.md)
 - [ApplicantTrackingGetApplicationDetailsResponseApplicant](docs/ApplicantTrackingGetApplicationDetailsResponseApplicant.md)
 - [ApplicantTrackingGetApplicationDetailsResponseApplicantAddress](docs/ApplicantTrackingGetApplicationDetailsResponseApplicantAddress.md)
 - [ApplicantTrackingGetApplicationDetailsResponseApplicantEducation](docs/ApplicantTrackingGetApplicationDetailsResponseApplicantEducation.md)
 - [ApplicantTrackingGetApplicationDetailsResponseApplicantEducationLevel](docs/ApplicantTrackingGetApplicationDetailsResponseApplicantEducationLevel.md)
 - [ApplicantTrackingGetApplicationDetailsResponseJob](docs/ApplicantTrackingGetApplicationDetailsResponseJob.md)
 - [ApplicantTrackingGetApplicationDetailsResponseJobHiringLead](docs/ApplicantTrackingGetApplicationDetailsResponseJobHiringLead.md)
 - [ApplicantTrackingGetApplicationDetailsResponseJobHiringLeadJobTitle](docs/ApplicantTrackingGetApplicationDetailsResponseJobHiringLeadJobTitle.md)
 - [ApplicantTrackingGetApplicationDetailsResponseJobTitle](docs/ApplicantTrackingGetApplicationDetailsResponseJobTitle.md)
 - [ApplicantTrackingGetApplicationDetailsResponseMovedTo](docs/ApplicantTrackingGetApplicationDetailsResponseMovedTo.md)
 - [ApplicantTrackingGetApplicationDetailsResponseMovedToJob](docs/ApplicantTrackingGetApplicationDetailsResponseMovedToJob.md)
 - [ApplicantTrackingGetApplicationDetailsResponseMovedToJobTitle](docs/ApplicantTrackingGetApplicationDetailsResponseMovedToJobTitle.md)
 - [ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInner](docs/ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInner.md)
 - [ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInnerAnswer](docs/ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInnerAnswer.md)
 - [ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInnerQuestion](docs/ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInnerQuestion.md)
 - [ApplicantTrackingGetApplicationDetailsResponseStatus](docs/ApplicantTrackingGetApplicationDetailsResponseStatus.md)
 - [ApplicantTrackingGetApplicationDetailsResponseStatusChangedByUser](docs/ApplicantTrackingGetApplicationDetailsResponseStatusChangedByUser.md)
 - [ApplicantTrackingGetCompanyLocationsResponseInner](docs/ApplicantTrackingGetCompanyLocationsResponseInner.md)
 - [ApplicantTrackingGetHiringLeadsResponseInner](docs/ApplicantTrackingGetHiringLeadsResponseInner.md)
 - [ApplicantTrackingGetJobSummariesResponseInner](docs/ApplicantTrackingGetJobSummariesResponseInner.md)
 - [ApplicantTrackingGetJobSummariesResponseInnerDepartment](docs/ApplicantTrackingGetJobSummariesResponseInnerDepartment.md)
 - [ApplicantTrackingGetJobSummariesResponseInnerLocation](docs/ApplicantTrackingGetJobSummariesResponseInnerLocation.md)
 - [ApplicantTrackingGetJobSummariesResponseInnerLocationAddress](docs/ApplicantTrackingGetJobSummariesResponseInnerLocationAddress.md)
 - [ApplicantTrackingGetJobSummariesResponseInnerStatus](docs/ApplicantTrackingGetJobSummariesResponseInnerStatus.md)
 - [ApplicantTrackingGetJobSummariesResponseInnerTitle](docs/ApplicantTrackingGetJobSummariesResponseInnerTitle.md)
 - [ApplicantTrackingListApplicationsResponse](docs/ApplicantTrackingListApplicationsResponse.md)
 - [ApplicantTrackingListApplicationsResponseApplicationsInner](docs/ApplicantTrackingListApplicationsResponseApplicationsInner.md)
 - [ApplicantTrackingListApplicationsResponseApplicationsInnerApplicant](docs/ApplicantTrackingListApplicationsResponseApplicationsInnerApplicant.md)
 - [ApplicantTrackingListApplicationsResponseApplicationsInnerJob](docs/ApplicantTrackingListApplicationsResponseApplicationsInnerJob.md)
 - [ApplicantTrackingListApplicationsResponseApplicationsInnerJobTitle](docs/ApplicantTrackingListApplicationsResponseApplicationsInnerJobTitle.md)
 - [ApplicantTrackingListApplicationsResponseApplicationsInnerStatus](docs/ApplicantTrackingListApplicationsResponseApplicationsInnerStatus.md)
 - [ApplicantTrackingListStatusesResponseInner](docs/ApplicantTrackingListStatusesResponseInner.md)
 - [BenefitGroup](docs/BenefitGroup.md)
 - [BenefitGroupEmployee](docs/BenefitGroupEmployee.md)
 - [BenefitGroupPlan](docs/BenefitGroupPlan.md)
 - [BenefitGroupPlanCost](docs/BenefitGroupPlanCost.md)
 - [BenefitPlan](docs/BenefitPlan.md)
 - [BenefitPlanCoverage](docs/BenefitPlanCoverage.md)
 - [BenefitsAddEmployeeBenefitRequest](docs/BenefitsAddEmployeeBenefitRequest.md)
 - [BenefitsAddNewCompanyBenefitRequest](docs/BenefitsAddNewCompanyBenefitRequest.md)
 - [BenefitsUpdateCompanyBenefitRequest](docs/BenefitsUpdateCompanyBenefitRequest.md)
 - [CompanyBenefitRequest](docs/CompanyBenefitRequest.md)
 - [CompanyBenefitResponse](docs/CompanyBenefitResponse.md)
 - [CompanyBenefitType](docs/CompanyBenefitType.md)
 - [CompanyFileUpdate](docs/CompanyFileUpdate.md)
 - [Country](docs/Country.md)
 - [Employee](docs/Employee.md)
 - [EmployeeBenefit](docs/EmployeeBenefit.md)
 - [EmployeeBenefitFilters](docs/EmployeeBenefitFilters.md)
 - [EmployeeBenefitFiltersFilters](docs/EmployeeBenefitFiltersFilters.md)
 - [EmployeeDependent](docs/EmployeeDependent.md)
 - [EmployeeDeposit](docs/EmployeeDeposit.md)
 - [EmployeeDepositAccountsInner](docs/EmployeeDepositAccountsInner.md)
 - [EmployeeFileUpdate](docs/EmployeeFileUpdate.md)
 - [EmployeePaystub](docs/EmployeePaystub.md)
 - [EmployeePaystubDeductionsInner](docs/EmployeePaystubDeductionsInner.md)
 - [EmployeePaystubDepositsInner](docs/EmployeePaystubDepositsInner.md)
 - [EmployeePaystubTaxesInner](docs/EmployeePaystubTaxesInner.md)
 - [EmployeePaystubWagesInner](docs/EmployeePaystubWagesInner.md)
 - [EmployeeUnpaidPaystub](docs/EmployeeUnpaidPaystub.md)
 - [EmployeeUnpaidPaystubUnpaidPeriodsInner](docs/EmployeeUnpaidPaystubUnpaidPeriodsInner.md)
 - [EmployeeWithholding](docs/EmployeeWithholding.md)
 - [EmployeesGetDirectory200Response](docs/EmployeesGetDirectory200Response.md)
 - [EmployeesGetDirectoryResponse](docs/EmployeesGetDirectoryResponse.md)
 - [EmployeesGetEmployeeData200Response](docs/EmployeesGetEmployeeData200Response.md)
 - [EmployeesGetEmployeeDataResponse](docs/EmployeesGetEmployeeDataResponse.md)
 - [Goal](docs/Goal.md)
 - [GoalsCloseGoalResponse](docs/GoalsCloseGoalResponse.md)
 - [GoalsCloseGoalResponseGoal](docs/GoalsCloseGoalResponseGoal.md)
 - [GoalsCloseGoalResponseGoalActions](docs/GoalsCloseGoalResponseGoalActions.md)
 - [GoalsCloseGoalResponseGoalMilestonesInner](docs/GoalsCloseGoalResponseGoalMilestonesInner.md)
 - [GoalsCountPerStatusResponse](docs/GoalsCountPerStatusResponse.md)
 - [GoalsCountPerStatusResponseFiltersInner](docs/GoalsCountPerStatusResponseFiltersInner.md)
 - [GoalsCountPerStatusResponseFiltersInnerActions](docs/GoalsCountPerStatusResponseFiltersInnerActions.md)
 - [GoalsGetAllAggregateInfo200Response](docs/GoalsGetAllAggregateInfo200Response.md)
 - [GoalsGetAllAggregateInfo200Response1](docs/GoalsGetAllAggregateInfo200Response1.md)
 - [GoalsGetAllAggregateInfo200Response1CommentsInner](docs/GoalsGetAllAggregateInfo200Response1CommentsInner.md)
 - [GoalsGetAllAggregateInfo200Response1FiltersInner](docs/GoalsGetAllAggregateInfo200Response1FiltersInner.md)
 - [GoalsGetAllAggregateInfo200Response1FiltersInnerActions](docs/GoalsGetAllAggregateInfo200Response1FiltersInnerActions.md)
 - [GoalsGetAllAggregateInfo200Response1GoalsInner](docs/GoalsGetAllAggregateInfo200Response1GoalsInner.md)
 - [GoalsGetAllAggregateInfo200Response1GoalsInnerActions](docs/GoalsGetAllAggregateInfo200Response1GoalsInnerActions.md)
 - [GoalsGetAllAggregateInfo200Response1GoalsInnerMilestonesInner](docs/GoalsGetAllAggregateInfo200Response1GoalsInnerMilestonesInner.md)
 - [GoalsGetAllAggregateInfo200Response1PersonsInner](docs/GoalsGetAllAggregateInfo200Response1PersonsInner.md)
 - [GoalsGetAllAggregateInfo200ResponseCommentsInner](docs/GoalsGetAllAggregateInfo200ResponseCommentsInner.md)
 - [GoalsGetAllAggregateInfo200ResponseFiltersInner](docs/GoalsGetAllAggregateInfo200ResponseFiltersInner.md)
 - [GoalsGetAllAggregateInfo200ResponseFiltersInnerActions](docs/GoalsGetAllAggregateInfo200ResponseFiltersInnerActions.md)
 - [GoalsGetAllAggregateInfo200ResponseGoalsInner](docs/GoalsGetAllAggregateInfo200ResponseGoalsInner.md)
 - [GoalsGetAllAggregateInfo200ResponsePersonsInner](docs/GoalsGetAllAggregateInfo200ResponsePersonsInner.md)
 - [GoalsGetAllAggregateInfoResponse](docs/GoalsGetAllAggregateInfoResponse.md)
 - [GoalsGetAllAggregateInfoResponseCommentsInner](docs/GoalsGetAllAggregateInfoResponseCommentsInner.md)
 - [GoalsGetAllAggregateInfoResponseFiltersInner](docs/GoalsGetAllAggregateInfoResponseFiltersInner.md)
 - [GoalsGetAllAggregateInfoResponseGoalsInner](docs/GoalsGetAllAggregateInfoResponseGoalsInner.md)
 - [GoalsGetAllAggregateInfoResponsePersonsInner](docs/GoalsGetAllAggregateInfoResponsePersonsInner.md)
 - [GoalsGetEmployeeGoalsResponse](docs/GoalsGetEmployeeGoalsResponse.md)
 - [GoalsGetEmployeeGoalsResponseGoalsInner](docs/GoalsGetEmployeeGoalsResponseGoalsInner.md)
 - [GoalsGetEmployeeGoalsResponseGoalsInnerActions](docs/GoalsGetEmployeeGoalsResponseGoalsInnerActions.md)
 - [GoalsGetEmployeeGoalsResponseGoalsInnerMilestonesInner](docs/GoalsGetEmployeeGoalsResponseGoalsInnerMilestonesInner.md)
 - [GoalsGetGoalAggregateInfoResponse](docs/GoalsGetGoalAggregateInfoResponse.md)
 - [GoalsGetGoalAggregateInfoResponseAlignsWithOptionsInner](docs/GoalsGetGoalAggregateInfoResponseAlignsWithOptionsInner.md)
 - [GoalsGetGoalAggregateInfoResponseCommentsInner](docs/GoalsGetGoalAggregateInfoResponseCommentsInner.md)
 - [GoalsGetGoalAggregateInfoResponseGoal](docs/GoalsGetGoalAggregateInfoResponseGoal.md)
 - [GoalsGetGoalAggregateInfoResponseGoalActions](docs/GoalsGetGoalAggregateInfoResponseGoalActions.md)
 - [GoalsGetGoalAggregateInfoResponseGoalMilestonesInner](docs/GoalsGetGoalAggregateInfoResponseGoalMilestonesInner.md)
 - [GoalsGetGoalAggregateInfoResponsePersonsInner](docs/GoalsGetGoalAggregateInfoResponsePersonsInner.md)
 - [GoalsStatusCountResponse](docs/GoalsStatusCountResponse.md)
 - [GoalsStatusCountResponseFiltersInner](docs/GoalsStatusCountResponseFiltersInner.md)
 - [GoalsUpdateGoalSharingRequest](docs/GoalsUpdateGoalSharingRequest.md)
 - [GoalsUpdateGoalSharingResponse](docs/GoalsUpdateGoalSharingResponse.md)
 - [GoalsUpdateGoalSharingResponseGoal](docs/GoalsUpdateGoalSharingResponseGoal.md)
 - [GoalsUpdateProgressResponse](docs/GoalsUpdateProgressResponse.md)
 - [GoalsUpdateProgressResponseGoal](docs/GoalsUpdateProgressResponseGoal.md)
 - [HiringLead](docs/HiringLead.md)
 - [HoursEditHourRecordRequest](docs/HoursEditHourRecordRequest.md)
 - [ListFieldValues](docs/ListFieldValues.md)
 - [ListFieldValuesOptionsInner](docs/ListFieldValuesOptionsInner.md)
 - [Location](docs/Location.md)
 - [Login](docs/Login.md)
 - [Milestone](docs/Milestone.md)
 - [NewGoal](docs/NewGoal.md)
 - [NewWebHook](docs/NewWebHook.md)
 - [NewWebHookFrequency](docs/NewWebHookFrequency.md)
 - [NewWebHookLimit](docs/NewWebHookLimit.md)
 - [PostNewEmployee](docs/PostNewEmployee.md)
 - [Request](docs/Request.md)
 - [RequestCustomReport](docs/RequestCustomReport.md)
 - [RequestCustomReportFilters](docs/RequestCustomReportFilters.md)
 - [RequestCustomReportFiltersLastChanged](docs/RequestCustomReportFiltersLastChanged.md)
 - [State](docs/State.md)
 - [TableRowUpdate](docs/TableRowUpdate.md)
 - [TabularDataDeleteRowResponse](docs/TabularDataDeleteRowResponse.md)
 - [TimeOffHistory](docs/TimeOffHistory.md)
 - [TimeOffPoliciesInner](docs/TimeOffPoliciesInner.md)
 - [TimeOffRequest](docs/TimeOffRequest.md)
 - [TimeOffRequestDatesInner](docs/TimeOffRequestDatesInner.md)
 - [TimeOffRequestNotesInner](docs/TimeOffRequestNotesInner.md)
 - [TimeTrackingApproveEmployeeTimesheetsRequest](docs/TimeTrackingApproveEmployeeTimesheetsRequest.md)
 - [TimeTrackingApproveEmployeeTimesheetsRequest1](docs/TimeTrackingApproveEmployeeTimesheetsRequest1.md)
 - [TimeTrackingApproveEmployeeTimesheetsRequest1ClockOutsInner](docs/TimeTrackingApproveEmployeeTimesheetsRequest1ClockOutsInner.md)
 - [TimeTrackingApproveEmployeeTimesheetsRequestTimesheetsInner](docs/TimeTrackingApproveEmployeeTimesheetsRequestTimesheetsInner.md)
 - [TimeTrackingClockInEmployeeRequest](docs/TimeTrackingClockInEmployeeRequest.md)
 - [TimeTrackingClockInEmployeeRequestClockInLocation](docs/TimeTrackingClockInEmployeeRequestClockInLocation.md)
 - [TimeTrackingClockOutEmployeeAtSpecificTimeRequest](docs/TimeTrackingClockOutEmployeeAtSpecificTimeRequest.md)
 - [TimeTrackingClockOutEmployeeRequest](docs/TimeTrackingClockOutEmployeeRequest.md)
 - [TimeTrackingClockOutEmployeeRequestClockOutLocation](docs/TimeTrackingClockOutEmployeeRequestClockOutLocation.md)
 - [TimeTrackingDeleteClockEntriesRequest](docs/TimeTrackingDeleteClockEntriesRequest.md)
 - [TimeTrackingEditClockedInEntryDataRequest](docs/TimeTrackingEditClockedInEntryDataRequest.md)
 - [TimeTrackingEditClockedInEntryDataRequestClockInLocation](docs/TimeTrackingEditClockedInEntryDataRequestClockInLocation.md)
 - [TimeTrackingEditClockedInEntryDataRequestClockOutLocation](docs/TimeTrackingEditClockedInEntryDataRequestClockOutLocation.md)
 - [TimeTrackingGetTimesheetsByIdsRequest](docs/TimeTrackingGetTimesheetsByIdsRequest.md)
 - [TimeTrackingPrivateBetaAddEditClockEntriesRequest](docs/TimeTrackingPrivateBetaAddEditClockEntriesRequest.md)
 - [TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner](docs/TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.md)
 - [TimeTrackingPrivateBetaAddEditHourEntriesRequest](docs/TimeTrackingPrivateBetaAddEditHourEntriesRequest.md)
 - [TimeTrackingPrivateBetaAddEditHourEntriesRequestHoursInner](docs/TimeTrackingPrivateBetaAddEditHourEntriesRequestHoursInner.md)
 - [TimeTrackingPrivateBetaAddTimesheetClockInRequest](docs/TimeTrackingPrivateBetaAddTimesheetClockInRequest.md)
 - [TimeTrackingPrivateBetaCreateProjectTaskRequest](docs/TimeTrackingPrivateBetaCreateProjectTaskRequest.md)
 - [TimeTrackingPrivateBetaCreateProjectTaskRequestTasksInner](docs/TimeTrackingPrivateBetaCreateProjectTaskRequestTasksInner.md)
 - [TimeTrackingPrivateBetaDeleteHourEntriesRequest](docs/TimeTrackingPrivateBetaDeleteHourEntriesRequest.md)
 - [TimeTrackingPrivateBetaDeleteTimeSheetEntriesRequest](docs/TimeTrackingPrivateBetaDeleteTimeSheetEntriesRequest.md)
 - [TimeTrackingProject](docs/TimeTrackingProject.md)
 - [TimeTrackingProjectInfo](docs/TimeTrackingProjectInfo.md)
 - [TimeTrackingProjectWithTasks](docs/TimeTrackingProjectWithTasks.md)
 - [TimeTrackingProjectWithTasksAndEmployeeIds](docs/TimeTrackingProjectWithTasksAndEmployeeIds.md)
 - [TimeTrackingRecord](docs/TimeTrackingRecord.md)
 - [TimeTrackingStoreClockEntriesRequest](docs/TimeTrackingStoreClockEntriesRequest.md)
 - [TimeTrackingStoreClockEntriesRequestEntriesInner](docs/TimeTrackingStoreClockEntriesRequestEntriesInner.md)
 - [TimeTrackingStoreDailyEntriesRequest](docs/TimeTrackingStoreDailyEntriesRequest.md)
 - [TimeTrackingStoreDailyEntriesRequestEntriesInner](docs/TimeTrackingStoreDailyEntriesRequestEntriesInner.md)
 - [TimeTrackingTask](docs/TimeTrackingTask.md)
 - [TimesheetEntry](docs/TimesheetEntry.md)
 - [TrainingAddCategoryRequest](docs/TrainingAddCategoryRequest.md)
 - [TrainingAddEmployeeTrainingRecordRequest](docs/TrainingAddEmployeeTrainingRecordRequest.md)
 - [TrainingAddEmployeeTrainingRecordRequestCost](docs/TrainingAddEmployeeTrainingRecordRequestCost.md)
 - [TrainingCategory](docs/TrainingCategory.md)
 - [TrainingCategoryListResponseInner](docs/TrainingCategoryListResponseInner.md)
 - [TrainingGetTypesResponseInner](docs/TrainingGetTypesResponseInner.md)
 - [TrainingListEmployeeTrainingsResponseInner](docs/TrainingListEmployeeTrainingsResponseInner.md)
 - [TrainingRecord](docs/TrainingRecord.md)
 - [TrainingType](docs/TrainingType.md)
 - [TrainingTypeAdditionRequest](docs/TrainingTypeAdditionRequest.md)
 - [TrainingTypeAdditionRequestCategory](docs/TrainingTypeAdditionRequestCategory.md)
 - [TrainingUpdateCategoryRequest](docs/TrainingUpdateCategoryRequest.md)
 - [TrainingUpdateEmployeeTrainingRecordRequest](docs/TrainingUpdateEmployeeTrainingRecordRequest.md)
 - [TrainingUpdateTypeRequest](docs/TrainingUpdateTypeRequest.md)
 - [TrainingUpdateTypeRequestCategory](docs/TrainingUpdateTypeRequestCategory.md)
 - [UpdateGoalV11](docs/UpdateGoalV11.md)
 - [WebHookLogResponse](docs/WebHookLogResponse.md)
 - [WebHookResponse](docs/WebHookResponse.md)
 - [WebHookResponseFrequency](docs/WebHookResponseFrequency.md)
 - [WebHookResponseLimit](docs/WebHookResponseLimit.md)
 - [WebhooksAddNewWebhookResponse](docs/WebhooksAddNewWebhookResponse.md)
 - [WebhooksAddNewWebhookResponseFrequency](docs/WebhooksAddNewWebhookResponseFrequency.md)
 - [WebhooksAddNewWebhookResponseLimit](docs/WebhooksAddNewWebhookResponseLimit.md)
 - [WebhooksGetUserListResponse](docs/WebhooksGetUserListResponse.md)
 - [WebhooksGetUserListResponseWebhooksInner](docs/WebhooksGetUserListResponseWebhooksInner.md)
 - [WebhooksListMonitorFieldsResponse](docs/WebhooksListMonitorFieldsResponse.md)
 - [WebhooksListMonitorFieldsResponseFieldsInner](docs/WebhooksListMonitorFieldsResponseFieldsInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)

# ApplicantTrackingApi

All URIs are relative to *https://api.bamboohr.com/api/gateway.php*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addApplicationComment**](ApplicantTrackingApi.md#addApplicationComment) | **POST** /{companyDomain}/v1/applicant_tracking/applications/{applicationId}/comments | Add Application Comment |
| [**changeApplicantStatus**](ApplicantTrackingApi.md#changeApplicantStatus) | **POST** /{companyDomain}/v1/applicant_tracking/applications/{applicationId}/status | Change Applicant&#39;s Status |
| [**createNewApplication**](ApplicantTrackingApi.md#createNewApplication) | **POST** /{companyDomain}/v1/applicant_tracking/application | Add New Candidate |
| [**createNewJobOpening**](ApplicantTrackingApi.md#createNewJobOpening) | **POST** /{companyDomain}/v1/applicant_tracking/job_opening | Add New Job Opening |
| [**getApplicationDetails**](ApplicantTrackingApi.md#getApplicationDetails) | **GET** /{companyDomain}/v1/applicant_tracking/applications/{applicationId} | Get Application Details |
| [**getCompanyLocations**](ApplicantTrackingApi.md#getCompanyLocations) | **GET** /{companyDomain}/v1/applicant_tracking/locations | Get Company Locations |
| [**getHiringLeads**](ApplicantTrackingApi.md#getHiringLeads) | **GET** /{companyDomain}/v1/applicant_tracking/hiring_leads | Get Hiring Leads |
| [**getJobSummaries**](ApplicantTrackingApi.md#getJobSummaries) | **GET** /{companyDomain}/v1/applicant_tracking/jobs | Get Job Summaries |
| [**listApplications**](ApplicantTrackingApi.md#listApplications) | **GET** /{companyDomain}/v1/applicant_tracking/applications | Get Applications |
| [**listStatuses**](ApplicantTrackingApi.md#listStatuses) | **GET** /{companyDomain}/v1/applicant_tracking/statuses | Get Statuses |


<a name="addApplicationComment"></a>
# **addApplicationComment**
> addApplicationComment(companyDomain, applicationId, applicantTrackingAddApplicationCommentRequest).execute();

Add Application Comment

Add a comment to an application. The owner of the API key used must have access to ATS settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingApi;
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
    String type = "comment"; // Always the value \\\"comment\\\".
    String comment = "comment_example"; // The comment being posted.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    Integer applicationId = 0; // The ID of the application to add a comment to.
    try {
      client
              .applicantTracking
              .addApplicationComment(type, comment, companyDomain, applicationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#addApplicationComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicantTracking
              .addApplicationComment(type, comment, companyDomain, applicationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#addApplicationComment");
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
| **applicationId** | **Integer**| The ID of the application to add a comment to. | [default to 0] |
| **applicantTrackingAddApplicationCommentRequest** | [**ApplicantTrackingAddApplicationCommentRequest**](ApplicantTrackingAddApplicationCommentRequest.md)| Comment object to post | |

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
| **200** | Success. |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="changeApplicantStatus"></a>
# **changeApplicantStatus**
> changeApplicantStatus(companyDomain, applicationId, applicantTrackingChangeApplicantStatusRequest).execute();

Change Applicant&#39;s Status

Change applicant&#39;s status. The owner of the API key used must have access to ATS settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingApi;
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
    Integer status = 56; // Associates a status id with an application.
    String companyDomain = "companyDomain_example"; // The subdomain used to access BambooHR. If you access BambooHR at https://mycompany.bamboohr.com, then the companyDomain is \"mycompany\"
    Integer applicationId = 0; // The ID of the application to add a comment to.
    try {
      client
              .applicantTracking
              .changeApplicantStatus(status, companyDomain, applicationId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#changeApplicantStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applicantTracking
              .changeApplicantStatus(status, companyDomain, applicationId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#changeApplicantStatus");
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
| **applicationId** | **Integer**| The ID of the application to add a comment to. | [default to 0] |
| **applicantTrackingChangeApplicantStatusRequest** | [**ApplicantTrackingChangeApplicantStatusRequest**](ApplicantTrackingChangeApplicantStatusRequest.md)| Sample Post Data. | |

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
| **200** | Success |  -  |
| **400** | Bad request parameters. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="createNewApplication"></a>
# **createNewApplication**
> List&lt;ApplicantTrackingCreateNewApplicationResponseInner&gt; createNewApplication(companyDomain, firstName, lastName, jobId, applicantTrackingCreateNewApplicationRequest).email(email).phoneNumber(phoneNumber).source(source).address(address).city(city).state(state).zip(zip).country(country).linkedinUrl(linkedinUrl).dateAvailable(dateAvailable).desiredSalary(desiredSalary).referredBy(referredBy).websiteUrl(websiteUrl).highestEducation(highestEducation).collegeName(collegeName).references(references).resume(resume).coverLetter(coverLetter).execute();

Add New Candidate

Add a new candidate application to a job opening. The owner of the API key used must have access to ATS settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingApi;
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
    String firstName = "firstName_example"; // The first name of the candidate.
    String lastName = "lastName_example"; // The last name of the candidate.
    Integer jobId = 56; // The id of the job opening for the candidate application.
    String email = "email_example"; // The email address of the candidate.
    String phoneNumber = "phoneNumber_example"; // The phone number of the candidate.
    String source = "source_example"; // The source of the candidate application, e.g. LinkedIn, Indeed, etc.
    String address = "address_example"; // The street address of the candidate.
    String city = "city_example"; // The city of the candidate.
    String state = "state_example"; // The state or province of the candidate. Accepts state name, abbreviation, or ISO code.
    String zip = "zip_example"; // The zip code or postal code of the candidate.
    String country = "country_example"; // The country of the candidate. Accepts country name or ISO code.
    String linkedinUrl = "linkedinUrl_example"; // The LinkedIn profile url of the candidate.
    String dateAvailable = "dateAvailable_example"; // The available start date of the candidate with the format YYYY-MM-DD.
    String desiredSalary = "desiredSalary_example"; // The desired salary of the candidate.
    String referredBy = "referredBy_example"; // The person or entity that referred the candidate.
    String websiteUrl = "websiteUrl_example"; // The personal website, blog, or online portfolio of the candidate.
    String highestEducation = "GED or Equivalent"; // The highest completed education level of the candidate.
    String collegeName = "collegeName_example"; // The college or university of the candidate.
    String references = "references_example"; // A list of references supplied by the candidate.
    File resume = new File("/path/to/file"); // Resume of the candidate.
    File coverLetter = new File("/path/to/file"); // Cover letter of the candidate.
    try {
      List<ApplicantTrackingCreateNewApplicationResponseInner> result = client
              .applicantTracking
              .createNewApplication(companyDomain, firstName, lastName, jobId)
              .email(email)
              .phoneNumber(phoneNumber)
              .source(source)
              .address(address)
              .city(city)
              .state(state)
              .zip(zip)
              .country(country)
              .linkedinUrl(linkedinUrl)
              .dateAvailable(dateAvailable)
              .desiredSalary(desiredSalary)
              .referredBy(referredBy)
              .websiteUrl(websiteUrl)
              .highestEducation(highestEducation)
              .collegeName(collegeName)
              .references(references)
              .resume(resume)
              .coverLetter(coverLetter)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#createNewApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApplicantTrackingCreateNewApplicationResponseInner>> response = client
              .applicantTracking
              .createNewApplication(companyDomain, firstName, lastName, jobId)
              .email(email)
              .phoneNumber(phoneNumber)
              .source(source)
              .address(address)
              .city(city)
              .state(state)
              .zip(zip)
              .country(country)
              .linkedinUrl(linkedinUrl)
              .dateAvailable(dateAvailable)
              .desiredSalary(desiredSalary)
              .referredBy(referredBy)
              .websiteUrl(websiteUrl)
              .highestEducation(highestEducation)
              .collegeName(collegeName)
              .references(references)
              .resume(resume)
              .coverLetter(coverLetter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#createNewApplication");
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
| **firstName** | **String**| The first name of the candidate. | |
| **lastName** | **String**| The last name of the candidate. | |
| **jobId** | **Integer**| The id of the job opening for the candidate application. | |
| **applicantTrackingCreateNewApplicationRequest** | [**ApplicantTrackingCreateNewApplicationRequest**](ApplicantTrackingCreateNewApplicationRequest.md)|  | |
| **email** | **String**| The email address of the candidate. | [optional] |
| **phoneNumber** | **String**| The phone number of the candidate. | [optional] |
| **source** | **String**| The source of the candidate application, e.g. LinkedIn, Indeed, etc. | [optional] |
| **address** | **String**| The street address of the candidate. | [optional] |
| **city** | **String**| The city of the candidate. | [optional] |
| **state** | **String**| The state or province of the candidate. Accepts state name, abbreviation, or ISO code. | [optional] |
| **zip** | **String**| The zip code or postal code of the candidate. | [optional] |
| **country** | **String**| The country of the candidate. Accepts country name or ISO code. | [optional] |
| **linkedinUrl** | **String**| The LinkedIn profile url of the candidate. | [optional] |
| **dateAvailable** | **String**| The available start date of the candidate with the format YYYY-MM-DD. | [optional] |
| **desiredSalary** | **String**| The desired salary of the candidate. | [optional] |
| **referredBy** | **String**| The person or entity that referred the candidate. | [optional] |
| **websiteUrl** | **String**| The personal website, blog, or online portfolio of the candidate. | [optional] |
| **highestEducation** | **String**| The highest completed education level of the candidate. | [optional] [enum: GED or Equivalent, High School, Some College, College - Associates, College - Bachelor of Arts, College - Bachelor of Fine Arts, College - Bachelor of Science, College - Master of Arts, College - Master of Fine Arts, College - Master of Science, College - Master of Business Administration, College - Doctorate, Medical Doctor, Other] |
| **collegeName** | **String**| The college or university of the candidate. | [optional] |
| **references** | **String**| A list of references supplied by the candidate. | [optional] |
| **resume** | **File**| Resume of the candidate. | [optional] |
| **coverLetter** | **File**| Cover letter of the candidate. | [optional] |

### Return type

[**List&lt;ApplicantTrackingCreateNewApplicationResponseInner&gt;**](ApplicantTrackingCreateNewApplicationResponseInner.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |
| **422** | Unprocessable entity. One or more parameters failed validation. |  -  |

<a name="createNewJobOpening"></a>
# **createNewJobOpening**
> List&lt;ApplicantTrackingCreateNewJobOpeningResponseInner&gt; createNewJobOpening(companyDomain, postingTitle, jobStatus, hiringLead, employmentType, jobDescription, applicantTrackingCreateNewJobOpeningRequest).department(department).minimumExperience(minimumExperience).compensation(compensation).jobLocation(jobLocation).applicationQuestionResume(applicationQuestionResume).applicationQuestionAddress(applicationQuestionAddress).applicationQuestionLinkedinUrl(applicationQuestionLinkedinUrl).applicationQuestionDateAvailable(applicationQuestionDateAvailable).applicationQuestionDesiredSalary(applicationQuestionDesiredSalary).applicationQuestionCoverLetter(applicationQuestionCoverLetter).applicationQuestionReferredBy(applicationQuestionReferredBy).applicationQuestionWebsiteUrl(applicationQuestionWebsiteUrl).applicationQuestionHighestEducation(applicationQuestionHighestEducation).applicationQuestionCollege(applicationQuestionCollege).applicationQuestionReferences(applicationQuestionReferences).internalJobCode(internalJobCode).execute();

Add New Job Opening

Add a new job opening. The owner of the API key used must have access to ATS settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingApi;
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
    String postingTitle = "postingTitle_example"; // The posting title of the job opening.
    String jobStatus = "Draft"; // The status of the job opening.
    Integer hiringLead = 56; // The employee id (from the v1/applicant_tracking/hiring_leads endpoint) of the hiring lead for the job opening.
    String employmentType = "employmentType_example"; // The type of employment offered in the job opening, e.g. Full-Time, Part-Time, Contractor, etc.
    String jobDescription = "jobDescription_example"; // The long-form text description of the job opening.
    String department = "department_example"; // The department of the job opening.
    String minimumExperience = "Entry-level"; // The minimum experience level that qualifies a candidate for the job opening.
    String compensation = "compensation_example"; // The pay rate or compensation for the job opening.
    Integer jobLocation = 56; // The location id (from the v1/applicant_tracking/locations endpoint) of the job opening. Omit this parameter for a remote job location.
    String applicationQuestionResume = "true"; // Whether the job opening application has a standard question for resume (true) or not (false) or if uploading a resume is mandatory (required).
    String applicationQuestionAddress = "true"; // Whether the job opening application has a standard question for address (true) or not (false) or if entering an address is mandatory (required).
    String applicationQuestionLinkedinUrl = "true"; // Whether the job opening application has a standard question for LinkedIn profile url (true) or not (false) or if entering a LinkedIn profile url is mandatory (required).
    String applicationQuestionDateAvailable = "true"; // Whether the job opening application has a standard question for availability date (true) or not (false) or if entering an availability date is mandatory (required).
    String applicationQuestionDesiredSalary = "true"; // Whether the job opening application has a standard question for desired salary (true) or not (false) or if entering a desired salary is mandatory (required).
    String applicationQuestionCoverLetter = "true"; // Whether the job opening application has a standard question for cover letter (true) or not (false) or if uploading a cover letter is mandatory (required).
    String applicationQuestionReferredBy = "true"; // Whether the job opening application has a standard question for referred by (true) or not (false) or if entering referred by is mandatory (required).
    String applicationQuestionWebsiteUrl = "true"; // Whether the job opening application has a standard question for website url (true) or not (false) or if entering a website url is mandatory (required).
    String applicationQuestionHighestEducation = "true"; // Whether the job opening application has a standard question for highest education (true) or not (false) or if entering highest education is mandatory (required).
    String applicationQuestionCollege = "true"; // Whether the job opening application has a standard question for college (true) or not (false) or if entering a college is mandatory (required).
    String applicationQuestionReferences = "true"; // Whether the job opening application has a standard question for references (true) or not (false) or if entering references is mandatory (required).
    String internalJobCode = "internalJobCode_example"; // The internal job code for the job opening.
    try {
      List<ApplicantTrackingCreateNewJobOpeningResponseInner> result = client
              .applicantTracking
              .createNewJobOpening(companyDomain, postingTitle, jobStatus, hiringLead, employmentType, jobDescription)
              .department(department)
              .minimumExperience(minimumExperience)
              .compensation(compensation)
              .jobLocation(jobLocation)
              .applicationQuestionResume(applicationQuestionResume)
              .applicationQuestionAddress(applicationQuestionAddress)
              .applicationQuestionLinkedinUrl(applicationQuestionLinkedinUrl)
              .applicationQuestionDateAvailable(applicationQuestionDateAvailable)
              .applicationQuestionDesiredSalary(applicationQuestionDesiredSalary)
              .applicationQuestionCoverLetter(applicationQuestionCoverLetter)
              .applicationQuestionReferredBy(applicationQuestionReferredBy)
              .applicationQuestionWebsiteUrl(applicationQuestionWebsiteUrl)
              .applicationQuestionHighestEducation(applicationQuestionHighestEducation)
              .applicationQuestionCollege(applicationQuestionCollege)
              .applicationQuestionReferences(applicationQuestionReferences)
              .internalJobCode(internalJobCode)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#createNewJobOpening");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApplicantTrackingCreateNewJobOpeningResponseInner>> response = client
              .applicantTracking
              .createNewJobOpening(companyDomain, postingTitle, jobStatus, hiringLead, employmentType, jobDescription)
              .department(department)
              .minimumExperience(minimumExperience)
              .compensation(compensation)
              .jobLocation(jobLocation)
              .applicationQuestionResume(applicationQuestionResume)
              .applicationQuestionAddress(applicationQuestionAddress)
              .applicationQuestionLinkedinUrl(applicationQuestionLinkedinUrl)
              .applicationQuestionDateAvailable(applicationQuestionDateAvailable)
              .applicationQuestionDesiredSalary(applicationQuestionDesiredSalary)
              .applicationQuestionCoverLetter(applicationQuestionCoverLetter)
              .applicationQuestionReferredBy(applicationQuestionReferredBy)
              .applicationQuestionWebsiteUrl(applicationQuestionWebsiteUrl)
              .applicationQuestionHighestEducation(applicationQuestionHighestEducation)
              .applicationQuestionCollege(applicationQuestionCollege)
              .applicationQuestionReferences(applicationQuestionReferences)
              .internalJobCode(internalJobCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#createNewJobOpening");
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
| **postingTitle** | **String**| The posting title of the job opening. | |
| **jobStatus** | **String**| The status of the job opening. | [enum: Draft, Open, On Hold, Filled, Canceled] |
| **hiringLead** | **Integer**| The employee id (from the v1/applicant_tracking/hiring_leads endpoint) of the hiring lead for the job opening. | |
| **employmentType** | **String**| The type of employment offered in the job opening, e.g. Full-Time, Part-Time, Contractor, etc. | |
| **jobDescription** | **String**| The long-form text description of the job opening. | |
| **applicantTrackingCreateNewJobOpeningRequest** | [**ApplicantTrackingCreateNewJobOpeningRequest**](ApplicantTrackingCreateNewJobOpeningRequest.md)|  | |
| **department** | **String**| The department of the job opening. | [optional] |
| **minimumExperience** | **String**| The minimum experience level that qualifies a candidate for the job opening. | [optional] [enum: Entry-level, Mid-level, Experienced, Manager/Supervisor, Senior Manager/Supervisor', Executive, Senior Executive] |
| **compensation** | **String**| The pay rate or compensation for the job opening. | [optional] |
| **jobLocation** | **Integer**| The location id (from the v1/applicant_tracking/locations endpoint) of the job opening. Omit this parameter for a remote job location. | [optional] |
| **applicationQuestionResume** | **String**| Whether the job opening application has a standard question for resume (true) or not (false) or if uploading a resume is mandatory (required). | [optional] [enum: true, false, Required] |
| **applicationQuestionAddress** | **String**| Whether the job opening application has a standard question for address (true) or not (false) or if entering an address is mandatory (required). | [optional] [enum: true, false, Required] |
| **applicationQuestionLinkedinUrl** | **String**| Whether the job opening application has a standard question for LinkedIn profile url (true) or not (false) or if entering a LinkedIn profile url is mandatory (required). | [optional] [enum: true, false, Required] |
| **applicationQuestionDateAvailable** | **String**| Whether the job opening application has a standard question for availability date (true) or not (false) or if entering an availability date is mandatory (required). | [optional] [enum: true, false, Required] |
| **applicationQuestionDesiredSalary** | **String**| Whether the job opening application has a standard question for desired salary (true) or not (false) or if entering a desired salary is mandatory (required). | [optional] [enum: true, false, Required] |
| **applicationQuestionCoverLetter** | **String**| Whether the job opening application has a standard question for cover letter (true) or not (false) or if uploading a cover letter is mandatory (required). | [optional] [enum: true, false, Required] |
| **applicationQuestionReferredBy** | **String**| Whether the job opening application has a standard question for referred by (true) or not (false) or if entering referred by is mandatory (required). | [optional] [enum: true, false, Required] |
| **applicationQuestionWebsiteUrl** | **String**| Whether the job opening application has a standard question for website url (true) or not (false) or if entering a website url is mandatory (required). | [optional] [enum: true, false, Required] |
| **applicationQuestionHighestEducation** | **String**| Whether the job opening application has a standard question for highest education (true) or not (false) or if entering highest education is mandatory (required). | [optional] [enum: true, false, Required] |
| **applicationQuestionCollege** | **String**| Whether the job opening application has a standard question for college (true) or not (false) or if entering a college is mandatory (required). | [optional] [enum: true, false, Required] |
| **applicationQuestionReferences** | **String**| Whether the job opening application has a standard question for references (true) or not (false) or if entering references is mandatory (required). | [optional] [enum: true, false, Required] |
| **internalJobCode** | **String**| The internal job code for the job opening. | [optional] |

### Return type

[**List&lt;ApplicantTrackingCreateNewJobOpeningResponseInner&gt;**](ApplicantTrackingCreateNewJobOpeningResponseInner.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |
| **422** | Unprocessable entity. One or more parameters failed validation. |  -  |

<a name="getApplicationDetails"></a>
# **getApplicationDetails**
> ApplicantTrackingGetApplicationDetailsResponse getApplicationDetails(companyDomain, applicationId).execute();

Get Application Details

Get the details of an application. The owner of the API key used must have access to ATS settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingApi;
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
    Integer applicationId = 0; // The ID of the application to look up details.
    try {
      ApplicantTrackingGetApplicationDetailsResponse result = client
              .applicantTracking
              .getApplicationDetails(companyDomain, applicationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAppliedDate());
      System.out.println(result.getStatus());
      System.out.println(result.getRating());
      System.out.println(result.getResumeFileId());
      System.out.println(result.getCoverLetterFileId());
      System.out.println(result.getMovedTo());
      System.out.println(result.getMovedFrom());
      System.out.println(result.getAlsoAppliedToCount());
      System.out.println(result.getDuplicateApplicationCount());
      System.out.println(result.getReferredBy());
      System.out.println(result.getDesiredSalary());
      System.out.println(result.getCommentCount());
      System.out.println(result.getEmailCount());
      System.out.println(result.getQuestionsAndAnswers());
      System.out.println(result.getApplicant());
      System.out.println(result.getJob());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#getApplicationDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicantTrackingGetApplicationDetailsResponse> response = client
              .applicantTracking
              .getApplicationDetails(companyDomain, applicationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#getApplicationDetails");
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
| **applicationId** | **Integer**| The ID of the application to look up details. | [default to 0] |

### Return type

[**ApplicantTrackingGetApplicationDetailsResponse**](ApplicantTrackingGetApplicationDetailsResponse.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="getCompanyLocations"></a>
# **getCompanyLocations**
> List&lt;ApplicantTrackingGetCompanyLocationsResponseInner&gt; getCompanyLocations(companyDomain).execute();

Get Company Locations

Get company locations for use in creating a new job opening. The owner of the API key used must have access to ATS settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingApi;
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
      List<ApplicantTrackingGetCompanyLocationsResponseInner> result = client
              .applicantTracking
              .getCompanyLocations(companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#getCompanyLocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApplicantTrackingGetCompanyLocationsResponseInner>> response = client
              .applicantTracking
              .getCompanyLocations(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#getCompanyLocations");
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

[**List&lt;ApplicantTrackingGetCompanyLocationsResponseInner&gt;**](ApplicantTrackingGetCompanyLocationsResponseInner.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="getHiringLeads"></a>
# **getHiringLeads**
> List&lt;ApplicantTrackingGetHiringLeadsResponseInner&gt; getHiringLeads(companyDomain).execute();

Get Hiring Leads

Get potential hiring leads for use in creating a new job opening. The owner of the API key used must have access to ATS settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingApi;
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
      List<ApplicantTrackingGetHiringLeadsResponseInner> result = client
              .applicantTracking
              .getHiringLeads(companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#getHiringLeads");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApplicantTrackingGetHiringLeadsResponseInner>> response = client
              .applicantTracking
              .getHiringLeads(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#getHiringLeads");
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

[**List&lt;ApplicantTrackingGetHiringLeadsResponseInner&gt;**](ApplicantTrackingGetHiringLeadsResponseInner.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |
| **404** | Bad request url. |  -  |

<a name="getJobSummaries"></a>
# **getJobSummaries**
> List&lt;ApplicantTrackingGetJobSummariesResponseInner&gt; getJobSummaries(companyDomain).statusGroups(statusGroups).sortBy(sortBy).sortOrder(sortOrder).execute();

Get Job Summaries

Get a list of job summaries. The owner of the API key used must have access to ATS settings. Combine as many different optional parameter filters as you like.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingApi;
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
    String statusGroups = "ALL"; // A list of status groups to filter positions by.
    String sortBy = "count"; // A specific field to sort the results by.
    String sortOrder = "ASC"; // Order by which to sort results.
    try {
      List<ApplicantTrackingGetJobSummariesResponseInner> result = client
              .applicantTracking
              .getJobSummaries(companyDomain)
              .statusGroups(statusGroups)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#getJobSummaries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApplicantTrackingGetJobSummariesResponseInner>> response = client
              .applicantTracking
              .getJobSummaries(companyDomain)
              .statusGroups(statusGroups)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#getJobSummaries");
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
| **statusGroups** | **String**| A list of status groups to filter positions by. | [optional] [enum: ALL, DRAFT_AND_OPEN, Open, Filled, Draft, Deleted, On Hold, Canceled] |
| **sortBy** | **String**| A specific field to sort the results by. | [optional] [enum: count, title, lead, created, status] |
| **sortOrder** | **String**| Order by which to sort results. | [optional] [enum: ASC, DESC] |

### Return type

[**List&lt;ApplicantTrackingGetJobSummariesResponseInner&gt;**](ApplicantTrackingGetJobSummariesResponseInner.md)

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

<a name="listApplications"></a>
# **listApplications**
> ApplicantTrackingListApplicationsResponse listApplications(companyDomain).page(page).jobId(jobId).applicationStatusId(applicationStatusId).applicationStatus(applicationStatus).jobStatusGroups(jobStatusGroups).searchString(searchString).sortBy(sortBy).sortOrder(sortOrder).newSince(newSince).execute();

Get Applications

Get a list of applications. The owner of the API key used must have access to ATS settings. Combine as many different optional parameter filters as you like.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingApi;
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
    Integer page = 56; // The page number
    Integer jobId = 56; // A Job Id to limit results to
    Integer applicationStatusId = 56; // Application status id to filter by.
    String applicationStatus = "ALL"; // A list of application status groups to filter by.
    String jobStatusGroups = "ALL"; // A list of position status groups to filter by.
    String searchString = "searchString_example"; // A general search criteria by which to find applications.
    String sortBy = "first_name"; // A specific field to sort the results by.
    String sortOrder = "ASC"; // Order by which to sort results.
    OffsetDateTime newSince = OffsetDateTime.now(); // Only get applications newer than a given UTC timestamp, for example 2024-01-01 13:00:00
    try {
      ApplicantTrackingListApplicationsResponse result = client
              .applicantTracking
              .listApplications(companyDomain)
              .page(page)
              .jobId(jobId)
              .applicationStatusId(applicationStatusId)
              .applicationStatus(applicationStatus)
              .jobStatusGroups(jobStatusGroups)
              .searchString(searchString)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .newSince(newSince)
              .execute();
      System.out.println(result);
      System.out.println(result.getPaginationComplete());
      System.out.println(result.getApplications());
      System.out.println(result.getNextPageUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#listApplications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicantTrackingListApplicationsResponse> response = client
              .applicantTracking
              .listApplications(companyDomain)
              .page(page)
              .jobId(jobId)
              .applicationStatusId(applicationStatusId)
              .applicationStatus(applicationStatus)
              .jobStatusGroups(jobStatusGroups)
              .searchString(searchString)
              .sortBy(sortBy)
              .sortOrder(sortOrder)
              .newSince(newSince)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#listApplications");
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
| **page** | **Integer**| The page number | [optional] |
| **jobId** | **Integer**| A Job Id to limit results to | [optional] |
| **applicationStatusId** | **Integer**| Application status id to filter by. | [optional] |
| **applicationStatus** | **String**| A list of application status groups to filter by. | [optional] [enum: ALL, ALL_ACTIVE, NEW, ACTIVE, INACTIVE, HIRED] |
| **jobStatusGroups** | **String**| A list of position status groups to filter by. | [optional] [enum: ALL, DRAFT_AND_OPEN, Open, Filled, Draft, Deleted, On Hold, Canceled] |
| **searchString** | **String**| A general search criteria by which to find applications. | [optional] |
| **sortBy** | **String**| A specific field to sort the results by. | [optional] [enum: first_name, job_title, rating, phone, status, last_updated, created_date] |
| **sortOrder** | **String**| Order by which to sort results. | [optional] [enum: ASC, DESC] |
| **newSince** | **OffsetDateTime**| Only get applications newer than a given UTC timestamp, for example 2024-01-01 13:00:00 | [optional] |

### Return type

[**ApplicantTrackingListApplicationsResponse**](ApplicantTrackingListApplicationsResponse.md)

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

<a name="listStatuses"></a>
# **listStatuses**
> List&lt;ApplicantTrackingListStatusesResponseInner&gt; listStatuses(companyDomain).execute();

Get Statuses

Get a list of statuses for a company. The owner of the API key used must have access to ATS settings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BambooHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicantTrackingApi;
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
      List<ApplicantTrackingListStatusesResponseInner> result = client
              .applicantTracking
              .listStatuses(companyDomain)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#listStatuses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ApplicantTrackingListStatusesResponseInner>> response = client
              .applicantTracking
              .listStatuses(companyDomain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicantTrackingApi#listStatuses");
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

[**List&lt;ApplicantTrackingListStatusesResponseInner&gt;**](ApplicantTrackingListStatusesResponseInner.md)

### Authorization

[auth](../README.md#auth), [basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | Unauthorized. Invalid API credentials. |  -  |
| **403** | Insufficient user permissions or API access is not turned on. |  -  |


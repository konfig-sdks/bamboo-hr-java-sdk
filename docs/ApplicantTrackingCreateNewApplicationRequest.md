

# ApplicantTrackingCreateNewApplicationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name of the candidate. |  |
|**lastName** | **String** | The last name of the candidate. |  |
|**email** | **String** | The email address of the candidate. |  [optional] |
|**phoneNumber** | **String** | The phone number of the candidate. |  [optional] |
|**source** | **String** | The source of the candidate application, e.g. LinkedIn, Indeed, etc. |  [optional] |
|**jobId** | **Integer** | The id of the job opening for the candidate application. |  |
|**address** | **String** | The street address of the candidate. |  [optional] |
|**city** | **String** | The city of the candidate. |  [optional] |
|**state** | **String** | The state or province of the candidate. Accepts state name, abbreviation, or ISO code. |  [optional] |
|**zip** | **String** | The zip code or postal code of the candidate. |  [optional] |
|**country** | **String** | The country of the candidate. Accepts country name or ISO code. |  [optional] |
|**linkedinUrl** | **String** | The LinkedIn profile url of the candidate. |  [optional] |
|**dateAvailable** | **String** | The available start date of the candidate with the format YYYY-MM-DD. |  [optional] |
|**desiredSalary** | **String** | The desired salary of the candidate. |  [optional] |
|**referredBy** | **String** | The person or entity that referred the candidate. |  [optional] |
|**websiteUrl** | **String** | The personal website, blog, or online portfolio of the candidate. |  [optional] |
|**highestEducation** | [**HighestEducationEnum**](#HighestEducationEnum) | The highest completed education level of the candidate. |  [optional] |
|**collegeName** | **String** | The college or university of the candidate. |  [optional] |
|**references** | **String** | A list of references supplied by the candidate. |  [optional] |
|**resume** | **File** | Resume of the candidate. |  [optional] |
|**coverLetter** | **File** | Cover letter of the candidate. |  [optional] |



## Enum: HighestEducationEnum

| Name | Value |
|---- | -----|
| GED_OR_EQUIVALENT | &quot;GED or Equivalent&quot; |
| HIGH_SCHOOL | &quot;High School&quot; |
| SOME_COLLEGE | &quot;Some College&quot; |
| COLLEGE_ASSOCIATES | &quot;College - Associates&quot; |
| COLLEGE_BACHELOR_OF_ARTS | &quot;College - Bachelor of Arts&quot; |
| COLLEGE_BACHELOR_OF_FINE_ARTS | &quot;College - Bachelor of Fine Arts&quot; |
| COLLEGE_BACHELOR_OF_SCIENCE | &quot;College - Bachelor of Science&quot; |
| COLLEGE_MASTER_OF_ARTS | &quot;College - Master of Arts&quot; |
| COLLEGE_MASTER_OF_FINE_ARTS | &quot;College - Master of Fine Arts&quot; |
| COLLEGE_MASTER_OF_SCIENCE | &quot;College - Master of Science&quot; |
| COLLEGE_MASTER_OF_BUSINESS_ADMINISTRATION | &quot;College - Master of Business Administration&quot; |
| COLLEGE_DOCTORATE | &quot;College - Doctorate&quot; |
| MEDICAL_DOCTOR | &quot;Medical Doctor&quot; |
| OTHER | &quot;Other&quot; |




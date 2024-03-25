

# ApplicantTrackingCreateNewJobOpeningRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**postingTitle** | **String** | The posting title of the job opening. |  |
|**jobStatus** | [**JobStatusEnum**](#JobStatusEnum) | The status of the job opening. |  |
|**hiringLead** | **Integer** | The employee id (from the v1/applicant_tracking/hiring_leads endpoint) of the hiring lead for the job opening. |  |
|**department** | **String** | The department of the job opening. |  [optional] |
|**employmentType** | **String** | The type of employment offered in the job opening, e.g. Full-Time, Part-Time, Contractor, etc. |  |
|**minimumExperience** | [**MinimumExperienceEnum**](#MinimumExperienceEnum) | The minimum experience level that qualifies a candidate for the job opening. |  [optional] |
|**compensation** | **String** | The pay rate or compensation for the job opening. |  [optional] |
|**jobLocation** | **Integer** | The location id (from the v1/applicant_tracking/locations endpoint) of the job opening. Omit this parameter for a remote job location. |  [optional] |
|**jobDescription** | **String** | The long-form text description of the job opening. |  |
|**applicationQuestionResume** | [**ApplicationQuestionResumeEnum**](#ApplicationQuestionResumeEnum) | Whether the job opening application has a standard question for resume (true) or not (false) or if uploading a resume is mandatory (required). |  [optional] |
|**applicationQuestionAddress** | [**ApplicationQuestionAddressEnum**](#ApplicationQuestionAddressEnum) | Whether the job opening application has a standard question for address (true) or not (false) or if entering an address is mandatory (required). |  [optional] |
|**applicationQuestionLinkedinUrl** | [**ApplicationQuestionLinkedinUrlEnum**](#ApplicationQuestionLinkedinUrlEnum) | Whether the job opening application has a standard question for LinkedIn profile url (true) or not (false) or if entering a LinkedIn profile url is mandatory (required). |  [optional] |
|**applicationQuestionDateAvailable** | [**ApplicationQuestionDateAvailableEnum**](#ApplicationQuestionDateAvailableEnum) | Whether the job opening application has a standard question for availability date (true) or not (false) or if entering an availability date is mandatory (required). |  [optional] |
|**applicationQuestionDesiredSalary** | [**ApplicationQuestionDesiredSalaryEnum**](#ApplicationQuestionDesiredSalaryEnum) | Whether the job opening application has a standard question for desired salary (true) or not (false) or if entering a desired salary is mandatory (required). |  [optional] |
|**applicationQuestionCoverLetter** | [**ApplicationQuestionCoverLetterEnum**](#ApplicationQuestionCoverLetterEnum) | Whether the job opening application has a standard question for cover letter (true) or not (false) or if uploading a cover letter is mandatory (required). |  [optional] |
|**applicationQuestionReferredBy** | [**ApplicationQuestionReferredByEnum**](#ApplicationQuestionReferredByEnum) | Whether the job opening application has a standard question for referred by (true) or not (false) or if entering referred by is mandatory (required). |  [optional] |
|**applicationQuestionWebsiteUrl** | [**ApplicationQuestionWebsiteUrlEnum**](#ApplicationQuestionWebsiteUrlEnum) | Whether the job opening application has a standard question for website url (true) or not (false) or if entering a website url is mandatory (required). |  [optional] |
|**applicationQuestionHighestEducation** | [**ApplicationQuestionHighestEducationEnum**](#ApplicationQuestionHighestEducationEnum) | Whether the job opening application has a standard question for highest education (true) or not (false) or if entering highest education is mandatory (required). |  [optional] |
|**applicationQuestionCollege** | [**ApplicationQuestionCollegeEnum**](#ApplicationQuestionCollegeEnum) | Whether the job opening application has a standard question for college (true) or not (false) or if entering a college is mandatory (required). |  [optional] |
|**applicationQuestionReferences** | [**ApplicationQuestionReferencesEnum**](#ApplicationQuestionReferencesEnum) | Whether the job opening application has a standard question for references (true) or not (false) or if entering references is mandatory (required). |  [optional] |
|**internalJobCode** | **String** | The internal job code for the job opening. |  [optional] |



## Enum: JobStatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;Draft&quot; |
| OPEN | &quot;Open&quot; |
| ON_HOLD | &quot;On Hold&quot; |
| FILLED | &quot;Filled&quot; |
| CANCELED | &quot;Canceled&quot; |



## Enum: MinimumExperienceEnum

| Name | Value |
|---- | -----|
| ENTRY_LEVEL | &quot;Entry-level&quot; |
| MID_LEVEL | &quot;Mid-level&quot; |
| EXPERIENCED | &quot;Experienced&quot; |
| MANAGER_SUPERVISOR | &quot;Manager/Supervisor&quot; |
| SENIOR_MANAGER_SUPERVISOR_ | &quot;Senior Manager/Supervisor&#39;&quot; |
| EXECUTIVE | &quot;Executive&quot; |
| SENIOR_EXECUTIVE | &quot;Senior Executive&quot; |



## Enum: ApplicationQuestionResumeEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |



## Enum: ApplicationQuestionAddressEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |



## Enum: ApplicationQuestionLinkedinUrlEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |



## Enum: ApplicationQuestionDateAvailableEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |



## Enum: ApplicationQuestionDesiredSalaryEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |



## Enum: ApplicationQuestionCoverLetterEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |



## Enum: ApplicationQuestionReferredByEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |



## Enum: ApplicationQuestionWebsiteUrlEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |



## Enum: ApplicationQuestionHighestEducationEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |



## Enum: ApplicationQuestionCollegeEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |



## Enum: ApplicationQuestionReferencesEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| REQUIRED | &quot;Required&quot; |




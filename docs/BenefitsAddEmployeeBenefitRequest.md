

# BenefitsAddEmployeeBenefitRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **Integer** | Employee ID |  |
|**companyBenefitId** | **Integer** | Company benefit ID |  |
|**companyBenefitName** | **String** | Company benefit name |  |
|**coverageLevel** | **String** | Coverage level |  [optional] |
|**deductionEndDate** | **LocalDate** | Deduction end date |  [optional] |
|**deductionStartDate** | **LocalDate** | Deduction start date |  [optional] |
|**enrollmentStatus** | [**EnrollmentStatusEnum**](#EnrollmentStatusEnum) | Enrollment status |  |
|**effectiveDate** | **LocalDate** | Enrollment status effective date |  |
|**currencyCode** | **String** | Currency code |  [optional] |
|**employeeAmount** | **Double** | Employee amount |  [optional] |
|**employeeAmountType** | **String** | Employee amount type |  [optional] |
|**employeePercentBasedOn** | **String** | Employee percent based on |  [optional] |
|**employeeCapAmount** | **Double** | Employee cap amount |  [optional] |
|**employeeCapAmountType** | **String** | Employee cap amount type |  [optional] |
|**employeeAnnualMax** | **Double** | Employee annual max |  [optional] |
|**companyAmount** | **Double** | Company amount |  [optional] |
|**companyAmountType** | **String** | Company amount type |  [optional] |
|**companyPercentBasedOn** | **String** | Company percent based on |  [optional] |
|**companyCapAmount** | **Double** | Company cap amount |  [optional] |
|**companyCapAmountType** | **String** | Company cap amount type |  [optional] |
|**companyAnnualMax** | **Double** | Company annual max |  [optional] |
|**benefitPlanCoverageId** | **Double** | Benefit Plan Coverage ID |  [optional] |



## Enum: EnrollmentStatusEnum

| Name | Value |
|---- | -----|
| ELIGIBLE | &quot;Eligible&quot; |
| ENROLLED | &quot;Enrolled&quot; |
| WAIVED | &quot;Waived&quot; |
| WITHDRAWN | &quot;Withdrawn&quot; |
| TERMINATED | &quot;Terminated&quot; |
| INELIGIBLE | &quot;Ineligible&quot; |




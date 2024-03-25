

# BenefitsAddNewCompanyBenefitRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description |  [optional] |
|**companyBenefitName** | **String** | Name |  [optional] |
|**benefitVendorId** | **String** | Benefit vendor ID |  [optional] |
|**benefitType** | [**BenefitTypeEnum**](#BenefitTypeEnum) | Benefit type |  |
|**deductionTypeId** | **String** | Deduction type ID |  |
|**startDate** | **LocalDate** | Benefit start date |  |
|**endDate** | **LocalDate** | Benefit end date |  |
|**planUrl** | **String** | Plan url |  [optional] |
|**ssoLoginUrl** | **String** | SSO login url |  [optional] |
|**ssoLoginUrlLinkText** | **String** | SSO login link text |  [optional] |
|**safeHarbor** | **Boolean** | Is a safe harbor |  [optional] |
|**meetAcaMin** | **Boolean** | Meets ACA minimum requirements |  |
|**reimbursementAmount** | **Double** | Reimbursement amount |  [optional] |
|**reimbursementFrequency** | [**ReimbursementFrequencyEnum**](#ReimbursementFrequencyEnum) | Reimbursement frequency |  [optional] |
|**reimbursementCurrencyCode** | **String** | Reimbursement currency code |  [optional] |
|**minEssentialCoverage** | **Boolean** | Provides minimum essential coverage |  |



## Enum: BenefitTypeEnum

| Name | Value |
|---- | -----|
| HEALTH | &quot;health&quot; |
| DENTAL | &quot;dental&quot; |
| VISION | &quot;vision&quot; |
| RETIREMENT | &quot;retirement&quot; |
| HSA | &quot;hsa&quot; |
| FLEX | &quot;flex&quot; |
| LIFE | &quot;life&quot; |
| DISABILITY | &quot;disability&quot; |
| REIMBURSEMENT | &quot;reimbursement&quot; |
| SUPPLEMENTAL | &quot;supplemental&quot; |
| OTHER | &quot;other&quot; |



## Enum: ReimbursementFrequencyEnum

| Name | Value |
|---- | -----|
| PAY_PERIOD | &quot;pay period&quot; |
| MONTH | &quot;month&quot; |
| QUARTER | &quot;quarter&quot; |
| YEAR | &quot;year&quot; |
| ONE_TIME | &quot;one time&quot; |
| NULL | &quot;null&quot; |




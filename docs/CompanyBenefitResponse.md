

# CompanyBenefitResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description |  [optional] |
|**name** | **String** | Name |  [optional] |
|**benefitVendorId** | **String** | Benefit vendor ID |  [optional] |
|**benefitType** | [**BenefitTypeEnum**](#BenefitTypeEnum) | Benefit type |  [optional] |
|**deductionTypeId** | **Integer** | Deduction type ID |  [optional] |
|**startDate** | **LocalDate** | Benefit start date |  [optional] |
|**endDate** | **LocalDate** | Benefit end date |  [optional] |
|**planUrl** | **String** | Plan url |  [optional] |
|**ssoLoginUrl** | **String** | SSO login url |  [optional] |
|**ssoLoginUrlLinkText** | **String** | SSO login link text |  [optional] |
|**safeHarbor** | [**SafeHarborEnum**](#SafeHarborEnum) | Is a safe harbor |  [optional] |
|**meetAcaMin** | [**MeetAcaMinEnum**](#MeetAcaMinEnum) | Meets ACA minimum requirements |  [optional] |
|**reimbursementAmount** | **Double** | Reimbursement amount |  [optional] |
|**reimbursementFrequency** | [**ReimbursementFrequencyEnum**](#ReimbursementFrequencyEnum) | Reimbursement frequency |  [optional] |
|**minEssentialCoverage** | [**MinEssentialCoverageEnum**](#MinEssentialCoverageEnum) | Provides minimum essential coverage |  [optional] |



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



## Enum: SafeHarborEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| NULL | &quot;null&quot; |



## Enum: MeetAcaMinEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| NULL | &quot;null&quot; |



## Enum: ReimbursementFrequencyEnum

| Name | Value |
|---- | -----|
| PAY_PERIOD | &quot;pay period&quot; |
| MONTH | &quot;month&quot; |
| QUARTER | &quot;quarter&quot; |
| YEAR | &quot;year&quot; |
| ONE_TIME | &quot;one time&quot; |
| NULL | &quot;null&quot; |



## Enum: MinEssentialCoverageEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |
| NULL | &quot;null&quot; |




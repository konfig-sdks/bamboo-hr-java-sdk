

# EmployeePaystub


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** |  |  [optional] |
|**externalRecordId** | **String** |  |  [optional] |
|**payPeriodFrom** | **String** |  |  [optional] |
|**payPeriodTo** | **String** |  |  [optional] |
|**payDate** | **String** |  |  [optional] |
|**payorName** | **String** |  |  [optional] |
|**payorAdd1** | **String** |  |  [optional] |
|**payorAdd2** | **String** |  |  [optional] |
|**payorCity** | **String** |  |  [optional] |
|**payorState** | **String** |  |  [optional] |
|**payorZip** | **String** |  |  [optional] |
|**payeeName** | **String** |  |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**net** | **String** |  |  [optional] |
|**gross** | **String** |  |  [optional] |
|**totalTaxes** | **String** |  |  [optional] |
|**totalDeductions** | **String** |  |  [optional] |
|**ytdNet** | **String** |  |  [optional] |
|**ytdGross** | **String** |  |  [optional] |
|**ytdTaxes** | **String** |  |  [optional] |
|**ytdDeductions** | **String** |  |  [optional] |
|**fedWitholding** | **String** |  |  [optional] |
|**federalType** | [**FederalTypeEnum**](#FederalTypeEnum) | must be 2020_w4, pre_2020_w4, or null |  [optional] |
|**twoJobs** | **String** | boolean value |  [optional] |
|**dependentsAmount** | **String** | float value |  [optional] |
|**otherIncome** | **String** | float value |  [optional] |
|**deductionsAmount** | **String** | float value |  [optional] |
|**stateWithholding** | **String** |  |  [optional] |
|**localWithholding** | **String** |  |  [optional] |
|**additionalFed** | **String** |  |  [optional] |
|**additionalState** | **String** |  |  [optional] |
|**additionalLocal** | **String** |  |  [optional] |
|**taxState** | **String** |  |  [optional] |
|**taxLocal** | **String** |  |  [optional] |
|**wages** | [**List&lt;EmployeePaystubWagesInner&gt;**](EmployeePaystubWagesInner.md) |  |  [optional] |
|**taxes** | [**List&lt;EmployeePaystubTaxesInner&gt;**](EmployeePaystubTaxesInner.md) |  |  [optional] |
|**deductions** | [**List&lt;EmployeePaystubDeductionsInner&gt;**](EmployeePaystubDeductionsInner.md) |  |  [optional] |
|**deposits** | [**List&lt;EmployeePaystubDepositsInner&gt;**](EmployeePaystubDepositsInner.md) |  |  [optional] |



## Enum: FederalTypeEnum

| Name | Value |
|---- | -----|
| _2020_W4 | &quot;2020_w4&quot; |
| PRE_2020_W4 | &quot;pre_2020_w4&quot; |




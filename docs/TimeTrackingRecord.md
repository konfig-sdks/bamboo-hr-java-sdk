

# TimeTrackingRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeTrackingId** | **String** | A unique identifier for the record. Use this ID to adjust or delete these hours. It can be any ID you use to track the record up to 36 characters in length. (i.e. UUID). |  |
|**employeeId** | **Integer** | The ID of the employee. |  |
|**divisionId** | **Integer** | [Optional] The ID of the division for the employee. |  [optional] |
|**departmentId** | **Integer** | [Optional] The ID of the department for the employee. |  [optional] |
|**jobTitleId** | **Integer** | [Optional] The ID of the job title for the employee. |  [optional] |
|**payCode** | **String** | [Optional] Only necessary if the payroll provider requires a pay code |  [optional] |
|**dateHoursWorked** | **String** | The date the hours were worked. Please use the ISO-8601 date format YYYY-MM-DD. |  |
|**payRate** | **Float** | [Optional] The rate of pay. e.g. $15.00/hour should use 15.00 here. Only necessary if the payroll provider requires a pay rate. |  [optional] |
|**rateType** | **String** | The type of hours - regular or overtime. Please use either \&quot;REG\&quot; or \&quot;OT\&quot; here. |  |
|**hoursWorked** | **Float** | The number of hours worked. |  |
|**jobCode** | **Integer** | [Optional] A job code. |  [optional] |
|**jobData** | **String** | [Optional] A list of up to four 20 characters max job numbers in comma delimited format with no spaces. |  [optional] |




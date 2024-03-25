

# TimesheetEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | ID of the entry. |  [optional] |
|**employeeId** | **Integer** | ID of the employee associated with the entry. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type of the entry. |  [optional] |
|**start** | **String** | Timestamp, in UTC, of when the employee clocked in. ISO 8601 format. Property can be null. |  [optional] |
|**end** | **String** | Timestamp, in UTC, of when the employee clocked out. ISO 8601 format. Property can be null. |  [optional] |
|**timezone** | **String** | The timezone the clock entry was recorded in. Property can be null. |  [optional] |
|**hours** | **Double** | The number of hours for the entry. This value has a maximum scale of 4. Property can be null. |  [optional] |
|**note** | **String** | The note associated with the entry. Property can be null. |  [optional] |
|**projectInfo** | [**TimeTrackingProjectInfo**](TimeTrackingProjectInfo.md) |  |  [optional] |
|**approved** | **Boolean** | Approval status of the timesheet for the entry. |  [optional] |
|**approvedAt** | **String** | Timestamp, in UTC, of when the timesheet for the entry was approved. Property can be null. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;hour&quot; |
| CLOCK | &quot;clock&quot; |




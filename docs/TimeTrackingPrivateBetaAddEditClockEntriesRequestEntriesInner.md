

# TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **Integer** | Unique identifier for the employee. |  |
|**date** | **String** | Date for the timesheet entry. Must be in YYYY-MM-DD format. |  |
|**start** | **String** | Start time for the timesheet entry. Local time for the employee. Must be in hh:mm 24 hour format. |  |
|**end** | **String** | End time for the timesheet entry. Local time for the employee. Must be in hh:mm 24 hour format. |  |
|**id** | **Integer** | The ID of an existing timesheet entry. This can be specified to edit an existing entry. |  [optional] |
|**projectId** | **Integer** | The ID of the project to associate with the timesheet entry. |  [optional] |
|**taskId** | **Integer** | The ID of the task to associate with the timesheet entry. |  [optional] |
|**note** | **String** | Optional note to associate with the timesheet entry. |  [optional] |






# TimeTrackingProjectWithTasksAndEmployeeIds


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | ID of the project. |  [optional] |
|**name** | **String** | Name of the project. |  [optional] |
|**tasks** | [**List&lt;TimeTrackingTask&gt;**](TimeTrackingTask.md) | A list of time tracking tasks for the project. |  [optional] |
|**employeeIds** | **List&lt;Integer&gt;** | A list of employee IDs that can log time for this project. If not present, all employees can log time for the project. |  [optional] |




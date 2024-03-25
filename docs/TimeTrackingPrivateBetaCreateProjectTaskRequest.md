

# TimeTrackingPrivateBetaCreateProjectTaskRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the project. |  |
|**billable** | **Boolean** | Indicates if the project is billable. Defaults to true if not provided. |  [optional] |
|**allowAllEmployees** | **Boolean** | Indicates if all employees can log time for this project. Defaults to true if not provided. |  [optional] |
|**employeeIds** | **List&lt;Integer&gt;** | A list of employee IDs that can log time for this project. |  [optional] |
|**hasTasks** | **Boolean** | Indicates if the project has tasks. Defaults to false if not provided. |  [optional] |
|**tasks** | [**List&lt;TimeTrackingPrivateBetaCreateProjectTaskRequestTasksInner&gt;**](TimeTrackingPrivateBetaCreateProjectTaskRequestTasksInner.md) | List of tasks to create and associate with the project. |  [optional] |




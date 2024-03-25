

# GoalsGetAllAggregateInfo200Response1GoalsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of the goal. |  [optional] |
|**description** | **String** | A description of the goal. |  [optional] |
|**id** | **Integer** | The id of the goal. |  [optional] |
|**percentComplete** | **Integer** | A percentage (1-100) that denotes how complete the goal is. |  [optional] |
|**alignsWithOptionId** | **Integer** |  |  [optional] |
|**sharedWithEmployeeIds** | **List&lt;Integer&gt;** | Ids of the employees that have access to this goal. |  [optional] |
|**dueDate** | **LocalDate** | The due date of the goal. |  [optional] |
|**completionDate** | **LocalDate** | The date the goal was completed. |  [optional] |
|**status** | **String** | The status of the goal. |  [optional] |
|**milestones** | [**List&lt;GoalsGetAllAggregateInfo200Response1GoalsInnerMilestonesInner&gt;**](GoalsGetAllAggregateInfo200Response1GoalsInnerMilestonesInner.md) | All milestones for the individual goal. This array will not exist if milestones are not selected for this goal. |  [optional] |
|**actions** | [**GoalsGetAllAggregateInfo200Response1GoalsInnerActions**](GoalsGetAllAggregateInfo200Response1GoalsInnerActions.md) |  |  [optional] |




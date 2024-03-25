

# UpdateGoalV11


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | [Required] The goal title. |  |
|**description** | **String** | [Optional] The goal description. |  [optional] |
|**alignsWithOptionId** | **String** | [Optional] The option ID that aligns with this goal. |  [optional] |
|**sharedWithEmployeeIds** | **List&lt;Integer&gt;** | [Required] Employee IDs of employees with whom the goal is shared. All goal owners are considered \&quot;shared with\&quot;. This must include the employee for whom the goal is created. |  |
|**dueDate** | **String** | [Required] The goal due date in YYYY-mm-dd format. |  |
|**milestonesEnabled** | **Boolean** | [Optional] A flag indicating whether or not milestones are enabled for this goal. Setting this flag to false will delete all existing milestones for this goal. |  [optional] |
|**deletedMilestoneIds** | **List&lt;Integer&gt;** | [Optional] Ids of all the milestones to be deleted with the update. |  [optional] |
|**milestones** | [**List&lt;Milestone&gt;**](Milestone.md) | [Optional] All milestones to be added to the goal with this update. |  [optional] |




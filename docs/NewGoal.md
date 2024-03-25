

# NewGoal


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | [Required] The goal title. |  |
|**description** | **String** | [Optional] The goal description. |  [optional] |
|**percentComplete** | **Integer** | [Optional] The goal completion percentage (0 - 100). If completionDate is set, this value must be 100. |  [optional] |
|**alignsWithOptionId** | **String** | [Optional] The option ID that aligns with this goal. |  [optional] |
|**sharedWithEmployeeIds** | **List&lt;Integer&gt;** | [Required] Employee IDs of employees with whom the goal is shared. All goal owners are considered \&quot;shared with\&quot;. This must include the employee for whom the goal is created. |  |
|**dueDate** | **String** | [Required] The goal due date in YYYY-mm-dd format. |  |
|**completionDate** | **Float** | [Optional] The date the goal was completed. If date is set, and no milestones are contained within this goal, percentComplete must be set to 100. If this goal does contain milestones, completion date cannot be set. |  [optional] |
|**milestones** | [**List&lt;Milestone&gt;**](Milestone.md) | [Optional] Milestones for the goal. |  [optional] |




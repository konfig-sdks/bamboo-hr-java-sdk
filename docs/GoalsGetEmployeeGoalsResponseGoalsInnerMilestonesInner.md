

# GoalsGetEmployeeGoalsResponseGoalsInnerMilestonesInner

An individual milestone.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the milestone. |  [optional] |
|**id** | **Integer** | The id of the milestone. |  [optional] |
|**employeeGoalId** | **Integer** | The id of the goal which encompasses this milestone. |  [optional] |
|**currentValue** | **Double** | The current value for a numeric milestone. This number will be rounded to the nearest hundreds. On the creation of a numeric milestone this value will automatically be set to the start value of the milestone. If the milestone is a simple checkbox milestone, this value will always be null. |  [optional] |
|**startValue** | **Double** | The starting value for a numeric milestone. This number will be rounded to the nearest hundreds. If the milestone is a simple checkbox milestone, this value will always be null. |  [optional] |
|**endValue** | **Double** | The end goal for a numeric milestone. This number will be rounded to the nearest hundreds. If the milestone is a simple checkbox milestone, this value will always be null. |  [optional] |
|**completedDateTime** | **String** | The date and time in which the goal has been completed. If the goal is not completed the value will be null. |  [optional] |
|**lastUpdateDateDateTime** | **String** | The date and time in which the goal was last updated. |  [optional] |
|**lastUpdateUserId** | **Integer** | The ID of the user who last updated this milestone. |  [optional] |




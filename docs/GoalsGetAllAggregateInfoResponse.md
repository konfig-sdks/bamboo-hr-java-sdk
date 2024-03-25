

# GoalsGetAllAggregateInfoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canAlign** | **Boolean** | The selected user can align goals with other users. |  [optional] |
|**canCreateGoals** | **Boolean** | The selected user can create a goal. |  [optional] |
|**filters** | [**List&lt;GoalsGetAllAggregateInfoResponseFiltersInner&gt;**](GoalsGetAllAggregateInfoResponseFiltersInner.md) | All the goals of the user seperated by filter. |  [optional] |
|**selectedFilter** | **String** | The id of the current selected filter. |  [optional] |
|**goals** | [**List&lt;GoalsGetAllAggregateInfoResponseGoalsInner&gt;**](GoalsGetAllAggregateInfoResponseGoalsInner.md) | All goals in selected filter. |  [optional] |
|**persons** | [**List&lt;GoalsGetAllAggregateInfoResponsePersonsInner&gt;**](GoalsGetAllAggregateInfoResponsePersonsInner.md) | A list of people with access to the goal. |  [optional] |
|**comments** | [**List&lt;GoalsGetAllAggregateInfoResponseCommentsInner&gt;**](GoalsGetAllAggregateInfoResponseCommentsInner.md) | A list of how many comments belong to each goal. |  [optional] |




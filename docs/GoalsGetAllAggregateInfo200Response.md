

# GoalsGetAllAggregateInfo200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canAlign** | **Boolean** | The selected user can align goals with other users. |  [optional] |
|**canCreateGoals** | **Boolean** | The selected user can create a goal. |  [optional] |
|**filters** | [**List&lt;GoalsGetAllAggregateInfo200ResponseFiltersInner&gt;**](GoalsGetAllAggregateInfo200ResponseFiltersInner.md) | All the goals of the user seperated by filter. |  [optional] |
|**selectedFilter** | **String** | The id of the current selected filter. |  [optional] |
|**goals** | [**List&lt;GoalsGetAllAggregateInfo200ResponseGoalsInner&gt;**](GoalsGetAllAggregateInfo200ResponseGoalsInner.md) | All goals in selected filter. |  [optional] |
|**persons** | [**List&lt;GoalsGetAllAggregateInfo200ResponsePersonsInner&gt;**](GoalsGetAllAggregateInfo200ResponsePersonsInner.md) | A list of people with access to the goal. |  [optional] |
|**comments** | [**List&lt;GoalsGetAllAggregateInfo200ResponseCommentsInner&gt;**](GoalsGetAllAggregateInfo200ResponseCommentsInner.md) | A list of how many comments belong to each goal. |  [optional] |




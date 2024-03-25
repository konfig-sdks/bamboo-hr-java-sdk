

# GoalsGetAllAggregateInfo200Response1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canAlign** | **Boolean** | The selected user can align goals with other users. |  [optional] |
|**canCreateGoals** | **Boolean** | The selected user can create a goal. |  [optional] |
|**filters** | [**List&lt;GoalsGetAllAggregateInfo200Response1FiltersInner&gt;**](GoalsGetAllAggregateInfo200Response1FiltersInner.md) | All the goals of the user seperated by filter. |  [optional] |
|**selectedFilter** | **String** | The id of the current selected filter. |  [optional] |
|**goals** | [**List&lt;GoalsGetAllAggregateInfo200Response1GoalsInner&gt;**](GoalsGetAllAggregateInfo200Response1GoalsInner.md) | All goals in selected filter. |  [optional] |
|**persons** | [**List&lt;GoalsGetAllAggregateInfo200Response1PersonsInner&gt;**](GoalsGetAllAggregateInfo200Response1PersonsInner.md) | A list of people with access to the goal. |  [optional] |
|**comments** | [**List&lt;GoalsGetAllAggregateInfo200Response1CommentsInner&gt;**](GoalsGetAllAggregateInfo200Response1CommentsInner.md) | A list of how many comments belong to each goal. |  [optional] |






# WebHookLogResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookId** | **Integer** | The id of the webhook. |  [optional] |
|**url** | **String** | The URL of the webhook. |  [optional] |
|**lastAttempted** | **String** | timestamp of last time the webhook was sent |  [optional] |
|**lastSuccess** | **String** | timestamp of last time the webhook was sent successfully |  [optional] |
|**failureCount** | **Integer** | Count of how many times this call failed since last success |  [optional] |
|**status** | **Integer** | Status code of last request |  [optional] |
|**employeeIds** | **List&lt;Integer&gt;** | A list of employee ids that were changed. |  [optional] |




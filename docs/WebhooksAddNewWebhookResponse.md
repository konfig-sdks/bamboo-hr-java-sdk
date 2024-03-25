

# WebhooksAddNewWebhookResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The id of the webhook. |  [optional] |
|**name** | **String** | The name of the webhook. |  [optional] |
|**created** | **String** | timestamp of creation |  [optional] |
|**lastSent** | **String** | timestamp of last webhook sent |  [optional] |
|**monitorFields** | **List&lt;String&gt;** | A list of fields to monitor. |  [optional] |
|**postFields** | **Map&lt;String, String&gt;** | A list of fields to post to the webhook url. Field ID or alias: external name |  [optional] |
|**url** | **String** | The url the webhook should send data to. |  [optional] |
|**format** | **String** | The format the webhook should use (json, form-encoded). |  [optional] |
|**frequency** | [**WebhooksAddNewWebhookResponseFrequency**](WebhooksAddNewWebhookResponseFrequency.md) |  |  [optional] |
|**limit** | [**WebhooksAddNewWebhookResponseLimit**](WebhooksAddNewWebhookResponseLimit.md) |  |  [optional] |
|**privateKey** | **String** | The private key which can be used to verify that the webhook is secure (uses HMAC-SHA256) |  [optional] |
|**includeCompanyDomain** | **Boolean** | If set to true, the company domain will be added to the header. |  [optional] |




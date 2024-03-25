

# NewWebHook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the webhook. |  |
|**monitorFields** | **List&lt;String&gt;** | A list of fields to monitor. |  |
|**postFields** | **Map&lt;String, String&gt;** | A list of fields to post to the webhook url. Field ID or alias: external name |  |
|**url** | **String** | The url the webhook should send data to (must begin with https://). |  |
|**format** | [**FormatEnum**](#FormatEnum) | The format the webhook should use (json - default, form-encoded). |  [optional] |
|**frequency** | [**NewWebHookFrequency**](NewWebHookFrequency.md) |  |  [optional] |
|**limit** | [**NewWebHookLimit**](NewWebHookLimit.md) |  |  [optional] |
|**includeCompanyDomain** | **Boolean** | If set to true, the company domain will be added to the header. |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| JSON | &quot;json&quot; |
| FORM_ENCODED | &quot;form-encoded&quot; |




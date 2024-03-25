

# TrainingType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description for the training. |  [optional] |
|**id** | **Integer** | The ID of the training |  [optional] |
|**name** | **String** | Name of the training type. |  [optional] |
|**renewable** | **Boolean** | If true, training will be renewed based off of frequency. |  [optional] |
|**frequency** | **Integer** | The frequency is the (optional) amount of months between renewing trainings. Not valid if training are not renewable. |  [optional] |
|**dueFromHireDate** | **Integer** | Number of days before the training is due for new hires. Not valid if training is not required. |  [optional] |
|**required** | **Integer** | Is this a required training? |  [optional] |
|**category** | [**TrainingCategory**](TrainingCategory.md) |  |  [optional] |
|**linkUrl** | **String** | Optional URL that can be included with a training. |  [optional] |
|**allowEmployeesToMarkComplete** | **Boolean** | Allows all employees who can view the training to be able to mark it complete. |  [optional] |




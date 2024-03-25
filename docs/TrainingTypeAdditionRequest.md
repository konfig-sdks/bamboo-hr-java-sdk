

# TrainingTypeAdditionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description for the training. |  [optional] |
|**name** | **String** | Name of the new training type. |  |
|**frequency** | **Integer** | The frequency is the (optional) amount of months between renewing trainings. Not valid if training are not renewable. |  [optional] |
|**renewable** | **Boolean** | Renewable is optional but if you are setting it to true you must pass a frequency which is the months between renewals. |  [optional] |
|**category** | [**TrainingTypeAdditionRequestCategory**](TrainingTypeAdditionRequestCategory.md) |  |  [optional] |
|**required** | **Boolean** | Is this a required training? |  |
|**dueFromHireDate** | **Integer** | Number of days before the training is due for new hires. Not valid unless training is required. |  [optional] |
|**linkUrl** | **String** | Optional URL that can be included with a training. |  [optional] |
|**allowEmployeesToMarkComplete** | **Boolean** | Allows all employees who can view the training to be able to mark it complete. |  [optional] |



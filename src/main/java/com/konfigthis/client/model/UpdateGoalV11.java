/*
 * BambooHR API
 * This is the majority of the API requests including some that are not documented.  http://www.bamboohr.com/api/documentation/
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Milestone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * UpdateGoalV11
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UpdateGoalV11 {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ALIGNS_WITH_OPTION_ID = "alignsWithOptionId";
  @SerializedName(SERIALIZED_NAME_ALIGNS_WITH_OPTION_ID)
  private String alignsWithOptionId;

  public static final String SERIALIZED_NAME_SHARED_WITH_EMPLOYEE_IDS = "sharedWithEmployeeIds";
  @SerializedName(SERIALIZED_NAME_SHARED_WITH_EMPLOYEE_IDS)
  private List<Integer> sharedWithEmployeeIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private String dueDate;

  public static final String SERIALIZED_NAME_MILESTONES_ENABLED = "milestonesEnabled";
  @SerializedName(SERIALIZED_NAME_MILESTONES_ENABLED)
  private Boolean milestonesEnabled;

  public static final String SERIALIZED_NAME_DELETED_MILESTONE_IDS = "deletedMilestoneIds";
  @SerializedName(SERIALIZED_NAME_DELETED_MILESTONE_IDS)
  private List<Integer> deletedMilestoneIds = null;

  public static final String SERIALIZED_NAME_MILESTONES = "milestones";
  @SerializedName(SERIALIZED_NAME_MILESTONES)
  private List<Milestone> milestones = null;

  public UpdateGoalV11() {
  }

  public UpdateGoalV11 title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * [Required] The goal title.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "[Required] The goal title.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public UpdateGoalV11 description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * [Optional] The goal description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Optional] The goal description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public UpdateGoalV11 alignsWithOptionId(String alignsWithOptionId) {
    
    
    
    
    this.alignsWithOptionId = alignsWithOptionId;
    return this;
  }

   /**
   * [Optional] The option ID that aligns with this goal.
   * @return alignsWithOptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Optional] The option ID that aligns with this goal.")

  public String getAlignsWithOptionId() {
    return alignsWithOptionId;
  }


  public void setAlignsWithOptionId(String alignsWithOptionId) {
    
    
    
    this.alignsWithOptionId = alignsWithOptionId;
  }


  public UpdateGoalV11 sharedWithEmployeeIds(List<Integer> sharedWithEmployeeIds) {
    
    
    
    
    this.sharedWithEmployeeIds = sharedWithEmployeeIds;
    return this;
  }

  public UpdateGoalV11 addSharedWithEmployeeIdsItem(Integer sharedWithEmployeeIdsItem) {
    this.sharedWithEmployeeIds.add(sharedWithEmployeeIdsItem);
    return this;
  }

   /**
   * [Required] Employee IDs of employees with whom the goal is shared. All goal owners are considered \&quot;shared with\&quot;. This must include the employee for whom the goal is created.
   * @return sharedWithEmployeeIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "[Required] Employee IDs of employees with whom the goal is shared. All goal owners are considered \"shared with\". This must include the employee for whom the goal is created.")

  public List<Integer> getSharedWithEmployeeIds() {
    return sharedWithEmployeeIds;
  }


  public void setSharedWithEmployeeIds(List<Integer> sharedWithEmployeeIds) {
    
    
    
    this.sharedWithEmployeeIds = sharedWithEmployeeIds;
  }


  public UpdateGoalV11 dueDate(String dueDate) {
    
    
    
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * [Required] The goal due date in YYYY-mm-dd format.
   * @return dueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "[Required] The goal due date in YYYY-mm-dd format.")

  public String getDueDate() {
    return dueDate;
  }


  public void setDueDate(String dueDate) {
    
    
    
    this.dueDate = dueDate;
  }


  public UpdateGoalV11 milestonesEnabled(Boolean milestonesEnabled) {
    
    
    
    
    this.milestonesEnabled = milestonesEnabled;
    return this;
  }

   /**
   * [Optional] A flag indicating whether or not milestones are enabled for this goal. Setting this flag to false will delete all existing milestones for this goal.
   * @return milestonesEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Optional] A flag indicating whether or not milestones are enabled for this goal. Setting this flag to false will delete all existing milestones for this goal.")

  public Boolean getMilestonesEnabled() {
    return milestonesEnabled;
  }


  public void setMilestonesEnabled(Boolean milestonesEnabled) {
    
    
    
    this.milestonesEnabled = milestonesEnabled;
  }


  public UpdateGoalV11 deletedMilestoneIds(List<Integer> deletedMilestoneIds) {
    
    
    
    
    this.deletedMilestoneIds = deletedMilestoneIds;
    return this;
  }

  public UpdateGoalV11 addDeletedMilestoneIdsItem(Integer deletedMilestoneIdsItem) {
    if (this.deletedMilestoneIds == null) {
      this.deletedMilestoneIds = new ArrayList<>();
    }
    this.deletedMilestoneIds.add(deletedMilestoneIdsItem);
    return this;
  }

   /**
   * [Optional] Ids of all the milestones to be deleted with the update.
   * @return deletedMilestoneIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Optional] Ids of all the milestones to be deleted with the update.")

  public List<Integer> getDeletedMilestoneIds() {
    return deletedMilestoneIds;
  }


  public void setDeletedMilestoneIds(List<Integer> deletedMilestoneIds) {
    
    
    
    this.deletedMilestoneIds = deletedMilestoneIds;
  }


  public UpdateGoalV11 milestones(List<Milestone> milestones) {
    
    
    
    
    this.milestones = milestones;
    return this;
  }

  public UpdateGoalV11 addMilestonesItem(Milestone milestonesItem) {
    if (this.milestones == null) {
      this.milestones = new ArrayList<>();
    }
    this.milestones.add(milestonesItem);
    return this;
  }

   /**
   * [Optional] All milestones to be added to the goal with this update.
   * @return milestones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[Optional] All milestones to be added to the goal with this update.")

  public List<Milestone> getMilestones() {
    return milestones;
  }


  public void setMilestones(List<Milestone> milestones) {
    
    
    
    this.milestones = milestones;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UpdateGoalV11 instance itself
   */
  public UpdateGoalV11 putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGoalV11 updateGoalV11 = (UpdateGoalV11) o;
    return Objects.equals(this.title, updateGoalV11.title) &&
        Objects.equals(this.description, updateGoalV11.description) &&
        Objects.equals(this.alignsWithOptionId, updateGoalV11.alignsWithOptionId) &&
        Objects.equals(this.sharedWithEmployeeIds, updateGoalV11.sharedWithEmployeeIds) &&
        Objects.equals(this.dueDate, updateGoalV11.dueDate) &&
        Objects.equals(this.milestonesEnabled, updateGoalV11.milestonesEnabled) &&
        Objects.equals(this.deletedMilestoneIds, updateGoalV11.deletedMilestoneIds) &&
        Objects.equals(this.milestones, updateGoalV11.milestones)&&
        Objects.equals(this.additionalProperties, updateGoalV11.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, alignsWithOptionId, sharedWithEmployeeIds, dueDate, milestonesEnabled, deletedMilestoneIds, milestones, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGoalV11 {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    alignsWithOptionId: ").append(toIndentedString(alignsWithOptionId)).append("\n");
    sb.append("    sharedWithEmployeeIds: ").append(toIndentedString(sharedWithEmployeeIds)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    milestonesEnabled: ").append(toIndentedString(milestonesEnabled)).append("\n");
    sb.append("    deletedMilestoneIds: ").append(toIndentedString(deletedMilestoneIds)).append("\n");
    sb.append("    milestones: ").append(toIndentedString(milestones)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("alignsWithOptionId");
    openapiFields.add("sharedWithEmployeeIds");
    openapiFields.add("dueDate");
    openapiFields.add("milestonesEnabled");
    openapiFields.add("deletedMilestoneIds");
    openapiFields.add("milestones");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("sharedWithEmployeeIds");
    openapiRequiredFields.add("dueDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateGoalV11
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateGoalV11.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGoalV11 is not found in the empty JSON string", UpdateGoalV11.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateGoalV11.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("alignsWithOptionId") != null && !jsonObj.get("alignsWithOptionId").isJsonNull()) && !jsonObj.get("alignsWithOptionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alignsWithOptionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alignsWithOptionId").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("sharedWithEmployeeIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("sharedWithEmployeeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedWithEmployeeIds` to be an array in the JSON string but got `%s`", jsonObj.get("sharedWithEmployeeIds").toString()));
      }
      if (!jsonObj.get("dueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dueDate").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("deletedMilestoneIds") != null && !jsonObj.get("deletedMilestoneIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deletedMilestoneIds` to be an array in the JSON string but got `%s`", jsonObj.get("deletedMilestoneIds").toString()));
      }
      if (jsonObj.get("milestones") != null && !jsonObj.get("milestones").isJsonNull()) {
        JsonArray jsonArraymilestones = jsonObj.getAsJsonArray("milestones");
        if (jsonArraymilestones != null) {
          // ensure the json data is an array
          if (!jsonObj.get("milestones").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `milestones` to be an array in the JSON string but got `%s`", jsonObj.get("milestones").toString()));
          }

          // validate the optional field `milestones` (array)
          for (int i = 0; i < jsonArraymilestones.size(); i++) {
            Milestone.validateJsonObject(jsonArraymilestones.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGoalV11.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGoalV11' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGoalV11> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGoalV11.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGoalV11>() {
           @Override
           public void write(JsonWriter out, UpdateGoalV11 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGoalV11 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateGoalV11 instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateGoalV11 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateGoalV11
  * @throws IOException if the JSON string is invalid with respect to UpdateGoalV11
  */
  public static UpdateGoalV11 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGoalV11.class);
  }

 /**
  * Convert an instance of UpdateGoalV11 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

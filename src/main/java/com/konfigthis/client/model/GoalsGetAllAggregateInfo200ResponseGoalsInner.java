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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * GoalsGetAllAggregateInfo200ResponseGoalsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GoalsGetAllAggregateInfo200ResponseGoalsInner {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PERCENT_COMPLETE = "percentComplete";
  @SerializedName(SERIALIZED_NAME_PERCENT_COMPLETE)
  private Integer percentComplete;

  public static final String SERIALIZED_NAME_ALIGNS_WITH_OPTION_ID = "alignsWithOptionId";
  @SerializedName(SERIALIZED_NAME_ALIGNS_WITH_OPTION_ID)
  private Integer alignsWithOptionId;

  public static final String SERIALIZED_NAME_SHARED_WITH_EMPLOYEE_IDS = "sharedWithEmployeeIds";
  @SerializedName(SERIALIZED_NAME_SHARED_WITH_EMPLOYEE_IDS)
  private List<Integer> sharedWithEmployeeIds = null;

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private LocalDate dueDate;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "completionDate";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  private LocalDate completionDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public GoalsGetAllAggregateInfo200ResponseGoalsInner() {
  }

  public GoalsGetAllAggregateInfo200ResponseGoalsInner title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Title of the goal.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Complete Documentation Epic", value = "Title of the goal.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public GoalsGetAllAggregateInfo200ResponseGoalsInner description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A description of the goal.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Document every endpoint for the goals API.", value = "A description of the goal.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public GoalsGetAllAggregateInfo200ResponseGoalsInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The id of the goal.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The id of the goal.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public GoalsGetAllAggregateInfo200ResponseGoalsInner percentComplete(Integer percentComplete) {
    
    
    
    
    this.percentComplete = percentComplete;
    return this;
  }

   /**
   * A percentage (1-100) that denotes how complete the goal is.
   * @return percentComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "A percentage (1-100) that denotes how complete the goal is.")

  public Integer getPercentComplete() {
    return percentComplete;
  }


  public void setPercentComplete(Integer percentComplete) {
    
    
    
    this.percentComplete = percentComplete;
  }


  public GoalsGetAllAggregateInfo200ResponseGoalsInner alignsWithOptionId(Integer alignsWithOptionId) {
    
    
    
    
    this.alignsWithOptionId = alignsWithOptionId;
    return this;
  }

   /**
   * Get alignsWithOptionId
   * @return alignsWithOptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAlignsWithOptionId() {
    return alignsWithOptionId;
  }


  public void setAlignsWithOptionId(Integer alignsWithOptionId) {
    
    
    
    this.alignsWithOptionId = alignsWithOptionId;
  }


  public GoalsGetAllAggregateInfo200ResponseGoalsInner sharedWithEmployeeIds(List<Integer> sharedWithEmployeeIds) {
    
    
    
    
    this.sharedWithEmployeeIds = sharedWithEmployeeIds;
    return this;
  }

  public GoalsGetAllAggregateInfo200ResponseGoalsInner addSharedWithEmployeeIdsItem(Integer sharedWithEmployeeIdsItem) {
    if (this.sharedWithEmployeeIds == null) {
      this.sharedWithEmployeeIds = new ArrayList<>();
    }
    this.sharedWithEmployeeIds.add(sharedWithEmployeeIdsItem);
    return this;
  }

   /**
   * Ids of the employees that have access to this goal.
   * @return sharedWithEmployeeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ids of the employees that have access to this goal.")

  public List<Integer> getSharedWithEmployeeIds() {
    return sharedWithEmployeeIds;
  }


  public void setSharedWithEmployeeIds(List<Integer> sharedWithEmployeeIds) {
    
    
    
    this.sharedWithEmployeeIds = sharedWithEmployeeIds;
  }


  public GoalsGetAllAggregateInfo200ResponseGoalsInner dueDate(LocalDate dueDate) {
    
    
    
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * The due date of the goal.
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Dec 16 16:00:00 PST 2021", value = "The due date of the goal.")

  public LocalDate getDueDate() {
    return dueDate;
  }


  public void setDueDate(LocalDate dueDate) {
    
    
    
    this.dueDate = dueDate;
  }


  public GoalsGetAllAggregateInfo200ResponseGoalsInner completionDate(LocalDate completionDate) {
    
    
    
    
    this.completionDate = completionDate;
    return this;
  }

   /**
   * The date the goal was completed.
   * @return completionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Dec 15 16:00:00 PST 2021", value = "The date the goal was completed.")

  public LocalDate getCompletionDate() {
    return completionDate;
  }


  public void setCompletionDate(LocalDate completionDate) {
    
    
    
    this.completionDate = completionDate;
  }


  public GoalsGetAllAggregateInfo200ResponseGoalsInner status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the goal.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "in_progress", value = "The status of the goal.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
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
   * @return the GoalsGetAllAggregateInfo200ResponseGoalsInner instance itself
   */
  public GoalsGetAllAggregateInfo200ResponseGoalsInner putAdditionalProperty(String key, Object value) {
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
    GoalsGetAllAggregateInfo200ResponseGoalsInner goalsGetAllAggregateInfo200ResponseGoalsInner = (GoalsGetAllAggregateInfo200ResponseGoalsInner) o;
    return Objects.equals(this.title, goalsGetAllAggregateInfo200ResponseGoalsInner.title) &&
        Objects.equals(this.description, goalsGetAllAggregateInfo200ResponseGoalsInner.description) &&
        Objects.equals(this.id, goalsGetAllAggregateInfo200ResponseGoalsInner.id) &&
        Objects.equals(this.percentComplete, goalsGetAllAggregateInfo200ResponseGoalsInner.percentComplete) &&
        Objects.equals(this.alignsWithOptionId, goalsGetAllAggregateInfo200ResponseGoalsInner.alignsWithOptionId) &&
        Objects.equals(this.sharedWithEmployeeIds, goalsGetAllAggregateInfo200ResponseGoalsInner.sharedWithEmployeeIds) &&
        Objects.equals(this.dueDate, goalsGetAllAggregateInfo200ResponseGoalsInner.dueDate) &&
        Objects.equals(this.completionDate, goalsGetAllAggregateInfo200ResponseGoalsInner.completionDate) &&
        Objects.equals(this.status, goalsGetAllAggregateInfo200ResponseGoalsInner.status)&&
        Objects.equals(this.additionalProperties, goalsGetAllAggregateInfo200ResponseGoalsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, id, percentComplete, alignsWithOptionId, sharedWithEmployeeIds, dueDate, completionDate, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalsGetAllAggregateInfo200ResponseGoalsInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    percentComplete: ").append(toIndentedString(percentComplete)).append("\n");
    sb.append("    alignsWithOptionId: ").append(toIndentedString(alignsWithOptionId)).append("\n");
    sb.append("    sharedWithEmployeeIds: ").append(toIndentedString(sharedWithEmployeeIds)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("percentComplete");
    openapiFields.add("alignsWithOptionId");
    openapiFields.add("sharedWithEmployeeIds");
    openapiFields.add("dueDate");
    openapiFields.add("completionDate");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoalsGetAllAggregateInfo200ResponseGoalsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoalsGetAllAggregateInfo200ResponseGoalsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalsGetAllAggregateInfo200ResponseGoalsInner is not found in the empty JSON string", GoalsGetAllAggregateInfo200ResponseGoalsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedWithEmployeeIds") != null && !jsonObj.get("sharedWithEmployeeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedWithEmployeeIds` to be an array in the JSON string but got `%s`", jsonObj.get("sharedWithEmployeeIds").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoalsGetAllAggregateInfo200ResponseGoalsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalsGetAllAggregateInfo200ResponseGoalsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalsGetAllAggregateInfo200ResponseGoalsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalsGetAllAggregateInfo200ResponseGoalsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalsGetAllAggregateInfo200ResponseGoalsInner>() {
           @Override
           public void write(JsonWriter out, GoalsGetAllAggregateInfo200ResponseGoalsInner value) throws IOException {
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
           public GoalsGetAllAggregateInfo200ResponseGoalsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoalsGetAllAggregateInfo200ResponseGoalsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoalsGetAllAggregateInfo200ResponseGoalsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoalsGetAllAggregateInfo200ResponseGoalsInner
  * @throws IOException if the JSON string is invalid with respect to GoalsGetAllAggregateInfo200ResponseGoalsInner
  */
  public static GoalsGetAllAggregateInfo200ResponseGoalsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalsGetAllAggregateInfo200ResponseGoalsInner.class);
  }

 /**
  * Convert an instance of GoalsGetAllAggregateInfo200ResponseGoalsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


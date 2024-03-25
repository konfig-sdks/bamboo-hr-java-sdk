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
 * TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private Integer employeeId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Integer projectId;

  public static final String SERIALIZED_NAME_TASK_ID = "taskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Integer taskId;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner() {
  }

  public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner employeeId(Integer employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Unique identifier for the employee.
   * @return employeeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier for the employee.")

  public Integer getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(Integer employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner date(String date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Date for the timesheet entry. Must be in YYYY-MM-DD format.
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2024-01-31", required = true, value = "Date for the timesheet entry. Must be in YYYY-MM-DD format.")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    
    
    
    this.date = date;
  }


  public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner start(String start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * Start time for the timesheet entry. Local time for the employee. Must be in hh:mm 24 hour format.
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "09:00", required = true, value = "Start time for the timesheet entry. Local time for the employee. Must be in hh:mm 24 hour format.")

  public String getStart() {
    return start;
  }


  public void setStart(String start) {
    
    
    
    this.start = start;
  }


  public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner end(String end) {
    
    
    
    
    this.end = end;
    return this;
  }

   /**
   * End time for the timesheet entry. Local time for the employee. Must be in hh:mm 24 hour format.
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1020", required = true, value = "End time for the timesheet entry. Local time for the employee. Must be in hh:mm 24 hour format.")

  public String getEnd() {
    return end;
  }


  public void setEnd(String end) {
    
    
    
    this.end = end;
  }


  public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of an existing timesheet entry. This can be specified to edit an existing entry.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of an existing timesheet entry. This can be specified to edit an existing entry.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner projectId(Integer projectId) {
    
    
    
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project to associate with the timesheet entry.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project to associate with the timesheet entry.")

  public Integer getProjectId() {
    return projectId;
  }


  public void setProjectId(Integer projectId) {
    
    
    
    this.projectId = projectId;
  }


  public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner taskId(Integer taskId) {
    
    
    
    
    this.taskId = taskId;
    return this;
  }

   /**
   * The ID of the task to associate with the timesheet entry.
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the task to associate with the timesheet entry.")

  public Integer getTaskId() {
    return taskId;
  }


  public void setTaskId(Integer taskId) {
    
    
    
    this.taskId = taskId;
  }


  public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner note(String note) {
    
    
    
    
    this.note = note;
    return this;
  }

   /**
   * Optional note to associate with the timesheet entry.
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional note to associate with the timesheet entry.")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    
    
    
    this.note = note;
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
   * @return the TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner instance itself
   */
  public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner putAdditionalProperty(String key, Object value) {
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
    TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner timeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner = (TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner) o;
    return Objects.equals(this.employeeId, timeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.employeeId) &&
        Objects.equals(this.date, timeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.date) &&
        Objects.equals(this.start, timeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.start) &&
        Objects.equals(this.end, timeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.end) &&
        Objects.equals(this.id, timeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.id) &&
        Objects.equals(this.projectId, timeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.projectId) &&
        Objects.equals(this.taskId, timeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.taskId) &&
        Objects.equals(this.note, timeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.note)&&
        Objects.equals(this.additionalProperties, timeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, date, start, end, id, projectId, taskId, note, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
    openapiFields.add("employeeId");
    openapiFields.add("date");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("id");
    openapiFields.add("projectId");
    openapiFields.add("taskId");
    openapiFields.add("note");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employeeId");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("start");
    openapiRequiredFields.add("end");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner is not found in the empty JSON string", TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (!jsonObj.get("start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start").toString()));
      }
      if (!jsonObj.get("end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end").toString()));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner>() {
           @Override
           public void write(JsonWriter out, TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner value) throws IOException {
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
           public TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner
  * @throws IOException if the JSON string is invalid with respect to TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner
  */
  public static TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner.class);
  }

 /**
  * Convert an instance of TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

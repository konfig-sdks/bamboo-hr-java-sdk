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
 * TrainingRecord
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TrainingRecord {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private Integer employeeId;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private String completed;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_INSTRUCTOR = "instructor";
  @SerializedName(SERIALIZED_NAME_INSTRUCTOR)
  private String instructor;

  public static final String SERIALIZED_NAME_CREDITS = "credits";
  @SerializedName(SERIALIZED_NAME_CREDITS)
  private Double credits;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Double hours;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private String cost;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public TrainingRecord() {
  }

  public TrainingRecord id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the training record.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the training record.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public TrainingRecord employeeId(Integer employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The ID of the employee associated with the training.
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the employee associated with the training.")

  public Integer getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(Integer employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public TrainingRecord completed(String completed) {
    
    
    
    
    this.completed = completed;
    return this;
  }

   /**
   * Completed is a date in the format yyyy-mm-dd.
   * @return completed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Completed is a date in the format yyyy-mm-dd.")

  public String getCompleted() {
    return completed;
  }


  public void setCompleted(String completed) {
    
    
    
    this.completed = completed;
  }


  public TrainingRecord notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Notes left on the training record.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Notes left on the training record.")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public TrainingRecord instructor(String instructor) {
    
    
    
    
    this.instructor = instructor;
    return this;
  }

   /**
   * Name of the instructor.
   * @return instructor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the instructor.")

  public String getInstructor() {
    return instructor;
  }


  public void setInstructor(String instructor) {
    
    
    
    this.instructor = instructor;
  }


  public TrainingRecord credits(Double credits) {
    
    
    
    
    this.credits = credits;
    return this;
  }

  public TrainingRecord credits(Integer credits) {
    
    
    
    
    this.credits = credits.doubleValue();
    return this;
  }

   /**
   * What was credited for the training record.
   * @return credits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "What was credited for the training record.")

  public Double getCredits() {
    return credits;
  }


  public void setCredits(Double credits) {
    
    
    
    this.credits = credits;
  }


  public TrainingRecord hours(Double hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

  public TrainingRecord hours(Integer hours) {
    
    
    
    
    this.hours = hours.doubleValue();
    return this;
  }

   /**
   * Hours associated with the training record.
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hours associated with the training record.")

  public Double getHours() {
    return hours;
  }


  public void setHours(Double hours) {
    
    
    
    this.hours = hours;
  }


  public TrainingRecord cost(String cost) {
    
    
    
    
    this.cost = cost;
    return this;
  }

   /**
   * The currency and cost for the training record.
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency and cost for the training record.")

  public String getCost() {
    return cost;
  }


  public void setCost(String cost) {
    
    
    
    this.cost = cost;
  }


  public TrainingRecord type(Integer type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The training type ID.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The training type ID.")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    
    
    
    this.type = type;
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
   * @return the TrainingRecord instance itself
   */
  public TrainingRecord putAdditionalProperty(String key, Object value) {
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
    TrainingRecord trainingRecord = (TrainingRecord) o;
    return Objects.equals(this.id, trainingRecord.id) &&
        Objects.equals(this.employeeId, trainingRecord.employeeId) &&
        Objects.equals(this.completed, trainingRecord.completed) &&
        Objects.equals(this.notes, trainingRecord.notes) &&
        Objects.equals(this.instructor, trainingRecord.instructor) &&
        Objects.equals(this.credits, trainingRecord.credits) &&
        Objects.equals(this.hours, trainingRecord.hours) &&
        Objects.equals(this.cost, trainingRecord.cost) &&
        Objects.equals(this.type, trainingRecord.type)&&
        Objects.equals(this.additionalProperties, trainingRecord.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeeId, completed, notes, instructor, credits, hours, cost, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainingRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    instructor: ").append(toIndentedString(instructor)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("employeeId");
    openapiFields.add("completed");
    openapiFields.add("notes");
    openapiFields.add("instructor");
    openapiFields.add("credits");
    openapiFields.add("hours");
    openapiFields.add("cost");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrainingRecord
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrainingRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrainingRecord is not found in the empty JSON string", TrainingRecord.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("completed") != null && !jsonObj.get("completed").isJsonNull()) && !jsonObj.get("completed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completed").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("instructor") != null && !jsonObj.get("instructor").isJsonNull()) && !jsonObj.get("instructor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructor").toString()));
      }
      if ((jsonObj.get("cost") != null && !jsonObj.get("cost").isJsonNull()) && !jsonObj.get("cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cost").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrainingRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrainingRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrainingRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrainingRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<TrainingRecord>() {
           @Override
           public void write(JsonWriter out, TrainingRecord value) throws IOException {
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
           public TrainingRecord read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TrainingRecord instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TrainingRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrainingRecord
  * @throws IOException if the JSON string is invalid with respect to TrainingRecord
  */
  public static TrainingRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrainingRecord.class);
  }

 /**
  * Convert an instance of TrainingRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


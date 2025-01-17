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
import com.konfigthis.client.model.TimeOffRequestDatesInner;
import com.konfigthis.client.model.TimeOffRequestNotesInner;
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
 * TimeOffRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimeOffRequest {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE_ID = "timeOffTypeId";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE_ID)
  private Integer timeOffTypeId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<TimeOffRequestNotesInner> notes = null;

  public static final String SERIALIZED_NAME_DATES = "dates";
  @SerializedName(SERIALIZED_NAME_DATES)
  private List<TimeOffRequestDatesInner> dates = null;

  public static final String SERIALIZED_NAME_PREVIOUS_REQUEST = "previousRequest";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_REQUEST)
  private Integer previousRequest;

  public TimeOffRequest() {
  }

  public TimeOffRequest status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public TimeOffRequest start(String start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * 
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStart() {
    return start;
  }


  public void setStart(String start) {
    
    
    
    this.start = start;
  }


  public TimeOffRequest end(String end) {
    
    
    
    
    this.end = end;
    return this;
  }

   /**
   * 
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnd() {
    return end;
  }


  public void setEnd(String end) {
    
    
    
    this.end = end;
  }


  public TimeOffRequest timeOffTypeId(Integer timeOffTypeId) {
    
    
    
    
    this.timeOffTypeId = timeOffTypeId;
    return this;
  }

   /**
   * 
   * @return timeOffTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeOffTypeId() {
    return timeOffTypeId;
  }


  public void setTimeOffTypeId(Integer timeOffTypeId) {
    
    
    
    this.timeOffTypeId = timeOffTypeId;
  }


  public TimeOffRequest amount(Integer amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    
    
    
    this.amount = amount;
  }


  public TimeOffRequest notes(List<TimeOffRequestNotesInner> notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

  public TimeOffRequest addNotesItem(TimeOffRequestNotesInner notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * 
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TimeOffRequestNotesInner> getNotes() {
    return notes;
  }


  public void setNotes(List<TimeOffRequestNotesInner> notes) {
    
    
    
    this.notes = notes;
  }


  public TimeOffRequest dates(List<TimeOffRequestDatesInner> dates) {
    
    
    
    
    this.dates = dates;
    return this;
  }

  public TimeOffRequest addDatesItem(TimeOffRequestDatesInner datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<>();
    }
    this.dates.add(datesItem);
    return this;
  }

   /**
   * 
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TimeOffRequestDatesInner> getDates() {
    return dates;
  }


  public void setDates(List<TimeOffRequestDatesInner> dates) {
    
    
    
    this.dates = dates;
  }


  public TimeOffRequest previousRequest(Integer previousRequest) {
    
    
    
    
    this.previousRequest = previousRequest;
    return this;
  }

   /**
   * 
   * @return previousRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPreviousRequest() {
    return previousRequest;
  }


  public void setPreviousRequest(Integer previousRequest) {
    
    
    
    this.previousRequest = previousRequest;
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
   * @return the TimeOffRequest instance itself
   */
  public TimeOffRequest putAdditionalProperty(String key, Object value) {
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
    TimeOffRequest timeOffRequest = (TimeOffRequest) o;
    return Objects.equals(this.status, timeOffRequest.status) &&
        Objects.equals(this.start, timeOffRequest.start) &&
        Objects.equals(this.end, timeOffRequest.end) &&
        Objects.equals(this.timeOffTypeId, timeOffRequest.timeOffTypeId) &&
        Objects.equals(this.amount, timeOffRequest.amount) &&
        Objects.equals(this.notes, timeOffRequest.notes) &&
        Objects.equals(this.dates, timeOffRequest.dates) &&
        Objects.equals(this.previousRequest, timeOffRequest.previousRequest)&&
        Objects.equals(this.additionalProperties, timeOffRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, start, end, timeOffTypeId, amount, notes, dates, previousRequest, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    timeOffTypeId: ").append(toIndentedString(timeOffTypeId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    previousRequest: ").append(toIndentedString(previousRequest)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("timeOffTypeId");
    openapiFields.add("amount");
    openapiFields.add("notes");
    openapiFields.add("dates");
    openapiFields.add("previousRequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeOffRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimeOffRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeOffRequest is not found in the empty JSON string", TimeOffRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("start") != null && !jsonObj.get("start").isJsonNull()) && !jsonObj.get("start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start").toString()));
      }
      if ((jsonObj.get("end") != null && !jsonObj.get("end").isJsonNull()) && !jsonObj.get("end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end").toString()));
      }
      if (jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) {
        JsonArray jsonArraynotes = jsonObj.getAsJsonArray("notes");
        if (jsonArraynotes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notes` to be an array in the JSON string but got `%s`", jsonObj.get("notes").toString()));
          }

          // validate the optional field `notes` (array)
          for (int i = 0; i < jsonArraynotes.size(); i++) {
            TimeOffRequestNotesInner.validateJsonObject(jsonArraynotes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("dates") != null && !jsonObj.get("dates").isJsonNull()) {
        JsonArray jsonArraydates = jsonObj.getAsJsonArray("dates");
        if (jsonArraydates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dates` to be an array in the JSON string but got `%s`", jsonObj.get("dates").toString()));
          }

          // validate the optional field `dates` (array)
          for (int i = 0; i < jsonArraydates.size(); i++) {
            TimeOffRequestDatesInner.validateJsonObject(jsonArraydates.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeOffRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeOffRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeOffRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeOffRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeOffRequest>() {
           @Override
           public void write(JsonWriter out, TimeOffRequest value) throws IOException {
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
           public TimeOffRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimeOffRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimeOffRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeOffRequest
  * @throws IOException if the JSON string is invalid with respect to TimeOffRequest
  */
  public static TimeOffRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeOffRequest.class);
  }

 /**
  * Convert an instance of TimeOffRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


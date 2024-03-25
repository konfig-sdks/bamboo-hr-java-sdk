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
 * AdjustTimeOffBalance
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AdjustTimeOffBalance {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_TIME_OFF_TYPE_ID = "timeOffTypeId";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_TYPE_ID)
  private Integer timeOffTypeId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public AdjustTimeOffBalance() {
  }

  public AdjustTimeOffBalance date(String date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * The date the adjustment should be added in history. Should be in ISO8601 date format (YYYY-MM-DD).
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date the adjustment should be added in history. Should be in ISO8601 date format (YYYY-MM-DD).")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    
    
    
    this.date = date;
  }


  public AdjustTimeOffBalance timeOffTypeId(Integer timeOffTypeId) {
    
    
    
    
    this.timeOffTypeId = timeOffTypeId;
    return this;
  }

   /**
   * The ID of the time off type to add a balance adjustment for.
   * @return timeOffTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the time off type to add a balance adjustment for.")

  public Integer getTimeOffTypeId() {
    return timeOffTypeId;
  }


  public void setTimeOffTypeId(Integer timeOffTypeId) {
    
    
    
    this.timeOffTypeId = timeOffTypeId;
  }


  public AdjustTimeOffBalance amount(Float amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The number of hours/days to adjust the balance by.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of hours/days to adjust the balance by.")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    
    
    
    this.amount = amount;
  }


  public AdjustTimeOffBalance note(String note) {
    
    
    
    
    this.note = note;
    return this;
  }

   /**
   * This is an optional note to show in history.
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is an optional note to show in history.")

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
   * @return the AdjustTimeOffBalance instance itself
   */
  public AdjustTimeOffBalance putAdditionalProperty(String key, Object value) {
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
    AdjustTimeOffBalance adjustTimeOffBalance = (AdjustTimeOffBalance) o;
    return Objects.equals(this.date, adjustTimeOffBalance.date) &&
        Objects.equals(this.timeOffTypeId, adjustTimeOffBalance.timeOffTypeId) &&
        Objects.equals(this.amount, adjustTimeOffBalance.amount) &&
        Objects.equals(this.note, adjustTimeOffBalance.note)&&
        Objects.equals(this.additionalProperties, adjustTimeOffBalance.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, timeOffTypeId, amount, note, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustTimeOffBalance {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    timeOffTypeId: ").append(toIndentedString(timeOffTypeId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("timeOffTypeId");
    openapiFields.add("amount");
    openapiFields.add("note");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("timeOffTypeId");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdjustTimeOffBalance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AdjustTimeOffBalance.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdjustTimeOffBalance is not found in the empty JSON string", AdjustTimeOffBalance.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdjustTimeOffBalance.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdjustTimeOffBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdjustTimeOffBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdjustTimeOffBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdjustTimeOffBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<AdjustTimeOffBalance>() {
           @Override
           public void write(JsonWriter out, AdjustTimeOffBalance value) throws IOException {
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
           public AdjustTimeOffBalance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AdjustTimeOffBalance instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AdjustTimeOffBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdjustTimeOffBalance
  * @throws IOException if the JSON string is invalid with respect to AdjustTimeOffBalance
  */
  public static AdjustTimeOffBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdjustTimeOffBalance.class);
  }

 /**
  * Convert an instance of AdjustTimeOffBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * How often the webhook could fire.
 */
@ApiModel(description = "How often the webhook could fire.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NewWebHookFrequency {
  public static final String SERIALIZED_NAME_HOUR = "hour";
  @SerializedName(SERIALIZED_NAME_HOUR)
  private Integer hour;

  public static final String SERIALIZED_NAME_MINUTE = "minute";
  @SerializedName(SERIALIZED_NAME_MINUTE)
  private Integer minute;

  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private Integer day;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Integer month;

  public NewWebHookFrequency() {
  }

  public NewWebHookFrequency hour(Integer hour) {
    if (hour != null && hour < 0) {
      throw new IllegalArgumentException("Invalid value for hour. Must be greater than or equal to 0.");
    }
    if (hour != null && hour > 23) {
      throw new IllegalArgumentException("Invalid value for hour. Must be less than or equal to 23.");
    }
    
    
    this.hour = hour;
    return this;
  }

   /**
   * The hour to potentially fire (0-23, null to potentially fire every hour)
   * minimum: 0
   * maximum: 23
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hour to potentially fire (0-23, null to potentially fire every hour)")

  public Integer getHour() {
    return hour;
  }


  public void setHour(Integer hour) {
    if (hour != null && hour < 0) {
      throw new IllegalArgumentException("Invalid value for hour. Must be greater than or equal to 0.");
    }
    if (hour != null && hour > 23) {
      throw new IllegalArgumentException("Invalid value for hour. Must be less than or equal to 23.");
    }
    
    this.hour = hour;
  }


  public NewWebHookFrequency minute(Integer minute) {
    if (minute != null && minute < 0) {
      throw new IllegalArgumentException("Invalid value for minute. Must be greater than or equal to 0.");
    }
    if (minute != null && minute > 59) {
      throw new IllegalArgumentException("Invalid value for minute. Must be less than or equal to 59.");
    }
    
    
    this.minute = minute;
    return this;
  }

   /**
   * The minute to potentially fire (0-59, null to potentially fire every minute)
   * minimum: 0
   * maximum: 59
   * @return minute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minute to potentially fire (0-59, null to potentially fire every minute)")

  public Integer getMinute() {
    return minute;
  }


  public void setMinute(Integer minute) {
    if (minute != null && minute < 0) {
      throw new IllegalArgumentException("Invalid value for minute. Must be greater than or equal to 0.");
    }
    if (minute != null && minute > 59) {
      throw new IllegalArgumentException("Invalid value for minute. Must be less than or equal to 59.");
    }
    
    this.minute = minute;
  }


  public NewWebHookFrequency day(Integer day) {
    if (day != null && day < 1) {
      throw new IllegalArgumentException("Invalid value for day. Must be greater than or equal to 1.");
    }
    if (day != null && day > 31) {
      throw new IllegalArgumentException("Invalid value for day. Must be less than or equal to 31.");
    }
    
    
    this.day = day;
    return this;
  }

   /**
   * The day to potentially fire (1-31, null to potentially fire every day)
   * minimum: 1
   * maximum: 31
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The day to potentially fire (1-31, null to potentially fire every day)")

  public Integer getDay() {
    return day;
  }


  public void setDay(Integer day) {
    if (day != null && day < 1) {
      throw new IllegalArgumentException("Invalid value for day. Must be greater than or equal to 1.");
    }
    if (day != null && day > 31) {
      throw new IllegalArgumentException("Invalid value for day. Must be less than or equal to 31.");
    }
    
    this.day = day;
  }


  public NewWebHookFrequency month(Integer month) {
    if (month != null && month < 1) {
      throw new IllegalArgumentException("Invalid value for month. Must be greater than or equal to 1.");
    }
    if (month != null && month > 12) {
      throw new IllegalArgumentException("Invalid value for month. Must be less than or equal to 12.");
    }
    
    
    this.month = month;
    return this;
  }

   /**
   * The month to potentially fire (1-12, null to potentially fire every month)
   * minimum: 1
   * maximum: 12
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The month to potentially fire (1-12, null to potentially fire every month)")

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    if (month != null && month < 1) {
      throw new IllegalArgumentException("Invalid value for month. Must be greater than or equal to 1.");
    }
    if (month != null && month > 12) {
      throw new IllegalArgumentException("Invalid value for month. Must be less than or equal to 12.");
    }
    
    this.month = month;
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
   * @return the NewWebHookFrequency instance itself
   */
  public NewWebHookFrequency putAdditionalProperty(String key, Object value) {
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
    NewWebHookFrequency newWebHookFrequency = (NewWebHookFrequency) o;
    return Objects.equals(this.hour, newWebHookFrequency.hour) &&
        Objects.equals(this.minute, newWebHookFrequency.minute) &&
        Objects.equals(this.day, newWebHookFrequency.day) &&
        Objects.equals(this.month, newWebHookFrequency.month)&&
        Objects.equals(this.additionalProperties, newWebHookFrequency.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, minute, day, month, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewWebHookFrequency {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
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
    openapiFields.add("hour");
    openapiFields.add("minute");
    openapiFields.add("day");
    openapiFields.add("month");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NewWebHookFrequency
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NewWebHookFrequency.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NewWebHookFrequency is not found in the empty JSON string", NewWebHookFrequency.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NewWebHookFrequency.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NewWebHookFrequency' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NewWebHookFrequency> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NewWebHookFrequency.class));

       return (TypeAdapter<T>) new TypeAdapter<NewWebHookFrequency>() {
           @Override
           public void write(JsonWriter out, NewWebHookFrequency value) throws IOException {
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
           public NewWebHookFrequency read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NewWebHookFrequency instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NewWebHookFrequency given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NewWebHookFrequency
  * @throws IOException if the JSON string is invalid with respect to NewWebHookFrequency
  */
  public static NewWebHookFrequency fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NewWebHookFrequency.class);
  }

 /**
  * Convert an instance of NewWebHookFrequency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


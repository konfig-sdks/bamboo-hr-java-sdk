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
 * EmployeePaystubWagesInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeePaystubWagesInner {
  public static final String SERIALIZED_NAME_EXTERNAL_WAGE_ID = "externalWageId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_WAGE_ID)
  private String externalWageId;

  public static final String SERIALIZED_NAME_WAGE_DESCRIPTION = "wageDescription";
  @SerializedName(SERIALIZED_NAME_WAGE_DESCRIPTION)
  private String wageDescription;

  public static final String SERIALIZED_NAME_WAGE_AMOUNT = "wageAmount";
  @SerializedName(SERIALIZED_NAME_WAGE_AMOUNT)
  private String wageAmount;

  public static final String SERIALIZED_NAME_YTD_WAGE_AMOUNT = "ytdWageAmount";
  @SerializedName(SERIALIZED_NAME_YTD_WAGE_AMOUNT)
  private String ytdWageAmount;

  public static final String SERIALIZED_NAME_WAGE_RATE = "wageRate";
  @SerializedName(SERIALIZED_NAME_WAGE_RATE)
  private String wageRate;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private String hours;

  public EmployeePaystubWagesInner() {
  }

  public EmployeePaystubWagesInner externalWageId(String externalWageId) {
    
    
    
    
    this.externalWageId = externalWageId;
    return this;
  }

   /**
   * Get externalWageId
   * @return externalWageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalWageId() {
    return externalWageId;
  }


  public void setExternalWageId(String externalWageId) {
    
    
    
    this.externalWageId = externalWageId;
  }


  public EmployeePaystubWagesInner wageDescription(String wageDescription) {
    
    
    
    
    this.wageDescription = wageDescription;
    return this;
  }

   /**
   * Get wageDescription
   * @return wageDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWageDescription() {
    return wageDescription;
  }


  public void setWageDescription(String wageDescription) {
    
    
    
    this.wageDescription = wageDescription;
  }


  public EmployeePaystubWagesInner wageAmount(String wageAmount) {
    
    
    
    
    this.wageAmount = wageAmount;
    return this;
  }

   /**
   * Get wageAmount
   * @return wageAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWageAmount() {
    return wageAmount;
  }


  public void setWageAmount(String wageAmount) {
    
    
    
    this.wageAmount = wageAmount;
  }


  public EmployeePaystubWagesInner ytdWageAmount(String ytdWageAmount) {
    
    
    
    
    this.ytdWageAmount = ytdWageAmount;
    return this;
  }

   /**
   * Get ytdWageAmount
   * @return ytdWageAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getYtdWageAmount() {
    return ytdWageAmount;
  }


  public void setYtdWageAmount(String ytdWageAmount) {
    
    
    
    this.ytdWageAmount = ytdWageAmount;
  }


  public EmployeePaystubWagesInner wageRate(String wageRate) {
    
    
    
    
    this.wageRate = wageRate;
    return this;
  }

   /**
   * Get wageRate
   * @return wageRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWageRate() {
    return wageRate;
  }


  public void setWageRate(String wageRate) {
    
    
    
    this.wageRate = wageRate;
  }


  public EmployeePaystubWagesInner hours(String hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHours() {
    return hours;
  }


  public void setHours(String hours) {
    
    
    
    this.hours = hours;
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
   * @return the EmployeePaystubWagesInner instance itself
   */
  public EmployeePaystubWagesInner putAdditionalProperty(String key, Object value) {
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
    EmployeePaystubWagesInner employeePaystubWagesInner = (EmployeePaystubWagesInner) o;
    return Objects.equals(this.externalWageId, employeePaystubWagesInner.externalWageId) &&
        Objects.equals(this.wageDescription, employeePaystubWagesInner.wageDescription) &&
        Objects.equals(this.wageAmount, employeePaystubWagesInner.wageAmount) &&
        Objects.equals(this.ytdWageAmount, employeePaystubWagesInner.ytdWageAmount) &&
        Objects.equals(this.wageRate, employeePaystubWagesInner.wageRate) &&
        Objects.equals(this.hours, employeePaystubWagesInner.hours)&&
        Objects.equals(this.additionalProperties, employeePaystubWagesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalWageId, wageDescription, wageAmount, ytdWageAmount, wageRate, hours, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePaystubWagesInner {\n");
    sb.append("    externalWageId: ").append(toIndentedString(externalWageId)).append("\n");
    sb.append("    wageDescription: ").append(toIndentedString(wageDescription)).append("\n");
    sb.append("    wageAmount: ").append(toIndentedString(wageAmount)).append("\n");
    sb.append("    ytdWageAmount: ").append(toIndentedString(ytdWageAmount)).append("\n");
    sb.append("    wageRate: ").append(toIndentedString(wageRate)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
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
    openapiFields.add("externalWageId");
    openapiFields.add("wageDescription");
    openapiFields.add("wageAmount");
    openapiFields.add("ytdWageAmount");
    openapiFields.add("wageRate");
    openapiFields.add("hours");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeePaystubWagesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeePaystubWagesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeePaystubWagesInner is not found in the empty JSON string", EmployeePaystubWagesInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("externalWageId") != null && !jsonObj.get("externalWageId").isJsonNull()) && !jsonObj.get("externalWageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalWageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalWageId").toString()));
      }
      if ((jsonObj.get("wageDescription") != null && !jsonObj.get("wageDescription").isJsonNull()) && !jsonObj.get("wageDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wageDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wageDescription").toString()));
      }
      if ((jsonObj.get("wageAmount") != null && !jsonObj.get("wageAmount").isJsonNull()) && !jsonObj.get("wageAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wageAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wageAmount").toString()));
      }
      if ((jsonObj.get("ytdWageAmount") != null && !jsonObj.get("ytdWageAmount").isJsonNull()) && !jsonObj.get("ytdWageAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ytdWageAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ytdWageAmount").toString()));
      }
      if ((jsonObj.get("wageRate") != null && !jsonObj.get("wageRate").isJsonNull()) && !jsonObj.get("wageRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wageRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wageRate").toString()));
      }
      if ((jsonObj.get("hours") != null && !jsonObj.get("hours").isJsonNull()) && !jsonObj.get("hours").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hours` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hours").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeePaystubWagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeePaystubWagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeePaystubWagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeePaystubWagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeePaystubWagesInner>() {
           @Override
           public void write(JsonWriter out, EmployeePaystubWagesInner value) throws IOException {
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
           public EmployeePaystubWagesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeePaystubWagesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeePaystubWagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeePaystubWagesInner
  * @throws IOException if the JSON string is invalid with respect to EmployeePaystubWagesInner
  */
  public static EmployeePaystubWagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeePaystubWagesInner.class);
  }

 /**
  * Convert an instance of EmployeePaystubWagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


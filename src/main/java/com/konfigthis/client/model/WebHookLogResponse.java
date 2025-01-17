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
 * WebHookLogResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebHookLogResponse {
  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private Integer webhookId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_LAST_ATTEMPTED = "lastAttempted";
  @SerializedName(SERIALIZED_NAME_LAST_ATTEMPTED)
  private String lastAttempted;

  public static final String SERIALIZED_NAME_LAST_SUCCESS = "lastSuccess";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESS)
  private String lastSuccess;

  public static final String SERIALIZED_NAME_FAILURE_COUNT = "failureCount";
  @SerializedName(SERIALIZED_NAME_FAILURE_COUNT)
  private Integer failureCount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_EMPLOYEE_IDS = "employeeIds";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_IDS)
  private List<Integer> employeeIds = null;

  public WebHookLogResponse() {
  }

  public WebHookLogResponse webhookId(Integer webhookId) {
    
    
    
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * The id of the webhook.
   * @return webhookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The id of the webhook.")

  public Integer getWebhookId() {
    return webhookId;
  }


  public void setWebhookId(Integer webhookId) {
    
    
    
    this.webhookId = webhookId;
  }


  public WebHookLogResponse url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the webhook.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://exmaple.com", value = "The URL of the webhook.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public WebHookLogResponse lastAttempted(String lastAttempted) {
    
    
    
    
    this.lastAttempted = lastAttempted;
    return this;
  }

   /**
   * timestamp of last time the webhook was sent
   * @return lastAttempted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-09-20 22:58:01", value = "timestamp of last time the webhook was sent")

  public String getLastAttempted() {
    return lastAttempted;
  }


  public void setLastAttempted(String lastAttempted) {
    
    
    
    this.lastAttempted = lastAttempted;
  }


  public WebHookLogResponse lastSuccess(String lastSuccess) {
    
    
    
    
    this.lastSuccess = lastSuccess;
    return this;
  }

   /**
   * timestamp of last time the webhook was sent successfully
   * @return lastSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-09-20 22:58:01", value = "timestamp of last time the webhook was sent successfully")

  public String getLastSuccess() {
    return lastSuccess;
  }


  public void setLastSuccess(String lastSuccess) {
    
    
    
    this.lastSuccess = lastSuccess;
  }


  public WebHookLogResponse failureCount(Integer failureCount) {
    
    
    
    
    this.failureCount = failureCount;
    return this;
  }

   /**
   * Count of how many times this call failed since last success
   * @return failureCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Count of how many times this call failed since last success")

  public Integer getFailureCount() {
    return failureCount;
  }


  public void setFailureCount(Integer failureCount) {
    
    
    
    this.failureCount = failureCount;
  }


  public WebHookLogResponse status(Integer status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Status code of last request
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "Status code of last request")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    
    
    
    this.status = status;
  }


  public WebHookLogResponse employeeIds(List<Integer> employeeIds) {
    
    
    
    
    this.employeeIds = employeeIds;
    return this;
  }

  public WebHookLogResponse addEmployeeIdsItem(Integer employeeIdsItem) {
    if (this.employeeIds == null) {
      this.employeeIds = new ArrayList<>();
    }
    this.employeeIds.add(employeeIdsItem);
    return this;
  }

   /**
   * A list of employee ids that were changed.
   * @return employeeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1,2]", value = "A list of employee ids that were changed.")

  public List<Integer> getEmployeeIds() {
    return employeeIds;
  }


  public void setEmployeeIds(List<Integer> employeeIds) {
    
    
    
    this.employeeIds = employeeIds;
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
   * @return the WebHookLogResponse instance itself
   */
  public WebHookLogResponse putAdditionalProperty(String key, Object value) {
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
    WebHookLogResponse webHookLogResponse = (WebHookLogResponse) o;
    return Objects.equals(this.webhookId, webHookLogResponse.webhookId) &&
        Objects.equals(this.url, webHookLogResponse.url) &&
        Objects.equals(this.lastAttempted, webHookLogResponse.lastAttempted) &&
        Objects.equals(this.lastSuccess, webHookLogResponse.lastSuccess) &&
        Objects.equals(this.failureCount, webHookLogResponse.failureCount) &&
        Objects.equals(this.status, webHookLogResponse.status) &&
        Objects.equals(this.employeeIds, webHookLogResponse.employeeIds)&&
        Objects.equals(this.additionalProperties, webHookLogResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookId, url, lastAttempted, lastSuccess, failureCount, status, employeeIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookLogResponse {\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    lastAttempted: ").append(toIndentedString(lastAttempted)).append("\n");
    sb.append("    lastSuccess: ").append(toIndentedString(lastSuccess)).append("\n");
    sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    employeeIds: ").append(toIndentedString(employeeIds)).append("\n");
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
    openapiFields.add("webhookId");
    openapiFields.add("url");
    openapiFields.add("lastAttempted");
    openapiFields.add("lastSuccess");
    openapiFields.add("failureCount");
    openapiFields.add("status");
    openapiFields.add("employeeIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebHookLogResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebHookLogResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebHookLogResponse is not found in the empty JSON string", WebHookLogResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("lastAttempted") != null && !jsonObj.get("lastAttempted").isJsonNull()) && !jsonObj.get("lastAttempted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastAttempted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastAttempted").toString()));
      }
      if ((jsonObj.get("lastSuccess") != null && !jsonObj.get("lastSuccess").isJsonNull()) && !jsonObj.get("lastSuccess").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastSuccess` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastSuccess").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("employeeIds") != null && !jsonObj.get("employeeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeIds` to be an array in the JSON string but got `%s`", jsonObj.get("employeeIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebHookLogResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebHookLogResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebHookLogResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebHookLogResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WebHookLogResponse>() {
           @Override
           public void write(JsonWriter out, WebHookLogResponse value) throws IOException {
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
           public WebHookLogResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebHookLogResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebHookLogResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebHookLogResponse
  * @throws IOException if the JSON string is invalid with respect to WebHookLogResponse
  */
  public static WebHookLogResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebHookLogResponse.class);
  }

 /**
  * Convert an instance of WebHookLogResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.konfigthis.client.model.ApplicantTrackingGetApplicationDetailsResponseMovedToJob;
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
 * ApplicantTrackingGetApplicationDetailsResponseMovedTo
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicantTrackingGetApplicationDetailsResponseMovedTo {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "applicationId";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private Double applicationId;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private ApplicantTrackingGetApplicationDetailsResponseMovedToJob job;

  public ApplicantTrackingGetApplicationDetailsResponseMovedTo() {
  }

  public ApplicantTrackingGetApplicationDetailsResponseMovedTo applicationId(Double applicationId) {
    
    
    
    
    this.applicationId = applicationId;
    return this;
  }

  public ApplicantTrackingGetApplicationDetailsResponseMovedTo applicationId(Integer applicationId) {
    
    
    
    
    this.applicationId = applicationId.doubleValue();
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Double getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(Double applicationId) {
    
    
    
    this.applicationId = applicationId;
  }


  public ApplicantTrackingGetApplicationDetailsResponseMovedTo job(ApplicantTrackingGetApplicationDetailsResponseMovedToJob job) {
    
    
    
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingGetApplicationDetailsResponseMovedToJob getJob() {
    return job;
  }


  public void setJob(ApplicantTrackingGetApplicationDetailsResponseMovedToJob job) {
    
    
    
    this.job = job;
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
   * @return the ApplicantTrackingGetApplicationDetailsResponseMovedTo instance itself
   */
  public ApplicantTrackingGetApplicationDetailsResponseMovedTo putAdditionalProperty(String key, Object value) {
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
    ApplicantTrackingGetApplicationDetailsResponseMovedTo applicantTrackingGetApplicationDetailsResponseMovedTo = (ApplicantTrackingGetApplicationDetailsResponseMovedTo) o;
    return Objects.equals(this.applicationId, applicantTrackingGetApplicationDetailsResponseMovedTo.applicationId) &&
        Objects.equals(this.job, applicantTrackingGetApplicationDetailsResponseMovedTo.job)&&
        Objects.equals(this.additionalProperties, applicantTrackingGetApplicationDetailsResponseMovedTo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, job, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantTrackingGetApplicationDetailsResponseMovedTo {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
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
    openapiFields.add("applicationId");
    openapiFields.add("job");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicantTrackingGetApplicationDetailsResponseMovedTo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicantTrackingGetApplicationDetailsResponseMovedTo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicantTrackingGetApplicationDetailsResponseMovedTo is not found in the empty JSON string", ApplicantTrackingGetApplicationDetailsResponseMovedTo.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `job`
      if (jsonObj.get("job") != null && !jsonObj.get("job").isJsonNull()) {
        ApplicantTrackingGetApplicationDetailsResponseMovedToJob.validateJsonObject(jsonObj.getAsJsonObject("job"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicantTrackingGetApplicationDetailsResponseMovedTo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicantTrackingGetApplicationDetailsResponseMovedTo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicantTrackingGetApplicationDetailsResponseMovedTo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicantTrackingGetApplicationDetailsResponseMovedTo.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicantTrackingGetApplicationDetailsResponseMovedTo>() {
           @Override
           public void write(JsonWriter out, ApplicantTrackingGetApplicationDetailsResponseMovedTo value) throws IOException {
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
           public ApplicantTrackingGetApplicationDetailsResponseMovedTo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicantTrackingGetApplicationDetailsResponseMovedTo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApplicantTrackingGetApplicationDetailsResponseMovedTo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicantTrackingGetApplicationDetailsResponseMovedTo
  * @throws IOException if the JSON string is invalid with respect to ApplicantTrackingGetApplicationDetailsResponseMovedTo
  */
  public static ApplicantTrackingGetApplicationDetailsResponseMovedTo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicantTrackingGetApplicationDetailsResponseMovedTo.class);
  }

 /**
  * Convert an instance of ApplicantTrackingGetApplicationDetailsResponseMovedTo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

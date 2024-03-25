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
import com.konfigthis.client.model.ApplicantTrackingListApplicationsResponseApplicationsInnerApplicant;
import com.konfigthis.client.model.ApplicantTrackingListApplicationsResponseApplicationsInnerJob;
import com.konfigthis.client.model.ApplicantTrackingListApplicationsResponseApplicationsInnerStatus;
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
 * ApplicantTrackingListApplicationsResponseApplicationsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicantTrackingListApplicationsResponseApplicationsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Double id;

  public static final String SERIALIZED_NAME_APPLIED_DATE = "appliedDate";
  @SerializedName(SERIALIZED_NAME_APPLIED_DATE)
  private String appliedDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ApplicantTrackingListApplicationsResponseApplicationsInnerStatus status;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private Double rating;

  public static final String SERIALIZED_NAME_APPLICANT = "applicant";
  @SerializedName(SERIALIZED_NAME_APPLICANT)
  private ApplicantTrackingListApplicationsResponseApplicationsInnerApplicant applicant;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private ApplicantTrackingListApplicationsResponseApplicationsInnerJob job;

  public ApplicantTrackingListApplicationsResponseApplicationsInner() {
  }

  public ApplicantTrackingListApplicationsResponseApplicationsInner id(Double id) {
    
    
    
    
    this.id = id;
    return this;
  }

  public ApplicantTrackingListApplicationsResponseApplicationsInner id(Integer id) {
    
    
    
    
    this.id = id.doubleValue();
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Double getId() {
    return id;
  }


  public void setId(Double id) {
    
    
    
    this.id = id;
  }


  public ApplicantTrackingListApplicationsResponseApplicationsInner appliedDate(String appliedDate) {
    
    
    
    
    this.appliedDate = appliedDate;
    return this;
  }

   /**
   * Get appliedDate
   * @return appliedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getAppliedDate() {
    return appliedDate;
  }


  public void setAppliedDate(String appliedDate) {
    
    
    
    this.appliedDate = appliedDate;
  }


  public ApplicantTrackingListApplicationsResponseApplicationsInner status(ApplicantTrackingListApplicationsResponseApplicationsInnerStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingListApplicationsResponseApplicationsInnerStatus getStatus() {
    return status;
  }


  public void setStatus(ApplicantTrackingListApplicationsResponseApplicationsInnerStatus status) {
    
    
    
    this.status = status;
  }


  public ApplicantTrackingListApplicationsResponseApplicationsInner rating(Double rating) {
    
    
    
    
    this.rating = rating;
    return this;
  }

  public ApplicantTrackingListApplicationsResponseApplicationsInner rating(Integer rating) {
    
    
    
    
    this.rating = rating.doubleValue();
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Double getRating() {
    return rating;
  }


  public void setRating(Double rating) {
    
    
    
    this.rating = rating;
  }


  public ApplicantTrackingListApplicationsResponseApplicationsInner applicant(ApplicantTrackingListApplicationsResponseApplicationsInnerApplicant applicant) {
    
    
    
    
    this.applicant = applicant;
    return this;
  }

   /**
   * Get applicant
   * @return applicant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingListApplicationsResponseApplicationsInnerApplicant getApplicant() {
    return applicant;
  }


  public void setApplicant(ApplicantTrackingListApplicationsResponseApplicationsInnerApplicant applicant) {
    
    
    
    this.applicant = applicant;
  }


  public ApplicantTrackingListApplicationsResponseApplicationsInner job(ApplicantTrackingListApplicationsResponseApplicationsInnerJob job) {
    
    
    
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingListApplicationsResponseApplicationsInnerJob getJob() {
    return job;
  }


  public void setJob(ApplicantTrackingListApplicationsResponseApplicationsInnerJob job) {
    
    
    
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
   * @return the ApplicantTrackingListApplicationsResponseApplicationsInner instance itself
   */
  public ApplicantTrackingListApplicationsResponseApplicationsInner putAdditionalProperty(String key, Object value) {
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
    ApplicantTrackingListApplicationsResponseApplicationsInner applicantTrackingListApplicationsResponseApplicationsInner = (ApplicantTrackingListApplicationsResponseApplicationsInner) o;
    return Objects.equals(this.id, applicantTrackingListApplicationsResponseApplicationsInner.id) &&
        Objects.equals(this.appliedDate, applicantTrackingListApplicationsResponseApplicationsInner.appliedDate) &&
        Objects.equals(this.status, applicantTrackingListApplicationsResponseApplicationsInner.status) &&
        Objects.equals(this.rating, applicantTrackingListApplicationsResponseApplicationsInner.rating) &&
        Objects.equals(this.applicant, applicantTrackingListApplicationsResponseApplicationsInner.applicant) &&
        Objects.equals(this.job, applicantTrackingListApplicationsResponseApplicationsInner.job)&&
        Objects.equals(this.additionalProperties, applicantTrackingListApplicationsResponseApplicationsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appliedDate, status, rating, applicant, job, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantTrackingListApplicationsResponseApplicationsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appliedDate: ").append(toIndentedString(appliedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    applicant: ").append(toIndentedString(applicant)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("appliedDate");
    openapiFields.add("status");
    openapiFields.add("rating");
    openapiFields.add("applicant");
    openapiFields.add("job");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicantTrackingListApplicationsResponseApplicationsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicantTrackingListApplicationsResponseApplicationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicantTrackingListApplicationsResponseApplicationsInner is not found in the empty JSON string", ApplicantTrackingListApplicationsResponseApplicationsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("appliedDate") != null && !jsonObj.get("appliedDate").isJsonNull()) && !jsonObj.get("appliedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appliedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appliedDate").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        ApplicantTrackingListApplicationsResponseApplicationsInnerStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      // validate the optional field `applicant`
      if (jsonObj.get("applicant") != null && !jsonObj.get("applicant").isJsonNull()) {
        ApplicantTrackingListApplicationsResponseApplicationsInnerApplicant.validateJsonObject(jsonObj.getAsJsonObject("applicant"));
      }
      // validate the optional field `job`
      if (jsonObj.get("job") != null && !jsonObj.get("job").isJsonNull()) {
        ApplicantTrackingListApplicationsResponseApplicationsInnerJob.validateJsonObject(jsonObj.getAsJsonObject("job"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicantTrackingListApplicationsResponseApplicationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicantTrackingListApplicationsResponseApplicationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicantTrackingListApplicationsResponseApplicationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicantTrackingListApplicationsResponseApplicationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicantTrackingListApplicationsResponseApplicationsInner>() {
           @Override
           public void write(JsonWriter out, ApplicantTrackingListApplicationsResponseApplicationsInner value) throws IOException {
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
           public ApplicantTrackingListApplicationsResponseApplicationsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicantTrackingListApplicationsResponseApplicationsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApplicantTrackingListApplicationsResponseApplicationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicantTrackingListApplicationsResponseApplicationsInner
  * @throws IOException if the JSON string is invalid with respect to ApplicantTrackingListApplicationsResponseApplicationsInner
  */
  public static ApplicantTrackingListApplicationsResponseApplicationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicantTrackingListApplicationsResponseApplicationsInner.class);
  }

 /**
  * Convert an instance of ApplicantTrackingListApplicationsResponseApplicationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

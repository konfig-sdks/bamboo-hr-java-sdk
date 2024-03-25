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
import com.konfigthis.client.model.ApplicantTrackingGetJobSummariesResponseInnerDepartment;
import com.konfigthis.client.model.ApplicantTrackingGetJobSummariesResponseInnerLocation;
import com.konfigthis.client.model.ApplicantTrackingGetJobSummariesResponseInnerStatus;
import com.konfigthis.client.model.ApplicantTrackingGetJobSummariesResponseInnerTitle;
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
 * ApplicantTrackingGetJobSummariesResponseInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicantTrackingGetJobSummariesResponseInner {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private ApplicantTrackingGetJobSummariesResponseInnerTitle title;

  public static final String SERIALIZED_NAME_POSTED_DATE = "postedDate";
  @SerializedName(SERIALIZED_NAME_POSTED_DATE)
  private String postedDate;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private ApplicantTrackingGetJobSummariesResponseInnerLocation location;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private ApplicantTrackingGetJobSummariesResponseInnerDepartment department;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ApplicantTrackingGetJobSummariesResponseInnerStatus status;

  public static final String SERIALIZED_NAME_NEW_APPLICANTS_COUNT = "newApplicantsCount";
  @SerializedName(SERIALIZED_NAME_NEW_APPLICANTS_COUNT)
  private Double newApplicantsCount;

  public static final String SERIALIZED_NAME_ACTIVE_APPLICANTS_COUNT = "activeApplicantsCount";
  @SerializedName(SERIALIZED_NAME_ACTIVE_APPLICANTS_COUNT)
  private Double activeApplicantsCount;

  public static final String SERIALIZED_NAME_TOTAL_APPLICANTS_COUNT = "totalApplicantsCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_APPLICANTS_COUNT)
  private Double totalApplicantsCount;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Double id;

  public static final String SERIALIZED_NAME_POSTING_URL = "postingUrl";
  @SerializedName(SERIALIZED_NAME_POSTING_URL)
  private String postingUrl;

  public ApplicantTrackingGetJobSummariesResponseInner() {
  }

  public ApplicantTrackingGetJobSummariesResponseInner title(ApplicantTrackingGetJobSummariesResponseInnerTitle title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingGetJobSummariesResponseInnerTitle getTitle() {
    return title;
  }


  public void setTitle(ApplicantTrackingGetJobSummariesResponseInnerTitle title) {
    
    
    
    this.title = title;
  }


  public ApplicantTrackingGetJobSummariesResponseInner postedDate(String postedDate) {
    
    
    
    
    this.postedDate = postedDate;
    return this;
  }

   /**
   * Get postedDate
   * @return postedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-30 16:59:40", value = "")

  public String getPostedDate() {
    return postedDate;
  }


  public void setPostedDate(String postedDate) {
    
    
    
    this.postedDate = postedDate;
  }


  public ApplicantTrackingGetJobSummariesResponseInner location(ApplicantTrackingGetJobSummariesResponseInnerLocation location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingGetJobSummariesResponseInnerLocation getLocation() {
    return location;
  }


  public void setLocation(ApplicantTrackingGetJobSummariesResponseInnerLocation location) {
    
    
    
    this.location = location;
  }


  public ApplicantTrackingGetJobSummariesResponseInner department(ApplicantTrackingGetJobSummariesResponseInnerDepartment department) {
    
    
    
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingGetJobSummariesResponseInnerDepartment getDepartment() {
    return department;
  }


  public void setDepartment(ApplicantTrackingGetJobSummariesResponseInnerDepartment department) {
    
    
    
    this.department = department;
  }


  public ApplicantTrackingGetJobSummariesResponseInner status(ApplicantTrackingGetJobSummariesResponseInnerStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingGetJobSummariesResponseInnerStatus getStatus() {
    return status;
  }


  public void setStatus(ApplicantTrackingGetJobSummariesResponseInnerStatus status) {
    
    
    
    this.status = status;
  }


  public ApplicantTrackingGetJobSummariesResponseInner newApplicantsCount(Double newApplicantsCount) {
    
    
    
    
    this.newApplicantsCount = newApplicantsCount;
    return this;
  }

  public ApplicantTrackingGetJobSummariesResponseInner newApplicantsCount(Integer newApplicantsCount) {
    
    
    
    
    this.newApplicantsCount = newApplicantsCount.doubleValue();
    return this;
  }

   /**
   * Get newApplicantsCount
   * @return newApplicantsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Double getNewApplicantsCount() {
    return newApplicantsCount;
  }


  public void setNewApplicantsCount(Double newApplicantsCount) {
    
    
    
    this.newApplicantsCount = newApplicantsCount;
  }


  public ApplicantTrackingGetJobSummariesResponseInner activeApplicantsCount(Double activeApplicantsCount) {
    
    
    
    
    this.activeApplicantsCount = activeApplicantsCount;
    return this;
  }

  public ApplicantTrackingGetJobSummariesResponseInner activeApplicantsCount(Integer activeApplicantsCount) {
    
    
    
    
    this.activeApplicantsCount = activeApplicantsCount.doubleValue();
    return this;
  }

   /**
   * Get activeApplicantsCount
   * @return activeApplicantsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Double getActiveApplicantsCount() {
    return activeApplicantsCount;
  }


  public void setActiveApplicantsCount(Double activeApplicantsCount) {
    
    
    
    this.activeApplicantsCount = activeApplicantsCount;
  }


  public ApplicantTrackingGetJobSummariesResponseInner totalApplicantsCount(Double totalApplicantsCount) {
    
    
    
    
    this.totalApplicantsCount = totalApplicantsCount;
    return this;
  }

  public ApplicantTrackingGetJobSummariesResponseInner totalApplicantsCount(Integer totalApplicantsCount) {
    
    
    
    
    this.totalApplicantsCount = totalApplicantsCount.doubleValue();
    return this;
  }

   /**
   * Get totalApplicantsCount
   * @return totalApplicantsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Double getTotalApplicantsCount() {
    return totalApplicantsCount;
  }


  public void setTotalApplicantsCount(Double totalApplicantsCount) {
    
    
    
    this.totalApplicantsCount = totalApplicantsCount;
  }


  public ApplicantTrackingGetJobSummariesResponseInner id(Double id) {
    
    
    
    
    this.id = id;
    return this;
  }

  public ApplicantTrackingGetJobSummariesResponseInner id(Integer id) {
    
    
    
    
    this.id = id.doubleValue();
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Double getId() {
    return id;
  }


  public void setId(Double id) {
    
    
    
    this.id = id;
  }


  public ApplicantTrackingGetJobSummariesResponseInner postingUrl(String postingUrl) {
    
    
    
    
    this.postingUrl = postingUrl;
    return this;
  }

   /**
   * Get postingUrl
   * @return postingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getPostingUrl() {
    return postingUrl;
  }


  public void setPostingUrl(String postingUrl) {
    
    
    
    this.postingUrl = postingUrl;
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
   * @return the ApplicantTrackingGetJobSummariesResponseInner instance itself
   */
  public ApplicantTrackingGetJobSummariesResponseInner putAdditionalProperty(String key, Object value) {
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
    ApplicantTrackingGetJobSummariesResponseInner applicantTrackingGetJobSummariesResponseInner = (ApplicantTrackingGetJobSummariesResponseInner) o;
    return Objects.equals(this.title, applicantTrackingGetJobSummariesResponseInner.title) &&
        Objects.equals(this.postedDate, applicantTrackingGetJobSummariesResponseInner.postedDate) &&
        Objects.equals(this.location, applicantTrackingGetJobSummariesResponseInner.location) &&
        Objects.equals(this.department, applicantTrackingGetJobSummariesResponseInner.department) &&
        Objects.equals(this.status, applicantTrackingGetJobSummariesResponseInner.status) &&
        Objects.equals(this.newApplicantsCount, applicantTrackingGetJobSummariesResponseInner.newApplicantsCount) &&
        Objects.equals(this.activeApplicantsCount, applicantTrackingGetJobSummariesResponseInner.activeApplicantsCount) &&
        Objects.equals(this.totalApplicantsCount, applicantTrackingGetJobSummariesResponseInner.totalApplicantsCount) &&
        Objects.equals(this.id, applicantTrackingGetJobSummariesResponseInner.id) &&
        Objects.equals(this.postingUrl, applicantTrackingGetJobSummariesResponseInner.postingUrl)&&
        Objects.equals(this.additionalProperties, applicantTrackingGetJobSummariesResponseInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, postedDate, location, department, status, newApplicantsCount, activeApplicantsCount, totalApplicantsCount, id, postingUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantTrackingGetJobSummariesResponseInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    newApplicantsCount: ").append(toIndentedString(newApplicantsCount)).append("\n");
    sb.append("    activeApplicantsCount: ").append(toIndentedString(activeApplicantsCount)).append("\n");
    sb.append("    totalApplicantsCount: ").append(toIndentedString(totalApplicantsCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    postingUrl: ").append(toIndentedString(postingUrl)).append("\n");
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
    openapiFields.add("postedDate");
    openapiFields.add("location");
    openapiFields.add("department");
    openapiFields.add("status");
    openapiFields.add("newApplicantsCount");
    openapiFields.add("activeApplicantsCount");
    openapiFields.add("totalApplicantsCount");
    openapiFields.add("id");
    openapiFields.add("postingUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicantTrackingGetJobSummariesResponseInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicantTrackingGetJobSummariesResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicantTrackingGetJobSummariesResponseInner is not found in the empty JSON string", ApplicantTrackingGetJobSummariesResponseInner.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `title`
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) {
        ApplicantTrackingGetJobSummariesResponseInnerTitle.validateJsonObject(jsonObj.getAsJsonObject("title"));
      }
      if ((jsonObj.get("postedDate") != null && !jsonObj.get("postedDate").isJsonNull()) && !jsonObj.get("postedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postedDate").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        ApplicantTrackingGetJobSummariesResponseInnerLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `department`
      if (jsonObj.get("department") != null && !jsonObj.get("department").isJsonNull()) {
        ApplicantTrackingGetJobSummariesResponseInnerDepartment.validateJsonObject(jsonObj.getAsJsonObject("department"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        ApplicantTrackingGetJobSummariesResponseInnerStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      if ((jsonObj.get("postingUrl") != null && !jsonObj.get("postingUrl").isJsonNull()) && !jsonObj.get("postingUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postingUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postingUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicantTrackingGetJobSummariesResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicantTrackingGetJobSummariesResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicantTrackingGetJobSummariesResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicantTrackingGetJobSummariesResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicantTrackingGetJobSummariesResponseInner>() {
           @Override
           public void write(JsonWriter out, ApplicantTrackingGetJobSummariesResponseInner value) throws IOException {
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
           public ApplicantTrackingGetJobSummariesResponseInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicantTrackingGetJobSummariesResponseInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApplicantTrackingGetJobSummariesResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicantTrackingGetJobSummariesResponseInner
  * @throws IOException if the JSON string is invalid with respect to ApplicantTrackingGetJobSummariesResponseInner
  */
  public static ApplicantTrackingGetJobSummariesResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicantTrackingGetJobSummariesResponseInner.class);
  }

 /**
  * Convert an instance of ApplicantTrackingGetJobSummariesResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


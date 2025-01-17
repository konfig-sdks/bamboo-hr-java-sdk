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
 * BenefitGroupPlan
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BenefitGroupPlan {
  public static final String SERIALIZED_NAME_BENEFIT_GROUP_ID = "benefitGroupId";
  @SerializedName(SERIALIZED_NAME_BENEFIT_GROUP_ID)
  private String benefitGroupId;

  public static final String SERIALIZED_NAME_BENEFIT_PLAN_ID = "benefitPlanId";
  @SerializedName(SERIALIZED_NAME_BENEFIT_PLAN_ID)
  private String benefitPlanId;

  public static final String SERIALIZED_NAME_ELIGIBILITY = "eligibility";
  @SerializedName(SERIALIZED_NAME_ELIGIBILITY)
  private String eligibility;

  public static final String SERIALIZED_NAME_WAIT_PERIOD = "waitPeriod";
  @SerializedName(SERIALIZED_NAME_WAIT_PERIOD)
  private String waitPeriod;

  public static final String SERIALIZED_NAME_WAIT_PERIOD_TYPE = "waitPeriodType";
  @SerializedName(SERIALIZED_NAME_WAIT_PERIOD_TYPE)
  private String waitPeriodType;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public BenefitGroupPlan() {
  }

  public BenefitGroupPlan benefitGroupId(String benefitGroupId) {
    
    
    
    
    this.benefitGroupId = benefitGroupId;
    return this;
  }

   /**
   * 
   * @return benefitGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBenefitGroupId() {
    return benefitGroupId;
  }


  public void setBenefitGroupId(String benefitGroupId) {
    
    
    
    this.benefitGroupId = benefitGroupId;
  }


  public BenefitGroupPlan benefitPlanId(String benefitPlanId) {
    
    
    
    
    this.benefitPlanId = benefitPlanId;
    return this;
  }

   /**
   * 
   * @return benefitPlanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBenefitPlanId() {
    return benefitPlanId;
  }


  public void setBenefitPlanId(String benefitPlanId) {
    
    
    
    this.benefitPlanId = benefitPlanId;
  }


  public BenefitGroupPlan eligibility(String eligibility) {
    
    
    
    
    this.eligibility = eligibility;
    return this;
  }

   /**
   * 
   * @return eligibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEligibility() {
    return eligibility;
  }


  public void setEligibility(String eligibility) {
    
    
    
    this.eligibility = eligibility;
  }


  public BenefitGroupPlan waitPeriod(String waitPeriod) {
    
    
    
    
    this.waitPeriod = waitPeriod;
    return this;
  }

   /**
   * 
   * @return waitPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWaitPeriod() {
    return waitPeriod;
  }


  public void setWaitPeriod(String waitPeriod) {
    
    
    
    this.waitPeriod = waitPeriod;
  }


  public BenefitGroupPlan waitPeriodType(String waitPeriodType) {
    
    
    
    
    this.waitPeriodType = waitPeriodType;
    return this;
  }

   /**
   * 
   * @return waitPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWaitPeriodType() {
    return waitPeriodType;
  }


  public void setWaitPeriodType(String waitPeriodType) {
    
    
    
    this.waitPeriodType = waitPeriodType;
  }


  public BenefitGroupPlan startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public BenefitGroupPlan endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
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
   * @return the BenefitGroupPlan instance itself
   */
  public BenefitGroupPlan putAdditionalProperty(String key, Object value) {
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
    BenefitGroupPlan benefitGroupPlan = (BenefitGroupPlan) o;
    return Objects.equals(this.benefitGroupId, benefitGroupPlan.benefitGroupId) &&
        Objects.equals(this.benefitPlanId, benefitGroupPlan.benefitPlanId) &&
        Objects.equals(this.eligibility, benefitGroupPlan.eligibility) &&
        Objects.equals(this.waitPeriod, benefitGroupPlan.waitPeriod) &&
        Objects.equals(this.waitPeriodType, benefitGroupPlan.waitPeriodType) &&
        Objects.equals(this.startDate, benefitGroupPlan.startDate) &&
        Objects.equals(this.endDate, benefitGroupPlan.endDate)&&
        Objects.equals(this.additionalProperties, benefitGroupPlan.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefitGroupId, benefitPlanId, eligibility, waitPeriod, waitPeriodType, startDate, endDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitGroupPlan {\n");
    sb.append("    benefitGroupId: ").append(toIndentedString(benefitGroupId)).append("\n");
    sb.append("    benefitPlanId: ").append(toIndentedString(benefitPlanId)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    waitPeriod: ").append(toIndentedString(waitPeriod)).append("\n");
    sb.append("    waitPeriodType: ").append(toIndentedString(waitPeriodType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("benefitGroupId");
    openapiFields.add("benefitPlanId");
    openapiFields.add("eligibility");
    openapiFields.add("waitPeriod");
    openapiFields.add("waitPeriodType");
    openapiFields.add("startDate");
    openapiFields.add("endDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BenefitGroupPlan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BenefitGroupPlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BenefitGroupPlan is not found in the empty JSON string", BenefitGroupPlan.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("benefitGroupId") != null && !jsonObj.get("benefitGroupId").isJsonNull()) && !jsonObj.get("benefitGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefitGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefitGroupId").toString()));
      }
      if ((jsonObj.get("benefitPlanId") != null && !jsonObj.get("benefitPlanId").isJsonNull()) && !jsonObj.get("benefitPlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefitPlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefitPlanId").toString()));
      }
      if ((jsonObj.get("eligibility") != null && !jsonObj.get("eligibility").isJsonNull()) && !jsonObj.get("eligibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eligibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eligibility").toString()));
      }
      if ((jsonObj.get("waitPeriod") != null && !jsonObj.get("waitPeriod").isJsonNull()) && !jsonObj.get("waitPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waitPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waitPeriod").toString()));
      }
      if ((jsonObj.get("waitPeriodType") != null && !jsonObj.get("waitPeriodType").isJsonNull()) && !jsonObj.get("waitPeriodType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `waitPeriodType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("waitPeriodType").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BenefitGroupPlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BenefitGroupPlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BenefitGroupPlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BenefitGroupPlan.class));

       return (TypeAdapter<T>) new TypeAdapter<BenefitGroupPlan>() {
           @Override
           public void write(JsonWriter out, BenefitGroupPlan value) throws IOException {
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
           public BenefitGroupPlan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BenefitGroupPlan instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BenefitGroupPlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BenefitGroupPlan
  * @throws IOException if the JSON string is invalid with respect to BenefitGroupPlan
  */
  public static BenefitGroupPlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BenefitGroupPlan.class);
  }

 /**
  * Convert an instance of BenefitGroupPlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * CompanyBenefitType
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CompanyBenefitType {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_CAN_BE_ACA_PLAN = "canBeAcaPlan";
  @SerializedName(SERIALIZED_NAME_CAN_BE_ACA_PLAN)
  private Boolean canBeAcaPlan;

  public static final String SERIALIZED_NAME_CAN_CO_EXIST_ENROLLMENT = "canCoExistEnrollment";
  @SerializedName(SERIALIZED_NAME_CAN_CO_EXIST_ENROLLMENT)
  private Boolean canCoExistEnrollment;

  public static final String SERIALIZED_NAME_IS_REIMBURSEMENT_PLAN = "isReimbursementPlan";
  @SerializedName(SERIALIZED_NAME_IS_REIMBURSEMENT_PLAN)
  private Boolean isReimbursementPlan;

  public CompanyBenefitType() {
  }

  public CompanyBenefitType name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the company benefit plan.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the company benefit plan.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CompanyBenefitType slug(String slug) {
    
    
    
    
    this.slug = slug;
    return this;
  }

   /**
   * The unique identifier for the company benefit plan.
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the company benefit plan.")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    
    
    
    this.slug = slug;
  }


  public CompanyBenefitType canBeAcaPlan(Boolean canBeAcaPlan) {
    
    
    
    
    this.canBeAcaPlan = canBeAcaPlan;
    return this;
  }

   /**
   * Can the company benefit plan be an ACA plan.
   * @return canBeAcaPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can the company benefit plan be an ACA plan.")

  public Boolean getCanBeAcaPlan() {
    return canBeAcaPlan;
  }


  public void setCanBeAcaPlan(Boolean canBeAcaPlan) {
    
    
    
    this.canBeAcaPlan = canBeAcaPlan;
  }


  public CompanyBenefitType canCoExistEnrollment(Boolean canCoExistEnrollment) {
    
    
    
    
    this.canCoExistEnrollment = canCoExistEnrollment;
    return this;
  }

   /**
   * Can the company benefit plan co-exist with an enrollment plan.
   * @return canCoExistEnrollment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can the company benefit plan co-exist with an enrollment plan.")

  public Boolean getCanCoExistEnrollment() {
    return canCoExistEnrollment;
  }


  public void setCanCoExistEnrollment(Boolean canCoExistEnrollment) {
    
    
    
    this.canCoExistEnrollment = canCoExistEnrollment;
  }


  public CompanyBenefitType isReimbursementPlan(Boolean isReimbursementPlan) {
    
    
    
    
    this.isReimbursementPlan = isReimbursementPlan;
    return this;
  }

   /**
   * Is the company benefit plan a reimbursement plan.
   * @return isReimbursementPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the company benefit plan a reimbursement plan.")

  public Boolean getIsReimbursementPlan() {
    return isReimbursementPlan;
  }


  public void setIsReimbursementPlan(Boolean isReimbursementPlan) {
    
    
    
    this.isReimbursementPlan = isReimbursementPlan;
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
   * @return the CompanyBenefitType instance itself
   */
  public CompanyBenefitType putAdditionalProperty(String key, Object value) {
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
    CompanyBenefitType companyBenefitType = (CompanyBenefitType) o;
    return Objects.equals(this.name, companyBenefitType.name) &&
        Objects.equals(this.slug, companyBenefitType.slug) &&
        Objects.equals(this.canBeAcaPlan, companyBenefitType.canBeAcaPlan) &&
        Objects.equals(this.canCoExistEnrollment, companyBenefitType.canCoExistEnrollment) &&
        Objects.equals(this.isReimbursementPlan, companyBenefitType.isReimbursementPlan)&&
        Objects.equals(this.additionalProperties, companyBenefitType.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, canBeAcaPlan, canCoExistEnrollment, isReimbursementPlan, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyBenefitType {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    canBeAcaPlan: ").append(toIndentedString(canBeAcaPlan)).append("\n");
    sb.append("    canCoExistEnrollment: ").append(toIndentedString(canCoExistEnrollment)).append("\n");
    sb.append("    isReimbursementPlan: ").append(toIndentedString(isReimbursementPlan)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("slug");
    openapiFields.add("canBeAcaPlan");
    openapiFields.add("canCoExistEnrollment");
    openapiFields.add("isReimbursementPlan");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompanyBenefitType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CompanyBenefitType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompanyBenefitType is not found in the empty JSON string", CompanyBenefitType.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompanyBenefitType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompanyBenefitType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompanyBenefitType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompanyBenefitType.class));

       return (TypeAdapter<T>) new TypeAdapter<CompanyBenefitType>() {
           @Override
           public void write(JsonWriter out, CompanyBenefitType value) throws IOException {
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
           public CompanyBenefitType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CompanyBenefitType instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CompanyBenefitType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompanyBenefitType
  * @throws IOException if the JSON string is invalid with respect to CompanyBenefitType
  */
  public static CompanyBenefitType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyBenefitType.class);
  }

 /**
  * Convert an instance of CompanyBenefitType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


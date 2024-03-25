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
 * EmployeeDependent
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeDependent {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_RELATIONSHIP = "relationship";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP)
  private String relationship;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "addressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "addressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_HOME_PHONE = "homePhone";
  @SerializedName(SERIALIZED_NAME_HOME_PHONE)
  private String homePhone;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_IS_US_CITIZEN = "isUsCitizen";
  @SerializedName(SERIALIZED_NAME_IS_US_CITIZEN)
  private String isUsCitizen;

  public static final String SERIALIZED_NAME_IS_STUDENT = "isStudent";
  @SerializedName(SERIALIZED_NAME_IS_STUDENT)
  private String isStudent;

  public EmployeeDependent() {
  }

  public EmployeeDependent employeeId(String employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * 
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public EmployeeDependent firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * 
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public EmployeeDependent middleName(String middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * 
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    
    
    
    this.middleName = middleName;
  }


  public EmployeeDependent lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * 
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public EmployeeDependent relationship(String relationship) {
    
    
    
    
    this.relationship = relationship;
    return this;
  }

   /**
   * 
   * @return relationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRelationship() {
    return relationship;
  }


  public void setRelationship(String relationship) {
    
    
    
    this.relationship = relationship;
  }


  public EmployeeDependent gender(String gender) {
    
    
    
    
    this.gender = gender;
    return this;
  }

   /**
   * 
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    
    
    
    this.gender = gender;
  }


  public EmployeeDependent ssn(String ssn) {
    
    
    
    
    this.ssn = ssn;
    return this;
  }

   /**
   * 
   * @return ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    
    
    
    this.ssn = ssn;
  }


  public EmployeeDependent dateOfBirth(String dateOfBirth) {
    
    
    
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * 
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    
    
    
    this.dateOfBirth = dateOfBirth;
  }


  public EmployeeDependent addressLine1(String addressLine1) {
    
    
    
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * 
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    
    
    
    this.addressLine1 = addressLine1;
  }


  public EmployeeDependent addressLine2(String addressLine2) {
    
    
    
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * 
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    
    
    
    this.addressLine2 = addressLine2;
  }


  public EmployeeDependent city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public EmployeeDependent state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * 
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public EmployeeDependent zipCode(String zipCode) {
    
    
    
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * 
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    
    
    
    this.zipCode = zipCode;
  }


  public EmployeeDependent homePhone(String homePhone) {
    
    
    
    
    this.homePhone = homePhone;
    return this;
  }

   /**
   * 
   * @return homePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHomePhone() {
    return homePhone;
  }


  public void setHomePhone(String homePhone) {
    
    
    
    this.homePhone = homePhone;
  }


  public EmployeeDependent country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * 
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public EmployeeDependent isUsCitizen(String isUsCitizen) {
    
    
    
    
    this.isUsCitizen = isUsCitizen;
    return this;
  }

   /**
   * 
   * @return isUsCitizen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIsUsCitizen() {
    return isUsCitizen;
  }


  public void setIsUsCitizen(String isUsCitizen) {
    
    
    
    this.isUsCitizen = isUsCitizen;
  }


  public EmployeeDependent isStudent(String isStudent) {
    
    
    
    
    this.isStudent = isStudent;
    return this;
  }

   /**
   * 
   * @return isStudent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIsStudent() {
    return isStudent;
  }


  public void setIsStudent(String isStudent) {
    
    
    
    this.isStudent = isStudent;
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
   * @return the EmployeeDependent instance itself
   */
  public EmployeeDependent putAdditionalProperty(String key, Object value) {
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
    EmployeeDependent employeeDependent = (EmployeeDependent) o;
    return Objects.equals(this.employeeId, employeeDependent.employeeId) &&
        Objects.equals(this.firstName, employeeDependent.firstName) &&
        Objects.equals(this.middleName, employeeDependent.middleName) &&
        Objects.equals(this.lastName, employeeDependent.lastName) &&
        Objects.equals(this.relationship, employeeDependent.relationship) &&
        Objects.equals(this.gender, employeeDependent.gender) &&
        Objects.equals(this.ssn, employeeDependent.ssn) &&
        Objects.equals(this.dateOfBirth, employeeDependent.dateOfBirth) &&
        Objects.equals(this.addressLine1, employeeDependent.addressLine1) &&
        Objects.equals(this.addressLine2, employeeDependent.addressLine2) &&
        Objects.equals(this.city, employeeDependent.city) &&
        Objects.equals(this.state, employeeDependent.state) &&
        Objects.equals(this.zipCode, employeeDependent.zipCode) &&
        Objects.equals(this.homePhone, employeeDependent.homePhone) &&
        Objects.equals(this.country, employeeDependent.country) &&
        Objects.equals(this.isUsCitizen, employeeDependent.isUsCitizen) &&
        Objects.equals(this.isStudent, employeeDependent.isStudent)&&
        Objects.equals(this.additionalProperties, employeeDependent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, firstName, middleName, lastName, relationship, gender, ssn, dateOfBirth, addressLine1, addressLine2, city, state, zipCode, homePhone, country, isUsCitizen, isStudent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeDependent {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    isUsCitizen: ").append(toIndentedString(isUsCitizen)).append("\n");
    sb.append("    isStudent: ").append(toIndentedString(isStudent)).append("\n");
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
    openapiFields.add("employeeId");
    openapiFields.add("firstName");
    openapiFields.add("middleName");
    openapiFields.add("lastName");
    openapiFields.add("relationship");
    openapiFields.add("gender");
    openapiFields.add("ssn");
    openapiFields.add("dateOfBirth");
    openapiFields.add("addressLine1");
    openapiFields.add("addressLine2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zipCode");
    openapiFields.add("homePhone");
    openapiFields.add("country");
    openapiFields.add("isUsCitizen");
    openapiFields.add("isStudent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeDependent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeDependent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeDependent is not found in the empty JSON string", EmployeeDependent.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("middleName") != null && !jsonObj.get("middleName").isJsonNull()) && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("relationship") != null && !jsonObj.get("relationship").isJsonNull()) && !jsonObj.get("relationship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relationship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relationship").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("ssn") != null && !jsonObj.get("ssn").isJsonNull()) && !jsonObj.get("ssn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssn").toString()));
      }
      if ((jsonObj.get("dateOfBirth") != null && !jsonObj.get("dateOfBirth").isJsonNull()) && !jsonObj.get("dateOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateOfBirth").toString()));
      }
      if ((jsonObj.get("addressLine1") != null && !jsonObj.get("addressLine1").isJsonNull()) && !jsonObj.get("addressLine1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLine1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressLine1").toString()));
      }
      if ((jsonObj.get("addressLine2") != null && !jsonObj.get("addressLine2").isJsonNull()) && !jsonObj.get("addressLine2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLine2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressLine2").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("zipCode") != null && !jsonObj.get("zipCode").isJsonNull()) && !jsonObj.get("zipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipCode").toString()));
      }
      if ((jsonObj.get("homePhone") != null && !jsonObj.get("homePhone").isJsonNull()) && !jsonObj.get("homePhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homePhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homePhone").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("isUsCitizen") != null && !jsonObj.get("isUsCitizen").isJsonNull()) && !jsonObj.get("isUsCitizen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isUsCitizen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isUsCitizen").toString()));
      }
      if ((jsonObj.get("isStudent") != null && !jsonObj.get("isStudent").isJsonNull()) && !jsonObj.get("isStudent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isStudent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isStudent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeDependent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeDependent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeDependent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeDependent.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeDependent>() {
           @Override
           public void write(JsonWriter out, EmployeeDependent value) throws IOException {
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
           public EmployeeDependent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeDependent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeDependent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeDependent
  * @throws IOException if the JSON string is invalid with respect to EmployeeDependent
  */
  public static EmployeeDependent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeDependent.class);
  }

 /**
  * Convert an instance of EmployeeDependent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


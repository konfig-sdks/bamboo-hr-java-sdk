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
 * GoalsGetAllAggregateInfo200Response1CommentsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GoalsGetAllAggregateInfo200Response1CommentsInner {
  public static final String SERIALIZED_NAME_GOAL_ID = "goalId";
  @SerializedName(SERIALIZED_NAME_GOAL_ID)
  private Integer goalId;

  public static final String SERIALIZED_NAME_COMMENT_COUNT = "commentCount";
  @SerializedName(SERIALIZED_NAME_COMMENT_COUNT)
  private Integer commentCount;

  public GoalsGetAllAggregateInfo200Response1CommentsInner() {
  }

  public GoalsGetAllAggregateInfo200Response1CommentsInner goalId(Integer goalId) {
    
    
    
    
    this.goalId = goalId;
    return this;
  }

   /**
   * The goalId that the comments are linked to.
   * @return goalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "The goalId that the comments are linked to.")

  public Integer getGoalId() {
    return goalId;
  }


  public void setGoalId(Integer goalId) {
    
    
    
    this.goalId = goalId;
  }


  public GoalsGetAllAggregateInfo200Response1CommentsInner commentCount(Integer commentCount) {
    
    
    
    
    this.commentCount = commentCount;
    return this;
  }

   /**
   * How many comments are linked to the goal
   * @return commentCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "How many comments are linked to the goal")

  public Integer getCommentCount() {
    return commentCount;
  }


  public void setCommentCount(Integer commentCount) {
    
    
    
    this.commentCount = commentCount;
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
   * @return the GoalsGetAllAggregateInfo200Response1CommentsInner instance itself
   */
  public GoalsGetAllAggregateInfo200Response1CommentsInner putAdditionalProperty(String key, Object value) {
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
    GoalsGetAllAggregateInfo200Response1CommentsInner goalsGetAllAggregateInfo200Response1CommentsInner = (GoalsGetAllAggregateInfo200Response1CommentsInner) o;
    return Objects.equals(this.goalId, goalsGetAllAggregateInfo200Response1CommentsInner.goalId) &&
        Objects.equals(this.commentCount, goalsGetAllAggregateInfo200Response1CommentsInner.commentCount)&&
        Objects.equals(this.additionalProperties, goalsGetAllAggregateInfo200Response1CommentsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goalId, commentCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalsGetAllAggregateInfo200Response1CommentsInner {\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
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
    openapiFields.add("goalId");
    openapiFields.add("commentCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoalsGetAllAggregateInfo200Response1CommentsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoalsGetAllAggregateInfo200Response1CommentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalsGetAllAggregateInfo200Response1CommentsInner is not found in the empty JSON string", GoalsGetAllAggregateInfo200Response1CommentsInner.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoalsGetAllAggregateInfo200Response1CommentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalsGetAllAggregateInfo200Response1CommentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalsGetAllAggregateInfo200Response1CommentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalsGetAllAggregateInfo200Response1CommentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalsGetAllAggregateInfo200Response1CommentsInner>() {
           @Override
           public void write(JsonWriter out, GoalsGetAllAggregateInfo200Response1CommentsInner value) throws IOException {
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
           public GoalsGetAllAggregateInfo200Response1CommentsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoalsGetAllAggregateInfo200Response1CommentsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoalsGetAllAggregateInfo200Response1CommentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoalsGetAllAggregateInfo200Response1CommentsInner
  * @throws IOException if the JSON string is invalid with respect to GoalsGetAllAggregateInfo200Response1CommentsInner
  */
  public static GoalsGetAllAggregateInfo200Response1CommentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalsGetAllAggregateInfo200Response1CommentsInner.class);
  }

 /**
  * Convert an instance of GoalsGetAllAggregateInfo200Response1CommentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


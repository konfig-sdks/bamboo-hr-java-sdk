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
import com.konfigthis.client.model.GoalsGetAllAggregateInfo200ResponseCommentsInner;
import com.konfigthis.client.model.GoalsGetAllAggregateInfo200ResponseFiltersInner;
import com.konfigthis.client.model.GoalsGetAllAggregateInfo200ResponseGoalsInner;
import com.konfigthis.client.model.GoalsGetAllAggregateInfo200ResponsePersonsInner;
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
 * GoalsGetAllAggregateInfo200Response
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GoalsGetAllAggregateInfo200Response {
  public static final String SERIALIZED_NAME_CAN_ALIGN = "canAlign";
  @SerializedName(SERIALIZED_NAME_CAN_ALIGN)
  private Boolean canAlign;

  public static final String SERIALIZED_NAME_CAN_CREATE_GOALS = "canCreateGoals";
  @SerializedName(SERIALIZED_NAME_CAN_CREATE_GOALS)
  private Boolean canCreateGoals;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<GoalsGetAllAggregateInfo200ResponseFiltersInner> filters = null;

  public static final String SERIALIZED_NAME_SELECTED_FILTER = "selectedFilter";
  @SerializedName(SERIALIZED_NAME_SELECTED_FILTER)
  private String selectedFilter;

  public static final String SERIALIZED_NAME_GOALS = "goals";
  @SerializedName(SERIALIZED_NAME_GOALS)
  private List<GoalsGetAllAggregateInfo200ResponseGoalsInner> goals = null;

  public static final String SERIALIZED_NAME_PERSONS = "persons";
  @SerializedName(SERIALIZED_NAME_PERSONS)
  private List<GoalsGetAllAggregateInfo200ResponsePersonsInner> persons = null;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private List<GoalsGetAllAggregateInfo200ResponseCommentsInner> comments = null;

  public GoalsGetAllAggregateInfo200Response() {
  }

  public GoalsGetAllAggregateInfo200Response canAlign(Boolean canAlign) {
    
    
    
    
    this.canAlign = canAlign;
    return this;
  }

   /**
   * The selected user can align goals with other users.
   * @return canAlign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "The selected user can align goals with other users.")

  public Boolean getCanAlign() {
    return canAlign;
  }


  public void setCanAlign(Boolean canAlign) {
    
    
    
    this.canAlign = canAlign;
  }


  public GoalsGetAllAggregateInfo200Response canCreateGoals(Boolean canCreateGoals) {
    
    
    
    
    this.canCreateGoals = canCreateGoals;
    return this;
  }

   /**
   * The selected user can create a goal.
   * @return canCreateGoals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "The selected user can create a goal.")

  public Boolean getCanCreateGoals() {
    return canCreateGoals;
  }


  public void setCanCreateGoals(Boolean canCreateGoals) {
    
    
    
    this.canCreateGoals = canCreateGoals;
  }


  public GoalsGetAllAggregateInfo200Response filters(List<GoalsGetAllAggregateInfo200ResponseFiltersInner> filters) {
    
    
    
    
    this.filters = filters;
    return this;
  }

  public GoalsGetAllAggregateInfo200Response addFiltersItem(GoalsGetAllAggregateInfo200ResponseFiltersInner filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * All the goals of the user seperated by filter.
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All the goals of the user seperated by filter.")

  public List<GoalsGetAllAggregateInfo200ResponseFiltersInner> getFilters() {
    return filters;
  }


  public void setFilters(List<GoalsGetAllAggregateInfo200ResponseFiltersInner> filters) {
    
    
    
    this.filters = filters;
  }


  public GoalsGetAllAggregateInfo200Response selectedFilter(String selectedFilter) {
    
    
    
    
    this.selectedFilter = selectedFilter;
    return this;
  }

   /**
   * The id of the current selected filter.
   * @return selectedFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "status-inProgress", value = "The id of the current selected filter.")

  public String getSelectedFilter() {
    return selectedFilter;
  }


  public void setSelectedFilter(String selectedFilter) {
    
    
    
    this.selectedFilter = selectedFilter;
  }


  public GoalsGetAllAggregateInfo200Response goals(List<GoalsGetAllAggregateInfo200ResponseGoalsInner> goals) {
    
    
    
    
    this.goals = goals;
    return this;
  }

  public GoalsGetAllAggregateInfo200Response addGoalsItem(GoalsGetAllAggregateInfo200ResponseGoalsInner goalsItem) {
    if (this.goals == null) {
      this.goals = new ArrayList<>();
    }
    this.goals.add(goalsItem);
    return this;
  }

   /**
   * All goals in selected filter.
   * @return goals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All goals in selected filter.")

  public List<GoalsGetAllAggregateInfo200ResponseGoalsInner> getGoals() {
    return goals;
  }


  public void setGoals(List<GoalsGetAllAggregateInfo200ResponseGoalsInner> goals) {
    
    
    
    this.goals = goals;
  }


  public GoalsGetAllAggregateInfo200Response persons(List<GoalsGetAllAggregateInfo200ResponsePersonsInner> persons) {
    
    
    
    
    this.persons = persons;
    return this;
  }

  public GoalsGetAllAggregateInfo200Response addPersonsItem(GoalsGetAllAggregateInfo200ResponsePersonsInner personsItem) {
    if (this.persons == null) {
      this.persons = new ArrayList<>();
    }
    this.persons.add(personsItem);
    return this;
  }

   /**
   * A list of people with access to the goal.
   * @return persons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of people with access to the goal.")

  public List<GoalsGetAllAggregateInfo200ResponsePersonsInner> getPersons() {
    return persons;
  }


  public void setPersons(List<GoalsGetAllAggregateInfo200ResponsePersonsInner> persons) {
    
    
    
    this.persons = persons;
  }


  public GoalsGetAllAggregateInfo200Response comments(List<GoalsGetAllAggregateInfo200ResponseCommentsInner> comments) {
    
    
    
    
    this.comments = comments;
    return this;
  }

  public GoalsGetAllAggregateInfo200Response addCommentsItem(GoalsGetAllAggregateInfo200ResponseCommentsInner commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * A list of how many comments belong to each goal.
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of how many comments belong to each goal.")

  public List<GoalsGetAllAggregateInfo200ResponseCommentsInner> getComments() {
    return comments;
  }


  public void setComments(List<GoalsGetAllAggregateInfo200ResponseCommentsInner> comments) {
    
    
    
    this.comments = comments;
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
   * @return the GoalsGetAllAggregateInfo200Response instance itself
   */
  public GoalsGetAllAggregateInfo200Response putAdditionalProperty(String key, Object value) {
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
    GoalsGetAllAggregateInfo200Response goalsGetAllAggregateInfo200Response = (GoalsGetAllAggregateInfo200Response) o;
    return Objects.equals(this.canAlign, goalsGetAllAggregateInfo200Response.canAlign) &&
        Objects.equals(this.canCreateGoals, goalsGetAllAggregateInfo200Response.canCreateGoals) &&
        Objects.equals(this.filters, goalsGetAllAggregateInfo200Response.filters) &&
        Objects.equals(this.selectedFilter, goalsGetAllAggregateInfo200Response.selectedFilter) &&
        Objects.equals(this.goals, goalsGetAllAggregateInfo200Response.goals) &&
        Objects.equals(this.persons, goalsGetAllAggregateInfo200Response.persons) &&
        Objects.equals(this.comments, goalsGetAllAggregateInfo200Response.comments)&&
        Objects.equals(this.additionalProperties, goalsGetAllAggregateInfo200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canAlign, canCreateGoals, filters, selectedFilter, goals, persons, comments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalsGetAllAggregateInfo200Response {\n");
    sb.append("    canAlign: ").append(toIndentedString(canAlign)).append("\n");
    sb.append("    canCreateGoals: ").append(toIndentedString(canCreateGoals)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    selectedFilter: ").append(toIndentedString(selectedFilter)).append("\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
    sb.append("    persons: ").append(toIndentedString(persons)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
    openapiFields.add("canAlign");
    openapiFields.add("canCreateGoals");
    openapiFields.add("filters");
    openapiFields.add("selectedFilter");
    openapiFields.add("goals");
    openapiFields.add("persons");
    openapiFields.add("comments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoalsGetAllAggregateInfo200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoalsGetAllAggregateInfo200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalsGetAllAggregateInfo200Response is not found in the empty JSON string", GoalsGetAllAggregateInfo200Response.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            GoalsGetAllAggregateInfo200ResponseFiltersInner.validateJsonObject(jsonArrayfilters.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("selectedFilter") != null && !jsonObj.get("selectedFilter").isJsonNull()) && !jsonObj.get("selectedFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedFilter").toString()));
      }
      if (jsonObj.get("goals") != null && !jsonObj.get("goals").isJsonNull()) {
        JsonArray jsonArraygoals = jsonObj.getAsJsonArray("goals");
        if (jsonArraygoals != null) {
          // ensure the json data is an array
          if (!jsonObj.get("goals").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `goals` to be an array in the JSON string but got `%s`", jsonObj.get("goals").toString()));
          }

          // validate the optional field `goals` (array)
          for (int i = 0; i < jsonArraygoals.size(); i++) {
            GoalsGetAllAggregateInfo200ResponseGoalsInner.validateJsonObject(jsonArraygoals.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("persons") != null && !jsonObj.get("persons").isJsonNull()) {
        JsonArray jsonArraypersons = jsonObj.getAsJsonArray("persons");
        if (jsonArraypersons != null) {
          // ensure the json data is an array
          if (!jsonObj.get("persons").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `persons` to be an array in the JSON string but got `%s`", jsonObj.get("persons").toString()));
          }

          // validate the optional field `persons` (array)
          for (int i = 0; i < jsonArraypersons.size(); i++) {
            GoalsGetAllAggregateInfo200ResponsePersonsInner.validateJsonObject(jsonArraypersons.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) {
        JsonArray jsonArraycomments = jsonObj.getAsJsonArray("comments");
        if (jsonArraycomments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("comments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `comments` to be an array in the JSON string but got `%s`", jsonObj.get("comments").toString()));
          }

          // validate the optional field `comments` (array)
          for (int i = 0; i < jsonArraycomments.size(); i++) {
            GoalsGetAllAggregateInfo200ResponseCommentsInner.validateJsonObject(jsonArraycomments.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoalsGetAllAggregateInfo200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalsGetAllAggregateInfo200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalsGetAllAggregateInfo200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalsGetAllAggregateInfo200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalsGetAllAggregateInfo200Response>() {
           @Override
           public void write(JsonWriter out, GoalsGetAllAggregateInfo200Response value) throws IOException {
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
           public GoalsGetAllAggregateInfo200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoalsGetAllAggregateInfo200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoalsGetAllAggregateInfo200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoalsGetAllAggregateInfo200Response
  * @throws IOException if the JSON string is invalid with respect to GoalsGetAllAggregateInfo200Response
  */
  public static GoalsGetAllAggregateInfo200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalsGetAllAggregateInfo200Response.class);
  }

 /**
  * Convert an instance of GoalsGetAllAggregateInfo200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


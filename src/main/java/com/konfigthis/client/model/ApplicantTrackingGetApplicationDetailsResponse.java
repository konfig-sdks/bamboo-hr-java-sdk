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
import com.konfigthis.client.model.ApplicantTrackingGetApplicationDetailsResponseApplicant;
import com.konfigthis.client.model.ApplicantTrackingGetApplicationDetailsResponseJob;
import com.konfigthis.client.model.ApplicantTrackingGetApplicationDetailsResponseMovedTo;
import com.konfigthis.client.model.ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInner;
import com.konfigthis.client.model.ApplicantTrackingGetApplicationDetailsResponseStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ApplicantTrackingGetApplicationDetailsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicantTrackingGetApplicationDetailsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Double id;

  public static final String SERIALIZED_NAME_APPLIED_DATE = "appliedDate";
  @SerializedName(SERIALIZED_NAME_APPLIED_DATE)
  private String appliedDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ApplicantTrackingGetApplicationDetailsResponseStatus status;

  public static final String SERIALIZED_NAME_RATING = "rating";
  @SerializedName(SERIALIZED_NAME_RATING)
  private Double rating;

  public static final String SERIALIZED_NAME_RESUME_FILE_ID = "resumeFileId";
  @SerializedName(SERIALIZED_NAME_RESUME_FILE_ID)
  private Double resumeFileId;

  public static final String SERIALIZED_NAME_COVER_LETTER_FILE_ID = "coverLetterFileId";
  @SerializedName(SERIALIZED_NAME_COVER_LETTER_FILE_ID)
  private Double coverLetterFileId;

  public static final String SERIALIZED_NAME_MOVED_TO = "movedTo";
  @SerializedName(SERIALIZED_NAME_MOVED_TO)
  private ApplicantTrackingGetApplicationDetailsResponseMovedTo movedTo;

  public static final String SERIALIZED_NAME_MOVED_FROM = "movedFrom";
  @SerializedName(SERIALIZED_NAME_MOVED_FROM)
  private String movedFrom;

  public static final String SERIALIZED_NAME_ALSO_APPLIED_TO_COUNT = "alsoAppliedToCount";
  @SerializedName(SERIALIZED_NAME_ALSO_APPLIED_TO_COUNT)
  private Double alsoAppliedToCount;

  public static final String SERIALIZED_NAME_DUPLICATE_APPLICATION_COUNT = "duplicateApplicationCount";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_APPLICATION_COUNT)
  private Double duplicateApplicationCount;

  public static final String SERIALIZED_NAME_REFERRED_BY = "referredBy";
  @SerializedName(SERIALIZED_NAME_REFERRED_BY)
  private String referredBy;

  public static final String SERIALIZED_NAME_DESIRED_SALARY = "desiredSalary";
  @SerializedName(SERIALIZED_NAME_DESIRED_SALARY)
  private String desiredSalary;

  public static final String SERIALIZED_NAME_COMMENT_COUNT = "commentCount";
  @SerializedName(SERIALIZED_NAME_COMMENT_COUNT)
  private Double commentCount;

  public static final String SERIALIZED_NAME_EMAIL_COUNT = "emailCount";
  @SerializedName(SERIALIZED_NAME_EMAIL_COUNT)
  private Double emailCount;

  public static final String SERIALIZED_NAME_QUESTIONS_AND_ANSWERS = "questionsAndAnswers";
  @SerializedName(SERIALIZED_NAME_QUESTIONS_AND_ANSWERS)
  private List<ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInner> questionsAndAnswers = null;

  public static final String SERIALIZED_NAME_APPLICANT = "applicant";
  @SerializedName(SERIALIZED_NAME_APPLICANT)
  private ApplicantTrackingGetApplicationDetailsResponseApplicant applicant;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private ApplicantTrackingGetApplicationDetailsResponseJob job;

  public ApplicantTrackingGetApplicationDetailsResponse() {
  }

  public ApplicantTrackingGetApplicationDetailsResponse id(Double id) {
    
    
    
    
    this.id = id;
    return this;
  }

  public ApplicantTrackingGetApplicationDetailsResponse id(Integer id) {
    
    
    
    
    this.id = id.doubleValue();
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Double getId() {
    return id;
  }


  public void setId(Double id) {
    
    
    
    this.id = id;
  }


  public ApplicantTrackingGetApplicationDetailsResponse appliedDate(String appliedDate) {
    
    
    
    
    this.appliedDate = appliedDate;
    return this;
  }

   /**
   * Get appliedDate
   * @return appliedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-09 19:43:31", value = "")

  public String getAppliedDate() {
    return appliedDate;
  }


  public void setAppliedDate(String appliedDate) {
    
    
    
    this.appliedDate = appliedDate;
  }


  public ApplicantTrackingGetApplicationDetailsResponse status(ApplicantTrackingGetApplicationDetailsResponseStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingGetApplicationDetailsResponseStatus getStatus() {
    return status;
  }


  public void setStatus(ApplicantTrackingGetApplicationDetailsResponseStatus status) {
    
    
    
    this.status = status;
  }


  public ApplicantTrackingGetApplicationDetailsResponse rating(Double rating) {
    
    
    
    
    this.rating = rating;
    return this;
  }

  public ApplicantTrackingGetApplicationDetailsResponse rating(Integer rating) {
    
    
    
    
    this.rating = rating.doubleValue();
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Double getRating() {
    return rating;
  }


  public void setRating(Double rating) {
    
    
    
    this.rating = rating;
  }


  public ApplicantTrackingGetApplicationDetailsResponse resumeFileId(Double resumeFileId) {
    
    
    
    
    this.resumeFileId = resumeFileId;
    return this;
  }

  public ApplicantTrackingGetApplicationDetailsResponse resumeFileId(Integer resumeFileId) {
    
    
    
    
    this.resumeFileId = resumeFileId.doubleValue();
    return this;
  }

   /**
   * Get resumeFileId
   * @return resumeFileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Double getResumeFileId() {
    return resumeFileId;
  }


  public void setResumeFileId(Double resumeFileId) {
    
    
    
    this.resumeFileId = resumeFileId;
  }


  public ApplicantTrackingGetApplicationDetailsResponse coverLetterFileId(Double coverLetterFileId) {
    
    
    
    
    this.coverLetterFileId = coverLetterFileId;
    return this;
  }

  public ApplicantTrackingGetApplicationDetailsResponse coverLetterFileId(Integer coverLetterFileId) {
    
    
    
    
    this.coverLetterFileId = coverLetterFileId.doubleValue();
    return this;
  }

   /**
   * Get coverLetterFileId
   * @return coverLetterFileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Double getCoverLetterFileId() {
    return coverLetterFileId;
  }


  public void setCoverLetterFileId(Double coverLetterFileId) {
    
    
    
    this.coverLetterFileId = coverLetterFileId;
  }


  public ApplicantTrackingGetApplicationDetailsResponse movedTo(ApplicantTrackingGetApplicationDetailsResponseMovedTo movedTo) {
    
    
    
    
    this.movedTo = movedTo;
    return this;
  }

   /**
   * Get movedTo
   * @return movedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingGetApplicationDetailsResponseMovedTo getMovedTo() {
    return movedTo;
  }


  public void setMovedTo(ApplicantTrackingGetApplicationDetailsResponseMovedTo movedTo) {
    
    
    
    this.movedTo = movedTo;
  }


  public ApplicantTrackingGetApplicationDetailsResponse movedFrom(String movedFrom) {
    
    
    
    
    this.movedFrom = movedFrom;
    return this;
  }

   /**
   * Get movedFrom
   * @return movedFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMovedFrom() {
    return movedFrom;
  }


  public void setMovedFrom(String movedFrom) {
    
    
    
    this.movedFrom = movedFrom;
  }


  public ApplicantTrackingGetApplicationDetailsResponse alsoAppliedToCount(Double alsoAppliedToCount) {
    
    
    
    
    this.alsoAppliedToCount = alsoAppliedToCount;
    return this;
  }

  public ApplicantTrackingGetApplicationDetailsResponse alsoAppliedToCount(Integer alsoAppliedToCount) {
    
    
    
    
    this.alsoAppliedToCount = alsoAppliedToCount.doubleValue();
    return this;
  }

   /**
   * Get alsoAppliedToCount
   * @return alsoAppliedToCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Double getAlsoAppliedToCount() {
    return alsoAppliedToCount;
  }


  public void setAlsoAppliedToCount(Double alsoAppliedToCount) {
    
    
    
    this.alsoAppliedToCount = alsoAppliedToCount;
  }


  public ApplicantTrackingGetApplicationDetailsResponse duplicateApplicationCount(Double duplicateApplicationCount) {
    
    
    
    
    this.duplicateApplicationCount = duplicateApplicationCount;
    return this;
  }

  public ApplicantTrackingGetApplicationDetailsResponse duplicateApplicationCount(Integer duplicateApplicationCount) {
    
    
    
    
    this.duplicateApplicationCount = duplicateApplicationCount.doubleValue();
    return this;
  }

   /**
   * Get duplicateApplicationCount
   * @return duplicateApplicationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Double getDuplicateApplicationCount() {
    return duplicateApplicationCount;
  }


  public void setDuplicateApplicationCount(Double duplicateApplicationCount) {
    
    
    
    this.duplicateApplicationCount = duplicateApplicationCount;
  }


  public ApplicantTrackingGetApplicationDetailsResponse referredBy(String referredBy) {
    
    
    
    
    this.referredBy = referredBy;
    return this;
  }

   /**
   * Get referredBy
   * @return referredBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReferredBy() {
    return referredBy;
  }


  public void setReferredBy(String referredBy) {
    
    
    
    this.referredBy = referredBy;
  }


  public ApplicantTrackingGetApplicationDetailsResponse desiredSalary(String desiredSalary) {
    
    
    
    
    this.desiredSalary = desiredSalary;
    return this;
  }

   /**
   * Get desiredSalary
   * @return desiredSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "80000", value = "")

  public String getDesiredSalary() {
    return desiredSalary;
  }


  public void setDesiredSalary(String desiredSalary) {
    
    
    
    this.desiredSalary = desiredSalary;
  }


  public ApplicantTrackingGetApplicationDetailsResponse commentCount(Double commentCount) {
    
    
    
    
    this.commentCount = commentCount;
    return this;
  }

  public ApplicantTrackingGetApplicationDetailsResponse commentCount(Integer commentCount) {
    
    
    
    
    this.commentCount = commentCount.doubleValue();
    return this;
  }

   /**
   * Get commentCount
   * @return commentCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Double getCommentCount() {
    return commentCount;
  }


  public void setCommentCount(Double commentCount) {
    
    
    
    this.commentCount = commentCount;
  }


  public ApplicantTrackingGetApplicationDetailsResponse emailCount(Double emailCount) {
    
    
    
    
    this.emailCount = emailCount;
    return this;
  }

  public ApplicantTrackingGetApplicationDetailsResponse emailCount(Integer emailCount) {
    
    
    
    
    this.emailCount = emailCount.doubleValue();
    return this;
  }

   /**
   * Get emailCount
   * @return emailCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Double getEmailCount() {
    return emailCount;
  }


  public void setEmailCount(Double emailCount) {
    
    
    
    this.emailCount = emailCount;
  }


  public ApplicantTrackingGetApplicationDetailsResponse questionsAndAnswers(List<ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInner> questionsAndAnswers) {
    
    
    
    
    this.questionsAndAnswers = questionsAndAnswers;
    return this;
  }

  public ApplicantTrackingGetApplicationDetailsResponse addQuestionsAndAnswersItem(ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInner questionsAndAnswersItem) {
    if (this.questionsAndAnswers == null) {
      this.questionsAndAnswers = new ArrayList<>();
    }
    this.questionsAndAnswers.add(questionsAndAnswersItem);
    return this;
  }

   /**
   * Get questionsAndAnswers
   * @return questionsAndAnswers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInner> getQuestionsAndAnswers() {
    return questionsAndAnswers;
  }


  public void setQuestionsAndAnswers(List<ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInner> questionsAndAnswers) {
    
    
    
    this.questionsAndAnswers = questionsAndAnswers;
  }


  public ApplicantTrackingGetApplicationDetailsResponse applicant(ApplicantTrackingGetApplicationDetailsResponseApplicant applicant) {
    
    
    
    
    this.applicant = applicant;
    return this;
  }

   /**
   * Get applicant
   * @return applicant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingGetApplicationDetailsResponseApplicant getApplicant() {
    return applicant;
  }


  public void setApplicant(ApplicantTrackingGetApplicationDetailsResponseApplicant applicant) {
    
    
    
    this.applicant = applicant;
  }


  public ApplicantTrackingGetApplicationDetailsResponse job(ApplicantTrackingGetApplicationDetailsResponseJob job) {
    
    
    
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicantTrackingGetApplicationDetailsResponseJob getJob() {
    return job;
  }


  public void setJob(ApplicantTrackingGetApplicationDetailsResponseJob job) {
    
    
    
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
   * @return the ApplicantTrackingGetApplicationDetailsResponse instance itself
   */
  public ApplicantTrackingGetApplicationDetailsResponse putAdditionalProperty(String key, Object value) {
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
    ApplicantTrackingGetApplicationDetailsResponse applicantTrackingGetApplicationDetailsResponse = (ApplicantTrackingGetApplicationDetailsResponse) o;
    return Objects.equals(this.id, applicantTrackingGetApplicationDetailsResponse.id) &&
        Objects.equals(this.appliedDate, applicantTrackingGetApplicationDetailsResponse.appliedDate) &&
        Objects.equals(this.status, applicantTrackingGetApplicationDetailsResponse.status) &&
        Objects.equals(this.rating, applicantTrackingGetApplicationDetailsResponse.rating) &&
        Objects.equals(this.resumeFileId, applicantTrackingGetApplicationDetailsResponse.resumeFileId) &&
        Objects.equals(this.coverLetterFileId, applicantTrackingGetApplicationDetailsResponse.coverLetterFileId) &&
        Objects.equals(this.movedTo, applicantTrackingGetApplicationDetailsResponse.movedTo) &&
        Objects.equals(this.movedFrom, applicantTrackingGetApplicationDetailsResponse.movedFrom) &&
        Objects.equals(this.alsoAppliedToCount, applicantTrackingGetApplicationDetailsResponse.alsoAppliedToCount) &&
        Objects.equals(this.duplicateApplicationCount, applicantTrackingGetApplicationDetailsResponse.duplicateApplicationCount) &&
        Objects.equals(this.referredBy, applicantTrackingGetApplicationDetailsResponse.referredBy) &&
        Objects.equals(this.desiredSalary, applicantTrackingGetApplicationDetailsResponse.desiredSalary) &&
        Objects.equals(this.commentCount, applicantTrackingGetApplicationDetailsResponse.commentCount) &&
        Objects.equals(this.emailCount, applicantTrackingGetApplicationDetailsResponse.emailCount) &&
        Objects.equals(this.questionsAndAnswers, applicantTrackingGetApplicationDetailsResponse.questionsAndAnswers) &&
        Objects.equals(this.applicant, applicantTrackingGetApplicationDetailsResponse.applicant) &&
        Objects.equals(this.job, applicantTrackingGetApplicationDetailsResponse.job)&&
        Objects.equals(this.additionalProperties, applicantTrackingGetApplicationDetailsResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appliedDate, status, rating, resumeFileId, coverLetterFileId, movedTo, movedFrom, alsoAppliedToCount, duplicateApplicationCount, referredBy, desiredSalary, commentCount, emailCount, questionsAndAnswers, applicant, job, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantTrackingGetApplicationDetailsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appliedDate: ").append(toIndentedString(appliedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    resumeFileId: ").append(toIndentedString(resumeFileId)).append("\n");
    sb.append("    coverLetterFileId: ").append(toIndentedString(coverLetterFileId)).append("\n");
    sb.append("    movedTo: ").append(toIndentedString(movedTo)).append("\n");
    sb.append("    movedFrom: ").append(toIndentedString(movedFrom)).append("\n");
    sb.append("    alsoAppliedToCount: ").append(toIndentedString(alsoAppliedToCount)).append("\n");
    sb.append("    duplicateApplicationCount: ").append(toIndentedString(duplicateApplicationCount)).append("\n");
    sb.append("    referredBy: ").append(toIndentedString(referredBy)).append("\n");
    sb.append("    desiredSalary: ").append(toIndentedString(desiredSalary)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    emailCount: ").append(toIndentedString(emailCount)).append("\n");
    sb.append("    questionsAndAnswers: ").append(toIndentedString(questionsAndAnswers)).append("\n");
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
    openapiFields.add("resumeFileId");
    openapiFields.add("coverLetterFileId");
    openapiFields.add("movedTo");
    openapiFields.add("movedFrom");
    openapiFields.add("alsoAppliedToCount");
    openapiFields.add("duplicateApplicationCount");
    openapiFields.add("referredBy");
    openapiFields.add("desiredSalary");
    openapiFields.add("commentCount");
    openapiFields.add("emailCount");
    openapiFields.add("questionsAndAnswers");
    openapiFields.add("applicant");
    openapiFields.add("job");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicantTrackingGetApplicationDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicantTrackingGetApplicationDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicantTrackingGetApplicationDetailsResponse is not found in the empty JSON string", ApplicantTrackingGetApplicationDetailsResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("appliedDate") != null && !jsonObj.get("appliedDate").isJsonNull()) && !jsonObj.get("appliedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appliedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appliedDate").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        ApplicantTrackingGetApplicationDetailsResponseStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      // validate the optional field `movedTo`
      if (jsonObj.get("movedTo") != null && !jsonObj.get("movedTo").isJsonNull()) {
        ApplicantTrackingGetApplicationDetailsResponseMovedTo.validateJsonObject(jsonObj.getAsJsonObject("movedTo"));
      }
      if (!jsonObj.get("movedFrom").isJsonNull() && (jsonObj.get("movedFrom") != null && !jsonObj.get("movedFrom").isJsonNull()) && !jsonObj.get("movedFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `movedFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("movedFrom").toString()));
      }
      if (!jsonObj.get("referredBy").isJsonNull() && (jsonObj.get("referredBy") != null && !jsonObj.get("referredBy").isJsonNull()) && !jsonObj.get("referredBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referredBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referredBy").toString()));
      }
      if ((jsonObj.get("desiredSalary") != null && !jsonObj.get("desiredSalary").isJsonNull()) && !jsonObj.get("desiredSalary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desiredSalary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desiredSalary").toString()));
      }
      if (jsonObj.get("questionsAndAnswers") != null && !jsonObj.get("questionsAndAnswers").isJsonNull()) {
        JsonArray jsonArrayquestionsAndAnswers = jsonObj.getAsJsonArray("questionsAndAnswers");
        if (jsonArrayquestionsAndAnswers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("questionsAndAnswers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `questionsAndAnswers` to be an array in the JSON string but got `%s`", jsonObj.get("questionsAndAnswers").toString()));
          }

          // validate the optional field `questionsAndAnswers` (array)
          for (int i = 0; i < jsonArrayquestionsAndAnswers.size(); i++) {
            ApplicantTrackingGetApplicationDetailsResponseQuestionsAndAnswersInner.validateJsonObject(jsonArrayquestionsAndAnswers.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `applicant`
      if (jsonObj.get("applicant") != null && !jsonObj.get("applicant").isJsonNull()) {
        ApplicantTrackingGetApplicationDetailsResponseApplicant.validateJsonObject(jsonObj.getAsJsonObject("applicant"));
      }
      // validate the optional field `job`
      if (jsonObj.get("job") != null && !jsonObj.get("job").isJsonNull()) {
        ApplicantTrackingGetApplicationDetailsResponseJob.validateJsonObject(jsonObj.getAsJsonObject("job"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicantTrackingGetApplicationDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicantTrackingGetApplicationDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicantTrackingGetApplicationDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicantTrackingGetApplicationDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicantTrackingGetApplicationDetailsResponse>() {
           @Override
           public void write(JsonWriter out, ApplicantTrackingGetApplicationDetailsResponse value) throws IOException {
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
           public ApplicantTrackingGetApplicationDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicantTrackingGetApplicationDetailsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApplicantTrackingGetApplicationDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicantTrackingGetApplicationDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to ApplicantTrackingGetApplicationDetailsResponse
  */
  public static ApplicantTrackingGetApplicationDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicantTrackingGetApplicationDetailsResponse.class);
  }

 /**
  * Convert an instance of ApplicantTrackingGetApplicationDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


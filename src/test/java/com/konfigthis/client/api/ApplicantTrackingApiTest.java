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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ApplicantTrackingAddApplicationCommentRequest;
import com.konfigthis.client.model.ApplicantTrackingChangeApplicantStatusRequest;
import com.konfigthis.client.model.ApplicantTrackingCreateNewApplicationRequest;
import com.konfigthis.client.model.ApplicantTrackingCreateNewApplicationResponseInner;
import com.konfigthis.client.model.ApplicantTrackingCreateNewJobOpeningRequest;
import com.konfigthis.client.model.ApplicantTrackingCreateNewJobOpeningResponseInner;
import com.konfigthis.client.model.ApplicantTrackingGetApplicationDetailsResponse;
import com.konfigthis.client.model.ApplicantTrackingGetCompanyLocationsResponseInner;
import com.konfigthis.client.model.ApplicantTrackingGetHiringLeadsResponseInner;
import com.konfigthis.client.model.ApplicantTrackingGetJobSummariesResponseInner;
import com.konfigthis.client.model.ApplicantTrackingListApplicationsResponse;
import com.konfigthis.client.model.ApplicantTrackingListStatusesResponseInner;
import java.io.File;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicantTrackingApi
 */
@Disabled
public class ApplicantTrackingApiTest {

    private static ApplicantTrackingApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ApplicantTrackingApi(apiClient);
    }

    /**
     * Add Application Comment
     *
     * Add a comment to an application. The owner of the API key used must have access to ATS settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addApplicationCommentTest() throws ApiException {
        String type = null;
        String comment = null;
        String companyDomain = null;
        Integer applicationId = null;
        api.addApplicationComment(type, comment, companyDomain, applicationId)
                .execute();
        // TODO: test validations
    }

    /**
     * Change Applicant&#39;s Status
     *
     * Change applicant&#39;s status. The owner of the API key used must have access to ATS settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeApplicantStatusTest() throws ApiException {
        Integer status = null;
        String companyDomain = null;
        Integer applicationId = null;
        api.changeApplicantStatus(status, companyDomain, applicationId)
                .execute();
        // TODO: test validations
    }

    /**
     * Add New Candidate
     *
     * Add a new candidate application to a job opening. The owner of the API key used must have access to ATS settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewApplicationTest() throws ApiException {
        String companyDomain = null;
        String firstName = null;
        String lastName = null;
        Integer jobId = null;
        String email = null;
        String phoneNumber = null;
        String source = null;
        String address = null;
        String city = null;
        String state = null;
        String zip = null;
        String country = null;
        String linkedinUrl = null;
        String dateAvailable = null;
        String desiredSalary = null;
        String referredBy = null;
        String websiteUrl = null;
        String highestEducation = null;
        String collegeName = null;
        String references = null;
        File resume = null;
        File coverLetter = null;
        List<ApplicantTrackingCreateNewApplicationResponseInner> response = api.createNewApplication(companyDomain, firstName, lastName, jobId)
                .email(email)
                .phoneNumber(phoneNumber)
                .source(source)
                .address(address)
                .city(city)
                .state(state)
                .zip(zip)
                .country(country)
                .linkedinUrl(linkedinUrl)
                .dateAvailable(dateAvailable)
                .desiredSalary(desiredSalary)
                .referredBy(referredBy)
                .websiteUrl(websiteUrl)
                .highestEducation(highestEducation)
                .collegeName(collegeName)
                .references(references)
                .resume(resume)
                .coverLetter(coverLetter)
                .execute();
        // TODO: test validations
    }

    /**
     * Add New Job Opening
     *
     * Add a new job opening. The owner of the API key used must have access to ATS settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewJobOpeningTest() throws ApiException {
        String companyDomain = null;
        String postingTitle = null;
        String jobStatus = null;
        Integer hiringLead = null;
        String employmentType = null;
        String jobDescription = null;
        String department = null;
        String minimumExperience = null;
        String compensation = null;
        Integer jobLocation = null;
        String applicationQuestionResume = null;
        String applicationQuestionAddress = null;
        String applicationQuestionLinkedinUrl = null;
        String applicationQuestionDateAvailable = null;
        String applicationQuestionDesiredSalary = null;
        String applicationQuestionCoverLetter = null;
        String applicationQuestionReferredBy = null;
        String applicationQuestionWebsiteUrl = null;
        String applicationQuestionHighestEducation = null;
        String applicationQuestionCollege = null;
        String applicationQuestionReferences = null;
        String internalJobCode = null;
        List<ApplicantTrackingCreateNewJobOpeningResponseInner> response = api.createNewJobOpening(companyDomain, postingTitle, jobStatus, hiringLead, employmentType, jobDescription)
                .department(department)
                .minimumExperience(minimumExperience)
                .compensation(compensation)
                .jobLocation(jobLocation)
                .applicationQuestionResume(applicationQuestionResume)
                .applicationQuestionAddress(applicationQuestionAddress)
                .applicationQuestionLinkedinUrl(applicationQuestionLinkedinUrl)
                .applicationQuestionDateAvailable(applicationQuestionDateAvailable)
                .applicationQuestionDesiredSalary(applicationQuestionDesiredSalary)
                .applicationQuestionCoverLetter(applicationQuestionCoverLetter)
                .applicationQuestionReferredBy(applicationQuestionReferredBy)
                .applicationQuestionWebsiteUrl(applicationQuestionWebsiteUrl)
                .applicationQuestionHighestEducation(applicationQuestionHighestEducation)
                .applicationQuestionCollege(applicationQuestionCollege)
                .applicationQuestionReferences(applicationQuestionReferences)
                .internalJobCode(internalJobCode)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Application Details
     *
     * Get the details of an application. The owner of the API key used must have access to ATS settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getApplicationDetailsTest() throws ApiException {
        String companyDomain = null;
        Integer applicationId = null;
        ApplicantTrackingGetApplicationDetailsResponse response = api.getApplicationDetails(companyDomain, applicationId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Company Locations
     *
     * Get company locations for use in creating a new job opening. The owner of the API key used must have access to ATS settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompanyLocationsTest() throws ApiException {
        String companyDomain = null;
        List<ApplicantTrackingGetCompanyLocationsResponseInner> response = api.getCompanyLocations(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Hiring Leads
     *
     * Get potential hiring leads for use in creating a new job opening. The owner of the API key used must have access to ATS settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHiringLeadsTest() throws ApiException {
        String companyDomain = null;
        List<ApplicantTrackingGetHiringLeadsResponseInner> response = api.getHiringLeads(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Job Summaries
     *
     * Get a list of job summaries. The owner of the API key used must have access to ATS settings. Combine as many different optional parameter filters as you like.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getJobSummariesTest() throws ApiException {
        String companyDomain = null;
        String statusGroups = null;
        String sortBy = null;
        String sortOrder = null;
        List<ApplicantTrackingGetJobSummariesResponseInner> response = api.getJobSummaries(companyDomain)
                .statusGroups(statusGroups)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Applications
     *
     * Get a list of applications. The owner of the API key used must have access to ATS settings. Combine as many different optional parameter filters as you like.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listApplicationsTest() throws ApiException {
        String companyDomain = null;
        Integer page = null;
        Integer jobId = null;
        Integer applicationStatusId = null;
        String applicationStatus = null;
        String jobStatusGroups = null;
        String searchString = null;
        String sortBy = null;
        String sortOrder = null;
        OffsetDateTime newSince = null;
        ApplicantTrackingListApplicationsResponse response = api.listApplications(companyDomain)
                .page(page)
                .jobId(jobId)
                .applicationStatusId(applicationStatusId)
                .applicationStatus(applicationStatus)
                .jobStatusGroups(jobStatusGroups)
                .searchString(searchString)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .newSince(newSince)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Statuses
     *
     * Get a list of statuses for a company. The owner of the API key used must have access to ATS settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listStatusesTest() throws ApiException {
        String companyDomain = null;
        List<ApplicantTrackingListStatusesResponseInner> response = api.listStatuses(companyDomain)
                .execute();
        // TODO: test validations
    }

}
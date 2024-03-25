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
import com.konfigthis.client.model.HoursEditHourRecordRequest;
import com.konfigthis.client.model.TimeTrackingRecord;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HoursApi
 */
@Disabled
public class HoursApiTest {

    private static HoursApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new HoursApi(apiClient);
    }

    /**
     * Bulk add/edit hour records
     *
     * Bulk add/edit hour records
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkRecordEditTest() throws ApiException {
        String companyDomain = null;
        api.bulkRecordEdit(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an hour record
     *
     * Delete an hour record
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteHourRecordTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.deleteHourRecord(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit an hour record
     *
     * Edit an hour record
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editHourRecordTest() throws ApiException {
        String timeTrackingId = null;
        Float hoursWorked = null;
        String companyDomain = null;
        api.editHourRecord(timeTrackingId, hoursWorked, companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get an hour record
     *
     * Get an hour record
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHourRecordTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.getHourRecord(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Add an hour record
     *
     * Add an hour record
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordAdditionTest() throws ApiException {
        String timeTrackingId = null;
        Integer employeeId = null;
        String dateHoursWorked = null;
        String rateType = null;
        Float hoursWorked = null;
        String companyDomain = null;
        Integer divisionId = null;
        Integer departmentId = null;
        Integer jobTitleId = null;
        String payCode = null;
        Float payRate = null;
        Integer jobCode = null;
        String jobData = null;
        api.recordAddition(timeTrackingId, employeeId, dateHoursWorked, rateType, hoursWorked, companyDomain)
                .divisionId(divisionId)
                .departmentId(departmentId)
                .jobTitleId(jobTitleId)
                .payCode(payCode)
                .payRate(payRate)
                .jobCode(jobCode)
                .jobData(jobData)
                .execute();
        // TODO: test validations
    }

}
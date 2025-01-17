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
import com.konfigthis.client.model.TimeTrackingPrivateBetaAddEditClockEntriesRequest;
import com.konfigthis.client.model.TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner;
import com.konfigthis.client.model.TimeTrackingPrivateBetaAddEditHourEntriesRequest;
import com.konfigthis.client.model.TimeTrackingPrivateBetaAddEditHourEntriesRequestHoursInner;
import com.konfigthis.client.model.TimeTrackingPrivateBetaAddTimesheetClockInRequest;
import com.konfigthis.client.model.TimeTrackingPrivateBetaCreateProjectTaskRequest;
import com.konfigthis.client.model.TimeTrackingPrivateBetaCreateProjectTaskRequestTasksInner;
import com.konfigthis.client.model.TimeTrackingPrivateBetaDeleteHourEntriesRequest;
import com.konfigthis.client.model.TimeTrackingPrivateBetaDeleteTimeSheetEntriesRequest;
import com.konfigthis.client.model.TimeTrackingProjectWithTasks;
import com.konfigthis.client.model.TimeTrackingProjectWithTasksAndEmployeeIds;
import com.konfigthis.client.model.TimesheetEntry;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeTrackingPrivateBetaApi
 */
@Disabled
public class TimeTrackingPrivateBetaApiTest {

    private static TimeTrackingPrivateBetaApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TimeTrackingPrivateBetaApi(apiClient);
    }

    /**
     * Add Timesheet Clock-Out Entry
     *
     * Clock out an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addClockOutTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        TimesheetEntry response = api.addClockOut(companyDomain, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Add/Edit Timesheet Clock Entries
     *
     * Add or edit timesheet clock entries.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEditClockEntriesTest() throws ApiException {
        List<TimeTrackingPrivateBetaAddEditClockEntriesRequestEntriesInner> entries = null;
        String companyDomain = null;
        List<TimesheetEntry> response = api.addEditClockEntries(entries, companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Add/Edit Timesheet Hour Entries
     *
     * Add or edit timesheet hour entries.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEditHourEntriesTest() throws ApiException {
        List<TimeTrackingPrivateBetaAddEditHourEntriesRequestHoursInner> hours = null;
        String companyDomain = null;
        List<TimesheetEntry> response = api.addEditHourEntries(hours, companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Add Timesheet Clock-In Entry
     *
     * Clock in an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addTimesheetClockInTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        Integer projectId = null;
        Integer taskId = null;
        String note = null;
        TimesheetEntry response = api.addTimesheetClockIn(companyDomain, employeeId)
                .projectId(projectId)
                .taskId(taskId)
                .note(note)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a Time Tracking Project
     *
     * Create a time tracking project with optional tasks.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectTaskTest() throws ApiException {
        String name = null;
        String companyDomain = null;
        Boolean billable = null;
        Boolean allowAllEmployees = null;
        List<Integer> employeeIds = null;
        Boolean hasTasks = null;
        List<TimeTrackingPrivateBetaCreateProjectTaskRequestTasksInner> tasks = null;
        TimeTrackingProjectWithTasksAndEmployeeIds response = api.createProjectTask(name, companyDomain)
                .billable(billable)
                .allowAllEmployees(allowAllEmployees)
                .employeeIds(employeeIds)
                .hasTasks(hasTasks)
                .tasks(tasks)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Timesheet Hour Entries
     *
     * Delete timesheet hour entries.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteHourEntriesTest() throws ApiException {
        List<Integer> hourEntryIds = null;
        String companyDomain = null;
        api.deleteHourEntries(hourEntryIds, companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Timesheet Clock Entries
     *
     * Delete timesheet clock entries.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTimeSheetEntriesTest() throws ApiException {
        List<Integer> clockEntryIds = null;
        String companyDomain = null;
        api.deleteTimeSheetEntries(clockEntryIds, companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Employee Projects
     *
     * Get the projects an employee can track time for.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEmployeeProjectsTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        List<List<TimeTrackingProjectWithTasks>> response = api.listEmployeeProjects(companyDomain, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Timesheet Entries
     *
     * Get all timesheet entries for a given period of time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTimesheetEntriesTest() throws ApiException {
        String companyDomain = null;
        String start = null;
        String end = null;
        String employeeIds = null;
        List<TimesheetEntry> response = api.listTimesheetEntries(companyDomain, start, end)
                .employeeIds(employeeIds)
                .execute();
        // TODO: test validations
    }

}

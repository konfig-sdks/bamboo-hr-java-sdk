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
import com.konfigthis.client.model.TableRowUpdate;
import com.konfigthis.client.model.TabularDataDeleteRowResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TabularDataApi
 */
@Disabled
public class TabularDataApiTest {

    private static TabularDataApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TabularDataApi(apiClient);
    }

    /**
     * Adds a table row
     *
     * Adds a table row. Fundamentally the same as version 1 so choose a version and stay with it unless other changes occur. Changes from version 1 are now minor with a few variations limited to ACA, payroll, terminated rehire, gusto, benetrac, and final pay date.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addRowTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String table = null;
        String date = null;
        String location = null;
        String division = null;
        String department = null;
        String jobTitle = null;
        String reportsTo = null;
        api.addRow(companyDomain, id, table)
                .date(date)
                .location(location)
                .division(division)
                .department(department)
                .jobTitle(jobTitle)
                .reportsTo(reportsTo)
                .execute();
        // TODO: test validations
    }

    /**
     * Adds a table row
     *
     * Adds a table row. If employee is currently on a pay schedule syncing with Trax Payroll, or being added to one, the row cannot be added if they are missing any required fields for that table. If the API user is adding a row on the compensation table, the row cannot be added if they are missing any of the required employee fields (including fields not on that table).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addTableRowTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String table = null;
        String date = null;
        String location = null;
        String division = null;
        String department = null;
        String jobTitle = null;
        String reportsTo = null;
        api.addTableRow(companyDomain, id, table)
                .date(date)
                .location(location)
                .division(division)
                .department(department)
                .jobTitle(jobTitle)
                .reportsTo(reportsTo)
                .execute();
        // TODO: test validations
    }

    /**
     * Deletes a table row
     *
     * Deletes a table row
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRowTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String table = null;
        String rowId = null;
        TabularDataDeleteRowResponse response = api.deleteRow(companyDomain, id, table, rowId)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets all updated employee table data
     *
     * This API is merely an optimization to avoid downloading all table data for all employees. When you use this API you will provide a timestamp and the results will be limited to just the employees that have changed since the time you provided. This API operates on an employee-last-changed-timestamp, which means that a change in ANY field in the employee record will cause ALL of that employees table rows to show up via this API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChangedTableRowsTest() throws ApiException {
        String companyDomain = null;
        String table = null;
        String since = null;
        api.getChangedTableRows(companyDomain, table, since)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets table rows for a given employee and table combination
     *
     * Returns a data structure representing all the table rows for a given employee and table combination. The result is not sorted in any particular order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeTableRowsTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String table = null;
        api.getEmployeeTableRows(companyDomain, id, table)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a table row.
     *
     * Updates a table row. If employee is currently on a pay schedule syncing with Trax Payroll, or being added to one, the row cannot be added if they are missing any required fields for that table. If the API user is updating a row on the compensation table, the row cannot be updated if they are missing any of the required employee fields (including fields not on that table).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRowTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String table = null;
        String rowId = null;
        String date = null;
        String location = null;
        String division = null;
        String department = null;
        String jobTitle = null;
        String reportsTo = null;
        api.updateRow(companyDomain, id, table, rowId)
                .date(date)
                .location(location)
                .division(division)
                .department(department)
                .jobTitle(jobTitle)
                .reportsTo(reportsTo)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a table row.
     *
     * Updates a table row. Fundamentally the same as version 1 so choose a version and stay with it unless other changes occur. Changes from version 1 are now minor with a few variations limited to ACA, payroll, terminated rehire, gusto, benetrac, and final pay date.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRow_0Test() throws ApiException {
        String companyDomain = null;
        String id = null;
        String table = null;
        String rowId = null;
        String date = null;
        String location = null;
        String division = null;
        String department = null;
        String jobTitle = null;
        String reportsTo = null;
        api.updateRow_0(companyDomain, id, table, rowId)
                .date(date)
                .location(location)
                .division(division)
                .department(department)
                .jobTitle(jobTitle)
                .reportsTo(reportsTo)
                .execute();
        // TODO: test validations
    }

}

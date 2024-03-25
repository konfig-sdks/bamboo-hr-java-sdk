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
import com.konfigthis.client.model.EmployeeFileUpdate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmployeeFilesApi
 */
@Disabled
public class EmployeeFilesApiTest {

    private static EmployeeFilesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EmployeeFilesApi(apiClient);
    }

    /**
     * Add Employee File Category
     *
     * Add an employee file category.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCategoryTest() throws ApiException {
        String companyDomain = null;
        api.addCategory(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get an Employee File
     *
     * Gets an employee file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeFileTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String fileId = null;
        api.getEmployeeFile(companyDomain, id, fileId)
                .execute();
        // TODO: test validations
    }

    /**
     * List employee files and categories
     *
     * Lists employee files and categories
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFilesAndCategoriesTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.listFilesAndCategories(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Employee File
     *
     * Delete an employee file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeFileTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String fileId = null;
        api.removeFile(companyDomain, id, fileId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Employee File
     *
     * Update an employee file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmployeeFileTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String fileId = null;
        String name = null;
        String categoryId = null;
        String shareWithEmployee = null;
        api.updateEmployeeFile(companyDomain, id, fileId)
                .name(name)
                .categoryId(categoryId)
                .shareWithEmployee(shareWithEmployee)
                .execute();
        // TODO: test validations
    }

    /**
     * Upload Employee File
     *
     * Upload an employee file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.uploadFile(companyDomain, id)
                .execute();
        // TODO: test validations
    }

}

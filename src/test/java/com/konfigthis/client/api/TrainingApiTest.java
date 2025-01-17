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
import java.time.LocalDate;
import com.konfigthis.client.model.TrainingAddCategoryRequest;
import com.konfigthis.client.model.TrainingAddEmployeeTrainingRecordRequest;
import com.konfigthis.client.model.TrainingAddEmployeeTrainingRecordRequestCost;
import com.konfigthis.client.model.TrainingCategory;
import com.konfigthis.client.model.TrainingCategoryListResponseInner;
import com.konfigthis.client.model.TrainingGetTypesResponseInner;
import com.konfigthis.client.model.TrainingListEmployeeTrainingsResponseInner;
import com.konfigthis.client.model.TrainingRecord;
import com.konfigthis.client.model.TrainingType;
import com.konfigthis.client.model.TrainingTypeAdditionRequest;
import com.konfigthis.client.model.TrainingTypeAdditionRequestCategory;
import com.konfigthis.client.model.TrainingUpdateCategoryRequest;
import com.konfigthis.client.model.TrainingUpdateEmployeeTrainingRecordRequest;
import com.konfigthis.client.model.TrainingUpdateTypeRequest;
import com.konfigthis.client.model.TrainingUpdateTypeRequestCategory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrainingApi
 */
@Disabled
public class TrainingApiTest {

    private static TrainingApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TrainingApi(apiClient);
    }

    /**
     * Add Training Category
     *
     * Add a training category. The owner of the API key used must have access to training settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCategoryTest() throws ApiException {
        String name = null;
        String companyDomain = null;
        TrainingCategory response = api.addCategory(name, companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Add New Employee Training Record
     *
     * Add a new employee training record. The owner of the API key used must have permission to add trainings for the selected employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEmployeeTrainingRecordTest() throws ApiException {
        LocalDate completed = null;
        Integer type = null;
        String companyDomain = null;
        Integer employeeId = null;
        TrainingAddEmployeeTrainingRecordRequestCost cost = null;
        String instructor = null;
        Double hours = null;
        Double credits = null;
        String notes = null;
        TrainingRecord response = api.addEmployeeTrainingRecord(completed, type, companyDomain, employeeId)
                .cost(cost)
                .instructor(instructor)
                .hours(hours)
                .credits(credits)
                .notes(notes)
                .execute();
        // TODO: test validations
    }

    /**
     * List Training Categories
     *
     * Get a list of training categories. The owner of the API key used must have access to training settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void categoryListTest() throws ApiException {
        String companyDomain = null;
        List<TrainingCategoryListResponseInner> response = api.categoryList(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Training Category
     *
     * Delete an existing training category. The owner of the API key used must have access to training settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCategoryTest() throws ApiException {
        String companyDomain = null;
        Integer trainingCategoryId = null;
        api.deleteCategory(companyDomain, trainingCategoryId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Employee Training Record
     *
     * Delete an existing employee training record. The owner of the API key used must have permission to view and edit the employee and training type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEmployeeRecordTest() throws ApiException {
        String companyDomain = null;
        Integer employeeTrainingRecordId = null;
        api.deleteEmployeeRecord(companyDomain, employeeTrainingRecordId)
                .execute();
        // TODO: test validations
    }

    /**
     * List Training Types
     *
     * Get a list of training types. The owner of the API key used must have access to training settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTypesTest() throws ApiException {
        String companyDomain = null;
        List<TrainingGetTypesResponseInner> response = api.getTypes(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * List Employee Trainings
     *
     * Get all employee training records. The owner of the API key used must have access to view the employee. The API will only return trainings for the employee that the owner of the API key has permission to see. Included with each employee training is the training information that has been selected for tracking in settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEmployeeTrainingsTest() throws ApiException {
        String companyDomain = null;
        Integer employeeId = null;
        Integer trainingTypeId = null;
        List<TrainingListEmployeeTrainingsResponseInner> response = api.listEmployeeTrainings(companyDomain, employeeId)
                .trainingTypeId(trainingTypeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Training Type
     *
     * Delete an existing training type. The owner of the API key used must have access to training settings. Deleting a training type will only be successful if all employee trainings for this type have been removed prior to this request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTypeTest() throws ApiException {
        String companyDomain = null;
        Integer trainingTypeId = null;
        api.removeType(companyDomain, trainingTypeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Add Training Type
     *
     * Add a training type. The owner of the API key used must have access to training settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void typeAdditionTest() throws ApiException {
        String name = null;
        Boolean required = null;
        String companyDomain = null;
        String description = null;
        Integer frequency = null;
        Boolean renewable = null;
        TrainingTypeAdditionRequestCategory category = null;
        Integer dueFromHireDate = null;
        String linkUrl = null;
        Boolean allowEmployeesToMarkComplete = null;
        TrainingType response = api.typeAddition(name, required, companyDomain)
                .description(description)
                .frequency(frequency)
                .renewable(renewable)
                .category(category)
                .dueFromHireDate(dueFromHireDate)
                .linkUrl(linkUrl)
                .allowEmployeesToMarkComplete(allowEmployeesToMarkComplete)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Training Category
     *
     * Update an existing training category. The owner of the API key used must have access to training settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCategoryTest() throws ApiException {
        String name = null;
        String companyDomain = null;
        Integer trainingCategoryId = null;
        TrainingCategory response = api.updateCategory(name, companyDomain, trainingCategoryId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Employee Training Record
     *
     * Update an existing exmployee training record. The owner of the API key used must have permission to add trainings for the selected employee
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmployeeTrainingRecordTest() throws ApiException {
        String completed = null;
        String companyDomain = null;
        Integer employeeTrainingRecordId = null;
        TrainingAddEmployeeTrainingRecordRequestCost cost = null;
        String instructor = null;
        Double hours = null;
        Double credits = null;
        Double notes = null;
        TrainingRecord response = api.updateEmployeeTrainingRecord(completed, companyDomain, employeeTrainingRecordId)
                .cost(cost)
                .instructor(instructor)
                .hours(hours)
                .credits(credits)
                .notes(notes)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Training Type
     *
     * Update an existing training type. The owner of the API key used must have access to training settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTypeTest() throws ApiException {
        String name = null;
        Boolean required = null;
        String companyDomain = null;
        Integer trainingTypeId = null;
        String description = null;
        Integer frequency = null;
        Boolean renewable = null;
        TrainingUpdateTypeRequestCategory category = null;
        Integer dueFromHireDate = null;
        String linkUrl = null;
        Boolean allowEmployeesToMarkComplete = null;
        TrainingType response = api.updateType(name, required, companyDomain, trainingTypeId)
                .description(description)
                .frequency(frequency)
                .renewable(renewable)
                .category(category)
                .dueFromHireDate(dueFromHireDate)
                .linkUrl(linkUrl)
                .allowEmployeesToMarkComplete(allowEmployeesToMarkComplete)
                .execute();
        // TODO: test validations
    }

}

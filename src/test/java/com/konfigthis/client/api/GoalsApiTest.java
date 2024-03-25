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
import com.konfigthis.client.model.Goal;
import com.konfigthis.client.model.GoalsCloseGoalResponse;
import com.konfigthis.client.model.GoalsCountPerStatusResponse;
import com.konfigthis.client.model.GoalsGetAllAggregateInfo200Response;
import com.konfigthis.client.model.GoalsGetAllAggregateInfo200Response1;
import com.konfigthis.client.model.GoalsGetAllAggregateInfoResponse;
import com.konfigthis.client.model.GoalsGetEmployeeGoalsResponse;
import com.konfigthis.client.model.GoalsGetGoalAggregateInfoResponse;
import com.konfigthis.client.model.GoalsStatusCountResponse;
import com.konfigthis.client.model.GoalsUpdateGoalSharingRequest;
import com.konfigthis.client.model.GoalsUpdateGoalSharingResponse;
import com.konfigthis.client.model.GoalsUpdateProgressResponse;
import com.konfigthis.client.model.Milestone;
import com.konfigthis.client.model.NewGoal;
import com.konfigthis.client.model.UpdateGoalV11;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GoalsApi
 */
@Disabled
public class GoalsApiTest {

    private static GoalsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GoalsApi(apiClient);
    }

    /**
     * Close Goal
     *
     * Close a goal.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void closeGoalTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        GoalsCloseGoalResponse response = api.closeGoal(companyDomain, employeeId, goalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Goal Status Counts, Version 1.1
     *
     * Get the number of goals per status for an employee. Difference from Version 1: Returns goals in the closed filter and provides filter actions for each filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void countPerStatusTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        GoalsCountPerStatusResponse response = api.countPerStatus(companyDomain, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create Goal Comment
     *
     * Create a new goal comment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCommentTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        api.createComment(companyDomain, employeeId, goalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create Goal
     *
     * Create a new goal for an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEmployeeGoalTest() throws ApiException {
        String title = null;
        List<Integer> sharedWithEmployeeIds = null;
        String dueDate = null;
        String companyDomain = null;
        String employeeId = null;
        String description = null;
        Integer percentComplete = null;
        String alignsWithOptionId = null;
        Float completionDate = null;
        List<Milestone> milestones = null;
        Object response = api.createEmployeeGoal(title, sharedWithEmployeeIds, dueDate, companyDomain, employeeId)
                .description(description)
                .percentComplete(percentComplete)
                .alignsWithOptionId(alignsWithOptionId)
                .completionDate(completionDate)
                .milestones(milestones)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Goal
     *
     * Delete a goal.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByIdTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        api.deleteById(companyDomain, employeeId, goalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Goal Comment
     *
     * Delete a goal comment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCommentTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        String commentId = null;
        api.deleteComment(companyDomain, employeeId, goalId, commentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Can Create a Goal
     *
     * Determine if the API user has permission to create a goal for this employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void determinePermissionTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        api.determinePermission(companyDomain, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Alignable Goal Options
     *
     * Get alignable goal options for an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAlignableOptionsTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        api.getAlignableOptions(companyDomain, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get All Aggregate Goal Info
     *
     * Provides a list of all goals, type counts, goal comment counts, and employees shared with goals for the given employee. This version of the endpoint will not return any goals with milestones. Milestone functionality for this endpoint begins in version 1.2.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllAggregateInfoTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        GoalsGetAllAggregateInfoResponse response = api.getAllAggregateInfo(companyDomain, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get All Aggregate Goal Info, Version 1.1
     *
     * Provides a list of all goals, type counts, filter actions, goal comment counts, and employees shared with goals for the given employee. Difference from Version 1: Returns goals in the closed filter and provides filter actions for each filter. This version of the endpoint will not return any goals with milestones. Milestone functionality for this endpoint begins in version 1.2.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllAggregateInfo_0Test() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        GoalsGetAllAggregateInfo200Response response = api.getAllAggregateInfo_0(companyDomain, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get All Aggregate Goal Info, Version 1.2
     *
     * Provides a list of all goals, type counts, filter actions, goal comment counts, and employees shared with goals for the given employee. Difference from Version 1.1: Returns all goals, including goals that contain milestones.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllAggregateInfo_1Test() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        GoalsGetAllAggregateInfo200Response1 response = api.getAllAggregateInfo_1(companyDomain, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Goal Comments
     *
     * Get comments for a goal.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCommentsTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        api.getComments(companyDomain, employeeId, goalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Goals
     *
     * Get goals for an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeGoalsTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String filter = null;
        GoalsGetEmployeeGoalsResponse response = api.getEmployeeGoals(companyDomain, employeeId)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Aggregate Goal Info
     *
     * Provides goal information, goal comments, and employees shared with goals or who have commented on the given goal.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGoalAggregateInfoTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        GoalsGetGoalAggregateInfoResponse response = api.getGoalAggregateInfo(companyDomain, employeeId, goalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Reopen a Goal
     *
     * Reopen a goal.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reopenGoalTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        Object response = api.reopenGoal(companyDomain, employeeId, goalId)
                .execute();
        // TODO: test validations
    }

    /**
     * Available Goal Sharing Options
     *
     * Provides a list of employees with whom the specified employee&#39;s goals may be shared.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void shareOptionsGetTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String search = null;
        String limit = null;
        api.shareOptionsGet(companyDomain, employeeId)
                .search(search)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Goal Status Counts
     *
     * Get the number of goals per status for an employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void statusCountTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        GoalsStatusCountResponse response = api.statusCount(companyDomain, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Goal Comment
     *
     * Update a goal comment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCommentTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        String commentId = null;
        api.updateComment(companyDomain, employeeId, goalId, commentId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Goal
     *
     * Update a goal. This version will not update a goal to contain milestones, that functionality is added in version 1.1
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmployeeGoalTest() throws ApiException {
        String title = null;
        Integer id = null;
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        String description = null;
        Integer percentComplete = null;
        String alignsWithOptionId = null;
        List<Integer> sharedWithEmployeeIds = null;
        String dueDate = null;
        Float completionDate = null;
        Object response = api.updateEmployeeGoal(title, id, companyDomain, employeeId, goalId)
                .description(description)
                .percentComplete(percentComplete)
                .alignsWithOptionId(alignsWithOptionId)
                .sharedWithEmployeeIds(sharedWithEmployeeIds)
                .dueDate(dueDate)
                .completionDate(completionDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Goal, V1.1
     *
     * Update a goal. Version 1.1 allows the updating of the milestones contained within the goal, unlike Version 1.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmployeeGoalV11Test() throws ApiException {
        String title = null;
        List<Integer> sharedWithEmployeeIds = null;
        String dueDate = null;
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        String description = null;
        String alignsWithOptionId = null;
        Boolean milestonesEnabled = null;
        List<Integer> deletedMilestoneIds = null;
        List<Milestone> milestones = null;
        Object response = api.updateEmployeeGoalV11(title, sharedWithEmployeeIds, dueDate, companyDomain, employeeId, goalId)
                .description(description)
                .alignsWithOptionId(alignsWithOptionId)
                .milestonesEnabled(milestonesEnabled)
                .deletedMilestoneIds(deletedMilestoneIds)
                .milestones(milestones)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Goal Sharing
     *
     * Updates which employees this goal is shared with.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGoalSharingTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String goalId = null;
        List<Integer> sharedWithEmployeeIds = null;
        GoalsUpdateGoalSharingResponse response = api.updateGoalSharing(companyDomain, employeeId, goalId)
                .sharedWithEmployeeIds(sharedWithEmployeeIds)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Goal Progress
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProgressTest() throws ApiException {
        String companyDomain = null;
        Integer employeeId = null;
        Integer goalId = null;
        GoalsUpdateProgressResponse response = api.updateProgress(companyDomain, employeeId, goalId)
                .execute();
        // TODO: test validations
    }

}

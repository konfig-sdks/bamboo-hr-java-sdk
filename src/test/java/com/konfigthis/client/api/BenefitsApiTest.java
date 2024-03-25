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
import com.konfigthis.client.model.BenefitGroupEmployee;
import com.konfigthis.client.model.BenefitsAddEmployeeBenefitRequest;
import com.konfigthis.client.model.BenefitsAddNewCompanyBenefitRequest;
import com.konfigthis.client.model.BenefitsUpdateCompanyBenefitRequest;
import com.konfigthis.client.model.CompanyBenefitResponse;
import com.konfigthis.client.model.CompanyBenefitType;
import com.konfigthis.client.model.EmployeeBenefit;
import com.konfigthis.client.model.EmployeeBenefitFilters;
import com.konfigthis.client.model.EmployeeBenefitFiltersFilters;
import com.konfigthis.client.model.EmployeeDependent;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BenefitsApi
 */
@Disabled
public class BenefitsApiTest {

    private static BenefitsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BenefitsApi(apiClient);
    }

    /**
     * Add a benefit group employee
     *
     * Add a benefit group employee
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addBenefitGroupEmployeeTest() throws ApiException {
        String companyDomain = null;
        String benefitGroupId = null;
        String employeeId = null;
        String startDate = null;
        String endDate = null;
        api.addBenefitGroupEmployee(companyDomain)
                .benefitGroupId(benefitGroupId)
                .employeeId(employeeId)
                .startDate(startDate)
                .endDate(endDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Add an employee benefit
     *
     * Add an employee benefit
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEmployeeBenefitTest() throws ApiException {
        String companyDomain = null;
        Integer employeeId = null;
        Integer companyBenefitId = null;
        String companyBenefitName = null;
        String coverageLevel = null;
        LocalDate deductionEndDate = null;
        LocalDate deductionStartDate = null;
        String enrollmentStatus = null;
        LocalDate effectiveDate = null;
        String currencyCode = null;
        Double employeeAmount = null;
        String employeeAmountType = null;
        String employeePercentBasedOn = null;
        Double employeeCapAmount = null;
        String employeeCapAmountType = null;
        Double employeeAnnualMax = null;
        Double companyAmount = null;
        String companyAmountType = null;
        String companyPercentBasedOn = null;
        Double companyCapAmount = null;
        String companyCapAmountType = null;
        Double companyAnnualMax = null;
        Double benefitPlanCoverageId = null;
        api.addEmployeeBenefit(companyDomain)
                .employeeId(employeeId)
                .companyBenefitId(companyBenefitId)
                .companyBenefitName(companyBenefitName)
                .coverageLevel(coverageLevel)
                .deductionEndDate(deductionEndDate)
                .deductionStartDate(deductionStartDate)
                .enrollmentStatus(enrollmentStatus)
                .effectiveDate(effectiveDate)
                .currencyCode(currencyCode)
                .employeeAmount(employeeAmount)
                .employeeAmountType(employeeAmountType)
                .employeePercentBasedOn(employeePercentBasedOn)
                .employeeCapAmount(employeeCapAmount)
                .employeeCapAmountType(employeeCapAmountType)
                .employeeAnnualMax(employeeAnnualMax)
                .companyAmount(companyAmount)
                .companyAmountType(companyAmountType)
                .companyPercentBasedOn(companyPercentBasedOn)
                .companyCapAmount(companyCapAmount)
                .companyCapAmountType(companyCapAmountType)
                .companyAnnualMax(companyAnnualMax)
                .benefitPlanCoverageId(benefitPlanCoverageId)
                .execute();
        // TODO: test validations
    }

    /**
     * Add a new company benefit
     *
     * Add a new company benefit
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewCompanyBenefitTest() throws ApiException {
        String companyDomain = null;
        String description = null;
        String companyBenefitName = null;
        String benefitVendorId = null;
        String benefitType = null;
        String deductionTypeId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String planUrl = null;
        String ssoLoginUrl = null;
        String ssoLoginUrlLinkText = null;
        Boolean safeHarbor = null;
        Boolean meetAcaMin = null;
        Double reimbursementAmount = null;
        String reimbursementFrequency = null;
        String reimbursementCurrencyCode = null;
        Boolean minEssentialCoverage = null;
        CompanyBenefitResponse response = api.addNewCompanyBenefit(companyDomain)
                .description(description)
                .companyBenefitName(companyBenefitName)
                .benefitVendorId(benefitVendorId)
                .benefitType(benefitType)
                .deductionTypeId(deductionTypeId)
                .startDate(startDate)
                .endDate(endDate)
                .planUrl(planUrl)
                .ssoLoginUrl(ssoLoginUrl)
                .ssoLoginUrlLinkText(ssoLoginUrlLinkText)
                .safeHarbor(safeHarbor)
                .meetAcaMin(meetAcaMin)
                .reimbursementAmount(reimbursementAmount)
                .reimbursementFrequency(reimbursementFrequency)
                .reimbursementCurrencyCode(reimbursementCurrencyCode)
                .minEssentialCoverage(minEssentialCoverage)
                .execute();
        // TODO: test validations
    }

    /**
     * Add an employee dependent
     *
     * Adds an employee dependent
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEmployeeDependentTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String relationship = null;
        String gender = null;
        String ssn = null;
        String dateOfBirth = null;
        String addressLine1 = null;
        String addressLine2 = null;
        String city = null;
        String state = null;
        String zipCode = null;
        String homePhone = null;
        String country = null;
        String isUsCitizen = null;
        String isStudent = null;
        api.createEmployeeDependent(companyDomain)
                .employeeId(employeeId)
                .firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .relationship(relationship)
                .gender(gender)
                .ssn(ssn)
                .dateOfBirth(dateOfBirth)
                .addressLine1(addressLine1)
                .addressLine2(addressLine2)
                .city(city)
                .state(state)
                .zipCode(zipCode)
                .homePhone(homePhone)
                .country(country)
                .isUsCitizen(isUsCitizen)
                .isStudent(isStudent)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a company benefit
     *
     * Delete a company benefit
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCompanyBenefitTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.deleteCompanyBenefit(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get benefit group employees
     *
     * Get benefit group employees
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBenefitGroupEmployeesTest() throws ApiException {
        String companyDomain = null;
        api.getBenefitGroupEmployees(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get benefit groups
     *
     * Get benefit groups
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBenefitGroupsTest() throws ApiException {
        String companyDomain = null;
        api.getBenefitGroups(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get benefit plan deductions by employee
     *
     * Get benefit plan deductions by employee
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBenefitPlanDeductionsByEmployeeTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.getBenefitPlanDeductionsByEmployee(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get benefit plans
     *
     * Get benefit plans
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBenefitPlansTest() throws ApiException {
        String companyDomain = null;
        api.getBenefitPlans(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a company benefit
     *
     * Get a company benefit
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompanyBenefitTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        CompanyBenefitResponse response = api.getCompanyBenefit(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get benefit coverages
     *
     * Get benefit coverages
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCoveragesTest() throws ApiException {
        String companyDomain = null;
        api.getCoverages(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get benefit deduction types
     *
     * Get benefit deduction types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeductionTypesAllTest() throws ApiException {
        String companyDomain = null;
        api.getDeductionTypesAll(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get employee deductions by benefit plan
     *
     * Get employee deductions by benefit plan
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeductionsByPlanTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.getDeductionsByPlan(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get benefit deductions for employee
     *
     * Get benefit deductions for employee
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeBenefitDeductionsTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.getEmployeeBenefitDeductions(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get employee dependent
     *
     * Get employee dependent
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeDependentTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.getEmployeeDependent(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get benefit group plan costs
     *
     * Get benefit group plan costs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupPlanCostsTest() throws ApiException {
        String companyDomain = null;
        api.getGroupPlanCosts(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get benefit group plans
     *
     * Get benefit group plans
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupPlansTest() throws ApiException {
        String companyDomain = null;
        api.getGroupPlans(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get benefit plan coverages
     *
     * Get benefit plan coverages
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBenefitPlanCoveragesTest() throws ApiException {
        String companyDomain = null;
        api.listBenefitPlanCoverages(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a list of company benefit types
     *
     * Get a list of company benefit types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCompanyBenefitTypesTest() throws ApiException {
        String companyDomain = null;
        List<CompanyBenefitType> response = api.listCompanyBenefitTypes(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a list of company benefits
     *
     * Get a list of company benefits
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCompanyBenefitsTest() throws ApiException {
        String companyDomain = null;
        List<CompanyBenefitResponse> response = api.listCompanyBenefits(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a list of employee benefits
     *
     * Get a list of employee benefits
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEmployeeBenefitsTest() throws ApiException {
        String companyDomain = null;
        EmployeeBenefitFiltersFilters filters = null;
        List<EmployeeBenefit> response = api.listEmployeeBenefits(companyDomain)
                .filters(filters)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all employee dependents
     *
     * Get all employee dependents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEmployeeDependentsTest() throws ApiException {
        String companyDomain = null;
        String employeeid = null;
        api.listEmployeeDependents(companyDomain, employeeid)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a company benefit
     *
     * Update a company benefit
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCompanyBenefitTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String description = null;
        String companyBenefitName = null;
        String benefitVendorId = null;
        String benefitType = null;
        String deductionTypeId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String planUrl = null;
        String ssoLoginUrl = null;
        String ssoLoginUrlLinkText = null;
        Boolean safeHarbor = null;
        Boolean meetAcaMin = null;
        Double reimbursementAmount = null;
        String reimbursementFrequency = null;
        String reimbursementCurrencyCode = null;
        Boolean minEssentialCoverage = null;
        CompanyBenefitResponse response = api.updateCompanyBenefit(companyDomain, id)
                .description(description)
                .companyBenefitName(companyBenefitName)
                .benefitVendorId(benefitVendorId)
                .benefitType(benefitType)
                .deductionTypeId(deductionTypeId)
                .startDate(startDate)
                .endDate(endDate)
                .planUrl(planUrl)
                .ssoLoginUrl(ssoLoginUrl)
                .ssoLoginUrlLinkText(ssoLoginUrlLinkText)
                .safeHarbor(safeHarbor)
                .meetAcaMin(meetAcaMin)
                .reimbursementAmount(reimbursementAmount)
                .reimbursementFrequency(reimbursementFrequency)
                .reimbursementCurrencyCode(reimbursementCurrencyCode)
                .minEssentialCoverage(minEssentialCoverage)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an employee dependent
     *
     * This API allows you to change the information for a given dependent ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDependentInformationTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String employeeId = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String relationship = null;
        String gender = null;
        String ssn = null;
        String dateOfBirth = null;
        String addressLine1 = null;
        String addressLine2 = null;
        String city = null;
        String state = null;
        String zipCode = null;
        String homePhone = null;
        String country = null;
        String isUsCitizen = null;
        String isStudent = null;
        api.updateDependentInformation(companyDomain, id)
                .employeeId(employeeId)
                .firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .relationship(relationship)
                .gender(gender)
                .ssn(ssn)
                .dateOfBirth(dateOfBirth)
                .addressLine1(addressLine1)
                .addressLine2(addressLine2)
                .city(city)
                .state(state)
                .zipCode(zipCode)
                .homePhone(homePhone)
                .country(country)
                .isUsCitizen(isUsCitizen)
                .isStudent(isStudent)
                .execute();
        // TODO: test validations
    }

}
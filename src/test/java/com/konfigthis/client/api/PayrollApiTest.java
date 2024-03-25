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
import com.konfigthis.client.model.EmployeeDeposit;
import com.konfigthis.client.model.EmployeeDepositAccountsInner;
import com.konfigthis.client.model.EmployeePaystub;
import com.konfigthis.client.model.EmployeePaystubDeductionsInner;
import com.konfigthis.client.model.EmployeePaystubDepositsInner;
import com.konfigthis.client.model.EmployeePaystubTaxesInner;
import com.konfigthis.client.model.EmployeePaystubWagesInner;
import com.konfigthis.client.model.EmployeeUnpaidPaystub;
import com.konfigthis.client.model.EmployeeUnpaidPaystubUnpaidPeriodsInner;
import com.konfigthis.client.model.EmployeeWithholding;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayrollApi
 */
@Disabled
public class PayrollApiTest {

    private static PayrollApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PayrollApi(apiClient);
    }

    /**
     * Add an employee&#39;s direct deposit information
     *
     * Add an employee&#39;s direct deposit information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEmployeeDirectDepositInfoTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        List<EmployeeDepositAccountsInner> accounts = null;
        api.addEmployeeDirectDepositInfo(companyDomain, id)
                .accounts(accounts)
                .execute();
        // TODO: test validations
    }

    /**
     * Add an employee&#39;s paystub
     *
     * Add an employee&#39;s paystub
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEmployeePaystubTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        String externalRecordId = null;
        String payPeriodFrom = null;
        String payPeriodTo = null;
        String payDate = null;
        String payorName = null;
        String payorAdd1 = null;
        String payorAdd2 = null;
        String payorCity = null;
        String payorState = null;
        String payorZip = null;
        String payeeName = null;
        String currencyCode = null;
        String net = null;
        String gross = null;
        String totalTaxes = null;
        String totalDeductions = null;
        String ytdNet = null;
        String ytdGross = null;
        String ytdTaxes = null;
        String ytdDeductions = null;
        String fedWitholding = null;
        String federalType = null;
        String twoJobs = null;
        String dependentsAmount = null;
        String otherIncome = null;
        String deductionsAmount = null;
        String stateWithholding = null;
        String localWithholding = null;
        String additionalFed = null;
        String additionalState = null;
        String additionalLocal = null;
        String taxState = null;
        String taxLocal = null;
        List<EmployeePaystubWagesInner> wages = null;
        List<EmployeePaystubTaxesInner> taxes = null;
        List<EmployeePaystubDeductionsInner> deductions = null;
        List<EmployeePaystubDepositsInner> deposits = null;
        api.addEmployeePaystub(companyDomain)
                .employeeId(employeeId)
                .externalRecordId(externalRecordId)
                .payPeriodFrom(payPeriodFrom)
                .payPeriodTo(payPeriodTo)
                .payDate(payDate)
                .payorName(payorName)
                .payorAdd1(payorAdd1)
                .payorAdd2(payorAdd2)
                .payorCity(payorCity)
                .payorState(payorState)
                .payorZip(payorZip)
                .payeeName(payeeName)
                .currencyCode(currencyCode)
                .net(net)
                .gross(gross)
                .totalTaxes(totalTaxes)
                .totalDeductions(totalDeductions)
                .ytdNet(ytdNet)
                .ytdGross(ytdGross)
                .ytdTaxes(ytdTaxes)
                .ytdDeductions(ytdDeductions)
                .fedWitholding(fedWitholding)
                .federalType(federalType)
                .twoJobs(twoJobs)
                .dependentsAmount(dependentsAmount)
                .otherIncome(otherIncome)
                .deductionsAmount(deductionsAmount)
                .stateWithholding(stateWithholding)
                .localWithholding(localWithholding)
                .additionalFed(additionalFed)
                .additionalState(additionalState)
                .additionalLocal(additionalLocal)
                .taxState(taxState)
                .taxLocal(taxLocal)
                .wages(wages)
                .taxes(taxes)
                .deductions(deductions)
                .deposits(deposits)
                .execute();
        // TODO: test validations
    }

    /**
     * Add an employee&#39;s unpaid paystubs
     *
     * Add an employee&#39;s unpaid paystubs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEmployeeUnpaidPaystubsTest() throws ApiException {
        String companyDomain = null;
        String employeeId = null;
        List<EmployeeUnpaidPaystubUnpaidPeriodsInner> unpaidPeriods = null;
        api.addEmployeeUnpaidPaystubs(companyDomain)
                .employeeId(employeeId)
                .unpaidPeriods(unpaidPeriods)
                .execute();
        // TODO: test validations
    }

    /**
     * Add an employee&#39;s default withholdings
     *
     * Add an employee&#39;s default withholdings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEmployeeWithholdingsTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        String fedWithholding = null;
        String stateWithholding = null;
        String localWithholding = null;
        String additionalFed = null;
        String additionalState = null;
        String additionalLocal = null;
        String taxState = null;
        String taxLocal = null;
        api.addEmployeeWithholdings(companyDomain, id)
                .fedWithholding(fedWithholding)
                .stateWithholding(stateWithholding)
                .localWithholding(localWithholding)
                .additionalFed(additionalFed)
                .additionalState(additionalState)
                .additionalLocal(additionalLocal)
                .taxState(taxState)
                .taxLocal(taxLocal)
                .execute();
        // TODO: test validations
    }

    /**
     * Clear an employee&#39;s direct deposit information
     *
     * Clear an employee&#39;s direct deposit information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clearEmployeeDirectDepositTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.clearEmployeeDirectDeposit(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Clear an employee&#39;s unpaid paystubs
     *
     * Clear an employee&#39;s unpaid paystubs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clearEmployeeUnpaidPaystubsTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.clearEmployeeUnpaidPaystubs(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Clear an employee&#39;s default withholdings
     *
     * Clear an employee&#39;s default withholdings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clearEmployeeWithholdingsTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.clearEmployeeWithholdings(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an employee&#39;s paystub
     *
     * Delete an employee&#39;s paystub
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEmployeePaystubTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.deleteEmployeePaystub(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get an employee&#39;s direct deposit information
     *
     * Get an employee&#39;s direct deposit information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void employeeDirectDepositInfoTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.employeeDirectDepositInfo(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get an employee&#39;s default withholdings
     *
     * Get an employee&#39;s default withholdings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDefaultWithholdingsTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.getDefaultWithholdings(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get an employee&#39;s paystub
     *
     * Get an employee&#39;s paystub
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPaystubTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.getPaystub(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get an employee&#39;s unpaid paystubs
     *
     * Get an employee&#39;s unpaid paystubs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUnpaidPaystubsTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.getUnpaidPaystubs(companyDomain, id)
                .execute();
        // TODO: test validations
    }

}

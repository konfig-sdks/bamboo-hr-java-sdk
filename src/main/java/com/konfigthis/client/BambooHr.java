package com.konfigthis.client;

import com.konfigthis.client.api.AccountInformationApi;
import com.konfigthis.client.api.ApplicantTrackingApi;
import com.konfigthis.client.api.BenefitsApi;
import com.konfigthis.client.api.CompanyFilesApi;
import com.konfigthis.client.api.EmployeeFilesApi;
import com.konfigthis.client.api.EmployeesApi;
import com.konfigthis.client.api.GoalsApi;
import com.konfigthis.client.api.HoursApi;
import com.konfigthis.client.api.LastChangeInformationApi;
import com.konfigthis.client.api.LoginApi;
import com.konfigthis.client.api.PayrollApi;
import com.konfigthis.client.api.PhotosApi;
import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.TabularDataApi;
import com.konfigthis.client.api.TimeOffApi;
import com.konfigthis.client.api.TimeTrackingApi;
import com.konfigthis.client.api.TimeTrackingPrivateBetaApi;
import com.konfigthis.client.api.TrainingApi;
import com.konfigthis.client.api.WebhooksApi;

public class BambooHr {
    private ApiClient apiClient;
    public final AccountInformationApi accountInformation;
    public final ApplicantTrackingApi applicantTracking;
    public final BenefitsApi benefits;
    public final CompanyFilesApi companyFiles;
    public final EmployeeFilesApi employeeFiles;
    public final EmployeesApi employees;
    public final GoalsApi goals;
    public final HoursApi hours;
    public final LastChangeInformationApi lastChangeInformation;
    public final LoginApi login;
    public final PayrollApi payroll;
    public final PhotosApi photos;
    public final ReportsApi reports;
    public final TabularDataApi tabularData;
    public final TimeOffApi timeOff;
    public final TimeTrackingApi timeTracking;
    public final TimeTrackingPrivateBetaApi timeTrackingPrivateBeta;
    public final TrainingApi training;
    public final WebhooksApi webhooks;

    public BambooHr() {
        this(null);
    }

    public BambooHr(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accountInformation = new AccountInformationApi(this.apiClient);
        this.applicantTracking = new ApplicantTrackingApi(this.apiClient);
        this.benefits = new BenefitsApi(this.apiClient);
        this.companyFiles = new CompanyFilesApi(this.apiClient);
        this.employeeFiles = new EmployeeFilesApi(this.apiClient);
        this.employees = new EmployeesApi(this.apiClient);
        this.goals = new GoalsApi(this.apiClient);
        this.hours = new HoursApi(this.apiClient);
        this.lastChangeInformation = new LastChangeInformationApi(this.apiClient);
        this.login = new LoginApi(this.apiClient);
        this.payroll = new PayrollApi(this.apiClient);
        this.photos = new PhotosApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
        this.tabularData = new TabularDataApi(this.apiClient);
        this.timeOff = new TimeOffApi(this.apiClient);
        this.timeTracking = new TimeTrackingApi(this.apiClient);
        this.timeTrackingPrivateBeta = new TimeTrackingPrivateBetaApi(this.apiClient);
        this.training = new TrainingApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

}

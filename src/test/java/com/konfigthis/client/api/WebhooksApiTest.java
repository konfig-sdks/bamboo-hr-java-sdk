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
import com.konfigthis.client.model.NewWebHook;
import com.konfigthis.client.model.NewWebHookFrequency;
import com.konfigthis.client.model.NewWebHookLimit;
import com.konfigthis.client.model.WebHookLogResponse;
import com.konfigthis.client.model.WebHookResponse;
import com.konfigthis.client.model.WebhooksAddNewWebhookResponse;
import com.konfigthis.client.model.WebhooksGetUserListResponse;
import com.konfigthis.client.model.WebhooksListMonitorFieldsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private static WebhooksApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new WebhooksApi(apiClient);
    }

    /**
     * Add Webhook
     *
     * Add a new Webhook. For more details or instructions you can refer to the [webhooks API tutorial](https://documentation.bamboohr.com/docs/webhooks-api-permission-based).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewWebhookTest() throws ApiException {
        String name = null;
        List<String> monitorFields = null;
        Map<String, String> postFields = null;
        String url = null;
        String companyDomain = null;
        String format = null;
        NewWebHookFrequency frequency = null;
        NewWebHookLimit limit = null;
        Boolean includeCompanyDomain = null;
        WebhooksAddNewWebhookResponse response = api.addNewWebhook(name, monitorFields, postFields, url, companyDomain)
                .format(format)
                .frequency(frequency)
                .limit(limit)
                .includeCompanyDomain(includeCompanyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Webhook
     *
     * Delete a webhook that is tied to a specific user API Key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhookTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        api.deleteWebhook(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets as list of webhooks for the user API key.
     *
     * Gets as list of webhooks for the user API key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserListTest() throws ApiException {
        String companyDomain = null;
        WebhooksGetUserListResponse response = api.getUserList(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Webhook
     *
     * Get webhook data that is tied to a specific user API Key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserWebhookTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        WebHookResponse response = api.getUserWebhook(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Webhook Logs
     *
     * Get webhook logs for specific webhook id that is associated with the user API Key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhookLogsTest() throws ApiException {
        String companyDomain = null;
        String id = null;
        WebHookLogResponse response = api.getWebhookLogs(companyDomain, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get monitor fields
     *
     * Get a list fields webhooks can monitor monitor
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMonitorFieldsTest() throws ApiException {
        String companyDomain = null;
        WebhooksListMonitorFieldsResponse response = api.listMonitorFields(companyDomain)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Webhook
     *
     * Update a webhook, based on webhook ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWebhookByIdTest() throws ApiException {
        String name = null;
        List<String> monitorFields = null;
        Map<String, String> postFields = null;
        String url = null;
        String companyDomain = null;
        String id = null;
        String format = null;
        NewWebHookFrequency frequency = null;
        NewWebHookLimit limit = null;
        Boolean includeCompanyDomain = null;
        WebHookResponse response = api.updateWebhookById(name, monitorFields, postFields, url, companyDomain, id)
                .format(format)
                .frequency(frequency)
                .limit(limit)
                .includeCompanyDomain(includeCompanyDomain)
                .execute();
        // TODO: test validations
    }

}
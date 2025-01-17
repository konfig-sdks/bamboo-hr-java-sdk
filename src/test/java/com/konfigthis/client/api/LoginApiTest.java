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
import com.konfigthis.client.model.Login;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoginApi
 */
@Disabled
public class LoginApiTest {

    private static LoginApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LoginApi(apiClient);
    }

    /**
     * User Login
     *
     * User Login
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCredentialsTest() throws ApiException {
        String companyDomain = null;
        String applicationKey = null;
        String user = null;
        String password = null;
        api.userCredentials(companyDomain)
                .applicationKey(applicationKey)
                .user(user)
                .password(password)
                .execute();
        // TODO: test validations
    }

}

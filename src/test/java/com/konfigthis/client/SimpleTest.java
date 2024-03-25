package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.bamboohr.com/api/gateway.php";
        
        // Configure OAuth2 access token for authorization: auth
        configuration.accessToken = "YOUR ACCESS TOKEN";
        
        // Configure HTTP basic authorization: basic
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        BambooHr client = new BambooHr(configuration);
        assertNotNull(client);
    }
}

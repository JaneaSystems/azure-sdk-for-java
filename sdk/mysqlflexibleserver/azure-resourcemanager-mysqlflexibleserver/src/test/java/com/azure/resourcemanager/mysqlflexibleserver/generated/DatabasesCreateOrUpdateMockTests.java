// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mysqlflexibleserver.MySqlManager;
import com.azure.resourcemanager.mysqlflexibleserver.models.Database;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DatabasesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"charset\":\"kkqfqjbvle\",\"collation\":\"fmluiqtqzfavyvn\"},\"id\":\"ybar\",\"name\":\"euayjkqabqgzsles\",\"type\":\"cbhernntiewdj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MySqlManager manager = MySqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Database response = manager.databases()
            .define("zedqbcvhzlhplo")
            .withExistingFlexibleServer("ostgkts", "vdxec")
            .withCharset("dlwwqfbumlkxt")
            .withCollation("jfsmlmbtxhwgfwsr")
            .create();

        Assertions.assertEquals("kkqfqjbvle", response.charset());
        Assertions.assertEquals("fmluiqtqzfavyvn", response.collation());
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.models.CheckNameResult;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalAssignmentCheckNameRequest;
import com.azure.resourcemanager.kusto.models.Reason;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DatabasePrincipalAssignmentsCheckNameAvailabilityWithResponseMockTests {
    @Test
    public void testCheckNameAvailabilityWithResponse() throws Exception {
        String responseStr
            = "{\"nameAvailable\":true,\"name\":\"wartspphkixkykxd\",\"message\":\"j\",\"reason\":\"Invalid\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        KustoManager manager = KustoManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CheckNameResult response = manager.databasePrincipalAssignments()
            .checkNameAvailabilityWithResponse("piudeugfsxzecpa", "wkufykhvuhxepm", "utznabaobns",
                new DatabasePrincipalAssignmentCheckNameRequest().withName("ujdjltymkmvg"),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(true, response.nameAvailable());
        Assertions.assertEquals("wartspphkixkykxd", response.name());
        Assertions.assertEquals("j", response.message());
        Assertions.assertEquals(Reason.INVALID, response.reason());
    }
}

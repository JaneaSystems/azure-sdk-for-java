// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class SentSharesGetInvitationTests extends PurviewShareClientTestBase {
    @Test
    @Disabled
    public void testSentSharesGetInvitationTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                sentSharesClient.getSentShareInvitationWithResponse(
                        "FF4A2AAE-8755-47BB-9C00-A774B5A7006E", "9F154FA4-93D1-426B-A908-A9CAC7192B21", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("Fri, 12 Aug 2022 18:04:32 GMT", response.getHeaders().get("Date").getValue());
        Assertions.assertEquals(
                "25c78f97-0b0a-4fe9-ad39-883a482265cd",
                response.getHeaders().get("x-ms-correlation-request-id").getValue());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"type\":\"sentShares/sentShareInvitations\",\"id\":\"9F154FA4-93D1-426B-A908-A9CAC7192B21\",\"invitationKind\":\"User\",\"properties\":{\"expirationDate\":null,\"notify\":true,\"senderEmail\":\"testSender@microsoft.com\",\"senderName\":\"Test Sender\",\"senderTenantName\":\"Test Tenant\",\"sentAt\":\"2022-08-04T13:04:32.8172128Z\",\"shareStatus\":\"Detached\",\"state\":\"Succeeded\",\"targetEmail\":\"testReceiver@microsoft.com\"}}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
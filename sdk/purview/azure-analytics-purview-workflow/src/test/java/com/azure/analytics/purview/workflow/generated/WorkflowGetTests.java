// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WorkflowGetTests extends PurviewWorkflowClientTestBase {
    @Test
    public void testWorkflowGetTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                purviewWorkflowClient.getWorkflowWithResponse("8af1ecae-16ee-4b2d-8972-00d611dd2f99", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
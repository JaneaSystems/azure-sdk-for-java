// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.models.Operation;
import com.azure.resourcemanager.policyinsights.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Operation model = BinaryData.fromString(
            "{\"name\":\"c\",\"isDataAction\":true,\"display\":{\"provider\":\"ksrl\",\"resource\":\"desqplpvmjcdo\",\"operation\":\"bidyv\",\"description\":\"owx\"}}")
            .toObject(Operation.class);
        Assertions.assertEquals("c", model.name());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals("ksrl", model.display().provider());
        Assertions.assertEquals("desqplpvmjcdo", model.display().resource());
        Assertions.assertEquals("bidyv", model.display().operation());
        Assertions.assertEquals("owx", model.display().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Operation model = new Operation().withName("c")
            .withIsDataAction(true)
            .withDisplay(new OperationDisplay().withProvider("ksrl")
                .withResource("desqplpvmjcdo")
                .withOperation("bidyv")
                .withDescription("owx"));
        model = BinaryData.fromObject(model).toObject(Operation.class);
        Assertions.assertEquals("c", model.name());
        Assertions.assertEquals(true, model.isDataAction());
        Assertions.assertEquals("ksrl", model.display().provider());
        Assertions.assertEquals("desqplpvmjcdo", model.display().resource());
        Assertions.assertEquals("bidyv", model.display().operation());
        Assertions.assertEquals("owx", model.display().description());
    }
}

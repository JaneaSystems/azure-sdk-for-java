// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.EnvironmentVariableSetup;
import org.junit.jupiter.api.Assertions;

public final class EnvironmentVariableSetupTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnvironmentVariableSetup model =
            BinaryData
                .fromString(
                    "{\"type\":\"EnvironmentVariableSetup\",\"typeProperties\":{\"variableName\":\"lxeehuxiq\",\"variableValue\":\"zlrayme\"}}")
                .toObject(EnvironmentVariableSetup.class);
        Assertions.assertEquals("lxeehuxiq", model.variableName());
        Assertions.assertEquals("zlrayme", model.variableValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnvironmentVariableSetup model =
            new EnvironmentVariableSetup().withVariableName("lxeehuxiq").withVariableValue("zlrayme");
        model = BinaryData.fromObject(model).toObject(EnvironmentVariableSetup.class);
        Assertions.assertEquals("lxeehuxiq", model.variableName());
        Assertions.assertEquals("zlrayme", model.variableValue());
    }
}
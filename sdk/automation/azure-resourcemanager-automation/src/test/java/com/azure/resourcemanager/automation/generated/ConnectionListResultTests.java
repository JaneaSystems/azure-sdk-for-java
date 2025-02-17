// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.ConnectionInner;
import com.azure.resourcemanager.automation.models.ConnectionListResult;
import com.azure.resourcemanager.automation.models.ConnectionTypeAssociationProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConnectionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"connectionType\":{\"name\":\"zsjqlh\"},\"fieldDefinitionValues\":{\"p\":\"ibdeibq\"},\"creationTime\":\"2021-05-03T06:31:18Z\",\"lastModifiedTime\":\"2021-01-11T11:05:07Z\",\"description\":\"ndzwmkrefa\"},\"id\":\"pjorwkqnyhg\",\"name\":\"ij\",\"type\":\"jivfxzsjabib\"},{\"properties\":{\"connectionType\":{\"name\":\"awfsdjpvkvpbjxbk\"},\"fieldDefinitionValues\":{\"ncj\":\"kd\",\"zhjjklffhmouwq\":\"budurgkakmo\"},\"creationTime\":\"2021-01-26T12:14:58Z\",\"lastModifiedTime\":\"2021-12-02T00:58:01Z\",\"description\":\"eeyebi\"},\"id\":\"ikayuhqlbjbsybb\",\"name\":\"wrv\",\"type\":\"ldgmfpgvmpip\"}],\"nextLink\":\"ltha\"}")
            .toObject(ConnectionListResult.class);
        Assertions.assertEquals("zsjqlh", model.value().get(0).connectionType().name());
        Assertions.assertEquals("ndzwmkrefa", model.value().get(0).description());
        Assertions.assertEquals("ltha", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectionListResult model = new ConnectionListResult().withValue(Arrays.asList(
            new ConnectionInner().withConnectionType(new ConnectionTypeAssociationProperty().withName("zsjqlh"))
                .withDescription("ndzwmkrefa"),
            new ConnectionInner()
                .withConnectionType(new ConnectionTypeAssociationProperty().withName("awfsdjpvkvpbjxbk"))
                .withDescription("eeyebi")))
            .withNextLink("ltha");
        model = BinaryData.fromObject(model).toObject(ConnectionListResult.class);
        Assertions.assertEquals("zsjqlh", model.value().get(0).connectionType().name());
        Assertions.assertEquals("ndzwmkrefa", model.value().get(0).description());
        Assertions.assertEquals("ltha", model.nextLink());
    }
}

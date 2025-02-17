// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.Anomalies;
import org.junit.jupiter.api.Assertions;

public final class AnomaliesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Anomalies model = BinaryData.fromString(
            "{\"kind\":\"Anomalies\",\"properties\":{\"isEnabled\":false},\"etag\":\"gj\",\"id\":\"iobpnjodf\",\"name\":\"bj\",\"type\":\"qwm\"}")
            .toObject(Anomalies.class);
        Assertions.assertEquals("gj", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Anomalies model = new Anomalies().withEtag("gj");
        model = BinaryData.fromObject(model).toObject(Anomalies.class);
        Assertions.assertEquals("gj", model.etag());
    }
}

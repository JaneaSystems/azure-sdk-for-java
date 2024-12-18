// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.HighAvailability;
import com.azure.resourcemanager.mysqlflexibleserver.models.HighAvailabilityMode;
import org.junit.jupiter.api.Assertions;

public final class HighAvailabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HighAvailability model = BinaryData
            .fromString(
                "{\"mode\":\"Disabled\",\"state\":\"RemovingStandby\",\"standbyAvailabilityZone\":\"adehxnltyfsopp\"}")
            .toObject(HighAvailability.class);
        Assertions.assertEquals(HighAvailabilityMode.DISABLED, model.mode());
        Assertions.assertEquals("adehxnltyfsopp", model.standbyAvailabilityZone());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HighAvailability model = new HighAvailability().withMode(HighAvailabilityMode.DISABLED)
            .withStandbyAvailabilityZone("adehxnltyfsopp");
        model = BinaryData.fromObject(model).toObject(HighAvailability.class);
        Assertions.assertEquals(HighAvailabilityMode.DISABLED, model.mode());
        Assertions.assertEquals("adehxnltyfsopp", model.standbyAvailabilityZone());
    }
}

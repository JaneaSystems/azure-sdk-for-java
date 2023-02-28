// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.ResourceSkuZoneDetails;

public final class ResourceSkuZoneDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSkuZoneDetails model =
            BinaryData
                .fromString("{\"name\":[\"cxy\",\"ny\"],\"capabilities\":[{\"name\":\"yn\",\"value\":\"idybyxczf\"}]}")
                .toObject(ResourceSkuZoneDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceSkuZoneDetails model = new ResourceSkuZoneDetails();
        model = BinaryData.fromObject(model).toObject(ResourceSkuZoneDetails.class);
    }
}
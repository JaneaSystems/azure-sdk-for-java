// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.connectedvmware.models.PlacementProfile;
import org.junit.jupiter.api.Assertions;

public final class PlacementProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PlacementProfile model = BinaryData.fromString(
            "{\"resourcePoolId\":\"qibrtalme\",\"clusterId\":\"t\",\"hostId\":\"dslqxihhrmooizqs\",\"datastoreId\":\"pxiutc\"}")
            .toObject(PlacementProfile.class);
        Assertions.assertEquals("qibrtalme", model.resourcePoolId());
        Assertions.assertEquals("t", model.clusterId());
        Assertions.assertEquals("dslqxihhrmooizqs", model.hostId());
        Assertions.assertEquals("pxiutc", model.datastoreId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PlacementProfile model = new PlacementProfile().withResourcePoolId("qibrtalme")
            .withClusterId("t")
            .withHostId("dslqxihhrmooizqs")
            .withDatastoreId("pxiutc");
        model = BinaryData.fromObject(model).toObject(PlacementProfile.class);
        Assertions.assertEquals("qibrtalme", model.resourcePoolId());
        Assertions.assertEquals("t", model.clusterId());
        Assertions.assertEquals("dslqxihhrmooizqs", model.hostId());
        Assertions.assertEquals("pxiutc", model.datastoreId());
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.CapabilitySetsList;

public final class CapabilitySetsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapabilitySetsList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"supportedGeoBackupRegions\":[\"b\",\"e\"],\"supportedFlexibleServerEditions\":[{\"name\":\"k\",\"defaultSku\":\"ali\",\"defaultStorageSize\":12612409,\"supportedStorageEditions\":[{},{},{}],\"supportedSkus\":[{},{},{}]}],\"supportedServerVersions\":[{\"name\":\"ashsfwxos\"},{\"name\":\"z\"},{\"name\":\"ugicjooxdjebw\"}]},\"id\":\"cwwfvovbvme\",\"name\":\"ecivyh\",\"type\":\"ce\"}],\"nextLink\":\"jgjrwjueiotwm\"}")
            .toObject(CapabilitySetsList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapabilitySetsList model = new CapabilitySetsList();
        model = BinaryData.fromObject(model).toObject(CapabilitySetsList.class);
    }
}

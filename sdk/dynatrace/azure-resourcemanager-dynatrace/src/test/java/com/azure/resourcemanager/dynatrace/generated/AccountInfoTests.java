// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dynatrace.models.AccountInfo;
import org.junit.jupiter.api.Assertions;

public final class AccountInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountInfo model
            = BinaryData.fromString("{\"accountId\":\"kohdbiha\",\"regionId\":\"fhfcb\"}").toObject(AccountInfo.class);
        Assertions.assertEquals("kohdbiha", model.accountId());
        Assertions.assertEquals("fhfcb", model.regionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountInfo model = new AccountInfo().withAccountId("kohdbiha").withRegionId("fhfcb");
        model = BinaryData.fromObject(model).toObject(AccountInfo.class);
        Assertions.assertEquals("kohdbiha", model.accountId());
        Assertions.assertEquals("fhfcb", model.regionId());
    }
}

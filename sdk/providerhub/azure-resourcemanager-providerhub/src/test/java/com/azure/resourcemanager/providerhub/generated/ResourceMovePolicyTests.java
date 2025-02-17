// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.providerhub.models.ResourceMovePolicy;
import org.junit.jupiter.api.Assertions;

public final class ResourceMovePolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceMovePolicy model = BinaryData.fromString(
            "{\"validationRequired\":false,\"crossResourceGroupMoveEnabled\":true,\"crossSubscriptionMoveEnabled\":false}")
            .toObject(ResourceMovePolicy.class);
        Assertions.assertEquals(false, model.validationRequired());
        Assertions.assertEquals(true, model.crossResourceGroupMoveEnabled());
        Assertions.assertEquals(false, model.crossSubscriptionMoveEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceMovePolicy model = new ResourceMovePolicy().withValidationRequired(false)
            .withCrossResourceGroupMoveEnabled(true)
            .withCrossSubscriptionMoveEnabled(false);
        model = BinaryData.fromObject(model).toObject(ResourceMovePolicy.class);
        Assertions.assertEquals(false, model.validationRequired());
        Assertions.assertEquals(true, model.crossResourceGroupMoveEnabled());
        Assertions.assertEquals(false, model.crossSubscriptionMoveEnabled());
    }
}

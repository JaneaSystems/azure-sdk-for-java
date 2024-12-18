// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.fluent.models.AutoUpgradeProfileProperties;
import com.azure.resourcemanager.containerservicefleet.models.AutoUpgradeNodeImageSelection;
import com.azure.resourcemanager.containerservicefleet.models.AutoUpgradeNodeImageSelectionType;
import com.azure.resourcemanager.containerservicefleet.models.UpgradeChannel;
import org.junit.jupiter.api.Assertions;

public final class AutoUpgradeProfilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutoUpgradeProfileProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Canceled\",\"updateStrategyId\":\"nteiwaopv\",\"channel\":\"Stable\",\"nodeImageSelection\":{\"type\":\"Consistent\"},\"disabled\":false}")
            .toObject(AutoUpgradeProfileProperties.class);
        Assertions.assertEquals("nteiwaopv", model.updateStrategyId());
        Assertions.assertEquals(UpgradeChannel.STABLE, model.channel());
        Assertions.assertEquals(AutoUpgradeNodeImageSelectionType.CONSISTENT, model.nodeImageSelection().type());
        Assertions.assertEquals(false, model.disabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutoUpgradeProfileProperties model = new AutoUpgradeProfileProperties().withUpdateStrategyId("nteiwaopv")
            .withChannel(UpgradeChannel.STABLE)
            .withNodeImageSelection(
                new AutoUpgradeNodeImageSelection().withType(AutoUpgradeNodeImageSelectionType.CONSISTENT))
            .withDisabled(false);
        model = BinaryData.fromObject(model).toObject(AutoUpgradeProfileProperties.class);
        Assertions.assertEquals("nteiwaopv", model.updateStrategyId());
        Assertions.assertEquals(UpgradeChannel.STABLE, model.channel());
        Assertions.assertEquals(AutoUpgradeNodeImageSelectionType.CONSISTENT, model.nodeImageSelection().type());
        Assertions.assertEquals(false, model.disabled());
    }
}

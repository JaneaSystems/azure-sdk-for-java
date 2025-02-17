// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.MqttD2CMessagesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class MqttD2CMessagesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MqttD2CMessagesNotInAllowedRange model = BinaryData.fromString(
            "{\"ruleType\":\"MqttD2CMessagesNotInAllowedRange\",\"timeWindowSize\":\"PT235H6M21S\",\"minThreshold\":7484371,\"maxThreshold\":995984285,\"displayName\":\"zdq\",\"description\":\"hcspo\",\"isEnabled\":false}")
            .toObject(MqttD2CMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(7484371, model.minThreshold());
        Assertions.assertEquals(995984285, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT235H6M21S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MqttD2CMessagesNotInAllowedRange model = new MqttD2CMessagesNotInAllowedRange().withIsEnabled(false)
            .withMinThreshold(7484371)
            .withMaxThreshold(995984285)
            .withTimeWindowSize(Duration.parse("PT235H6M21S"));
        model = BinaryData.fromObject(model).toObject(MqttD2CMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(7484371, model.minThreshold());
        Assertions.assertEquals(995984285, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT235H6M21S"), model.timeWindowSize());
    }
}

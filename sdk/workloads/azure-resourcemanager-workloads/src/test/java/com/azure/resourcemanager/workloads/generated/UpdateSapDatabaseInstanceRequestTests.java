// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.UpdateSapDatabaseInstanceRequest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class UpdateSapDatabaseInstanceRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateSapDatabaseInstanceRequest model =
            BinaryData
                .fromString("{\"tags\":{\"rmjmwvvjektc\":\"kbeype\",\"frzpwvlqdqgb\":\"senhwlrs\"}}")
                .toObject(UpdateSapDatabaseInstanceRequest.class);
        Assertions.assertEquals("kbeype", model.tags().get("rmjmwvvjektc"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateSapDatabaseInstanceRequest model =
            new UpdateSapDatabaseInstanceRequest()
                .withTags(mapOf("rmjmwvvjektc", "kbeype", "frzpwvlqdqgb", "senhwlrs"));
        model = BinaryData.fromObject(model).toObject(UpdateSapDatabaseInstanceRequest.class);
        Assertions.assertEquals("kbeype", model.tags().get("rmjmwvvjektc"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
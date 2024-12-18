// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devhub.models.DeploymentProperties;
import com.azure.resourcemanager.devhub.models.ManifestType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DeploymentPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeploymentProperties model = BinaryData.fromString(
            "{\"manifestType\":\"helm\",\"kubeManifestLocations\":[\"kirsoodqxhc\",\"mnoh\",\"t\",\"kwh\"],\"helmChartPath\":\"oifiyipjxsqwpgr\",\"helmValues\":\"znorcj\",\"overrides\":{\"xqabnmocpcysh\":\"nb\"}}")
            .toObject(DeploymentProperties.class);
        Assertions.assertEquals(ManifestType.HELM, model.manifestType());
        Assertions.assertEquals("kirsoodqxhc", model.kubeManifestLocations().get(0));
        Assertions.assertEquals("oifiyipjxsqwpgr", model.helmChartPath());
        Assertions.assertEquals("znorcj", model.helmValues());
        Assertions.assertEquals("nb", model.overrides().get("xqabnmocpcysh"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeploymentProperties model = new DeploymentProperties().withManifestType(ManifestType.HELM)
            .withKubeManifestLocations(Arrays.asList("kirsoodqxhc", "mnoh", "t", "kwh"))
            .withHelmChartPath("oifiyipjxsqwpgr")
            .withHelmValues("znorcj")
            .withOverrides(mapOf("xqabnmocpcysh", "nb"));
        model = BinaryData.fromObject(model).toObject(DeploymentProperties.class);
        Assertions.assertEquals(ManifestType.HELM, model.manifestType());
        Assertions.assertEquals("kirsoodqxhc", model.kubeManifestLocations().get(0));
        Assertions.assertEquals("oifiyipjxsqwpgr", model.helmChartPath());
        Assertions.assertEquals("znorcj", model.helmValues());
        Assertions.assertEquals("nb", model.overrides().get("xqabnmocpcysh"));
    }

    // Use "Map.of" if available
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

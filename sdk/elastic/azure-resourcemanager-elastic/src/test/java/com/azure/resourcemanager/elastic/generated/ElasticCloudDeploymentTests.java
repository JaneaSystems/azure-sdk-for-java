// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.models.ElasticCloudDeployment;

public final class ElasticCloudDeploymentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ElasticCloudDeployment model = BinaryData.fromString(
            "{\"name\":\"sezcxtb\",\"deploymentId\":\"gfycc\",\"azureSubscriptionId\":\"ewmdw\",\"elasticsearchRegion\":\"eiachboosflnr\",\"elasticsearchServiceUrl\":\"fqpte\",\"kibanaServiceUrl\":\"zzvypyqrimzinp\",\"kibanaSsoUrl\":\"wjdk\"}")
            .toObject(ElasticCloudDeployment.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ElasticCloudDeployment model = new ElasticCloudDeployment();
        model = BinaryData.fromObject(model).toObject(ElasticCloudDeployment.class);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.fluent.models.AccountProperties;
import com.azure.resourcemanager.purview.models.AccountUpdateParameters;
import com.azure.resourcemanager.purview.models.CloudConnectors;
import com.azure.resourcemanager.purview.models.Identity;
import com.azure.resourcemanager.purview.models.PublicNetworkAccess;
import com.azure.resourcemanager.purview.models.Type;
import com.azure.resourcemanager.purview.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AccountUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountUpdateParameters model = BinaryData.fromString(
            "{\"identity\":{\"principalId\":\"ajiwkuo\",\"tenantId\":\"skghsauuimj\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"slkevle\":{\"clientId\":\"uugidyjrrfby\",\"principalId\":\"svexcsonpclhoco\"},\"hl\":{\"clientId\":\"zfbuhf\",\"principalId\":\"faxkffeii\"}}},\"properties\":{\"cloudConnectors\":{\"awsExternalId\":\"yvshxmz\"},\"createdAt\":\"2021-11-21T10:52:55Z\",\"createdBy\":\"oggigrxwburv\",\"createdByObjectId\":\"xjnspy\",\"endpoints\":{\"catalog\":\"koen\",\"guardian\":\"uknvudwti\",\"scan\":\"bldngkpoc\"},\"friendlyName\":\"azyxoegukg\",\"managedResourceGroupName\":\"piu\",\"managedResources\":{\"eventHubNamespace\":\"gevqznty\",\"resourceGroup\":\"rbpizc\",\"storageAccount\":\"qjsdpydnfyhxdeo\"},\"privateEndpointConnections\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"ifsjttgzfbishcb\"},\"privateLinkServiceConnectionState\":{\"actionsRequired\":\"jdeyeamdpha\",\"description\":\"lpbuxwgipwhonowk\",\"status\":\"Approved\"},\"provisioningState\":\"ankixzbinjeput\"},\"id\":\"mryw\",\"name\":\"uzoqft\",\"type\":\"yqzrnkcqvyxlw\"}],\"provisioningState\":\"Unknown\",\"publicNetworkAccess\":\"NotSpecified\"},\"tags\":{\"avwhheunm\":\"hoqqnwvlr\",\"yaxuconuqszfkb\":\"qhgyxzkonocukok\",\"xsenhwlr\":\"ypewrmjmwvvjekt\",\"ihkaetcktvfc\":\"ffrzpwvlqdqgbiqy\"}}")
            .toObject(AccountUpdateParameters.class);
        Assertions.assertEquals(Type.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("piu", model.properties().managedResourceGroupName());
        Assertions.assertEquals(PublicNetworkAccess.NOT_SPECIFIED, model.properties().publicNetworkAccess());
        Assertions.assertEquals("hoqqnwvlr", model.tags().get("avwhheunm"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountUpdateParameters model = new AccountUpdateParameters()
            .withIdentity(new Identity().withType(Type.USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf("slkevle", new UserAssignedIdentity(), "hl", new UserAssignedIdentity())))
            .withProperties(new AccountProperties().withCloudConnectors(new CloudConnectors())
                .withManagedResourceGroupName("piu")
                .withPublicNetworkAccess(PublicNetworkAccess.NOT_SPECIFIED))
            .withTags(mapOf("avwhheunm", "hoqqnwvlr", "yaxuconuqszfkb", "qhgyxzkonocukok", "xsenhwlr",
                "ypewrmjmwvvjekt", "ihkaetcktvfc", "ffrzpwvlqdqgbiqy"));
        model = BinaryData.fromObject(model).toObject(AccountUpdateParameters.class);
        Assertions.assertEquals(Type.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("piu", model.properties().managedResourceGroupName());
        Assertions.assertEquals(PublicNetworkAccess.NOT_SPECIFIED, model.properties().publicNetworkAccess());
        Assertions.assertEquals("hoqqnwvlr", model.tags().get("avwhheunm"));
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

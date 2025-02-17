// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.signalr.SignalRManager;
import com.azure.resourcemanager.signalr.models.AclAction;
import com.azure.resourcemanager.signalr.models.FeatureFlags;
import com.azure.resourcemanager.signalr.models.ManagedIdentityType;
import com.azure.resourcemanager.signalr.models.ServiceKind;
import com.azure.resourcemanager.signalr.models.SignalRRequestType;
import com.azure.resourcemanager.signalr.models.SignalRResource;
import com.azure.resourcemanager.signalr.models.SignalRSkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SignalRsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"sku\":{\"name\":\"wqqxeysko\",\"tier\":\"Premium\",\"size\":\"nkfkbgbzb\",\"family\":\"xeqoc\",\"capacity\":228407914},\"properties\":{\"provisioningState\":\"Failed\",\"externalIP\":\"zqkjjeokbzefe\",\"hostName\":\"xcczurtl\",\"publicPort\":1572244952,\"serverPort\":1316938253,\"version\":\"kwv\",\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"privateEndpoint\":{},\"groupIds\":[\"ixz\"],\"privateLinkServiceConnectionState\":{}},\"id\":\"pnodawopqhe\",\"name\":\"jptmcgsbost\",\"type\":\"eln\"},{\"properties\":{\"provisioningState\":\"Updating\",\"privateEndpoint\":{},\"groupIds\":[\"lbiojlvfhrb\",\"pn\",\"qvcww\",\"yurmochpprprs\"],\"privateLinkServiceConnectionState\":{}},\"id\":\"okayzejnhlbkp\",\"name\":\"z\",\"type\":\"cpilj\"},{\"properties\":{\"provisioningState\":\"Running\",\"privateEndpoint\":{},\"groupIds\":[\"ndbnwieh\"],\"privateLinkServiceConnectionState\":{}},\"id\":\"ewjwiuubw\",\"name\":\"fqsfa\",\"type\":\"aqtferr\"},{\"properties\":{\"provisioningState\":\"Creating\",\"privateEndpoint\":{},\"groupIds\":[\"xap\",\"wogqqnobpudcdab\",\"qwpwyawbzasqbuc\",\"jg\"],\"privateLinkServiceConnectionState\":{}},\"id\":\"exaoguya\",\"name\":\"p\",\"type\":\"dsdaultxijjumf\"}],\"sharedPrivateLinkResources\":[{\"properties\":{\"groupId\":\"nqnm\",\"privateLinkResourceId\":\"jng\",\"provisioningState\":\"Moving\",\"requestMessage\":\"xtbjwgnyfusfzsv\",\"status\":\"Approved\"},\"id\":\"kzhajqglcfhm\",\"name\":\"rqryxynqn\",\"type\":\"rd\"},{\"properties\":{\"groupId\":\"vwxzn\",\"privateLinkResourceId\":\"tgoe\",\"provisioningState\":\"Succeeded\",\"requestMessage\":\"abpfhvfs\",\"status\":\"Disconnected\"},\"id\":\"ntjlr\",\"name\":\"gjkskyrioov\",\"type\":\"idsxwaabzmifry\"},{\"properties\":{\"groupId\":\"mmaxrizkzobgo\",\"privateLinkResourceId\":\"xlhslnel\",\"provisioningState\":\"Failed\",\"requestMessage\":\"xynl\",\"status\":\"Pending\"},\"id\":\"cwcrojphs\",\"name\":\"hcawjutifdwfmv\",\"type\":\"gorqjbttzh\"},{\"properties\":{\"groupId\":\"lkafhonqjuje\",\"privateLinkResourceId\":\"ckpzvcpopmxeln\",\"provisioningState\":\"Unknown\",\"requestMessage\":\"yjede\",\"status\":\"Approved\"},\"id\":\"lfmk\",\"name\":\"scazuawxtzxpu\",\"type\":\"mwabzxrvxc\"}],\"tls\":{\"clientCertEnabled\":true},\"hostNamePrefix\":\"haivm\",\"features\":[{\"flag\":\"EnableLiveTrace\",\"value\":\"flv\",\"properties\":{\"hknsmjbl\":\"zwywako\",\"ryuzcbmqqv\":\"ljhlnymzotq\"}},{\"flag\":\"ServiceMode\",\"value\":\"vwf\",\"properties\":{\"jlzqnhc\":\"yxonsupe\",\"bgsxgnxfyqonmpq\":\"sqltnzo\",\"iqxeiiqbimht\":\"xwdofdb\"}}],\"liveTraceConfiguration\":{\"enabled\":\"inheh\",\"categories\":[{\"name\":\"fvwbcb\",\"enabled\":\"mbnkb\"},{\"name\":\"qvxkd\",\"enabled\":\"qihebw\"}]},\"resourceLogConfiguration\":{\"categories\":[{\"name\":\"uwfmduragegizvc\",\"enabled\":\"elisdjub\"},{\"name\":\"bqigkx\",\"enabled\":\"sazgakgacyrcmj\"},{\"name\":\"spofapvuhry\",\"enabled\":\"iofrzgbzjedmstk\"}]},\"cors\":{\"allowedOrigins\":[\"xbcuiiznkt\"]},\"serverless\":{\"connectionTimeoutInSeconds\":1437161648},\"upstream\":{\"templates\":[{\"hubPattern\":\"dibmikostbzbkiwb\",\"eventPattern\":\"n\",\"categoryPattern\":\"phzfylsgcrp\",\"urlTemplate\":\"bcunezzceze\",\"auth\":{}}]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"publicNetwork\":{\"allow\":[\"ServerConnection\"],\"deny\":[\"RESTAPI\",\"RESTAPI\",\"RESTAPI\"]},\"privateEndpoints\":[{\"name\":\"ihclafzv\",\"allow\":[\"ClientConnection\"],\"deny\":[\"ClientConnection\",\"ServerConnection\",\"RESTAPI\"]},{\"name\":\"wztcmwqkchc\",\"allow\":[\"ClientConnection\"],\"deny\":[\"ClientConnection\",\"RESTAPI\",\"ServerConnection\"]},{\"name\":\"kjexfdeqvhp\",\"allow\":[\"RESTAPI\",\"ClientConnection\",\"ClientConnection\",\"ServerConnection\"],\"deny\":[\"RESTAPI\",\"ClientConnection\"]},{\"name\":\"mbmxzjrgywwpgj\",\"allow\":[\"Trace\",\"ClientConnection\"],\"deny\":[\"ServerConnection\",\"Trace\",\"ServerConnection\"]}]},\"publicNetworkAccess\":\"gaao\",\"disableLocalAuth\":true,\"disableAadAuth\":true},\"kind\":\"RawWebSockets\",\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{\"rtixokff\":{\"principalId\":\"xswvru\",\"clientId\":\"zzjgehkfki\"},\"xgvelfclduccbird\":{\"principalId\":\"inljqepqwhixmo\",\"clientId\":\"tshi\"},\"inwjizcilngh\":{\"principalId\":\"uwc\",\"clientId\":\"iegstm\"}},\"principalId\":\"h\",\"tenantId\":\"jtbxqmuluxlx\"},\"location\":\"vnersbycucrw\",\"tags\":{\"bsmswziqgf\":\"ikzebr\",\"vhczznvfby\":\"hokzrusw\"},\"id\":\"jsxjwwix\",\"name\":\"vumwmxqh\",\"type\":\"dvnoamldsehaohdj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SignalRManager manager = SignalRManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SignalRResource response = manager.signalRs()
            .getByResourceGroupWithResponse("cohdx", "zlmcmuapcvhdb", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("vnersbycucrw", response.location());
        Assertions.assertEquals("ikzebr", response.tags().get("bsmswziqgf"));
        Assertions.assertEquals("wqqxeysko", response.sku().name());
        Assertions.assertEquals(SignalRSkuTier.PREMIUM, response.sku().tier());
        Assertions.assertEquals(228407914, response.sku().capacity());
        Assertions.assertEquals(ServiceKind.RAW_WEB_SOCKETS, response.kind());
        Assertions.assertEquals(ManagedIdentityType.NONE, response.identity().type());
        Assertions.assertEquals(true, response.tls().clientCertEnabled());
        Assertions.assertEquals(FeatureFlags.ENABLE_LIVE_TRACE, response.features().get(0).flag());
        Assertions.assertEquals("flv", response.features().get(0).value());
        Assertions.assertEquals("zwywako", response.features().get(0).properties().get("hknsmjbl"));
        Assertions.assertEquals("inheh", response.liveTraceConfiguration().enabled());
        Assertions.assertEquals("fvwbcb", response.liveTraceConfiguration().categories().get(0).name());
        Assertions.assertEquals("mbnkb", response.liveTraceConfiguration().categories().get(0).enabled());
        Assertions.assertEquals("uwfmduragegizvc", response.resourceLogConfiguration().categories().get(0).name());
        Assertions.assertEquals("elisdjub", response.resourceLogConfiguration().categories().get(0).enabled());
        Assertions.assertEquals("xbcuiiznkt", response.cors().allowedOrigins().get(0));
        Assertions.assertEquals(1437161648, response.serverless().connectionTimeoutInSeconds());
        Assertions.assertEquals("dibmikostbzbkiwb", response.upstream().templates().get(0).hubPattern());
        Assertions.assertEquals("n", response.upstream().templates().get(0).eventPattern());
        Assertions.assertEquals("phzfylsgcrp", response.upstream().templates().get(0).categoryPattern());
        Assertions.assertEquals("bcunezzceze", response.upstream().templates().get(0).urlTemplate());
        Assertions.assertEquals(AclAction.DENY, response.networkACLs().defaultAction());
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION,
            response.networkACLs().publicNetwork().allow().get(0));
        Assertions.assertEquals(SignalRRequestType.RESTAPI, response.networkACLs().publicNetwork().deny().get(0));
        Assertions.assertEquals(SignalRRequestType.CLIENT_CONNECTION,
            response.networkACLs().privateEndpoints().get(0).allow().get(0));
        Assertions.assertEquals(SignalRRequestType.CLIENT_CONNECTION,
            response.networkACLs().privateEndpoints().get(0).deny().get(0));
        Assertions.assertEquals("ihclafzv", response.networkACLs().privateEndpoints().get(0).name());
        Assertions.assertEquals("gaao", response.publicNetworkAccess());
        Assertions.assertEquals(true, response.disableLocalAuth());
        Assertions.assertEquals(true, response.disableAadAuth());
    }
}

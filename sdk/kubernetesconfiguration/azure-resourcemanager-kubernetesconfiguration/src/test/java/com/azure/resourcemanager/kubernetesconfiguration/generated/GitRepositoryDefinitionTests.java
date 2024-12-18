// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.GitRepositoryDefinition;
import com.azure.resourcemanager.kubernetesconfiguration.models.RepositoryRefDefinition;
import org.junit.jupiter.api.Assertions;

public final class GitRepositoryDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitRepositoryDefinition model = BinaryData.fromString(
            "{\"url\":\"cpc\",\"timeoutInSeconds\":207808974598598894,\"syncIntervalInSeconds\":3513543759245297355,\"repositoryRef\":{\"branch\":\"ljjgpbtoqcjmkl\",\"tag\":\"vbqid\",\"semver\":\"ajzyul\",\"commit\":\"u\"},\"sshKnownHosts\":\"krlkhbzhfepg\",\"httpsUser\":\"qex\",\"httpsCACert\":\"ocxscpaierhhbcs\",\"localAuthRef\":\"ummajtjaod\"}")
            .toObject(GitRepositoryDefinition.class);
        Assertions.assertEquals("cpc", model.url());
        Assertions.assertEquals(207808974598598894L, model.timeoutInSeconds());
        Assertions.assertEquals(3513543759245297355L, model.syncIntervalInSeconds());
        Assertions.assertEquals("ljjgpbtoqcjmkl", model.repositoryRef().branch());
        Assertions.assertEquals("vbqid", model.repositoryRef().tag());
        Assertions.assertEquals("ajzyul", model.repositoryRef().semver());
        Assertions.assertEquals("u", model.repositoryRef().commit());
        Assertions.assertEquals("krlkhbzhfepg", model.sshKnownHosts());
        Assertions.assertEquals("qex", model.httpsUser());
        Assertions.assertEquals("ocxscpaierhhbcs", model.httpsCACert());
        Assertions.assertEquals("ummajtjaod", model.localAuthRef());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitRepositoryDefinition model = new GitRepositoryDefinition().withUrl("cpc")
            .withTimeoutInSeconds(207808974598598894L)
            .withSyncIntervalInSeconds(3513543759245297355L)
            .withRepositoryRef(new RepositoryRefDefinition().withBranch("ljjgpbtoqcjmkl")
                .withTag("vbqid")
                .withSemver("ajzyul")
                .withCommit("u"))
            .withSshKnownHosts("krlkhbzhfepg")
            .withHttpsUser("qex")
            .withHttpsCACert("ocxscpaierhhbcs")
            .withLocalAuthRef("ummajtjaod");
        model = BinaryData.fromObject(model).toObject(GitRepositoryDefinition.class);
        Assertions.assertEquals("cpc", model.url());
        Assertions.assertEquals(207808974598598894L, model.timeoutInSeconds());
        Assertions.assertEquals(3513543759245297355L, model.syncIntervalInSeconds());
        Assertions.assertEquals("ljjgpbtoqcjmkl", model.repositoryRef().branch());
        Assertions.assertEquals("vbqid", model.repositoryRef().tag());
        Assertions.assertEquals("ajzyul", model.repositoryRef().semver());
        Assertions.assertEquals("u", model.repositoryRef().commit());
        Assertions.assertEquals("krlkhbzhfepg", model.sshKnownHosts());
        Assertions.assertEquals("qex", model.httpsUser());
        Assertions.assertEquals("ocxscpaierhhbcs", model.httpsCACert());
        Assertions.assertEquals("ummajtjaod", model.localAuthRef());
    }
}

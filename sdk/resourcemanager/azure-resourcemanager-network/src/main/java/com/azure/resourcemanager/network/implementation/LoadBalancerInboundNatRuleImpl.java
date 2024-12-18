// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.network.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.LoadBalancer;
import com.azure.resourcemanager.network.models.LoadBalancerFrontend;
import com.azure.resourcemanager.network.models.LoadBalancerInboundNatRule;
import com.azure.resourcemanager.network.models.Network;
import com.azure.resourcemanager.network.models.PublicIpAddress;
import com.azure.resourcemanager.network.models.Subnet;
import com.azure.resourcemanager.network.models.TransportProtocol;
import com.azure.resourcemanager.network.fluent.models.InboundNatRuleInner;
import com.azure.resourcemanager.resources.fluentcore.arm.ResourceUtils;
import com.azure.resourcemanager.resources.fluentcore.arm.models.implementation.ChildResourceImpl;
import com.azure.resourcemanager.resources.fluentcore.model.Creatable;
import com.azure.resourcemanager.resources.fluentcore.utils.ResourceManagerUtils;

/** Implementation for LoadBalancerInboundNatRule. */
class LoadBalancerInboundNatRuleImpl extends ChildResourceImpl<InboundNatRuleInner, LoadBalancerImpl, LoadBalancer>
    implements LoadBalancerInboundNatRule,
    LoadBalancerInboundNatRule.Definition<LoadBalancer.DefinitionStages.WithCreateAndInboundNatRule>,
    LoadBalancerInboundNatRule.UpdateDefinition<LoadBalancer.Update>, LoadBalancerInboundNatRule.Update {

    LoadBalancerInboundNatRuleImpl(InboundNatRuleInner inner, LoadBalancerImpl parent) {
        super(inner, parent);
    }

    // Getters

    @Override
    public String name() {
        return this.innerModel().name();
    }

    @Override
    public String backendNicIpConfigurationName() {
        if (this.innerModel().backendIpConfiguration() == null) {
            return null;
        } else {
            return ResourceUtils.nameFromResourceId(this.innerModel().backendIpConfiguration().id());
        }
    }

    @Override
    public int backendPort() {
        return ResourceManagerUtils.toPrimitiveInt(this.innerModel().backendPort());
    }

    @Override
    public String backendNetworkInterfaceId() {
        if (this.innerModel().backendIpConfiguration() == null) {
            return null;
        } else {
            return ResourceUtils.parentResourceIdFromResourceId(this.innerModel().backendIpConfiguration().id());
        }
    }

    @Override
    public TransportProtocol protocol() {
        return this.innerModel().protocol();
    }

    @Override
    public int frontendPort() {
        return ResourceManagerUtils.toPrimitiveInt(this.innerModel().frontendPort());
    }

    @Override
    public boolean floatingIPEnabled() {
        return this.innerModel().enableFloatingIp().booleanValue();
    }

    @Override
    public LoadBalancerFrontend frontend() {
        return this.parent()
            .frontends()
            .get(ResourceUtils.nameFromResourceId(this.innerModel().frontendIpConfiguration().id()));
    }

    @Override
    public int idleTimeoutInMinutes() {
        return ResourceManagerUtils.toPrimitiveInt(this.innerModel().idleTimeoutInMinutes());
    }

    // Fluent setters

    @Override
    public LoadBalancerInboundNatRuleImpl toBackendPort(int port) {
        this.innerModel().withBackendPort(port);
        return this;
    }

    @Override
    public LoadBalancerInboundNatRuleImpl withFloatingIPEnabled() {
        return withFloatingIP(true);
    }

    @Override
    public LoadBalancerInboundNatRuleImpl withFloatingIPDisabled() {
        return withFloatingIP(false);
    }

    @Override
    public LoadBalancerInboundNatRuleImpl withFloatingIP(boolean enabled) {
        this.innerModel().withEnableFloatingIp(enabled);
        return this;
    }

    @Override
    public LoadBalancerInboundNatRuleImpl fromFrontendPort(int port) {
        this.innerModel().withFrontendPort(port);
        if (this.backendPort() == 0) {
            // By default, assume the same backend port
            return this.toBackendPort(port);
        } else {
            return this;
        }
    }

    @Override
    public LoadBalancerInboundNatRuleImpl withIdleTimeoutInMinutes(int minutes) {
        this.innerModel().withIdleTimeoutInMinutes(minutes);
        return this;
    }

    @Override
    public LoadBalancerInboundNatRuleImpl withProtocol(TransportProtocol protocol) {
        this.innerModel().withProtocol(protocol);
        return this;
    }

    @Override
    public LoadBalancerInboundNatRuleImpl fromFrontend(String frontendName) {
        SubResource frontendRef = this.parent().ensureFrontendRef(frontendName);
        if (frontendRef != null) {
            this.innerModel().withFrontendIpConfiguration(frontendRef);
        }
        return this;
    }

    // Verbs

    @Override
    public LoadBalancerImpl attach() {
        return this.parent().withInboundNatRule(this);
    }

    @Override
    public LoadBalancerInboundNatRuleImpl fromExistingPublicIPAddress(PublicIpAddress publicIPAddress) {
        return (publicIPAddress != null) ? this.fromExistingPublicIPAddress(publicIPAddress.id()) : this;
    }

    @Override
    public LoadBalancerInboundNatRuleImpl fromExistingPublicIPAddress(String resourceId) {
        return (null != resourceId)
            ? this.fromFrontend(this.parent().ensurePublicFrontendWithPip(resourceId).name())
            : this;
    }

    @Override
    public LoadBalancerInboundNatRuleImpl fromNewPublicIPAddress(String leafDnsLabel) {
        String frontendName = this.parent().manager().resourceManager().internalContext().randomResourceName("fe", 20);
        this.parent().withNewPublicIPAddress(leafDnsLabel, frontendName);
        this.fromFrontend(frontendName);
        return this;
    }

    @Override
    public LoadBalancerInboundNatRuleImpl fromNewPublicIPAddress(Creatable<PublicIpAddress> pipDefinition) {
        String frontendName = this.parent().manager().resourceManager().internalContext().randomResourceName("fe", 20);
        this.parent().withNewPublicIPAddress(pipDefinition, frontendName);
        this.fromFrontend(frontendName);
        return this;
    }

    @Override
    public LoadBalancerInboundNatRuleImpl fromNewPublicIPAddress() {
        String dnsLabel = this.parent().manager().resourceManager().internalContext().randomResourceName("fe", 20);
        return this.fromNewPublicIPAddress(dnsLabel);
    }

    @Override
    public LoadBalancerInboundNatRuleImpl fromExistingSubnet(String networkResourceId, String subnetName) {
        return (null != networkResourceId && null != subnetName)
            ? this.fromFrontend(this.parent().ensurePrivateFrontendWithSubnet(networkResourceId, subnetName).name())
            : this;
    }

    @Override
    public LoadBalancerInboundNatRuleImpl fromExistingSubnet(Network network, String subnetName) {
        return (null != network && null != subnetName) ? this.fromExistingSubnet(network.id(), subnetName) : this;
    }

    @Override
    public LoadBalancerInboundNatRuleImpl fromExistingSubnet(Subnet subnet) {
        return (null != subnet) ? this.fromExistingSubnet(subnet.parent().id(), subnet.name()) : this;
    }
}

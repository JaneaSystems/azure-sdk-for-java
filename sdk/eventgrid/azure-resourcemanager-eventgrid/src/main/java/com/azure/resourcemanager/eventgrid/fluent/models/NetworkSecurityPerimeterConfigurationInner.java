// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigProvisioningState;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationIssues;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationProfile;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterInfo;
import com.azure.resourcemanager.eventgrid.models.ResourceAssociation;
import java.io.IOException;
import java.util.List;

/**
 * Network security perimeter configuration.
 */
@Fluent
public final class NetworkSecurityPerimeterConfigurationInner extends ProxyResource {
    /*
     * Properties of the network security perimeter configuration.
     */
    private NetworkSecurityPerimeterConfigurationProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfigurationInner class.
     */
    public NetworkSecurityPerimeterConfigurationInner() {
    }

    /**
     * Get the innerProperties property: Properties of the network security perimeter configuration.
     * 
     * @return the innerProperties value.
     */
    private NetworkSecurityPerimeterConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the provisioningState property: Provisioning state to reflect configuration state and indicate status of nsp
     * profile configuration retrieval.
     * 
     * @return the provisioningState value.
     */
    public NetworkSecurityPerimeterConfigProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state to reflect configuration state and indicate status of nsp
     * profile configuration retrieval.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkSecurityPerimeterConfigurationInner object itself.
     */
    public NetworkSecurityPerimeterConfigurationInner
        withProvisioningState(NetworkSecurityPerimeterConfigProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the provisioningIssues property: Provisioning issues to reflect status when attempting to retrieve nsp
     * profile configuration.
     * 
     * @return the provisioningIssues value.
     */
    public List<NetworkSecurityPerimeterConfigurationIssues> provisioningIssues() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningIssues();
    }

    /**
     * Set the provisioningIssues property: Provisioning issues to reflect status when attempting to retrieve nsp
     * profile configuration.
     * 
     * @param provisioningIssues the provisioningIssues value to set.
     * @return the NetworkSecurityPerimeterConfigurationInner object itself.
     */
    public NetworkSecurityPerimeterConfigurationInner
        withProvisioningIssues(List<NetworkSecurityPerimeterConfigurationIssues> provisioningIssues) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withProvisioningIssues(provisioningIssues);
        return this;
    }

    /**
     * Get the networkSecurityPerimeter property: Perimeter info for nsp association.
     * 
     * @return the networkSecurityPerimeter value.
     */
    public NetworkSecurityPerimeterInfo networkSecurityPerimeter() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSecurityPerimeter();
    }

    /**
     * Set the networkSecurityPerimeter property: Perimeter info for nsp association.
     * 
     * @param networkSecurityPerimeter the networkSecurityPerimeter value to set.
     * @return the NetworkSecurityPerimeterConfigurationInner object itself.
     */
    public NetworkSecurityPerimeterConfigurationInner
        withNetworkSecurityPerimeter(NetworkSecurityPerimeterInfo networkSecurityPerimeter) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withNetworkSecurityPerimeter(networkSecurityPerimeter);
        return this;
    }

    /**
     * Get the resourceAssociation property: Nsp association name and access mode of association.
     * 
     * @return the resourceAssociation value.
     */
    public ResourceAssociation resourceAssociation() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceAssociation();
    }

    /**
     * Set the resourceAssociation property: Nsp association name and access mode of association.
     * 
     * @param resourceAssociation the resourceAssociation value to set.
     * @return the NetworkSecurityPerimeterConfigurationInner object itself.
     */
    public NetworkSecurityPerimeterConfigurationInner withResourceAssociation(ResourceAssociation resourceAssociation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withResourceAssociation(resourceAssociation);
        return this;
    }

    /**
     * Get the profile property: Nsp profile configuration, access rules and diagnostic settings.
     * 
     * @return the profile value.
     */
    public NetworkSecurityPerimeterConfigurationProfile profile() {
        return this.innerProperties() == null ? null : this.innerProperties().profile();
    }

    /**
     * Set the profile property: Nsp profile configuration, access rules and diagnostic settings.
     * 
     * @param profile the profile value to set.
     * @return the NetworkSecurityPerimeterConfigurationInner object itself.
     */
    public NetworkSecurityPerimeterConfigurationInner
        withProfile(NetworkSecurityPerimeterConfigurationProfile profile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkSecurityPerimeterConfigurationProperties();
        }
        this.innerProperties().withProfile(profile);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkSecurityPerimeterConfigurationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkSecurityPerimeterConfigurationInner if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetworkSecurityPerimeterConfigurationInner.
     */
    public static NetworkSecurityPerimeterConfigurationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkSecurityPerimeterConfigurationInner deserializedNetworkSecurityPerimeterConfigurationInner
                = new NetworkSecurityPerimeterConfigurationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterConfigurationInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterConfigurationInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterConfigurationInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedNetworkSecurityPerimeterConfigurationInner.innerProperties
                        = NetworkSecurityPerimeterConfigurationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkSecurityPerimeterConfigurationInner;
        });
    }
}

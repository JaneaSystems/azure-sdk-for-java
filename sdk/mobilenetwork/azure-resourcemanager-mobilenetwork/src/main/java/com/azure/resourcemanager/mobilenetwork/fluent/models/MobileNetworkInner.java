// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentity;
import com.azure.resourcemanager.mobilenetwork.models.PlmnId;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.PublicLandMobileNetwork;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Mobile network resource.
 */
@Fluent
public final class MobileNetworkInner extends Resource {
    /*
     * Mobile network properties.
     */
    private MobileNetworkPropertiesFormat innerProperties = new MobileNetworkPropertiesFormat();

    /*
     * The identity used to retrieve any private keys used for SUPI concealment from Azure key vault.
     */
    private ManagedServiceIdentity identity;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

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
     * Creates an instance of MobileNetworkInner class.
     */
    public MobileNetworkInner() {
    }

    /**
     * Get the innerProperties property: Mobile network properties.
     * 
     * @return the innerProperties value.
     */
    private MobileNetworkPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity used to retrieve any private keys used for SUPI concealment from Azure
     * key vault.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity used to retrieve any private keys used for SUPI concealment from Azure
     * key vault.
     * 
     * @param identity the identity value to set.
     * @return the MobileNetworkInner object itself.
     */
    public MobileNetworkInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * {@inheritDoc}
     */
    @Override
    public MobileNetworkInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MobileNetworkInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the mobile network resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the publicLandMobileNetworkIdentifier property: The unique public land mobile network identifier for the
     * network. If both 'publicLandMobileNetworks' and 'publicLandMobileNetworkIdentifier' are specified, then the
     * 'publicLandMobileNetworks' will take precedence.
     * 
     * @return the publicLandMobileNetworkIdentifier value.
     */
    public PlmnId publicLandMobileNetworkIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().publicLandMobileNetworkIdentifier();
    }

    /**
     * Set the publicLandMobileNetworkIdentifier property: The unique public land mobile network identifier for the
     * network. If both 'publicLandMobileNetworks' and 'publicLandMobileNetworkIdentifier' are specified, then the
     * 'publicLandMobileNetworks' will take precedence.
     * 
     * @param publicLandMobileNetworkIdentifier the publicLandMobileNetworkIdentifier value to set.
     * @return the MobileNetworkInner object itself.
     */
    public MobileNetworkInner withPublicLandMobileNetworkIdentifier(PlmnId publicLandMobileNetworkIdentifier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MobileNetworkPropertiesFormat();
        }
        this.innerProperties().withPublicLandMobileNetworkIdentifier(publicLandMobileNetworkIdentifier);
        return this;
    }

    /**
     * Get the publicLandMobileNetworks property: A list of public land mobile networks including their identifiers. If
     * both 'publicLandMobileNetworks' and 'publicLandMobileNetworkIdentifier' are specified, then the
     * 'publicLandMobileNetworks' will take precedence.
     * 
     * @return the publicLandMobileNetworks value.
     */
    public List<PublicLandMobileNetwork> publicLandMobileNetworks() {
        return this.innerProperties() == null ? null : this.innerProperties().publicLandMobileNetworks();
    }

    /**
     * Set the publicLandMobileNetworks property: A list of public land mobile networks including their identifiers. If
     * both 'publicLandMobileNetworks' and 'publicLandMobileNetworkIdentifier' are specified, then the
     * 'publicLandMobileNetworks' will take precedence.
     * 
     * @param publicLandMobileNetworks the publicLandMobileNetworks value to set.
     * @return the MobileNetworkInner object itself.
     */
    public MobileNetworkInner withPublicLandMobileNetworks(List<PublicLandMobileNetwork> publicLandMobileNetworks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MobileNetworkPropertiesFormat();
        }
        this.innerProperties().withPublicLandMobileNetworks(publicLandMobileNetworks);
        return this;
    }

    /**
     * Get the serviceKey property: The mobile network resource identifier.
     * 
     * @return the serviceKey value.
     */
    public String serviceKey() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceKey();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model MobileNetworkInner"));
        } else {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MobileNetworkInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MobileNetworkInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MobileNetworkInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MobileNetworkInner.
     */
    public static MobileNetworkInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MobileNetworkInner deserializedMobileNetworkInner = new MobileNetworkInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMobileNetworkInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMobileNetworkInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMobileNetworkInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedMobileNetworkInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedMobileNetworkInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedMobileNetworkInner.innerProperties = MobileNetworkPropertiesFormat.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedMobileNetworkInner.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedMobileNetworkInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMobileNetworkInner;
        });
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/**
 * The ManualTriggerRequestBody model.
 */
@Fluent
public final class ManualTriggerRequestBody implements JsonSerializable<ManualTriggerRequestBody> {
    /*
     * The tenantId property.
     */
    private UUID tenantId;

    /*
     * The logicAppsResourceId property.
     */
    private String logicAppsResourceId;

    /**
     * Creates an instance of ManualTriggerRequestBody class.
     */
    public ManualTriggerRequestBody() {
    }

    /**
     * Get the tenantId property: The tenantId property.
     * 
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenantId property.
     * 
     * @param tenantId the tenantId value to set.
     * @return the ManualTriggerRequestBody object itself.
     */
    public ManualTriggerRequestBody withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the logicAppsResourceId property: The logicAppsResourceId property.
     * 
     * @return the logicAppsResourceId value.
     */
    public String logicAppsResourceId() {
        return this.logicAppsResourceId;
    }

    /**
     * Set the logicAppsResourceId property: The logicAppsResourceId property.
     * 
     * @param logicAppsResourceId the logicAppsResourceId value to set.
     * @return the ManualTriggerRequestBody object itself.
     */
    public ManualTriggerRequestBody withLogicAppsResourceId(String logicAppsResourceId) {
        this.logicAppsResourceId = logicAppsResourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logicAppsResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property logicAppsResourceId in model ManualTriggerRequestBody"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManualTriggerRequestBody.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("logicAppsResourceId", this.logicAppsResourceId);
        jsonWriter.writeStringField("tenantId", Objects.toString(this.tenantId, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManualTriggerRequestBody from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManualTriggerRequestBody if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManualTriggerRequestBody.
     */
    public static ManualTriggerRequestBody fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManualTriggerRequestBody deserializedManualTriggerRequestBody = new ManualTriggerRequestBody();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("logicAppsResourceId".equals(fieldName)) {
                    deserializedManualTriggerRequestBody.logicAppsResourceId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedManualTriggerRequestBody.tenantId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManualTriggerRequestBody;
        });
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The GroupQuotasEnforcementResponseProperties model.
 */
@Fluent
public final class GroupQuotasEnforcementResponseProperties
    implements JsonSerializable<GroupQuotasEnforcementResponseProperties> {
    /*
     * Is the GroupQuota Enforcement enabled for the Azure region.
     */
    private EnforcementState enforcementEnabled;

    /*
     * Request status.
     */
    private RequestState provisioningState;

    /*
     * Details of the failure.
     */
    private String faultCode;

    /**
     * Creates an instance of GroupQuotasEnforcementResponseProperties class.
     */
    public GroupQuotasEnforcementResponseProperties() {
    }

    /**
     * Get the enforcementEnabled property: Is the GroupQuota Enforcement enabled for the Azure region.
     * 
     * @return the enforcementEnabled value.
     */
    public EnforcementState enforcementEnabled() {
        return this.enforcementEnabled;
    }

    /**
     * Set the enforcementEnabled property: Is the GroupQuota Enforcement enabled for the Azure region.
     * 
     * @param enforcementEnabled the enforcementEnabled value to set.
     * @return the GroupQuotasEnforcementResponseProperties object itself.
     */
    public GroupQuotasEnforcementResponseProperties withEnforcementEnabled(EnforcementState enforcementEnabled) {
        this.enforcementEnabled = enforcementEnabled;
        return this;
    }

    /**
     * Get the provisioningState property: Request status.
     * 
     * @return the provisioningState value.
     */
    public RequestState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the faultCode property: Details of the failure.
     * 
     * @return the faultCode value.
     */
    public String faultCode() {
        return this.faultCode;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("enforcementEnabled",
            this.enforcementEnabled == null ? null : this.enforcementEnabled.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GroupQuotasEnforcementResponseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GroupQuotasEnforcementResponseProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GroupQuotasEnforcementResponseProperties.
     */
    public static GroupQuotasEnforcementResponseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GroupQuotasEnforcementResponseProperties deserializedGroupQuotasEnforcementResponseProperties
                = new GroupQuotasEnforcementResponseProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enforcementEnabled".equals(fieldName)) {
                    deserializedGroupQuotasEnforcementResponseProperties.enforcementEnabled
                        = EnforcementState.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedGroupQuotasEnforcementResponseProperties.provisioningState
                        = RequestState.fromString(reader.getString());
                } else if ("faultCode".equals(fieldName)) {
                    deserializedGroupQuotasEnforcementResponseProperties.faultCode = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGroupQuotasEnforcementResponseProperties;
        });
    }
}

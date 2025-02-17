// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Encryption identity for the volume group.
 */
@Fluent
public final class EncryptionIdentity implements JsonSerializable<EncryptionIdentity> {
    /*
     * Resource identifier of the UserAssigned identity to be associated with server-side encryption on the volume
     * group.
     */
    private String encryptionUserAssignedIdentity;

    /**
     * Creates an instance of EncryptionIdentity class.
     */
    public EncryptionIdentity() {
    }

    /**
     * Get the encryptionUserAssignedIdentity property: Resource identifier of the UserAssigned identity to be
     * associated with server-side encryption on the volume group.
     * 
     * @return the encryptionUserAssignedIdentity value.
     */
    public String encryptionUserAssignedIdentity() {
        return this.encryptionUserAssignedIdentity;
    }

    /**
     * Set the encryptionUserAssignedIdentity property: Resource identifier of the UserAssigned identity to be
     * associated with server-side encryption on the volume group.
     * 
     * @param encryptionUserAssignedIdentity the encryptionUserAssignedIdentity value to set.
     * @return the EncryptionIdentity object itself.
     */
    public EncryptionIdentity withEncryptionUserAssignedIdentity(String encryptionUserAssignedIdentity) {
        this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
        return this;
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
        jsonWriter.writeStringField("userAssignedIdentity", this.encryptionUserAssignedIdentity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EncryptionIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionIdentity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EncryptionIdentity.
     */
    public static EncryptionIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionIdentity deserializedEncryptionIdentity = new EncryptionIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("userAssignedIdentity".equals(fieldName)) {
                    deserializedEncryptionIdentity.encryptionUserAssignedIdentity = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionIdentity;
        });
    }
}
